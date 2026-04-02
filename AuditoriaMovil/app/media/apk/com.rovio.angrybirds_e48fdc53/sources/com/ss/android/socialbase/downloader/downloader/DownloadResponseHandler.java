package com.ss.android.socialbase.downloader.downloader;

import android.os.SystemClock;
import com.ss.android.socialbase.downloader.common.AppStatusManager;
import com.ss.android.socialbase.downloader.db.SqlDownloadCache;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.DefaultDownloadCache;
import com.ss.android.socialbase.downloader.impls.DownloadCache;
import com.ss.android.socialbase.downloader.impls.DownloadProxy;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.RandomAccessOutputStream;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.reader.AsyncStreamReader;
import com.ss.android.socialbase.downloader.reader.IStreamReader;
import com.ss.android.socialbase.downloader.reader.SyncStreamReader;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.thread.IDownloadRunnableCallback;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
/* loaded from: classes3.dex */
public class DownloadResponseHandler {
    private static final boolean DEBUG = false;
    public static final int MIN_SYNC_STEP_BYTE = 65536;
    public static final long MIN_SYNC_TIME_MS = 500;
    private static String TAG = "ResponseHandler";
    private final AppStatusManager appStatusManager;
    private final boolean bugfixCancelThenUpdate;
    private final IDownloadRunnableCallback callback;
    private volatile boolean canceled;
    private long curOffset;
    private IDownloadCache customCache;
    private long debugReadTimeNs;
    private long debugSyncTimeNs;
    private long debugTotalTimeNs;
    private long debugWriteTimeNs;
    private DownloadCache downloadCache;
    private final DownloadChunk downloadChunk;
    private volatile long downloadChunkContentLen;
    private final DownloadInfo downloadInfo;
    private volatile long endOffset;
    private BaseException exception;
    private long handleStartOffset;
    private final boolean hasSyncStrategy;
    private final IDownloadHttpConnection httpConnection;
    private final boolean isMonitorRw;
    private RandomAccessOutputStream outputStream;
    private volatile boolean paused;
    private boolean rwConcurrent;
    private final DownloadSetting setting;
    private ISqlDownloadCache sqlDownloadCache;
    private final long syncIntervalMsBg;
    private final long syncIntervalMsFg;
    private final String url;
    boolean openLimitSpeed = false;
    private volatile long lastSyncBytes = 0;
    private volatile long lastSyncTimestamp = 0;

    public DownloadResponseHandler(DownloadInfo downloadInfo, String str, IDownloadHttpConnection iDownloadHttpConnection, DownloadChunk downloadChunk, IDownloadRunnableCallback iDownloadRunnableCallback) {
        this.downloadInfo = downloadInfo;
        this.url = str;
        IDownloadCache downloadCache = DownloadComponentManager.getDownloadCache();
        this.customCache = downloadCache;
        if (downloadCache instanceof DefaultDownloadCache) {
            DefaultDownloadCache defaultDownloadCache = (DefaultDownloadCache) downloadCache;
            this.downloadCache = defaultDownloadCache.getDownloadCache();
            this.sqlDownloadCache = defaultDownloadCache.getSqlDownloadCache();
        }
        this.httpConnection = iDownloadHttpConnection;
        this.downloadChunk = downloadChunk;
        this.callback = iDownloadRunnableCallback;
        long currentOffset = downloadChunk.getCurrentOffset();
        this.curOffset = currentOffset;
        this.handleStartOffset = currentOffset;
        if (downloadChunk.isHostChunk()) {
            this.downloadChunkContentLen = downloadChunk.getContentLength();
        } else {
            this.downloadChunkContentLen = downloadChunk.getRetainLength(false);
        }
        this.endOffset = downloadChunk.getEndOffset();
        this.appStatusManager = AppStatusManager.getInstance();
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
        this.bugfixCancelThenUpdate = DownloadExpSwitchCode.isSwitchEnable(65536);
    }

    public long getCurOffset() {
        return this.curOffset;
    }

    private boolean isStoppedStatus() {
        return this.paused || this.canceled;
    }

    public void pause() {
        if (this.paused) {
            return;
        }
        this.paused = true;
        cancelConnection();
    }

    public void cancel() {
        if (this.canceled) {
            return;
        }
        synchronized (this.callback) {
            this.canceled = true;
        }
        cancelConnection();
    }

