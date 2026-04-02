package com.ss.android.downloadlib;

import android.text.TextUtils;
import com.ss.android.download.api.config.ll;
import com.ss.android.download.api.config.lp;
import com.ss.android.download.api.config.tb;
import com.ss.android.download.api.config.yk;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.socialbase.appdownloader.DownloadHandlerService;
import com.ss.android.socialbase.downloader.common.AppStatusManager;
import com.ss.android.socialbase.downloader.depend.INotificationClickCallback;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.DownloaderBuilder;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class q implements com.ss.android.download.api.dr {
    @Override // com.ss.android.download.api.dr
    public com.ss.android.download.api.dr dr(ll llVar) {
        wb.dr(llVar);
        return this;
    }

    @Override // com.ss.android.download.api.dr
    public com.ss.android.download.api.dr dr(com.ss.android.download.api.config.rb rbVar) {
        wb.dr(rbVar);
        return this;
    }

    @Override // com.ss.android.download.api.dr
    public com.ss.android.download.api.dr dr(yk ykVar) {
        wb.dr(ykVar);
        return this;
    }

    @Override // com.ss.android.download.api.dr
    public com.ss.android.download.api.dr dr(com.ss.android.download.api.config.xu xuVar) {
        wb.dr(xuVar);
        return this;
    }

    @Override // com.ss.android.download.api.dr
    public com.ss.android.download.api.dr dr(com.ss.android.download.api.config.wb wbVar) {
        wb.dr(wbVar);
        return this;
    }

    @Override // com.ss.android.download.api.dr
    public com.ss.android.download.api.dr dr(com.ss.android.download.api.model.dr drVar) {
        wb.dr(drVar);
        return this;
    }

    @Override // com.ss.android.download.api.dr
    public com.ss.android.download.api.dr dr(String str) {
        wb.dr(str);
        return this;
    }

    @Override // com.ss.android.download.api.dr
    public com.ss.android.download.api.dr dr(final com.ss.android.download.api.config.ge geVar) {
        wb.dr(geVar);
        AppStatusManager.getInstance().setInnerAppStatusChangeCaller(new AppStatusManager.InnerAppStatusChangeCaller() { // from class: com.ss.android.downloadlib.q.1
            @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.InnerAppStatusChangeCaller
            public boolean isAppInBackground() {
                return geVar.dr();
            }
        });
        return this;
    }

    @Override // com.ss.android.download.api.dr
    public com.ss.android.download.api.dr dr(DownloaderBuilder downloaderBuilder) {
        if (downloaderBuilder.getNotificationClickCallback() == null) {
            downloaderBuilder.notificationClickCallback(new INotificationClickCallback() { // from class: com.ss.android.downloadlib.q.2
                @Override // com.ss.android.socialbase.downloader.depend.INotificationClickCallback
                public boolean onClickWhenUnSuccess(DownloadInfo downloadInfo) {
                    DownloadSetting obtain = DownloadSetting.obtain(downloadInfo.getId());
                    if (obtain.optInt("notification_opt_2") == 1) {
                        if (downloadInfo.getStatus() == -2) {
                            DownloadHandlerService.dr(wb.getContext(), downloadInfo, com.ss.android.socialbase.appdownloader.g.wb().ge(), Downloader.getInstance(wb.getContext()).getDownloadNotificationEventListener(downloadInfo.getId()));
                        }
                        return true;
                    }
                    boolean dr = dr(downloadInfo);
                    if (obtain.optInt("disable_delete_dialog", 0) == 1) {
                        return true;
                    }
                    return dr;
                }

                private boolean dr(DownloadInfo downloadInfo) {
                    String dr;
                    tb de2 = wb.de();
                    if (de2 != null) {
                        com.ss.android.downloadad.api.dr.ge dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo);
                        if (dr2 != null && dr2.o()) {
                            dr = DownloadSetting.obtain(downloadInfo.getId()).optString("ad_notification_jump_url", null);
                        } else {
                            dr = com.ss.android.downloadlib.addownload.xu.dr(downloadInfo);
                        }
                        if (!TextUtils.isEmpty(dr)) {
                            return de2.dr(wb.getContext(), dr);
                        }
                        return false;
                    }
                    return false;
                }

                @Override // com.ss.android.socialbase.downloader.depend.INotificationClickCallback
                public boolean onClickWhenSuccess(DownloadInfo downloadInfo) {
                    return false;
                }

                @Override // com.ss.android.socialbase.downloader.depend.INotificationClickCallback
                public boolean onClickWhenInstalled(DownloadInfo downloadInfo) {
                    if (downloadInfo == null) {
                        return false;
                    }
                    com.ss.android.downloadad.api.dr.ge dr = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo);
                    if (dr != null) {
                        com.ss.android.downloadlib.ge.dr.dr(dr);
                    } else {
                        com.ss.android.downloadlib.rb.ll.ge(wb.getContext(), downloadInfo.getPackageName());
                    }
                    DownloadNotificationManager.getInstance().cancelNotification(downloadInfo.getId());
                    return true;
                }
            });
        }
        downloaderBuilder.addDownloadCompleteHandler(new com.ss.android.downloadlib.o.o());
        Downloader.initOrCover(downloaderBuilder, true);
        return this;
    }

    @Override // com.ss.android.download.api.dr
    public com.ss.android.download.api.dr dr(lp lpVar) {
        wb.dr(lpVar);
        return this;
    }

    @Override // com.ss.android.download.api.dr
    public void dr() {
        if (!wb.ii()) {
            com.ss.android.downloadlib.q.o.dr().dr("ttdownloader init error");
        }
        wb.dr(com.ss.android.downloadlib.q.o.dr());
        try {
            com.ss.android.socialbase.appdownloader.g.wb().ge(wb.tb());
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.ss.android.socialbase.appdownloader.g.wb().dr(dr.dr());
        g.dr().ge(new Runnable() { // from class: com.ss.android.downloadlib.q.3
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.socialbase.appdownloader.bn.q.dr("");
                if (com.ss.android.socialbase.appdownloader.bn.q.v()) {
                    DownloadComponentManager.setNotAutoRebootService(true);
                }
                if (DownloadSetting.obtainGlobal().optInt("disable_security_init", 1) == 1) {
                    com.ss.android.socialbase.appdownloader.bn.bn.dr(wb.getContext());
                }
            }
        });
    }
}
