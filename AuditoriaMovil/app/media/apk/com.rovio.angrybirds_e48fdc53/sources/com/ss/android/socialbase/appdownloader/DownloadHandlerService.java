package com.ss.android.socialbase.appdownloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.Toast;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener;
import com.ss.android.socialbase.downloader.depend.INotificationClickCallback;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.DownloadProcessDispatcher;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.AbsNotificationItem;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.File;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class DownloadHandlerService extends Service {
    private static final String dr = DownloadHandlerService.class.getSimpleName();

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        DownloadComponentManager.setAppContext(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (Logger.debug()) {
            Logger.d(dr, "onStartCommand");
        }
        dr(intent);
        stopSelf();
        return 2;
    }

    private boolean dr(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return false;
        }
        int intExtra = intent.getIntExtra("extra_click_download_ids", 0);
        intent.getIntExtra("extra_click_download_type", 0);
        com.ss.android.socialbase.appdownloader.o.g ge = g.wb().ge();
        IDownloadNotificationEventListener downloadNotificationEventListener = Downloader.getInstance(this).getDownloadNotificationEventListener(intExtra);
        boolean z = true;
        if (intent.getBooleanExtra("extra_from_notification", false) && DownloadSetting.obtain(intExtra).optInt("notification_opt_2") == 1) {
            DownloadNotificationManager.getInstance().cancelNotification(intExtra);
        }
        DownloadInfo downloadInfo = Downloader.getInstance(this).getDownloadInfo(intExtra);
        if (downloadInfo == null) {
            return false;
        }
        if (action.equals("android.ss.intent.action.DOWNLOAD_CLICK_CONTENT")) {
            dr(downloadInfo, ge, downloadNotificationEventListener);
        } else if (action.equals("android.ss.intent.action.DOWNLOAD_OPEN")) {
            dr(this, downloadInfo, ge, downloadNotificationEventListener);
        } else if (action.equals("android.ss.intent.action.DOWNLOAD_CLICK_BTN")) {
            if (downloadInfo.getStatus() == 0) {
                return false;
            }
            dr(this, downloadInfo, ge, downloadNotificationEventListener);
            if (downloadInfo.isDownloadOverStatus() && DownloadSetting.obtain(intExtra).optInt(DownloadSettingKeys.NO_HIDE_NOTIFICATION, 0) == 0) {
                if (DownloadSetting.obtain(intExtra).optInt(DownloadSettingKeys.OPT_NOTIFICATION_UI) < 2 || downloadInfo.getStatus() != -1) {
                    z = false;
                }
                if (!z) {
                    DownloadNotificationManager.getInstance().hideNotification(intExtra);
                    DownloadNotificationManager.getInstance().cancelNotification(intExtra);
                }
            }
        } else if (action.equals("android.ss.intent.action.DOWNLOAD_DELETE")) {
            ge(downloadInfo, ge, downloadNotificationEventListener);
        } else if (action.equals("android.ss.intent.action.DOWNLOAD_HIDE")) {
            DownloadNotificationManager.getInstance().hideNotification(intExtra);
        } else if (action.equals("android.intent.action.BOOT_COMPLETED") || action.equals("android.intent.action.MEDIA_MOUNTED")) {
            DownloadComponentManager.getCPUThreadExecutor().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.DownloadHandlerService.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(AdBaseConstants.MIME_APK);
                        arrayList.add(DownloadConstants.MIME_PLG);
                        Downloader.getInstance(DownloadComponentManager.getAppContext()).restartAllFailedDownloadTasks(arrayList);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            return true;
        }
        return false;
    }

    private static void dr(Context context, DownloadInfo downloadInfo) {
        if (DownloadUtils.isWifi(context.getApplicationContext()) && downloadInfo.isPauseReserveOnWifi()) {
            downloadInfo.stopPauseReserveOnWifi();
        }
    }

    private static void dr(Context context, final com.ss.android.socialbase.appdownloader.o.g gVar, final DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        final IDownloadNotificationEventListener downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(downloadInfo.getId());
        if (gVar == null && downloadNotificationEventListener == null) {
            return;
        }
        DownloadComponentManager.getCPUThreadExecutor().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.DownloadHandlerService.2
            @Override // java.lang.Runnable
            public void run() {
                String str;
                PackageInfo dr2;
                try {
                    File file = new File(DownloadInfo.this.getSavePath(), DownloadInfo.this.getName());
                    if (file.exists()) {
                        try {
                            if (DownloadComponentManager.getAppContext() == null || (dr2 = o.dr(DownloadInfo.this, file)) == null) {
                                str = "";
                            } else {
                                str = dr2.packageName;
                            }
                            com.ss.android.socialbase.appdownloader.o.g gVar2 = gVar;
                            if (gVar2 != null) {
                                gVar2.dr(DownloadInfo.this.getId(), 3, str, -3, DownloadInfo.this.getDownloadTime());
                            }
                            IDownloadNotificationEventListener iDownloadNotificationEventListener = downloadNotificationEventListener;
                            if (iDownloadNotificationEventListener != null) {
                                iDownloadNotificationEventListener.onNotificationEvent(3, DownloadInfo.this, str, "");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void dr(com.ss.android.socialbase.downloader.model.DownloadInfo r8, com.ss.android.socialbase.appdownloader.o.g r9, com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener r10) {
        /*
            r7 = this;
            int r1 = r8.getId()
            com.ss.android.socialbase.downloader.downloader.DownloadProcessDispatcher r0 = com.ss.android.socialbase.downloader.downloader.DownloadProcessDispatcher.getInstance()
            com.ss.android.socialbase.downloader.depend.INotificationClickCallback r0 = r0.getNotificationClickCallback(r1)
            if (r0 == 0) goto L18
            boolean r0 = r0.onClickWhenUnSuccess(r8)     // Catch: java.lang.Throwable -> L14
            goto L19
        L14:
            r0 = move-exception
            r0.printStackTrace()
        L18:
            r0 = 0
        L19:
            if (r0 != 0) goto L52
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity> r2 = com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.class
            r0.<init>(r7, r2)
            java.lang.String r2 = "extra_click_download_ids"
            r0.putExtra(r2, r1)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r2)
            r7.startActivity(r0)
            com.ss.android.socialbase.downloader.notification.DownloadNotificationManager r0 = com.ss.android.socialbase.downloader.notification.DownloadNotificationManager.getInstance()
            r0.hideNotification(r1)
            r8.updateDownloadTime()
            if (r9 == 0) goto L4a
            r2 = 7
            int r4 = r8.getStatus()
            long r5 = r8.getDownloadTime()
            java.lang.String r3 = ""
            r0 = r9
            r0.dr(r1, r2, r3, r4, r5)
        L4a:
            if (r10 == 0) goto L52
            r9 = 7
            java.lang.String r0 = ""
            r10.onNotificationEvent(r9, r8, r0, r0)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.DownloadHandlerService.dr(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.appdownloader.o.g, com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener):void");
    }

    private void ge(DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.o.g gVar, IDownloadNotificationEventListener iDownloadNotificationEventListener) {
        int id = downloadInfo.getId();
        Intent intent = new Intent(this, DownloadTaskDeleteActivity.class);
        intent.putExtra("extra_click_download_ids", id);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        startActivity(intent);
        DownloadNotificationManager.getInstance().hideNotification(id);
        downloadInfo.updateDownloadTime();
        if (gVar != null) {
            gVar.dr(id, 7, "", downloadInfo.getStatus(), downloadInfo.getDownloadTime());
        }
        if (iDownloadNotificationEventListener != null) {
            iDownloadNotificationEventListener.onNotificationEvent(7, downloadInfo, "", "");
        }
    }

    private static void dr(Context context, int i, boolean z) {
        boolean z2;
        INotificationClickCallback notificationClickCallback;
        if (z && (notificationClickCallback = DownloadProcessDispatcher.getInstance().getNotificationClickCallback(i)) != null) {
            try {
                DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i);
                if (downloadInfo == null) {
                    z2 = false;
                } else {
                    z2 = notificationClickCallback.onClickWhenSuccess(downloadInfo);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (!z2 && o.dr(context, i, true) == 0) {
                Toast.makeText(context, "Open Fail!", 0).show();
            }
            return;
        }
        z2 = false;
        if (!z2) {
            Toast.makeText(context, "Open Fail!", 0).show();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void dr(Context context, DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.o.g gVar, IDownloadNotificationEventListener iDownloadNotificationEventListener) {
        AbsNotificationItem notificationItem;
        int id = downloadInfo.getId();
        INotificationClickCallback notificationClickCallback = DownloadProcessDispatcher.getInstance().getNotificationClickCallback(id);
        if (AdBaseConstants.MIME_APK.equals(downloadInfo.getMimeType()) && notificationClickCallback != null && o.dr(context, downloadInfo) && notificationClickCallback.onClickWhenInstalled(downloadInfo)) {
            return;
        }
        boolean z = false;
        switch (downloadInfo.getStatus()) {
            case -4:
            case -1:
                if (DownloadSetting.obtain(id).optInt(DownloadSettingKeys.OPT_NOTIFICATION_UI) >= 2 && downloadInfo.isOnlyWifi()) {
                    downloadInfo.setOnlyWifi(false);
                }
                Downloader.getInstance(context).restart(id);
                return;
            case -3:
                dr(DownloadComponentManager.getAppContext(), id, true);
                dr(context, gVar, downloadInfo);
                if (DownloadSetting.obtain(id).optInt("notification_click_install_auto_cancel", 1) == 0 && (notificationItem = DownloadNotificationManager.getInstance().getNotificationItem(id)) != null) {
                    notificationItem.recordClickInstall();
                    notificationItem.refreshStatus(-3, null, false, true);
                } else {
                    z = true;
                }
                if (z) {
                    DownloadNotificationManager.getInstance().hideNotification(id);
                    return;
                }
                return;
            case -2:
                if (DownloadProcessDispatcher.getInstance().canResume(id)) {
                    Downloader.getInstance(context).resume(id);
                } else {
                    o.dr(downloadInfo, true, false);
                }
                if (gVar != null) {
                    gVar.dr(id, 6, "", downloadInfo.getStatus(), downloadInfo.getDownloadTime());
                }
                if (iDownloadNotificationEventListener != null) {
                    iDownloadNotificationEventListener.onNotificationEvent(6, downloadInfo, "", "");
                    return;
                }
                return;
            case 0:
            default:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                Downloader.getInstance(context).pause(id);
                dr(context, downloadInfo);
                if (gVar != null) {
                    gVar.dr(id, 5, "", downloadInfo.getStatus(), downloadInfo.getDownloadTime());
                }
                if (iDownloadNotificationEventListener != null) {
                    iDownloadNotificationEventListener.onNotificationEvent(5, downloadInfo, "", "");
                    return;
                }
                return;
        }
    }
}
