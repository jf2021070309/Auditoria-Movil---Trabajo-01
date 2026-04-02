package com.ss.android.socialbase.downloader.network.connectionpool;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.IFetchHttpHeadInfoListener;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class DownloadPreconnecter {
    private static final long DEFAULT_CONNECTION_OUTDATE_TIME = 300000;
    private static final long DEFAULT_HEAD_INFO_OUTDATE_TIME = 300000;
    private static Runnable sCancelRunnable;
    static long sConnectionOutdatedTime;
    private static final Handler sHandler;
    static long sHeadInfoOutdatedTime;
    private static final HandlerThread sPreconnectThread;

    static {
        HandlerThread handlerThread = new HandlerThread("Downloader-preconnecter");
        sPreconnectThread = handlerThread;
        init();
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        sHandler = handler;
        handler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.network.connectionpool.DownloadPreconnecter.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable th) {
                }
            }
        });
    }

    public static Looper getLooper() {
        return sPreconnectThread.getLooper();
    }

    public static void preconnect(String str, String str2, boolean z) {
        preconnect(-1, str, str2, null, z, true);
    }

    public static void preconnect(int i, String str, String str2, List<HttpHeader> list, boolean z, boolean z2) {
        long j;
        DownloadInfo downloadInfo = Downloader.getInstance(DownloadComponentManager.getAppContext()).getDownloadInfo(str, str2);
        if (downloadInfo == null) {
            j = 0;
        } else if (downloadInfo.isDownloadingStatus() || downloadInfo.isDownloaded() || downloadInfo.getChunkCount() > 1) {
            return;
        } else {
            j = DownloadUtils.getFirstOffset(downloadInfo);
        }
        asyncPreconnect(i, str, getExtraHeaders(j, downloadInfo, list), j, z, z2);
    }

    public static void asyncFetchHttpHeadInfo(final String str, final IFetchHttpHeadInfoListener iFetchHttpHeadInfoListener) {
        sHandler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.network.connectionpool.DownloadPreconnecter.2
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006a -> B:34:0x006c). Please submit an issue!!! */
            @Override // java.lang.Runnable
            public void run() {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        try {
                            try {
                                List<HttpHeader> extraHeaders = DownloadPreconnecter.getExtraHeaders(0L, null, null);
                                r1 = DownloadConnectionPool.getInstance().isHeadConnectionExist(str) ? DownloadConnectionPool.getInstance().getCachedHeadConnection(str, extraHeaders) : null;
                                if (r1 == null) {
                                    FakeDownloadHeadHttpConnection fakeDownloadHeadHttpConnection = new FakeDownloadHeadHttpConnection(str, extraHeaders, 0L);
                                    try {
                                        fakeDownloadHeadHttpConnection.execute();
                                        if (fakeDownloadHeadHttpConnection.isSuccessful()) {
                                            DownloadConnectionPool.getInstance().putCachedHeadConnections(str, fakeDownloadHeadHttpConnection);
                                        }
                                        r1 = fakeDownloadHeadHttpConnection;
                                    } catch (Exception e) {
                                        e = e;
                                        r1 = fakeDownloadHeadHttpConnection;
                                        e.printStackTrace();
                                        r1.cancel();
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        r1 = fakeDownloadHeadHttpConnection;
                                        try {
                                            r1.cancel();
                                        } catch (Throwable th2) {
                                        }
                                        throw th;
                                    }
                                }
                                Map<String, String> responseHeaders = r1.getResponseHeaders();
                                IFetchHttpHeadInfoListener iFetchHttpHeadInfoListener2 = iFetchHttpHeadInfoListener;
                                if (iFetchHttpHeadInfoListener2 != null) {
                                    iFetchHttpHeadInfoListener2.onFetchFinished(responseHeaders);
                                }
                                r1.cancel();
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th4) {
                        while (true) {
                            return;
                        }
                    }
                } else {
                    IFetchHttpHeadInfoListener iFetchHttpHeadInfoListener3 = iFetchHttpHeadInfoListener;
                    if (iFetchHttpHeadInfoListener3 != null) {
                        iFetchHttpHeadInfoListener3.onFetchFinished(null);
                    }
                }
            }
        });
    }

    private static void init() {
        sConnectionOutdatedTime = DownloadSetting.obtainGlobal().optLong(DownloadSettingKeys.GLOBAL_KEY_PRECONNECT_CONNECTION_OUTDATE_TIME, 300000L);
        sHeadInfoOutdatedTime = DownloadSetting.obtainGlobal().optLong(DownloadSettingKeys.GLOBAL_KEY_PRECONNECT_HEAD_INFO_OUTDATE_TIME, 300000L);
        DownloadConnectionPool.getInstance().setMaxCachedDownloadConnectionSize(DownloadSetting.obtainGlobal().optInt(DownloadSettingKeys.GLOBAL_KEY_PRECONNECT_MAX_CACHE_SIZE, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<HttpHeader> getExtraHeaders(long j, DownloadInfo downloadInfo, List<HttpHeader> list) {
        return DownloadUtils.addRangeHeader(list, downloadInfo == null ? null : downloadInfo.geteTag(), j, 0L);
    }

    private static void asyncPreconnect(final int i, final String str, final List<HttpHeader> list, final long j, final boolean z, final boolean z2) {
        sHandler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.network.connectionpool.DownloadPreconnecter.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (z2) {
                        DownloadPreconnecter.fetchHeadInfo(str, list, j);
                    }
                    if (z) {
                        DownloadPreconnecter.createConnection(i, str, list, j);
                        Runnable unused = DownloadPreconnecter.sCancelRunnable = new CancelRunnable(str);
                        DownloadPreconnecter.sHandler.postDelayed(DownloadPreconnecter.sCancelRunnable, DownloadPreconnecter.sConnectionOutdatedTime);
                    }
                } catch (Throwable th) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void createConnection(int i, String str, List<HttpHeader> list, long j) {
        if (DownloadConnectionPool.getInstance().isDownloadConnectionExist(str)) {
            return;
        }
        FakeDownloadHttpConnection fakeDownloadHttpConnection = new FakeDownloadHttpConnection(i, str, list, j);
        DownloadConnectionPool.getInstance().putCachedDownloadConnections(str, fakeDownloadHttpConnection);
        try {
            fakeDownloadHttpConnection.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fetchHeadInfo(String str, List<HttpHeader> list, long j) {
        if (DownloadConnectionPool.getInstance().isHeadConnectionExist(str)) {
            return;
        }
        FakeDownloadHeadHttpConnection fakeDownloadHeadHttpConnection = new FakeDownloadHeadHttpConnection(str, list, j);
        DownloadConnectionPool.getInstance().putCachedHeadConnections(str, fakeDownloadHeadHttpConnection);
        try {
            try {
                try {
                    fakeDownloadHeadHttpConnection.execute();
                    fakeDownloadHeadHttpConnection.cancel();
                } catch (Throwable th) {
                    try {
                        fakeDownloadHeadHttpConnection.cancel();
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            } catch (Exception e) {
                e.printStackTrace();
                fakeDownloadHeadHttpConnection.cancel();
            }
        } catch (Throwable th3) {
        }
    }

    /* loaded from: classes3.dex */
    private static class CancelRunnable implements Runnable {
        private final String mUrl;

        public CancelRunnable(String str) {
            this.mUrl = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                DownloadConnectionPool.getInstance().releaseDownloadConnection(this.mUrl);
            } catch (Throwable th) {
            }
        }
    }
}
