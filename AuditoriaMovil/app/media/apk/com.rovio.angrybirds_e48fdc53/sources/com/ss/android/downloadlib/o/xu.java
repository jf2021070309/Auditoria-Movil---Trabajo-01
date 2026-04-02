package com.ss.android.downloadlib.o;

import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class xu {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class dr {
        private static xu dr = new xu();
    }

    public static xu dr() {
        return dr.dr;
    }

    private xu() {
    }

    public void dr(com.ss.android.downloadad.api.dr.ge geVar) {
        ge(geVar, 5L);
    }

    public void ge(com.ss.android.downloadad.api.dr.ge geVar) {
        if (geVar == null) {
            return;
        }
        ge(geVar, DownloadSetting.obtain(geVar.i()).optInt("noti_continue_delay_secs", 5));
    }

    private void ge(final com.ss.android.downloadad.api.dr.ge geVar, long j) {
        final int i = geVar.i();
        if (DownloadSetting.obtain(i).optInt("notification_opt_2") != 1) {
            return;
        }
        dr(i);
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.o.xu.1
            @Override // java.lang.Runnable
            public void run() {
                DownloadInfo downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(i);
                JSONObject jSONObject = new JSONObject();
                yk.dr(jSONObject, "ttdownloader_type", (Object) 1);
                com.ss.android.downloadlib.rb.bn.o(downloadInfo, jSONObject);
                if (downloadInfo != null && -2 == downloadInfo.getRealStatus() && !downloadInfo.isPauseReserveOnWifi()) {
                    xu.this.dr(i, geVar, jSONObject);
                } else {
                    yk.dr(jSONObject, "error_code", (Object) 1001);
                }
                com.ss.android.downloadlib.g.dr.dr().ge("download_notification_try_show", jSONObject, geVar);
            }
        }, j * 1000);
    }

    public void o(com.ss.android.downloadad.api.dr.ge geVar) {
        o(geVar, 5L);
    }

    public void g(com.ss.android.downloadad.api.dr.ge geVar) {
        o(geVar, DownloadSetting.obtain(geVar.i()).optInt("noti_install_delay_secs", 5));
    }

    private void o(final com.ss.android.downloadad.api.dr.ge geVar, long j) {
        final int i = geVar.i();
        if (DownloadSetting.obtain(i).optInt("notification_opt_2") != 1) {
            return;
        }
        dr(i);
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.o.xu.2
            @Override // java.lang.Runnable
            public void run() {
                DownloadInfo downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(i);
                JSONObject jSONObject = new JSONObject();
                yk.dr(jSONObject, "ttdownloader_type", (Object) 2);
                com.ss.android.downloadlib.rb.bn.o(downloadInfo, jSONObject);
                if (!yk.ge(geVar)) {
                    xu.this.dr(i, geVar, jSONObject);
                } else {
                    yk.dr(jSONObject, "error_code", (Object) 1002);
                }
                com.ss.android.downloadlib.g.dr.dr().ge("download_notification_try_show", jSONObject, geVar);
            }
        }, j * 1000);
    }

    public void q(com.ss.android.downloadad.api.dr.ge geVar) {
        dr(geVar, 5L);
    }

    public void bn(com.ss.android.downloadad.api.dr.ge geVar) {
        dr(geVar, DownloadSetting.obtain(geVar.i()).optInt("noti_open_delay_secs", 5));
    }

    public void dr(final com.ss.android.downloadad.api.dr.ge geVar, long j) {
        final int i = geVar.i();
        if (DownloadSetting.obtain(i).optInt("notification_opt_2") != 1) {
            return;
        }
        dr(i);
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.o.xu.3
            @Override // java.lang.Runnable
            public void run() {
                DownloadInfo downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(i);
                JSONObject jSONObject = new JSONObject();
                yk.dr(jSONObject, "ttdownloader_type", (Object) 3);
                com.ss.android.downloadlib.rb.bn.o(downloadInfo, jSONObject);
                if (!yk.o(geVar.q())) {
                    xu.this.dr(i, geVar, jSONObject);
                } else {
                    yk.dr(jSONObject, "error_code", (Object) 1003);
                }
                com.ss.android.downloadlib.g.dr.dr().ge("download_notification_try_show", jSONObject, geVar);
            }
        }, j * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dr(int i, com.ss.android.downloadad.api.dr.ge geVar, JSONObject jSONObject) {
        if (!com.ss.android.socialbase.appdownloader.q.g.dr()) {
            yk.dr(jSONObject, "error_code", (Object) 1004);
            return;
        }
        DownloadInfo downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(i);
        if (downloadInfo == null) {
            yk.dr(jSONObject, "error_code", (Object) 1005);
            return;
        }
        if (DownloadNotificationManager.getInstance().getNotificationItem(i) != null) {
            DownloadNotificationManager.getInstance().cancelNotification(i);
        }
        com.ss.android.socialbase.appdownloader.q.dr drVar = new com.ss.android.socialbase.appdownloader.q.dr(wb.getContext(), i, downloadInfo.getTitle(), downloadInfo.getSavePath(), downloadInfo.getName(), downloadInfo.getExtra());
        drVar.setCurBytes(downloadInfo.getCurBytes());
        drVar.setTotalBytes(downloadInfo.getTotalBytes());
        drVar.refreshStatus(downloadInfo.getStatus(), null, false, false);
        DownloadNotificationManager.getInstance().addNotification(drVar);
        drVar.updateNotification(null, false);
        com.ss.android.downloadlib.g.dr.dr().ge("download_notification_show", jSONObject, geVar);
    }

    public void dr(int i) {
        DownloadInfo downloadInfo;
        if (com.ss.android.socialbase.appdownloader.q.o.dr().dr(i) == null && (downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(i)) != null) {
            com.ss.android.socialbase.appdownloader.q.o.dr().dr(i, downloadInfo.getIconUrl());
        }
    }
}
