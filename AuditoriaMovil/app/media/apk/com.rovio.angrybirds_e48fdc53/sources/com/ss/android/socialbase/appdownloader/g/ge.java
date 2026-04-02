package com.ss.android.socialbase.appdownloader.g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ss.android.socialbase.appdownloader.g;
import com.ss.android.socialbase.appdownloader.o;
import com.ss.android.socialbase.appdownloader.o.rb;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.IDownloadLaunchHandler;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.AbsNotificationItem;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.List;
/* loaded from: classes3.dex */
public class ge implements IDownloadLaunchHandler {
    private List<Integer> dr;
    private BroadcastReceiver ge;

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadLaunchHandler
    public List<String> getResumeMimeTypes() {
        return o.o();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadLaunchHandler
    public void onLaunchResume(final List<DownloadInfo> list, final int i) {
        if (DownloadUtils.isMainThread()) {
            DownloadComponentManager.getCPUThreadExecutor().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.g.ge.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ge.this.dr(list, i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } else {
            dr(list, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dr(List<DownloadInfo> list, int i) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rb yk = g.wb().yk();
        if (yk != null) {
            yk.dr(list);
        }
        Context appContext = DownloadComponentManager.getAppContext();
        if (appContext == null) {
            return;
        }
        boolean isWifi = DownloadUtils.isWifi(appContext);
        for (DownloadInfo downloadInfo : list) {
            dr(appContext, downloadInfo, isWifi, i);
        }
        List<Integer> list2 = this.dr;
        if (list2 != null && !list2.isEmpty() && this.ge == null) {
            this.ge = new BroadcastReceiver() { // from class: com.ss.android.socialbase.appdownloader.g.ge.2
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    final Context applicationContext = context.getApplicationContext();
                    if (!DownloadUtils.isWifi(applicationContext)) {
                        return;
                    }
                    Logger.d("LaunchResume", "onReceive : wifi connected !!!");
                    DownloadComponentManager.getCPUThreadExecutor().execute(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.g.ge.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                if (ge.this.dr != null && !ge.this.dr.isEmpty()) {
                                    int size = ge.this.dr.size();
                                    Integer[] numArr = new Integer[size];
                                    ge.this.dr.toArray(numArr);
                                    ge.this.dr.clear();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        DownloadInfo downloadInfo2 = Downloader.getInstance(applicationContext).getDownloadInfo(numArr[i2].intValue());
                                        if (downloadInfo2 != null && (downloadInfo2.getRealStatus() == -5 || (downloadInfo2.getRealStatus() == -2 && downloadInfo2.isPauseReserveOnWifi()))) {
                                            ge.this.dr(applicationContext, downloadInfo2, true, 2);
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    try {
                        applicationContext.unregisterReceiver(ge.this.ge);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    ge.this.ge = null;
                }
            };
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                appContext.registerReceiver(this.ge, intentFilter);
            } catch (Throwable th) {
                th.printStackTrace();
                this.ge = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dr(android.content.Context r21, com.ss.android.socialbase.downloader.model.DownloadInfo r22, boolean r23, int r24) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.g.ge.dr(android.content.Context, com.ss.android.socialbase.downloader.model.DownloadInfo, boolean, int):void");
    }

    private void dr(DownloadInfo downloadInfo, Context context) {
        DownloadSetting obtain = DownloadSetting.obtain(downloadInfo.getId());
        int optInt = obtain.optInt("paused_resume_max_count", 0);
        double optDouble = obtain.optDouble("paused_resume_max_hours", 72.0d);
        int pausedResumeCount = downloadInfo.getPausedResumeCount();
        if (pausedResumeCount < optInt && ((double) (System.currentTimeMillis() - downloadInfo.getLastDownloadTime())) < optDouble * 3600000.0d) {
            AbsNotificationItem notificationItem = DownloadNotificationManager.getInstance().getNotificationItem(downloadInfo.getId());
            if (notificationItem == null) {
                notificationItem = new com.ss.android.socialbase.appdownloader.q.dr(context, downloadInfo.getId(), downloadInfo.getTitle(), downloadInfo.getSavePath(), downloadInfo.getName(), downloadInfo.getExtra());
                DownloadNotificationManager.getInstance().addNotification(notificationItem);
            } else {
                notificationItem.updateNotificationItem(downloadInfo);
            }
            notificationItem.setTotalBytes(downloadInfo.getTotalBytes());
            notificationItem.setCurBytes(downloadInfo.getCurBytes());
            notificationItem.refreshStatus(downloadInfo.getStatus(), null, false, false);
            downloadInfo.setPausedResumeCount(pausedResumeCount + 1);
            downloadInfo.updateSpData();
        }
    }

    private boolean dr(DownloadInfo downloadInfo) {
        if (DownloadSetting.obtain(downloadInfo.getId()).optBugFix("uninstall_can_not_resume_for_force_task", false)) {
            return DownloadUtils.isFileDownloaded(downloadInfo, false, downloadInfo.getMd5());
        }
        return downloadInfo.isDownloaded();
    }
}