    private void cancelConnection() {
        ExecutorService cPUThreadExecutor;
        if (this.httpConnection != null && (cPUThreadExecutor = DownloadComponentManager.getCPUThreadExecutor()) != null) {
            cPUThreadExecutor.execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.DownloadResponseHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        DownloadResponseHandler.this.httpConnection.end();
                    } catch (Throwable th) {
                    }
                }
            });
        }
    }

    private boolean canReuseConnection() {
        return this.downloadInfo.isNeedReuseFirstConnection() && this.downloadChunk.isReuseingFirstConnection();
    }

    public void setChunkOffset(long j, long j2, long j3) {
        this.curOffset = j;
        this.handleStartOffset = j;
        this.endOffset = j2;
        this.downloadChunkContentLen = j3;
    }

    public void setEndOffset(long j, long j2) {
        this.endOffset = j;
        this.downloadChunkContentLen = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0302 A[Catch: all -> 0x0554, TRY_ENTER, TryCatch #24 {all -> 0x0554, blocks: (B:189:0x0302, B:190:0x0309, B:219:0x03a3, B:221:0x03a9, B:222:0x03ac, B:263:0x049b, B:264:0x049d, B:268:0x04a4, B:270:0x04c4, B:299:0x0548, B:301:0x054e, B:302:0x0551, B:303:0x0553), top: B:343:0x002c, inners: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a3 A[Catch: all -> 0x0554, TRY_ENTER, TryCatch #24 {all -> 0x0554, blocks: (B:189:0x0302, B:190:0x0309, B:219:0x03a3, B:221:0x03a9, B:222:0x03ac, B:263:0x049b, B:264:0x049d, B:268:0x04a4, B:270:0x04c4, B:299:0x0548, B:301:0x054e, B:302:0x0551, B:303:0x0553), top: B:343:0x002c, inners: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x042d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c4 A[Catch: all -> 0x0554, TRY_LEAVE, TryCatch #24 {all -> 0x0554, blocks: (B:189:0x0302, B:190:0x0309, B:219:0x03a3, B:221:0x03a9, B:222:0x03ac, B:263:0x049b, B:264:0x049d, B:268:0x04a4, B:270:0x04c4, B:299:0x0548, B:301:0x054e, B:302:0x0551, B:303:0x0553), top: B:343:0x002c, inners: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x054e A[Catch: all -> 0x0554, TryCatch #24 {all -> 0x0554, blocks: (B:189:0x0302, B:190:0x0309, B:219:0x03a3, B:221:0x03a9, B:222:0x03ac, B:263:0x049b, B:264:0x049d, B:268:0x04a4, B:270:0x04c4, B:299:0x0548, B:301:0x054e, B:302:0x0551, B:303:0x0553), top: B:343:0x002c, inners: #30 }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleResponse() throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 1502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.DownloadResponseHandler.handleResponse():void");
    }

    private IStreamReader createStreamReader(InputStream inputStream) {
        int writeBufferSize = DownloadComponentManager.getWriteBufferSize();
        if (this.setting.optInt("rw_concurrent", 0) == 1 && this.downloadInfo.getChunkCount() == 1 && this.downloadInfo.getTotalBytes() > 20971520) {
            try {
                AsyncStreamReader asyncStreamReader = new AsyncStreamReader(inputStream, writeBufferSize, this.setting.optInt(DownloadSettingKeys.RW_CONCURRENT_MAX_BUFFER_COUNT, 4));
                this.rwConcurrent = true;
                return asyncStreamReader;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        SyncStreamReader syncStreamReader = new SyncStreamReader(inputStream, writeBufferSize);
        this.rwConcurrent = false;
        return syncStreamReader;
    }

    private void checkAndSync(boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - this.lastSyncTimestamp;
        if (this.hasSyncStrategy) {
            if (j > (this.appStatusManager.isAppForeground() ? this.syncIntervalMsFg : this.syncIntervalMsBg)) {
                sync();
                this.lastSyncTimestamp = uptimeMillis;
                return;
            }
            return;
        }
        long j2 = this.curOffset - this.lastSyncBytes;
        if (z || isNeedSync(j2, j)) {
            sync();
            this.lastSyncTimestamp = uptimeMillis;
        }
    }

    private boolean isNeedSync(long j, long j2) {
        return j > 65536 && j2 > 500;
    }

    public long getLastSyncBytes() {
        return this.lastSyncBytes;
    }

    private void sync() {
        boolean z;
        long nanoTime = this.isMonitorRw ? System.nanoTime() : 0L;
        try {
            this.outputStream.flushAndSync();
            z = true;
        } catch (Exception e) {
            z = false;
        }
        if (z) {
            this.downloadInfo.updateRealDownloadTime(true);
            boolean z2 = this.downloadInfo.getChunkCount() > 1;
            IDownloadProxy iDownloadProxy = DownloadProxy.get(DownloadUtils.needNotifyDownloaderProcess());
            if (z2) {
                updateDownloadChunk(this.sqlDownloadCache);
                if (iDownloadProxy != null) {
                    iDownloadProxy.updateDownloadInfo(this.downloadInfo);
                } else {
                    this.sqlDownloadCache.OnDownloadTaskProgress(this.downloadInfo.getId(), this.downloadInfo.getCurBytes());
                }
            } else if (iDownloadProxy != null) {
                iDownloadProxy.updateDownloadInfo(this.downloadInfo);
            } else {
                this.sqlDownloadCache.OnDownloadTaskProgress(this.downloadChunk.getId(), this.curOffset);
            }
            this.lastSyncBytes = this.curOffset;
        }
        if (this.isMonitorRw) {
            this.debugSyncTimeNs += System.nanoTime() - nanoTime;
        }
    }

    private void updateDownloadChunk(IDownloadCache iDownloadCache) {
        IDownloadProxy iDownloadProxy;
        DownloadChunk downloadChunk;
        DownloadChunk downloadChunk2;
        if (iDownloadCache == null) {
            return;
        }
        boolean z = iDownloadCache instanceof SqlDownloadCache;
        if (!z) {
            iDownloadProxy = null;
        } else {
            IDownloadProxy iDownloadProxy2 = DownloadProxy.get(DownloadUtils.needNotifyDownloaderProcess());
            if (iDownloadProxy2 != null) {
                iDownloadProxy = iDownloadProxy2;
            } else {
                return;
            }
        }
        if (this.downloadChunk.isHostChunk()) {
            downloadChunk = this.downloadChunk.getFirstReuseChunk();
        } else {
            downloadChunk = this.downloadChunk;
        }
        if (downloadChunk != null) {
            downloadChunk.setCurrentOffset(this.curOffset);
            if (!z || iDownloadProxy == null) {
                downloadChunk2 = downloadChunk;
                iDownloadCache.updateSubDownloadChunk(downloadChunk.getId(), downloadChunk.getChunkIndex(), downloadChunk.getHostChunkIndex(), this.curOffset);
            } else {
                iDownloadProxy.updateSubDownloadChunk(downloadChunk.getId(), downloadChunk.getChunkIndex(), downloadChunk.getHostChunkIndex(), this.curOffset);
                downloadChunk2 = downloadChunk;
            }
            if (downloadChunk2.canRefreshCurOffsetForReuseChunk()) {
                boolean z2 = false;
                if (downloadChunk2.hasNoBytesDownload()) {
                    long nextChunkCurOffset = downloadChunk2.getNextChunkCurOffset();
                    if (nextChunkCurOffset > this.curOffset) {
                        if (z && iDownloadProxy != null) {
                            iDownloadProxy.updateDownloadChunk(downloadChunk2.getId(), downloadChunk2.getHostChunkIndex(), nextChunkCurOffset);
                        } else {
                            iDownloadCache.updateDownloadChunk(downloadChunk2.getId(), downloadChunk2.getHostChunkIndex(), nextChunkCurOffset);
                        }
                        z2 = true;
                    }
                }
                if (!z2) {
                    if (!z || iDownloadProxy == null) {
                        iDownloadCache.updateDownloadChunk(downloadChunk2.getId(), downloadChunk2.getHostChunkIndex(), this.curOffset);
                    } else {
                        iDownloadProxy.updateDownloadChunk(downloadChunk2.getId(), downloadChunk2.getHostChunkIndex(), this.curOffset);
                    }
                }
            }
        } else if (this.downloadChunk.isHostChunk()) {
            if (!z || iDownloadProxy == null) {
                iDownloadCache.updateDownloadChunk(this.downloadChunk.getId(), this.downloadChunk.getChunkIndex(), this.curOffset);
            } else {
                iDownloadProxy.updateDownloadChunk(this.downloadChunk.getId(), this.downloadChunk.getChunkIndex(), this.curOffset);
            }
        }
    }
}
