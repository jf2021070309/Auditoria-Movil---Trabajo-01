package com.ss.android.socialbase.downloader.segment;

import com.ss.android.socialbase.downloader.common.AppStatusManager;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.IDownloadCache;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.thread.IDownloadRunnableCallback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class MultiSegmentWriter {
    private static final boolean DEBUG = false;
    private static final int MIN_CACHE_BYTES = 65536;
    private static final int MIN_CACHE_TIME_MS = 100;
    private static final int MIN_SYNC_STEP_BYTE = 65536;
    private static final long MIN_SYNC_TIME_MS = 500;
    private static final String TAG = "MultiSegmentWriter";
    private final IDownloadRunnableCallback callback;
    private final DownloadInfo downloadInfo;
    private BaseException exception;
    private final boolean hasSyncStrategy;
    private final boolean isMonitorRw;
    private final IBufferPool pool;
    private final DownloadSetting setting;
    private final long syncIntervalMsBg;
    private final long syncIntervalMsFg;
    private long syncTimeNs;
    private final List<SegmentOutput> outputs = new LinkedList();
    private final List<SegmentOutput> doneOutputs = new ArrayList();
    private volatile boolean threadDirty = false;
    private volatile boolean paused = false;
    private volatile boolean canceled = false;
    private volatile long lastSyncBytes = 0;
    private volatile long lastSyncTimestamp = 0;
    private final IDownloadCache downloadCache = DownloadComponentManager.getDownloadCache();
    private final AppStatusManager appStatusManager = AppStatusManager.getInstance();

    /* JADX INFO: Access modifiers changed from: package-private */
    public MultiSegmentWriter(DownloadInfo downloadInfo, IDownloadRunnableCallback iDownloadRunnableCallback, IBufferPool iBufferPool) {
        this.downloadInfo = downloadInfo;
        this.callback = iDownloadRunnableCallback;
        this.pool = iBufferPool;
        DownloadSetting obtain = DownloadSetting.obtain(downloadInfo.getId());
        this.setting = obtain;
        boolean z = obtain.optInt(DownloadSettingKeys.SYNC_STRATEGY, 0) == 1;
        this.hasSyncStrategy = z;
        if (z) {
            this.syncIntervalMsFg = Math.max(obtain.optInt(DownloadSettingKeys.SYNC_INTERVAL_MS_FG, 5000), 500L);
            this.syncIntervalMsBg = Math.max(obtain.optInt(DownloadSettingKeys.SYNC_INTERVAL_MS_BG, 1000), 500L);
        } else {
            this.syncIntervalMsFg = 0L;
            this.syncIntervalMsBg = 0L;
        }
        this.isMonitorRw = obtain.optInt(DownloadSettingKeys.MONITOR_RW) == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void assignOutput(SegmentOutput segmentOutput) {
        synchronized (this) {
            this.outputs.add(segmentOutput);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02bc, code lost:
        r3.onProgress(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c2, code lost:
        if (r13 <= 0) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c5, code lost:
        r3.onProgress(r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0209 A[Catch: all -> 0x03f4, TryCatch #32 {all -> 0x03f4, blocks: (B:160:0x0205, B:162:0x0209, B:165:0x020f, B:167:0x0215, B:168:0x0218, B:169:0x022e, B:207:0x02b6, B:208:0x02b8, B:246:0x0340, B:248:0x034a, B:250:0x034e, B:287:0x03d2, B:289:0x03d8, B:290:0x03db, B:291:0x03f3), top: B:368:0x002b, inners: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0215 A[Catch: all -> 0x03f4, TryCatch #32 {all -> 0x03f4, blocks: (B:160:0x0205, B:162:0x0209, B:165:0x020f, B:167:0x0215, B:168:0x0218, B:169:0x022e, B:207:0x02b6, B:208:0x02b8, B:246:0x0340, B:248:0x034a, B:250:0x034e, B:287:0x03d2, B:289:0x03d8, B:290:0x03db, B:291:0x03f3), top: B:368:0x002b, inners: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x034a A[Catch: all -> 0x03f4, TryCatch #32 {all -> 0x03f4, blocks: (B:160:0x0205, B:162:0x0209, B:165:0x020f, B:167:0x0215, B:168:0x0218, B:169:0x022e, B:207:0x02b6, B:208:0x02b8, B:246:0x0340, B:248:0x034a, B:250:0x034e, B:287:0x03d2, B:289:0x03d8, B:290:0x03db, B:291:0x03f3), top: B:368:0x002b, inners: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03d8 A[Catch: all -> 0x03f4, TryCatch #32 {all -> 0x03f4, blocks: (B:160:0x0205, B:162:0x0209, B:165:0x020f, B:167:0x0215, B:168:0x0218, B:169:0x022e, B:207:0x02b6, B:208:0x02b8, B:246:0x0340, B:248:0x034a, B:250:0x034e, B:287:0x03d2, B:289:0x03d8, B:290:0x03db, B:291:0x03f3), top: B:368:0x002b, inners: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0261 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x02e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0241 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x02c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x037f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0433 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0412 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loopAndWrite(com.ss.android.socialbase.downloader.segment.IInput r31) throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.segment.MultiSegmentWriter.loopAndWrite(com.ss.android.socialbase.downloader.segment.IInput):void");
    }

    private void checkAndSync(long j, boolean z) throws IOException {
        long j2 = j - this.lastSyncTimestamp;
        if (this.hasSyncStrategy) {
            if (j2 > (this.appStatusManager.isAppForeground() ? this.syncIntervalMsFg : this.syncIntervalMsBg)) {
                flushAndSync();
                this.lastSyncTimestamp = j;
                return;
            }
            return;
        }
        long curBytes = this.downloadInfo.getCurBytes() - this.lastSyncBytes;
        if (z || isNeedSync(curBytes, j2)) {
            flushAndSync();
            this.lastSyncTimestamp = j;
        }
    }

    private boolean isNeedSync(long j, long j2) {
        return j > 65536 && j2 > 500;
    }

    public long getLastSyncBytes() {
        return this.lastSyncBytes;
    }

    private void outputDone(IOutput iOutput) {
        synchronized (this) {
            this.doneOutputs.add((SegmentOutput) iOutput);
        }
    }

    private void flushAndSync() throws IOException {
        boolean z = this.isMonitorRw;
        long nanoTime = z ? System.nanoTime() : 0L;
        DownloadInfo downloadInfo = this.downloadInfo;
        IDownloadCache iDownloadCache = this.downloadCache;
        List<SegmentOutput> list = this.outputs;
        List<SegmentOutput> list2 = this.doneOutputs;
        Map<Long, Segment> segmentMap = iDownloadCache.getSegmentMap(downloadInfo.getId());
        if (segmentMap == null) {
            segmentMap = new HashMap<>(4);
        }
        synchronized (this) {
            flush(list);
            sync(list);
            updateSegmentToMap(list, segmentMap);
            if (list2.size() > 0) {
                close(list2);
                list.removeAll(list2);
                list2.clear();
            }
        }
        if (1 != 0) {
            downloadInfo.updateRealDownloadTime(true);
            iDownloadCache.updateSegments(downloadInfo.getId(), segmentMap);
            iDownloadCache.updateDownloadInfo(downloadInfo);
            this.lastSyncBytes = downloadInfo.getCurBytes();
        }
        if (z) {
            this.syncTimeNs += System.nanoTime() - nanoTime;
        }
    }

    private void flush(List<SegmentOutput> list) throws IOException {
        for (SegmentOutput segmentOutput : list) {
            segmentOutput.flush();
        }
    }

    private void sync(List<SegmentOutput> list) throws IOException {
        for (SegmentOutput segmentOutput : list) {
            segmentOutput.sync();
        }
    }

    private void close(List<SegmentOutput> list) {
        for (SegmentOutput segmentOutput : list) {
            segmentOutput.close();
        }
    }

    private void updateSegmentToMap(List<SegmentOutput> list, Map<Long, Segment> map) {
        for (SegmentOutput segmentOutput : list) {
            Segment segment = segmentOutput.getSegment();
            Segment segment2 = map.get(Long.valueOf(segment.getStartOffset()));
            if (segment2 == null) {
                map.put(Long.valueOf(segment.getStartOffset()), new Segment(segment));
            } else {
                segment2.setCurrentOffset(segment.getCurrentOffset());
                segment2.setEndOffset(segment.getEndOffset());
            }
        }
    }

    public void cancel() {
        this.canceled = true;
        this.threadDirty = true;
    }

    public void pause() {
        this.paused = true;
        this.threadDirty = true;
    }
}
