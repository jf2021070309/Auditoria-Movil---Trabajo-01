package com.ss.android.socialbase.downloader.segment;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.exception.RetryThrowable;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpResponse;
import com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper;
import com.ss.android.socialbase.downloader.network.DownloadDnsManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.thread.DownloadWatchDog;
import com.ss.android.socialbase.downloader.thread.IDownloadRunnableCallback;
import com.ss.android.socialbase.downloader.utils.DownloadStenographer;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class SegmentDispatcher implements DownloadDnsManager.Callback, ISegmentCallback {
    private static final int READ_WATCH_TIME = 2000;
    private static final String TAG = "SegmentDispatcher";
    private final BufferQueue bufferQueue;
    private long connectTimeout;
    private final boolean debug;
    private final DownloadInfo downloadInfo;
    private BaseException failedException;
    private HttpResponse firstBackupUrlHttpResponse;
    private final IDownloadRunnableCallback hostCallback;
    private volatile boolean isAllContentDownloaded;
    private long lastReconnectTime;
    private HttpResponse mainUrlHttpResponse;
    private float poorSpeedRatio;
    private long readTimeout;
    private int reconnectCount;
    private final DownloadStenographer stenographer;
    private final SegmentStrategy strategy;
    private long totalLength;
    private int urlIndex;
    private final DownloadWatchDog watchDog;
    private final MultiSegmentWriter writer;
    private volatile boolean canceled = false;
    private volatile boolean paused = false;
    private final List<SegmentReader> readers = new ArrayList();
    private final List<UrlRecord> urlRecords = new ArrayList();
    private volatile boolean needWaitDnsResolve = true;
    private final LinkedList<Segment> toDispatchSegments = new LinkedList<>();
    private final List<Segment> dispatchedSegments = new ArrayList();
    private final Object firstConnectionLock = new Object();
    private volatile boolean allReaderFailed = false;
    private final DownloadWatchDog.IWatcher connectWatcher = new DownloadWatchDog.IWatcher() { // from class: com.ss.android.socialbase.downloader.segment.SegmentDispatcher.1
        private int watchTimes;

        @Override // com.ss.android.socialbase.downloader.thread.DownloadWatchDog.IWatcher
        public long onScheduleWatch() {
            if (SegmentDispatcher.this.canceled || SegmentDispatcher.this.paused) {
                return -1L;
            }
            synchronized (SegmentDispatcher.this) {
                if (SegmentDispatcher.this.mainUrlHttpResponse == null && SegmentDispatcher.this.firstBackupUrlHttpResponse == null) {
                    long j = SegmentDispatcher.this.connectTimeout;
                    if (j <= 0) {
                        return -1L;
                    }
                    this.watchTimes++;
                    SegmentReader findEarliestConnectTimeoutReader = SegmentDispatcher.this.findEarliestConnectTimeoutReader(false, System.currentTimeMillis(), j);
                    if (findEarliestConnectTimeoutReader != null) {
                        Log.i(SegmentDispatcher.TAG, "connectWatcher: switchUrl and reconnect");
                        SegmentDispatcher.this.trySwitchNextUrlForReader(findEarliestConnectTimeoutReader);
                        findEarliestConnectTimeoutReader.reconnect();
                        return ((this.watchTimes / SegmentDispatcher.this.urlRecords.size()) + 1) * j;
                    }
                    return j;
                }
                return -1L;
            }
        }
    };
    private final DownloadWatchDog.IWatcher readWatcher = new DownloadWatchDog.IWatcher() { // from class: com.ss.android.socialbase.downloader.segment.SegmentDispatcher.2
        @Override // com.ss.android.socialbase.downloader.thread.DownloadWatchDog.IWatcher
        public long onScheduleWatch() {
            return SegmentDispatcher.this.scheduleWatchRead();
        }
    };

    public SegmentDispatcher(DownloadInfo downloadInfo, SegmentStrategy segmentStrategy, IDownloadRunnableCallback iDownloadRunnableCallback) {
        this.downloadInfo = downloadInfo;
        this.strategy = segmentStrategy;
        BufferQueue bufferQueue = new BufferQueue(segmentStrategy.getBufferCount(), segmentStrategy.getBufferSize());
        this.bufferQueue = bufferQueue;
        this.hostCallback = iDownloadRunnableCallback;
        this.writer = new MultiSegmentWriter(downloadInfo, iDownloadRunnableCallback, bufferQueue);
        this.watchDog = new DownloadWatchDog();
        this.stenographer = new DownloadStenographer();
        this.debug = DownloadSetting.obtain(downloadInfo.getId()).optInt("debug") == 1;
    }

    public boolean downloadSegments(List<Segment> list) throws BaseException, InterruptedException {
        try {
            initUrlRecords();
            initSegments(list);
            dispatchReadThread();
            initWatchDog();
            initDns();
            long currentTimeMillis = System.currentTimeMillis();
            waitFirstConnection();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            this.downloadInfo.increaseAllConnectTime(currentTimeMillis2);
            this.downloadInfo.setFirstSpeedTime(currentTimeMillis2);
            if (!this.paused && !this.canceled) {
                this.hostCallback.checkSpaceOverflow(this.totalLength);
                initWatchDog2();
                writeSegments();
                return true;
            }
            if (!this.paused && !this.canceled) {
                Logger.i(TAG, "finally pause");
                pause();
            }
            this.watchDog.release();
            return true;
        } finally {
            if (!this.paused && !this.canceled) {
                Logger.i(TAG, "finally pause");
                pause();
            }
            this.watchDog.release();
        }
    }

    private void initSegments(List<Segment> list) {
        long totalBytes = this.downloadInfo.getTotalBytes();
        this.totalLength = totalBytes;
        if (totalBytes <= 0) {
            this.totalLength = this.downloadInfo.getExpectFileLength();
            Logger.i(TAG, "initSegments: getExpectFileLength = " + this.totalLength);
        }
        synchronized (this) {
            this.toDispatchSegments.clear();
            if (list != null && !list.isEmpty()) {
                for (Segment segment : list) {
                    arrangeSegmentLocked(this.toDispatchSegments, new Segment(segment), false);
                }
                fixSegmentsLocked(this.toDispatchSegments);
                checkDownloadedBytesLocked(this.toDispatchSegments);
                Logger.i(TAG, "initSegments: totalLength = " + this.totalLength);
            }
            arrangeSegmentLocked(this.toDispatchSegments, new Segment(0L, -1L), false);
            Logger.i(TAG, "initSegments: totalLength = " + this.totalLength);
        }
    }

    private void waitFirstConnection() throws BaseException, InterruptedException {
        BaseException baseException;
        synchronized (this.firstConnectionLock) {
            if (this.mainUrlHttpResponse == null && this.firstBackupUrlHttpResponse == null) {
                this.firstConnectionLock.wait();
            }
        }
        if (this.mainUrlHttpResponse == null && this.firstBackupUrlHttpResponse == null && (baseException = this.failedException) != null) {
            throw baseException;
        }
    }

    private void writeSegments() throws BaseException {
        try {
            this.writer.loopAndWrite(this.bufferQueue);
        } catch (StreamClosedException e) {
        } catch (BaseException e2) {
            Logger.e(TAG, "dispatchSegments: loopAndWrite e = " + e2);
            onError(e2);
            throw e2;
        }
        if (this.paused || this.canceled) {
            return;
        }
        try {
            synchronized (this) {
                while (!this.toDispatchSegments.isEmpty()) {
                    Segment poll = this.toDispatchSegments.poll();
                    if (poll != null) {
                        arrangeSegmentLocked(this.dispatchedSegments, poll, true);
                    }
                }
                checkDownloadedBytesLocked(this.dispatchedSegments);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.allReaderFailed && this.failedException != null) {
            Logger.e(TAG, "dispatchSegments: loopAndWrite  failedException = " + this.failedException);
            throw this.failedException;
        }
        if (this.downloadInfo.getCurBytes() != this.downloadInfo.getTotalBytes()) {
            DownloadMonitorHelper.monitorSegmentsError(this.downloadInfo, this.dispatchedSegments);
        }
        Logger.i(TAG, "dispatchSegments::download finished");
    }

    private void checkDownloadedBytesLocked(List<Segment> list) {
        long downloadedBytes = SegmentUtils.getDownloadedBytes(list);
        Logger.i(TAG, "checkDownloadBytes: getCurBytes = " + this.downloadInfo.getCurBytes() + ", totalBytes = " + this.downloadInfo.getTotalBytes() + ", downloadedBytes = " + downloadedBytes);
        if (downloadedBytes > this.downloadInfo.getTotalBytes() && this.downloadInfo.getTotalBytes() > 0) {
            downloadedBytes = this.downloadInfo.getTotalBytes();
        }
        if (this.downloadInfo.getCurBytes() != this.downloadInfo.getTotalBytes() && this.downloadInfo.getCurBytes() != downloadedBytes) {
            this.downloadInfo.setCurBytes(downloadedBytes);
        }
    }

    private void dispatchReadThread() {
        int i;
        if (this.totalLength <= 0 || this.needWaitDnsResolve) {
            i = 1;
        } else {
            i = this.strategy.getThreadCount();
            int segmentMinInitSize = (int) (this.totalLength / this.strategy.getSegmentMinInitSize());
            if (i > segmentMinInitSize) {
                i = segmentMinInitSize;
            }
        }
        Logger.i(TAG, "dispatchReadThread: totalLength = " + this.totalLength + ", threadCount = " + i);
        int i2 = i > 0 ? i : 1;
        synchronized (this) {
            do {
                if (this.readers.size() >= i2) {
                    break;
                }
                if (!this.paused && !this.canceled) {
                    dispatchReadThreadOnce(obtainUrl());
                }
                return;
            } while (!this.strategy.segmentOneByOne());
        }
    }

    private void initUrlRecords() {
        this.urlRecords.add(new UrlRecord(this.downloadInfo.getUrl(), true));
        List<String> backUpUrls = this.downloadInfo.getBackUpUrls();
        if (backUpUrls != null) {
            for (String str : backUpUrls) {
                if (!TextUtils.isEmpty(str)) {
                    this.urlRecords.add(new UrlRecord(str, false));
                }
            }
        }
        this.strategy.updateUrlCount(this.urlRecords.size());
    }

    private void initWatchDog() {
        SegmentStrategy segmentStrategy = this.strategy;
        this.connectTimeout = segmentStrategy.getConnectTimeout();
        this.readTimeout = segmentStrategy.getReadTimeout();
        this.poorSpeedRatio = segmentStrategy.getPoorSpeedRatio();
        int i = this.reconnectCount;
        if (i > 0) {
            this.watchDog.addWatcher(this.connectWatcher, i);
        }
    }

    private void initWatchDog2() {
        if (this.readTimeout > 0) {
            this.lastReconnectTime = System.currentTimeMillis();
            this.watchDog.addWatcher(this.readWatcher, 0L);
        }
    }

    private void initDns() {
        List<String> backUpUrls;
        int ipStrategy = this.strategy.getIpStrategy();
        if (ipStrategy <= 0) {
            this.needWaitDnsResolve = false;
            dispatchReadThread();
            return;
        }
        DownloadDnsManager downloadDnsManager = DownloadDnsManager.getInstance();
        downloadDnsManager.resolveDnsAsync(this.downloadInfo.getUrl(), this, 2000L);
        if (ipStrategy > 2 && (backUpUrls = this.downloadInfo.getBackUpUrls()) != null) {
            for (String str : backUpUrls) {
                if (!TextUtils.isEmpty(str)) {
                    downloadDnsManager.resolveDnsAsync(str, this, 2000L);
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.network.DownloadDnsManager.Callback
    public void onDnsResolved(String str, List<InetAddress> list) {
        if (this.paused || this.canceled) {
            return;
        }
        List<UrlRecord> list2 = null;
        try {
            list2 = assembleIpAddress(str, list);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        synchronized (this) {
            if (list2 != null) {
                addIpListLocked(str, list2);
            }
            this.needWaitDnsResolve = false;
            this.strategy.updateUrlCount(this.urlRecords.size());
            Log.i(TAG, "onDnsResolved: dispatchReadThread");
            dispatchReadThread();
        }
    }

    private void addIpListLocked(String str, List<UrlRecord> list) {
        int indexOfUrl;
        if (this.debug) {
            Iterator<UrlRecord> it = list.iterator();
            while (it.hasNext()) {
                Log.i(TAG, "addIpListLocked: urlRecord = " + it.next());
            }
        }
        int ipStrategy = this.strategy.getIpStrategy();
        if ((ipStrategy == 1 || ipStrategy == 3) && (indexOfUrl = indexOfUrl(str)) >= 0 && indexOfUrl < this.urlRecords.size()) {
            this.urlRecords.addAll(indexOfUrl + 1, list);
        } else {
            this.urlRecords.addAll(list);
        }
    }

    private int indexOfUrl(String str) {
        int size = this.urlRecords.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(this.urlRecords.get(i).url, str)) {
                return i;
            }
        }
        return -1;
    }

    private List<UrlRecord> assembleIpAddress(String str, List<InetAddress> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (InetAddress inetAddress : list) {
            if (inetAddress != null) {
                String hostAddress = inetAddress.getHostAddress();
                if (!TextUtils.isEmpty(hostAddress)) {
                    if (this.debug) {
                        Log.i(TAG, "onDnsResolved: ip = " + hostAddress);
                    }
                    UrlRecord urlRecord = new UrlRecord(str, hostAddress);
                    LinkedList linkedList = (LinkedList) linkedHashMap.get(urlRecord.ipFamily);
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        linkedHashMap.put(urlRecord.ipFamily, linkedList);
                    }
                    linkedList.add(urlRecord);
                    i++;
                }
            }
        }
        if (i <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            z = false;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                LinkedList linkedList2 = (LinkedList) entry.getValue();
                if (linkedList2 != null && !linkedList2.isEmpty()) {
                    arrayList.add((UrlRecord) linkedList2.pollFirst());
                    i--;
                    z = true;
                }
            }
            if (i <= 0) {
                break;
            }
        } while (z);
        return arrayList;
    }

    private UrlRecord obtainUrl() {
        UrlRecord urlRecord;
        synchronized (this) {
            int size = this.urlIndex % this.urlRecords.size();
            if (this.strategy.urlBalance()) {
                this.urlIndex++;
            }
            urlRecord = this.urlRecords.get(size);
        }
        return urlRecord;
    }

    private void switchToNextUrl() {
        synchronized (this) {
            this.urlIndex++;
        }
    }

    private void arrangeSegmentLocked(List<Segment> list, Segment segment, boolean z) {
        long startOffset = segment.getStartOffset();
        int size = list.size();
        int i = 0;
        while (i < size && startOffset >= list.get(i).getStartOffset()) {
            i++;
        }
        list.add(i, segment);
        if (z) {
            segment.setIndex(size);
        }
    }

    private void fixSegmentsLocked(List<Segment> list) {
        Segment segment = list.get(0);
        long startOffset = segment.getStartOffset();
        if (startOffset > 0) {
            Segment segment2 = new Segment(0L, startOffset - 1);
            Log.w(TAG, "fixSegmentsLocked: first = " + segment + ", add new first = " + segment2);
            arrangeSegmentLocked(list, segment2, true);
        }
        Iterator<Segment> it = list.iterator();
        if (it.hasNext()) {
            Segment next = it.next();
            while (it.hasNext()) {
                Segment next2 = it.next();
                if (next.getEndOffset() < next2.getStartOffset() - 1) {
                    Logger.w(TAG, "fixSegment: segment = " + next + ", new end = " + (next2.getStartOffset() - 1));
                    next.setEndOffset(next2.getStartOffset() - 1);
                }
                next = next2;
            }
        }
        Segment segment3 = list.get(list.size() - 1);
        long totalBytes = this.downloadInfo.getTotalBytes();
        if (totalBytes <= 0 || (segment3.getEndOffset() != -1 && segment3.getEndOffset() < totalBytes - 1)) {
            Logger.w(TAG, "fixSegment: last segment = " + segment3 + ", new end=-1");
            segment3.setEndOffset(-1L);
        }
    }

    private void dispatchReadThreadOnce(UrlRecord urlRecord) {
        SegmentReader segmentReader = new SegmentReader(this.downloadInfo, this, this.bufferQueue, urlRecord, this.readers.size());
        this.readers.add(segmentReader);
        segmentReader.setFuture(DownloadComponentManager.getChunkDownloadThreadExecutorService().submit(segmentReader));
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void onReaderRun(SegmentReader segmentReader) {
        if (this.debug) {
            Logger.i(TAG, "onReaderRun, threadIndex = " + segmentReader.threadIndex);
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public Segment obtainSegment(SegmentReader segmentReader, UrlRecord urlRecord) {
        if (this.canceled || this.paused) {
            return null;
        }
        synchronized (this) {
            Segment obtainSegmentLocked = obtainSegmentLocked(segmentReader, urlRecord);
            if (obtainSegmentLocked != null) {
                obtainSegmentLocked.increaseCompetitor();
                if (obtainSegmentLocked.getCompetitor() > 1) {
                    return new Segment(obtainSegmentLocked);
                }
            }
            return obtainSegmentLocked;
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void unObtainSegment(SegmentReader segmentReader, Segment segment) {
        synchronized (this) {
            segment.decreaseCompetitor();
        }
    }

    private Segment obtainSegmentLocked(SegmentReader segmentReader, UrlRecord urlRecord) {
        while (!this.toDispatchSegments.isEmpty()) {
            Segment poll = this.toDispatchSegments.poll();
            if (poll != null) {
                arrangeSegmentLocked(this.dispatchedSegments, poll, true);
                if (getRemainReadBytes(poll) > 0 || this.totalLength <= 0) {
                    return poll;
                }
            }
        }
        clearCoveredSegmentLocked();
        Segment obtainChildSegmentFromMaxRemain = obtainChildSegmentFromMaxRemain(segmentReader, urlRecord);
        if (obtainChildSegmentFromMaxRemain != null && getRemainReadBytes(obtainChildSegmentFromMaxRemain) > 0) {
            arrangeSegmentLocked(this.dispatchedSegments, obtainChildSegmentFromMaxRemain, true);
            return obtainChildSegmentFromMaxRemain;
        }
        Segment obtainSegmentWhenNoNewSegment = obtainSegmentWhenNoNewSegment();
        if (obtainSegmentWhenNoNewSegment != null) {
            return obtainSegmentWhenNoNewSegment;
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void onSegmentConnected(SegmentReader segmentReader, Segment segment, UrlRecord urlRecord, HttpResponse httpResponse) throws BaseException, RetryThrowable {
        synchronized (this) {
            if (this.canceled || this.paused) {
                throw new StreamClosedException("connected");
            }
            checkSegmentHttpResponseLocked(segmentReader, segment, urlRecord, httpResponse);
            segmentReader.setFailed(false);
            if (this.totalLength <= 0) {
                long totalBytes = this.downloadInfo.getTotalBytes();
                this.totalLength = totalBytes;
                if (totalBytes <= 0) {
                    this.totalLength = httpResponse.getTotalLength();
                }
                dispatchReadThread();
            } else if (this.strategy.segmentOneByOne()) {
                dispatchReadThread();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void applySegment(SegmentReader segmentReader, Segment segment) throws BaseException {
        synchronized (this) {
            applySegmentLocked(segmentReader, segment);
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void unApplySegment(SegmentReader segmentReader, Segment segment) {
        synchronized (this) {
            if (segment.owner == segmentReader) {
                Logger.i(TAG, "unApplySegment " + segment);
                segment.setCurrentOffsetRead(segmentReader.getCurSegmentReadOffset());
                segment.owner = null;
                segmentReader.updateReadBytes();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public IOutput createOutput(SegmentReader segmentReader, Segment segment) throws BaseException {
        IOutput stub;
        synchronized (this) {
            SegmentOutput segmentOutput = new SegmentOutput(this.downloadInfo, this.bufferQueue, segment);
            this.writer.assignOutput(segmentOutput);
            stub = segmentOutput.getStub();
        }
        return stub;
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void onSegmentRetry(SegmentReader segmentReader, UrlRecord urlRecord, Segment segment, BaseException baseException, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (!DownloadUtils.isResponseCodeError(baseException)) {
            z = false;
        } else {
            z = true;
        }
        int errorCode = baseException.getErrorCode();
        if (errorCode != 1047 && errorCode != 1074 && errorCode != 1055) {
            z2 = z;
        }
        if (z2 || i >= i2) {
            trySwitchNextUrlForReader(segmentReader);
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void onSegmentFailed(SegmentReader segmentReader, UrlRecord urlRecord, Segment segment, BaseException baseException) {
        synchronized (this) {
            Logger.e(TAG, "onSegmentFailed: segment = " + segment + ", e = " + baseException);
            segmentReader.setFailed(true);
            if (segmentReader.threadIndex == 0) {
                this.failedException = baseException;
            }
            if (isAllReaderFailedLocked()) {
                if (this.failedException == null) {
                    this.failedException = baseException;
                }
                this.allReaderFailed = true;
                onError(this.failedException);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.segment.ISegmentCallback
    public void onReaderExit(SegmentReader segmentReader) {
        Logger.i(TAG, "onReaderExit: threadIndex = " + segmentReader.threadIndex);
        synchronized (this) {
            segmentReader.setExited(true);
            this.readers.remove(segmentReader);
            clearCoveredSegmentLocked();
            if (this.readers.isEmpty()) {
                onComplete();
            } else if (isAllContentDownloaded()) {
                Log.i(TAG, "onReaderExit: allContentDownloaded");
                for (SegmentReader segmentReader2 : this.readers) {
                    segmentReader2.close();
                }
                onComplete();
            }
        }
    }

    private void onError(BaseException baseException) {
        Logger.e(TAG, "onError, e = " + baseException);
        this.failedException = baseException;
        this.bufferQueue.close();
        synchronized (this) {
            for (SegmentReader segmentReader : this.readers) {
                segmentReader.close();
            }
        }
    }

    private void onComplete() {
        Logger.i(TAG, "onComplete");
        this.bufferQueue.close();
        synchronized (this.firstConnectionLock) {
            this.firstConnectionLock.notify();
        }
    }

    private boolean isAllReaderFailedLocked() {
        for (SegmentReader segmentReader : this.readers) {
            if (!segmentReader.isFailed()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean trySwitchNextUrlForReader(SegmentReader segmentReader) {
        synchronized (this) {
            UrlRecord findNextUrlLocked = findNextUrlLocked(segmentReader);
            if (findNextUrlLocked == null) {
                return false;
            }
            return segmentReader.switchUrlRecord(findNextUrlLocked);
        }
    }

    private UrlRecord findNextUrlLocked(SegmentReader segmentReader) {
        UrlRecord urlRecord;
        Iterator<UrlRecord> it = this.urlRecords.iterator();
        UrlRecord urlRecord2 = null;
        while (true) {
            if (!it.hasNext()) {
                urlRecord = null;
                break;
            }
            urlRecord = it.next();
            if (urlRecord != segmentReader.urlRecord && !urlRecord.isCurrentFailed()) {
                if (urlRecord2 == null) {
                    urlRecord2 = urlRecord;
                }
                if (urlRecord.getCurrentUsers() <= 0) {
                    break;
                }
            }
        }
        if (this.strategy.urlBalance()) {
            if (urlRecord != null) {
                return urlRecord;
            }
            if (this.strategy.urlBalanceStrictly()) {
                return null;
            }
            return urlRecord2;
        }
        return urlRecord2;
    }

    private void checkSegmentHttpResponseLocked(SegmentReader segmentReader, Segment segment, UrlRecord urlRecord, HttpResponse httpResponse) throws BaseException, RetryThrowable {
        SegmentReader segmentReader2 = segment.owner;
        if (segmentReader2 != null && segmentReader2 != segmentReader) {
            throw new SegmentApplyException(1, "segment already has an owner");
        }
        if (segmentReader.getStartOffsetInConnection() != segment.getCurrentOffsetRead()) {
            throw new SegmentApplyException(5, "applySegment");
        }
        if (!httpResponse.acceptPartial()) {
            if (segment.getCurrentOffsetRead() > 0) {
                int i = httpResponse.responseCode;
                throw new DownloadHttpException(1004, i, "1: response code error : " + httpResponse.responseCode + " segment=" + segment);
            }
            Logger.e(TAG, "parseHttpResponse: segment.getCurrentOffsetRead = " + segment.getCurrentOffsetRead());
            if (!httpResponse.isResponseDataFromBegin()) {
                int i2 = httpResponse.responseCode;
                throw new DownloadHttpException(1004, i2, "2: response code error : " + httpResponse.responseCode + " segment=" + segment);
            }
        }
        if (urlRecord.isMainUrl) {
            if (this.mainUrlHttpResponse == null) {
                this.mainUrlHttpResponse = httpResponse;
                synchronized (this.firstConnectionLock) {
                    this.firstConnectionLock.notify();
                }
                IDownloadRunnableCallback iDownloadRunnableCallback = this.hostCallback;
                if (iDownloadRunnableCallback != null) {
                    iDownloadRunnableCallback.handleFirstConnection(urlRecord.url, httpResponse.connection, segment.getCurrentOffsetRead());
                }
                long totalLength = httpResponse.getTotalLength();
                if (totalLength > 0) {
                    for (Segment segment2 : this.dispatchedSegments) {
                        if (segment2.getEndOffset() <= 0 || segment2.getEndOffset() > totalLength - 1) {
                            segment2.setEndOffset(totalLength - 1);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        validateHttpResponse(httpResponse);
        if (this.firstBackupUrlHttpResponse == null) {
            this.firstBackupUrlHttpResponse = httpResponse;
            if (this.downloadInfo.getTotalBytes() <= 0) {
                long totalLength2 = httpResponse.getTotalLength();
                Logger.i(TAG, "checkSegmentHttpResponse:len=" + totalLength2 + ",url=" + urlRecord.url);
                this.downloadInfo.setTotalBytes(totalLength2);
            }
            synchronized (this.firstConnectionLock) {
                this.firstConnectionLock.notify();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if ((r10.getCurrentOffsetRead() - r23.getCurrentOffsetRead()) < (r14 / 2)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f9, code lost:
        r3 = r3 + 1;
        r6 = r21.dispatchedSegments.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0201, code lost:
        if (r3 >= r6) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0203, code lost:
        r7 = r21.dispatchedSegments.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0213, code lost:
        if (r7.getDownloadBytes() > 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0217, code lost:
        if (r7.owner == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x021a, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021d, code lost:
        r11 = r23.getEndOffset();
        r13 = r7.getStartOffset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0229, code lost:
        if (r11 <= 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022d, code lost:
        if (r11 < r13) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022f, code lost:
        r13 = r13 - 1;
        r23.setEndOffset(r13);
        com.ss.android.socialbase.downloader.logger.Logger.i(com.ss.android.socialbase.downloader.segment.SegmentDispatcher.TAG, "applySegment: segment set end:" + r13 + ", later = " + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x024f, code lost:
        android.util.Log.d(com.ss.android.socialbase.downloader.segment.SegmentDispatcher.TAG, "applySegmentLocked: break 2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0254, code lost:
        r6 = r23.getEndOffset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x025c, code lost:
        if (r6 <= 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0260, code lost:
        if (r19 > r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0268, code lost:
        if (r23.getCurrentOffsetRead() > r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0280, code lost:
        throw new com.ss.android.socialbase.downloader.segment.SegmentApplyException(6, "applySegment: " + r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0281, code lost:
        r23.owner = r22;
        com.ss.android.socialbase.downloader.logger.Logger.i(com.ss.android.socialbase.downloader.segment.SegmentDispatcher.TAG, "applySegment: OK " + r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0297, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void applySegmentLocked(com.ss.android.socialbase.downloader.segment.SegmentReader r22, com.ss.android.socialbase.downloader.segment.Segment r23) throws com.ss.android.socialbase.downloader.segment.SegmentApplyException {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.SegmentDispatcher.applySegmentLocked(com.ss.android.socialbase.downloader.segment.SegmentReader, com.ss.android.socialbase.downloader.segment.Segment):void");
    }

    private void validateHttpResponse(HttpResponse httpResponse) throws BaseException {
        HttpResponse httpResponse2 = this.mainUrlHttpResponse;
        if (httpResponse2 == null && (httpResponse2 = this.firstBackupUrlHttpResponse) == null) {
            return;
        }
        long totalLength = httpResponse.getTotalLength();
        long totalLength2 = httpResponse2.getTotalLength();
        if (totalLength != totalLength2) {
            String str = "total len not equals,len=" + totalLength + ",sLen=" + totalLength2 + ",code=" + httpResponse.responseCode + ",sCode=" + httpResponse2.responseCode + ",range=" + httpResponse.getContentRange() + ",sRange = " + httpResponse2.getContentRange() + ",url = " + httpResponse.url + ",sUrl=" + httpResponse2.url;
            Logger.e(TAG, str);
            if (totalLength > 0 && totalLength2 > 0) {
                throw new BaseException((int) DownloadErrorCode.ERROR_BAD_URL, str);
            }
        }
        String etag = httpResponse.getEtag();
        String etag2 = httpResponse2.getEtag();
        if (!TextUtils.equals(etag, etag2)) {
            String str2 = "etag not equals with main url, etag = " + etag + ", mainEtag = " + etag2;
            Logger.e(TAG, str2);
            if (!TextUtils.isEmpty(etag) && !TextUtils.isEmpty(etag2) && !etag.equalsIgnoreCase(etag2)) {
                throw new BaseException((int) DownloadErrorCode.ERROR_BAD_URL, str2);
            }
        }
    }

    public void cancel() {
        Logger.i(TAG, "cancel");
        this.canceled = true;
        synchronized (this) {
            for (SegmentReader segmentReader : this.readers) {
                segmentReader.close();
            }
        }
        this.writer.cancel();
        this.bufferQueue.close();
    }

    public void pause() {
        Logger.i(TAG, "pause1");
        this.paused = true;
        synchronized (this) {
            for (SegmentReader segmentReader : this.readers) {
                segmentReader.close();
            }
        }
        this.writer.pause();
        this.bufferQueue.close();
    }

    private int indexOfSegmentLocked(long j) {
        int size = this.dispatchedSegments.size();
        for (int i = 0; i < size; i++) {
            Segment segment = this.dispatchedSegments.get(i);
            if (segment.getStartOffset() == j) {
                return i;
            }
            if (segment.getStartOffset() > j) {
                return -1;
            }
        }
        return -1;
    }

    private void clearCoveredSegmentLocked() {
        int size;
        if (this.totalLength <= 0 || (size = this.dispatchedSegments.size()) <= 1) {
            return;
        }
        ArrayList<Segment> arrayList = null;
        int i = 0;
        int i2 = 1;
        while (i2 < size) {
            Segment segment = this.dispatchedSegments.get(i);
            Segment segment2 = this.dispatchedSegments.get(i2);
            if (segment.getCurrentOffsetRead() > segment2.getStartOffset() && segment2.getDownloadBytes() <= 0 && segment2.owner == null) {
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                }
                arrayList.add(segment2);
                if (this.debug) {
                    Log.w(TAG, "clearCovered, covered = " + segment2 + ", prev = " + segment);
                }
                i2++;
            } else {
                if (segment2.getCurrentOffsetRead() > segment.getCurrentOffsetRead()) {
                    i++;
                }
                i2++;
            }
        }
        if (arrayList != null) {
            for (Segment segment3 : arrayList) {
                this.dispatchedSegments.remove(segment3);
                for (SegmentReader segmentReader : this.readers) {
                    if (segmentReader.curSegment == segment3) {
                        if (this.debug) {
                            Log.w(TAG, "clearCoveredSegmentLocked: reconnect, segment = " + segment3 + ", threadIndex = " + segmentReader.threadIndex);
                        }
                        segmentReader.reconnect(true);
                    }
                }
            }
        }
    }

    private boolean isAllContentDownloaded() {
        long j = this.totalLength;
        if (j <= 0) {
            this.isAllContentDownloaded = false;
            return false;
        }
        synchronized (this) {
            long firstOffset = SegmentUtils.getFirstOffset(this.dispatchedSegments);
            Logger.i(TAG, "isAllContentDownloaded: firstOffset = " + firstOffset);
            if (firstOffset >= j) {
                this.isAllContentDownloaded = true;
                return true;
            }
            this.isAllContentDownloaded = false;
            return false;
        }
    }

    private Segment obtainChildSegmentFromMaxRemain(SegmentReader segmentReader, UrlRecord urlRecord) {
        int ratioSegmentStrategy;
        String str;
        String str2;
        float f;
        int size = this.dispatchedSegments.size();
        long j = -1;
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            long unconfirmedRemainBytes = getUnconfirmedRemainBytes(i2, size);
            if (unconfirmedRemainBytes > j) {
                i = i2;
                j = unconfirmedRemainBytes;
            }
        }
        long segmentMinSize = this.strategy.getSegmentMinSize();
        long segmentMaxSize = this.strategy.getSegmentMaxSize();
        if (i >= 0 && j > segmentMinSize) {
            Segment segment = this.dispatchedSegments.get(i);
            if (this.dispatchedSegments.size() < this.readers.size()) {
                ratioSegmentStrategy = 2;
            } else {
                ratioSegmentStrategy = this.strategy.getRatioSegmentStrategy();
            }
            if (ratioSegmentStrategy == 1) {
                SegmentReader segmentReader2 = segment.owner;
                if (segmentReader2 == null) {
                    str2 = TAG;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j2 = currentTimeMillis - 4000;
                    long recentDownloadSpeed = segmentReader2.getRecentDownloadSpeed(j2, currentTimeMillis);
                    long recentDownloadSpeed2 = segmentReader.getRecentDownloadSpeed(j2, currentTimeMillis);
                    if (recentDownloadSpeed > 0 && recentDownloadSpeed2 > 0) {
                        f = ((float) recentDownloadSpeed2) / ((float) (recentDownloadSpeed + recentDownloadSpeed2));
                    } else {
                        f = -1.0f;
                    }
                    if (f == -1.0f) {
                        long readBytes = segmentReader2.getReadBytes();
                        long readBytes2 = segmentReader.getReadBytes();
                        if (readBytes > 0 && readBytes2 > 0) {
                            f = ((float) readBytes2) / ((float) (readBytes + readBytes2));
                        }
                    }
                    if (f <= 0.0f) {
                        str2 = TAG;
                    } else {
                        float f2 = f * 0.9f;
                        long j3 = ((float) j) * f2;
                        if (j3 < segmentMinSize) {
                            j3 = segmentMinSize;
                        }
                        if (segmentMaxSize <= 0 || j3 <= segmentMaxSize) {
                            segmentMaxSize = j3;
                        }
                        long j4 = segmentMinSize / 2;
                        long j5 = j - j4;
                        if (segmentMaxSize > j5) {
                            segmentMaxSize = j5;
                        } else if (segmentMaxSize < j4) {
                            segmentMaxSize = j4;
                        }
                        Segment segment2 = new Segment(segment.getCurrentOffsetRead() + (j - segmentMaxSize), segment.getEndOffset());
                        Logger.i(TAG, "obtainSegment: parent = " + segment + ", child = " + segment2 + ", maxRemainBytes = " + j + ", childLength = " + segmentMaxSize + ", ratio = " + f2 + ", threadIndex = " + segmentReader.threadIndex);
                        return segment2;
                    }
                }
                str = str2;
            } else if (ratioSegmentStrategy != 2) {
                str = TAG;
            } else {
                float downloadRatio = getDownloadRatio(segmentReader, urlRecord);
                long curBytes = ((float) (this.totalLength - this.downloadInfo.getCurBytes())) * downloadRatio;
                if (curBytes < segmentMinSize) {
                    curBytes = segmentMinSize;
                }
                if (segmentMaxSize <= 0 || curBytes <= segmentMaxSize) {
                    segmentMaxSize = curBytes;
                }
                long j6 = segmentMinSize / 2;
                long j7 = j - j6;
                if (segmentMaxSize > j7) {
                    segmentMaxSize = j7;
                } else if (segmentMaxSize < j6) {
                    segmentMaxSize = j6;
                }
                Segment segment3 = new Segment(segment.getCurrentOffsetRead() + (j - segmentMaxSize), segment.getEndOffset());
                Logger.i(TAG, "obtainSegment: parent = " + segment + ", child = " + segment3 + ", maxRemainBytes = " + j + ", childLength = " + segmentMaxSize + ", ratio = " + downloadRatio + ", threadIndex = " + segmentReader.threadIndex);
                return segment3;
            }
            Segment segment4 = new Segment(segment.getCurrentOffsetRead() + (j / 2), segment.getEndOffset());
            Logger.i(str, "obtainSegment: parent = " + segment + ",child = " + segment4);
            return segment4;
        }
        return null;
    }

    private float getDownloadRatio(SegmentReader segmentReader, UrlRecord urlRecord) {
        long readBytes = segmentReader.getReadBytes();
        int size = this.readers.size();
        if (size <= 1) {
            size = this.strategy.getThreadCount();
        }
        if (readBytes <= 0) {
            float mainRatio = this.strategy.getMainRatio();
            if (mainRatio <= 0.0f || mainRatio >= 1.0f) {
                mainRatio = 1.0f / size;
            }
            if (segmentReader.threadIndex == 0) {
                return mainRatio;
            }
            if (size > 1) {
                return (1.0f - mainRatio) / (size - 1);
            }
            return 1.0f / size;
        }
        long totalReadBytes = getTotalReadBytes();
        if (totalReadBytes > readBytes) {
            return ((float) readBytes) / ((float) totalReadBytes);
        }
        return 1.0f / size;
    }

    private long getTotalReadBytes() {
        long j = 0;
        for (SegmentReader segmentReader : this.readers) {
            j += segmentReader.getReadBytes();
        }
        return j;
    }

    private Segment obtainSegmentWhenNoNewSegment() {
        int i = 0;
        while (true) {
            Segment obtainLeastCompetitorSegment = obtainLeastCompetitorSegment();
            if (obtainLeastCompetitorSegment == null) {
                return null;
            }
            SegmentReader segmentReader = obtainLeastCompetitorSegment.owner;
            if (segmentReader == null) {
                return obtainLeastCompetitorSegment;
            }
            if (obtainLeastCompetitorSegment.getCompetitor() >= 2) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            markProgress(currentTimeMillis);
            if (currentTimeMillis - segmentReader.readStartTime > 2000 && isDownloadSpeedPoor(segmentReader, currentTimeMillis - 2000, currentTimeMillis, 500L, 1.0d)) {
                if (this.debug) {
                    Log.i(TAG, "obtainSegmentWhenNoNewSegment: isDownloadSpeedPoor segment = " + obtainLeastCompetitorSegment + ", owner.threadIndex = " + segmentReader.threadIndex);
                }
                return obtainLeastCompetitorSegment;
            }
            int i2 = i + 1;
            if (i > 2) {
                if (this.debug) {
                    Log.i(TAG, "obtainSegmentWhenNoNewSegment: waitCount > 2, return segment = " + obtainLeastCompetitorSegment);
                }
                return obtainLeastCompetitorSegment;
            }
            try {
                synchronized (this) {
                    wait(500L);
                }
                i = i2;
            } catch (InterruptedException e) {
                return null;
            }
        }
    }

    private Segment obtainLeastCompetitorSegment() {
        int competitor;
        Segment segment = null;
        int i = Integer.MAX_VALUE;
        for (Segment segment2 : this.dispatchedSegments) {
            if (getRemainReadBytes(segment2) > 0 && (competitor = segment2.getCompetitor()) < i) {
                segment = segment2;
                i = competitor;
            }
        }
        return segment;
    }

    private long getUnconfirmedRemainBytes(int i, int i2) {
        Segment segment = this.dispatchedSegments.get(i);
        long remainReadBytes = getRemainReadBytes(segment);
        int i3 = i + 1;
        Segment segment2 = i3 < i2 ? this.dispatchedSegments.get(i3) : null;
        if (segment2 == null) {
            return remainReadBytes;
        }
        long startOffset = segment2.getStartOffset() - segment.getCurrentOffsetRead();
        if (remainReadBytes == -1) {
            return startOffset;
        }
        return Math.min(remainReadBytes, startOffset);
    }

    private long getRemainReadBytes(Segment segment) {
        long remainReadBytes = segment.getRemainReadBytes();
        if (remainReadBytes == -1) {
            long j = this.totalLength;
            if (j > 0) {
                return j - segment.getCurrentOffsetRead();
            }
            return remainReadBytes;
        }
        return remainReadBytes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SegmentReader findEarliestConnectTimeoutReader(boolean z, long j, long j2) {
        SegmentReader segmentReader = null;
        for (SegmentReader segmentReader2 : this.readers) {
            if (segmentReader2.threadIndex != 0 || z) {
                if (segmentReader2.connectStartTime > 0 && segmentReader2.connectEndTime <= 0 && j - segmentReader2.connectStartTime > j2) {
                    if (segmentReader == null) {
                        segmentReader = segmentReader2;
                    } else if (segmentReader2.connectStartTime < segmentReader.connectStartTime) {
                        segmentReader = segmentReader2;
                    }
                }
            }
        }
        return segmentReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long scheduleWatchRead() {
        if (this.canceled || this.paused) {
            return -1L;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            markProgress(currentTimeMillis);
            long readTimeout = this.strategy.getReadTimeout();
            if (readTimeout > 0) {
                long j = this.lastReconnectTime;
                if (j > 0 && currentTimeMillis - j > readTimeout && findPoorReadThreadAndReconnect(currentTimeMillis, readTimeout)) {
                    this.lastReconnectTime = currentTimeMillis;
                    this.reconnectCount++;
                }
            }
        }
        return 2000L;
    }

    private void markProgress(long j) {
        this.stenographer.markProgress(this.downloadInfo.getCurBytes(), j);
        for (SegmentReader segmentReader : this.readers) {
            segmentReader.markProgress(j);
        }
    }

    private boolean isDownloadSpeedPoor(SegmentReader segmentReader, long j, long j2, long j3, double d) {
        if (segmentReader.readStartTime > 0) {
            long recentDownloadSpeed = this.stenographer.getRecentDownloadSpeed(j, j2);
            int size = this.readers.size();
            long j4 = size > 0 ? recentDownloadSpeed / size : recentDownloadSpeed;
            long recentDownloadSpeed2 = segmentReader.getRecentDownloadSpeed(j, j2);
            if (recentDownloadSpeed2 < j3 || recentDownloadSpeed2 < j4 * d) {
                Log.i(TAG, "isDownloadSpeedPoor: totalSpeed = " + recentDownloadSpeed + ", threadAvgSpeed = " + j4 + ", poorSpeed = " + j3 + ", speed = " + recentDownloadSpeed2 + ",threadIndex = " + segmentReader.threadIndex);
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean findPoorReadThreadAndReconnect(long j, long j2) {
        long j3 = j - j2;
        long recentDownloadSpeed = this.stenographer.getRecentDownloadSpeed(j3, j);
        int size = this.readers.size();
        if (size > 0) {
            recentDownloadSpeed /= size;
        }
        SegmentReader findPoorReadThread = findPoorReadThread(j3, j, Math.max(10.0f, ((float) recentDownloadSpeed) * this.poorSpeedRatio), size / 2);
        if (findPoorReadThread != null) {
            trySwitchNextUrlForReader(findPoorReadThread);
            Logger.w(TAG, "handlePoorReadThread: reconnect for poor speed, threadIndex = " + findPoorReadThread.threadIndex);
            findPoorReadThread.reconnect();
            return true;
        }
        SegmentReader findEarliestConnectTimeoutReader = findEarliestConnectTimeoutReader(true, j, j2);
        if (findEarliestConnectTimeoutReader != null) {
            trySwitchNextUrlForReader(findEarliestConnectTimeoutReader);
            Logger.w(TAG, "handlePoorReadThread: reconnect for connect timeout, threadIndex = " + findEarliestConnectTimeoutReader.threadIndex);
            findEarliestConnectTimeoutReader.reconnect();
            return true;
        }
        return false;
    }

    private SegmentReader findPoorReadThread(long j, long j2, long j3, int i) {
        long j4;
        long j5 = Long.MAX_VALUE;
        int i2 = 0;
        SegmentReader segmentReader = null;
        for (SegmentReader segmentReader2 : this.readers) {
            if (segmentReader2.readStartTime > 0) {
                i2++;
                if (segmentReader2.readStartTime < j) {
                    j4 = j5;
                    long recentDownloadSpeed = segmentReader2.getRecentDownloadSpeed(j, j2);
                    if (this.debug) {
                        Log.i(TAG, "findPoorReadThread: speed = " + recentDownloadSpeed + ", threadIndex = " + segmentReader2.threadIndex);
                    }
                    if (recentDownloadSpeed >= 0 && recentDownloadSpeed < j4) {
                        j5 = recentDownloadSpeed;
                        segmentReader = segmentReader2;
                    }
                } else {
                    j4 = j5;
                }
                j5 = j4;
            }
        }
        long j6 = j5;
        if (segmentReader != null && i2 >= i && j6 < j3) {
            Logger.i(TAG, "findPoorReadThread: ----------- minSpeed = " + j6 + ", threadIndex = " + segmentReader.threadIndex);
            return segmentReader;
        }
        return null;
    }
}
