package com.ss.android.downloadlib;

import android.content.SharedPreferences;
import android.util.SparseArray;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.IDownloadCache;
import com.ss.android.socialbase.downloader.impls.DefaultDownloadCache;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.thread.DefaultThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class g {
    private ExecutorService dr;
    private ExecutorService ge;
    private ScheduledExecutorService o;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class dr {
        private static g dr = new g();
    }

    public static g dr() {
        return dr.dr;
    }

    private g() {
    }

    public void dr(Runnable runnable) {
        dr(runnable, false);
    }

    public void ge(Runnable runnable) {
        ge(runnable, false);
    }

    public void dr(Runnable runnable, boolean z) {
        if (runnable == null) {
            return;
        }
        if (z && !yk.dr()) {
            runnable.run();
        } else {
            ge().execute(runnable);
        }
    }

    public void ge(Runnable runnable, boolean z) {
        if (runnable == null) {
            return;
        }
        if (z && !yk.dr()) {
            runnable.run();
        } else {
            o().execute(runnable);
        }
    }

    public void dr(Runnable runnable, long j) {
        try {
            g().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public ExecutorService ge() {
        if (this.dr == null) {
            synchronized (g.class) {
                if (this.dr == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue = new SynchronousQueue();
                    this.dr = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30L, timeUnit, synchronousQueue, new DefaultThreadFactory(xu.class.getName() + "-CPUThreadPool"));
                }
            }
        }
        return this.dr;
    }

    public ExecutorService o() {
        if (this.ge == null) {
            synchronized (g.class) {
                if (this.ge == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue = new SynchronousQueue();
                    this.ge = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30L, timeUnit, synchronousQueue, new DefaultThreadFactory(xu.class.getName() + "-IOThreadPool"));
                }
            }
        }
        return this.ge;
    }

    public ScheduledExecutorService g() {
        if (this.o == null) {
            synchronized (g.class) {
                if (this.o == null) {
                    this.o = new ScheduledThreadPoolExecutor(0, new DefaultThreadFactory(xu.class.getName() + "-ScheduledThreadPool"));
                }
            }
        }
        return this.o;
    }

    public void q() {
        dr(new Runnable() { // from class: com.ss.android.downloadlib.g.1
            @Override // java.lang.Runnable
            public void run() {
                IDownloadCache downloadCache;
                synchronized (g.class) {
                    try {
                        String[] strArr = {"sp_ad_download_event", "sp_download_finish_cache", "sp_delay_operation_info", "sp_ttdownloader_md5", "sp_name_installed_app", "misc_config", "sp_ad_install_back_dialog", "sp_ttdownloader_clean", "sp_order_download", "sp_a_b_c", DownloadConstants.SP_ANTI_HIJACK_CONFIG, DownloadConstants.SP_DOWNLOAD_INFO, "sp_appdownloader"};
                        for (int i = 0; i < 13; i++) {
                            SharedPreferences sharedPreferences = wb.getContext().getSharedPreferences(strArr[i], 0);
                            if (sharedPreferences != null) {
                                sharedPreferences.edit().clear().apply();
                            }
                        }
                        downloadCache = DownloadComponentManager.getDownloadCache();
                    } catch (Throwable th) {
                    }
                    if (downloadCache instanceof DefaultDownloadCache) {
                        SparseArray<DownloadInfo> downloadInfoMap = ((DefaultDownloadCache) downloadCache).getDownloadCache().getDownloadInfoMap();
                        for (int size = downloadInfoMap.size() - 1; size >= 0; size--) {
                            DownloadInfo downloadInfo = downloadInfoMap.get(downloadInfoMap.keyAt(size));
                            if (downloadInfo != null) {
                                Downloader.getInstance(wb.getContext()).clearDownloadData(downloadInfo.getId());
                            }
                        }
                    }
                }
            }
        });
    }
}
