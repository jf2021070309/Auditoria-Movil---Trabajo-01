package com.ss.android.socialbase.downloader.segment;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.RetryThrowable;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.model.HttpResponse;
import com.ss.android.socialbase.downloader.network.AbsDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadStenographer;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.umeng.analytics.pro.as;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class SegmentReader implements Runnable {
    private static final int SEGMENT_APPLY_RETRY_MAX_COUNT = 50;
    private static final int SWITCH_URL_MAX_COUNT = 30;
    private static final String TAG = "SegmentReader";
    private volatile boolean changeSegment;
    private volatile boolean closed;
    volatile long connectEndTime;
    volatile long connectStartTime;
    String curHostIp;
    String curHostRealIp;
    private int curRetryCount;
    volatile Segment curSegment;
    String curUrl;
    private final DownloadInfo downloadInfo;
    private volatile long endOffsetInConnection;
    private boolean exited;
    private boolean failed;
    private BaseException failedException;
    private Future future;
    private final ISegmentCallback host;
    private IDownloadHttpConnection httpConnection;
    private HttpResponse httpResponse;
    private boolean httpsToHttpRetryUsed;
    private long lastConnectStartTime;
    private final IBufferPool pool;
    private volatile long readBytes;
    volatile long readEndTime;
    volatile long readStartTime;
    private volatile boolean reconnect;
    private int retryCount;
    private int segmentApplyRetryTimes;
    private volatile long segmentNewEndOffset;
    private final DownloadSetting setting;
    private long startOffsetInConnection;
    private DownloadStenographer stenographer;
    private int switchUrlTimes;
    private Thread thread;
    private volatile boolean threadDirty;
    final int threadIndex;
    UrlRecord urlRecord;
    private final List<Segment> succeedSegments = new ArrayList();
    private volatile long curSegmentReadOffset = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SegmentReader(DownloadInfo downloadInfo, SegmentDispatcher segmentDispatcher, IBufferPool iBufferPool, UrlRecord urlRecord, int i) {
        this.downloadInfo = downloadInfo;
        this.host = segmentDispatcher;
        this.pool = iBufferPool;
        this.setting = DownloadSetting.obtain(downloadInfo.getId());
        this.urlRecord = urlRecord;
        this.threadIndex = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
        r6.curSegment = null;
        r2 = r6.host;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.SegmentReader.run():void");
    }

    private boolean download(Segment segment) throws BaseException {
        initParams();
        try {
            try {
                doConnect(segment);
                loopAndRead(segment);
                releaseDownload();
                return true;
            } catch (SegmentApplyException e) {
                this.failedException = e;
                throw e;
            }
        }
    }

    private void releaseDownload() {
        this.lastConnectStartTime = this.connectStartTime;
        this.connectStartTime = -1L;
        this.connectEndTime = -1L;
        this.readStartTime = -1L;
        this.readEndTime = -1L;
        closeConnection();
    }

    private void closeConnection() {
        IDownloadHttpConnection iDownloadHttpConnection = this.httpConnection;
        if (iDownloadHttpConnection != null) {
            try {
                Logger.i(TAG, "closeConnection: thread = " + this.threadIndex);
                iDownloadHttpConnection.end();
                iDownloadHttpConnection.cancel();
            } catch (Throwable th) {
            }
        }
    }

    private void initParams() {
        this.httpsToHttpRetryUsed = false;
        resetRetryTimes();
    }

    private void resetRetryTimes() {
        this.retryCount = this.urlRecord.isMainUrl ? this.downloadInfo.getRetryCount() : this.downloadInfo.getBackUpUrlRetryCount();
        this.curRetryCount = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean switchUrlRecord(UrlRecord urlRecord) {
        int i = this.switchUrlTimes;
        if (i >= 30) {
            return false;
        }
        this.switchUrlTimes = i + 1;
        UrlRecord urlRecord2 = this.urlRecord;
        if (urlRecord2 != null) {
            urlRecord2.recordUnUse(this);
        }
        urlRecord.recordUse(this);
        this.urlRecord = urlRecord;
        resetRetryTimes();
        return true;
    }

    int getCurRetryCount() {
        return this.curRetryCount;
    }

    int getRetryCount() {
        return this.retryCount;
    }

    private boolean handleFailedAndCheckRetry(Segment segment, BaseException baseException) {
        Logger.e(TAG, "handleDownloadFailed:  e = " + baseException + ", curRetryCount = " + this.curRetryCount + ", retryCount = " + this.retryCount);
        this.failedException = baseException;
        this.urlRecord.recordFailed();
        this.host.onSegmentRetry(this, this.urlRecord, segment, baseException, this.curRetryCount, this.retryCount);
        int i = this.curRetryCount;
        if (i < this.retryCount) {
            this.curRetryCount = i + 1;
            return true;
        } else if (checkCanUseHttpsToHttpRetry(baseException)) {
            return true;
        } else {
            this.host.onSegmentFailed(this, this.urlRecord, segment, baseException);
            return false;
        }
    }

    private boolean checkCanUseHttpsToHttpRetry(BaseException baseException) {
        if (DownloadUtils.isHttpsError(baseException)) {
            String str = this.urlRecord.url;
            if (TextUtils.isEmpty(str) || !str.startsWith("https") || !this.downloadInfo.isNeedHttpsToHttpRetry() || this.httpsToHttpRetryUsed) {
                return false;
            }
            this.httpsToHttpRetryUsed = true;
            resetRetryTimes();
            return true;
        }
        return false;
    }

    private void doConnect(Segment segment) throws BaseException, RetryThrowable {
        createConnection(segment);
        this.host.onSegmentConnected(this, segment, this.urlRecord, this.httpResponse);
        this.urlRecord.recordSucceed();
    }

    private void createConnection(Segment segment) throws BaseException {
        String str;
        String str2;
        IDownloadHttpConnection downloadWithConnection;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.connectEndTime = 0L;
                this.connectStartTime = currentTimeMillis;
                this.startOffsetInConnection = segment.getCurrentOffsetRead();
                this.endOffsetInConnection = segment.getEndOffset();
                if (this.endOffsetInConnection > 0 && this.startOffsetInConnection > this.endOffsetInConnection) {
                    throw new SegmentApplyException(6, "createConn, " + segment);
                }
                this.stenographer = new DownloadStenographer();
                List<HttpHeader> addRangeHeader = DownloadUtils.addRangeHeader(this.downloadInfo.getExtraHeaders(), this.downloadInfo.geteTag(), this.startOffsetInConnection, this.endOffsetInConnection);
                addRangeHeader.add(new HttpHeader("Segment-Index", String.valueOf(segment.getIndex())));
                addRangeHeader.add(new HttpHeader("Thread-Index", String.valueOf(this.threadIndex)));
                DownloadUtils.addThrottleNetSpeed(addRangeHeader, this.downloadInfo);
                DownloadUtils.addTTNetProtectTimeout(addRangeHeader, this.downloadInfo);
                str = this.urlRecord.url;
                if (this.httpsToHttpRetryUsed && !TextUtils.isEmpty(str) && str.startsWith("https")) {
                    str = str.replaceFirst("https", "http");
                }
                str2 = this.urlRecord.ip;
                Logger.i(TAG, "createConnectionBegin: url = " + str + ", ip = " + str2 + ", segment = " + segment + ", threadIndex = " + this.threadIndex);
                this.curUrl = str;
                this.curHostIp = str2;
                downloadWithConnection = DownloadComponentManager.downloadWithConnection(this.downloadInfo.isNeedDefaultHttpServiceBackUp(), this.downloadInfo.getMaxBytes(), str, str2, addRangeHeader, 0, currentTimeMillis - this.lastConnectStartTime > 3000 && this.setting.optInt(DownloadSettingKeys.MONITOR_DOWNLOAD_CONNECT) > 0, this.downloadInfo);
            } finally {
                this.connectEndTime = System.currentTimeMillis();
            }
        } catch (BaseException e) {
            throw e;
        } catch (Throwable th) {
            DownloadUtils.parseException(th, "createConn");
        }
        if (downloadWithConnection == null) {
            throw new BaseException((int) DownloadErrorCode.ERROR_NO_CONNECTION, new IOException("download can't continue, chunk connection is null"));
        }
        this.httpConnection = downloadWithConnection;
        this.httpResponse = new HttpResponse(str, downloadWithConnection);
        if (this.closed) {
            throw new StreamClosedException("createConn");
        }
        if (downloadWithConnection instanceof AbsDownloadHttpConnection) {
            this.curHostRealIp = ((AbsDownloadHttpConnection) downloadWithConnection).getHostIp();
        }
        Log.i(TAG, "createConnectionSuccess: url = " + str + ", ip = " + str2 + ", hostRealIp = " + this.curHostRealIp + ", threadIndex = " + this.threadIndex);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d6, code lost:
        if (r11 <= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01da, code lost:
        if (r11 == Long.MAX_VALUE) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01de, code lost:
        if (r13 <= r11) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020d, code lost:
        throw new com.ss.android.socialbase.downloader.exception.BaseException((int) com.ss.android.socialbase.downloader.constants.DownloadErrorCode.ERROR_RESPONSE_DATA_NOT_EQUALS, java.lang.String.format("range[%d, %d] , but readCurrent[%d] , readStart[%d]", java.lang.Long.valueOf(r4), java.lang.Long.valueOf(r11), java.lang.Long.valueOf(r13), java.lang.Long.valueOf(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020e, code lost:
        com.ss.android.socialbase.downloader.utils.DownloadUtils.safeClose(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0217, code lost:
        if (r9 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x021a, code lost:
        r2 = r3.obtain();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021f, code lost:
        r2.size = -1;
        r9.write(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0225, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0228, code lost:
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x022b, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x022d, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0138, code lost:
        r7 = r11 + 1;
        r11 = r13 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0142, code lost:
        if (r11 <= 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0144, code lost:
        com.ss.android.socialbase.downloader.logger.Logger.e(com.ss.android.socialbase.downloader.segment.SegmentReader.TAG, "loopAndRead: redundant = " + r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015b, code lost:
        r31.curSegmentReadOffset = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015e, code lost:
        r13 = r7;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0163, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016c, code lost:
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x016a -> B:82:0x016b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void loopAndRead(com.ss.android.socialbase.downloader.segment.Segment r32) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.SegmentReader.loopAndRead(com.ss.android.socialbase.downloader.segment.Segment):void");
    }

    private Buffer probeFirstBuffer(IBufferPool iBufferPool, InputStream inputStream) throws InterruptedException, BaseException, IOException {
        int i;
        Buffer obtain = iBufferPool.obtain();
        try {
            i = inputStream.read(obtain.data);
        } catch (Throwable th) {
            th = th;
            i = -1;
        }
        try {
            if (i == -1) {
                throw new BaseException((int) DownloadErrorCode.ERROR_PROBE_FIRST_BUFFER, as.s);
            }
            obtain.size = i;
            if (i == -1) {
                iBufferPool.recycle(obtain);
            }
            return obtain;
        } catch (Throwable th2) {
            th = th2;
            if (i == -1) {
                iBufferPool.recycle(obtain);
            }
            throw th;
        }
    }

    private long refreshSegmentEndOffset() {
        long j = this.segmentNewEndOffset;
        this.segmentNewEndOffset = 0L;
        if (j <= 0) {
            return Long.MAX_VALUE;
        }
        return j;
    }

    public boolean adjustSegmentEndOffset(long j) {
        long j2 = this.endOffsetInConnection;
        if (j > 0 || j2 <= 0) {
            if (j <= j2 || j2 <= 0) {
                this.segmentNewEndOffset = j;
                this.threadDirty = true;
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateReadBytes() {
        UrlRecord urlRecord = this.urlRecord;
        try {
            synchronized (this.host) {
                long readingBytes = getReadingBytes();
                if (readingBytes > 0) {
                    this.readBytes += readingBytes;
                    urlRecord.increaseDownloadBytes(readingBytes);
                }
                this.curSegmentReadOffset = -1L;
            }
        } catch (Throwable th) {
        }
    }

    public long getReadBytes() {
        long readingBytes;
        synchronized (this.host) {
            readingBytes = this.readBytes + getReadingBytes();
        }
        return readingBytes;
    }

    public long getReadingBytes() {
        synchronized (this.host) {
            long j = this.curSegmentReadOffset;
            long j2 = this.startOffsetInConnection;
            if (j2 < 0 || j <= j2) {
                return 0L;
            }
            return j - j2;
        }
    }

    public long getCurSegmentReadOffset() {
        return this.curSegmentReadOffset;
    }

    public void close() {
        Logger.i(TAG, "close: threadIndex = " + this.threadIndex);
        synchronized (this) {
            this.closed = true;
            this.threadDirty = true;
        }
        closeConnection();
        Future future = this.future;
        if (future != null) {
            this.future = null;
            try {
                future.cancel(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void reconnect() {
        reconnect(false);
    }

    public void reconnect(boolean z) {
        Logger.i(TAG, "reconnect: threadIndex = " + this.threadIndex);
        synchronized (this) {
            this.changeSegment = z;
            this.reconnect = true;
            this.threadDirty = true;
        }
        closeConnection();
        Thread thread = this.thread;
        if (thread != null) {
            try {
                Log.i(TAG, "reconnect: t.interrupt threadIndex = " + this.threadIndex);
                thread.interrupt();
            } catch (Throwable th) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setFuture(Future future) {
        this.future = future;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setFailed(boolean z) {
        this.failed = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isFailed() {
        return this.failed;
    }

    public boolean isExited() {
        return this.exited;
    }

    public void setExited(boolean z) {
        this.exited = z;
    }

    BaseException getFailedException() {
        return this.failedException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void markProgress(long j) {
        long j2 = this.curSegmentReadOffset;
        DownloadStenographer downloadStenographer = this.stenographer;
        if (j2 < 0 || downloadStenographer == null) {
            return;
        }
        Log.i(TAG, "markProgress: curSegmentReadOffset = " + j2 + ", threadIndex = " + this.threadIndex);
        downloadStenographer.markProgress(j2, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getRecentDownloadSpeed(long j, long j2) {
        DownloadStenographer downloadStenographer = this.stenographer;
        if (downloadStenographer == null) {
            return -1L;
        }
        return downloadStenographer.getRecentDownloadSpeed(j, j2);
    }

    long getCurSegmentDownloadSpeed(long j) {
        long j2 = this.readStartTime;
        if (j2 <= 0) {
            return -1L;
        }
        long j3 = j - j2;
        if (j3 <= 0) {
            return -1L;
        }
        long j4 = this.curSegmentReadOffset;
        long j5 = this.startOffsetInConnection;
        if (j5 < 0 || j4 < j5) {
            return 0L;
        }
        return (j4 - j5) / j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getStartOffsetInConnection() {
        return this.startOffsetInConnection;
    }
}
