package com.ss.android.socialbase.appdownloader.bn;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import java.io.File;
/* loaded from: classes3.dex */
public class ge {
    public static void dr(DownloadInfo downloadInfo) {
        ge(downloadInfo);
    }

    private static void ge(final DownloadInfo downloadInfo) {
        final Context appContext = DownloadComponentManager.getAppContext();
        boolean z = true;
        if (((downloadInfo.isAutoResumed() && !downloadInfo.isShowNotificationForNetworkResumed()) || com.ss.android.socialbase.appdownloader.o.ge(downloadInfo.getExtra()) || TextUtils.isEmpty(downloadInfo.getMimeType()) || !downloadInfo.getMimeType().equals(AdBaseConstants.MIME_APK)) && DownloadSetting.obtain(downloadInfo.getId()).optInt("auto_install_when_resume", 0) != 1) {
            z = false;
        }
        final int dr = z ? com.ss.android.socialbase.appdownloader.o.dr(appContext, downloadInfo.getId(), false) : 2;
        DownloadComponentManager.getCPUThreadExecutor().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.bn.ge.1
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.socialbase.appdownloader.o.g ge = com.ss.android.socialbase.appdownloader.g.wb().ge();
                IDownloadNotificationEventListener downloadNotificationEventListener = Downloader.getInstance(appContext).getDownloadNotificationEventListener(downloadInfo.getId());
                if (ge != null || downloadNotificationEventListener != null) {
                    File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                    if (file.exists()) {
                        try {
                            PackageInfo dr2 = com.ss.android.socialbase.appdownloader.o.dr(downloadInfo, file);
                            if (dr2 != null) {
                                String packageName = (dr == 1 || TextUtils.isEmpty(downloadInfo.getPackageName())) ? dr2.packageName : downloadInfo.getPackageName();
                                if (ge != null) {
                                    ge.dr(downloadInfo.getId(), 1, packageName, -3, downloadInfo.getDownloadTime());
                                }
                                if (downloadNotificationEventListener != null) {
                                    downloadNotificationEventListener.onNotificationEvent(1, downloadInfo, packageName, "");
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
