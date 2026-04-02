package com.ss.android.downloadlib.addownload;

import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.impls.RetryScheduler;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class yk {
    private static com.ss.android.downloadlib.addownload.dr.o dr;

    public static com.ss.android.downloadlib.addownload.dr.o dr() {
        return dr;
    }

    public static void dr(com.ss.android.downloadlib.addownload.dr.o oVar) {
        dr = oVar;
    }

    public static boolean dr(final com.ss.android.downloadad.api.dr.ge geVar, DownloadInfo downloadInfo, int i, final com.ss.android.downloadlib.addownload.g.o oVar) {
        int i2;
        if (geVar == null) {
            com.ss.android.downloadlib.q.o.dr().dr("tryReverseWifi nativeModel null");
            return false;
        } else if (downloadInfo == null) {
            com.ss.android.downloadlib.q.o.dr().dr("tryReverseWifi info null");
            return false;
        } else {
            final int id = downloadInfo.getId();
            boolean ge = com.ss.android.downloadlib.rb.q.ge(geVar);
            JSONObject jSONObject = new JSONObject();
            if (!ge) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            try {
                jSONObject.putOpt("switch_status", Integer.valueOf(i2));
            } catch (Exception e) {
                e.printStackTrace();
            }
            com.ss.android.downloadlib.g.dr.dr().dr("pause_reserve_wifi_switch_status", jSONObject, geVar);
            if (!ge || !dr(i) || DownloadUtils.isWifi(wb.getContext()) || downloadInfo.hasPauseReservedOnWifi()) {
                return false;
            }
            dr(new com.ss.android.downloadlib.addownload.dr.o() { // from class: com.ss.android.downloadlib.addownload.yk.1
                @Override // com.ss.android.downloadlib.addownload.dr.o
                public void dr() {
                    yk.dr((com.ss.android.downloadlib.addownload.dr.o) null);
                    DownloadInfo downloadInfo2 = Downloader.getInstance(wb.getContext()).getDownloadInfo(id);
                    if (downloadInfo2 != null) {
                        downloadInfo2.startPauseReserveOnWifi();
                        RetryScheduler.getInstance().tryStartScheduleRetry(downloadInfo2);
                        com.ss.android.downloadlib.g.dr.dr().ge("pause_reserve_wifi_confirm", geVar);
                    }
                    oVar.dr(geVar);
                }

                @Override // com.ss.android.downloadlib.addownload.dr.o
                public void ge() {
                    yk.dr((com.ss.android.downloadlib.addownload.dr.o) null);
                    DownloadInfo downloadInfo2 = Downloader.getInstance(wb.getContext()).getDownloadInfo(id);
                    if (downloadInfo2 != null) {
                        downloadInfo2.stopPauseReserveOnWifi();
                    }
                    com.ss.android.downloadlib.g.dr.dr().ge("pause_reserve_wifi_cancel", geVar);
                    oVar.dr(geVar);
                }
            });
            TTDelegateActivity.ge(geVar);
            return true;
        }
    }

    public static boolean dr(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8;
    }
}
