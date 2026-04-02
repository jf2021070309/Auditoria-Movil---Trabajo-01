package com.ss.android.downloadlib.g;

import android.os.Build;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.o;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.ge.bn;
import com.ss.android.downloadlib.addownload.ge.ll;
import com.ss.android.downloadlib.addownload.ge.q;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.appdownloader.q.g;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.umeng.analytics.pro.bg;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class dr {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ss.android.downloadlib.g.dr$dr  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0296dr {
        private static dr dr = new dr();
    }

    public static dr dr() {
        return C0296dr.dr;
    }

    private dr() {
    }

    public void dr(long j, int i) {
        int i2;
        q q = bn.dr().q(j);
        if (q.n()) {
            com.ss.android.downloadlib.q.o.dr().dr("sendClickEvent ModelBox notValid");
        } else if (!q.o.isEnableClickEvent()) {
        } else {
            int i3 = 1;
            DownloadEventConfig downloadEventConfig = q.o;
            String clickItemTag = i == 1 ? downloadEventConfig.getClickItemTag() : downloadEventConfig.getClickButtonTag();
            String dr = yk.dr(q.o.getClickLabel(), "click");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("download_click_type", Integer.valueOf(i));
                if (g.dr()) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                jSONObject.putOpt("permission_notification", Integer.valueOf(i2));
                if (!DownloadUtils.isNetworkConnected(wb.getContext())) {
                    i3 = 2;
                }
                jSONObject.putOpt("network_available", Integer.valueOf(i3));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            dr(clickItemTag, dr, jSONObject, q);
            if ("click".equals(dr) && q.ge != null) {
                o.dr().dr(j, q.ge.getLogExtra());
            }
        }
    }

    public void dr(long j, int i, DownloadInfo downloadInfo) {
        String dr;
        q q = bn.dr().q(j);
        if (q.n()) {
            com.ss.android.downloadlib.q.o.dr().dr("sendEvent ModelBox notValid");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        yk.dr(jSONObject, "download_scene", Integer.valueOf(q.z()));
        if (i == 1) {
            dr = yk.dr(q.o.getStorageDenyLabel(), "storage_deny");
        } else if (i == 2) {
            String dr2 = yk.dr(q.o.getClickStartLabel(), "click_start");
            com.ss.android.downloadlib.rb.bn.dr(downloadInfo, jSONObject);
            dr = dr2;
        } else if (i == 3) {
            String dr3 = yk.dr(q.o.getClickPauseLabel(), "click_pause");
            com.ss.android.downloadlib.rb.bn.ge(downloadInfo, jSONObject);
            dr = dr3;
        } else if (i == 4) {
            String dr4 = yk.dr(q.o.getClickContinueLabel(), "click_continue");
            com.ss.android.downloadlib.rb.bn.o(downloadInfo, jSONObject);
            dr = dr4;
        } else if (i != 5) {
            dr = null;
        } else {
            if (downloadInfo != null) {
                try {
                    com.ss.android.downloadlib.rb.bn.dr(jSONObject, downloadInfo.getId());
                    com.ss.android.downloadlib.dr.ge(jSONObject, downloadInfo);
                } catch (Throwable th) {
                }
            }
            dr = yk.dr(q.o.getClickInstallLabel(), "click_install");
        }
        dr(null, dr, jSONObject, 0L, 1, q);
    }

    public void ge(long j, int i) {
        dr(j, i, (DownloadInfo) null);
    }

    public void dr(String str, int i, q qVar) {
        dr(null, str, null, i, 0, qVar);
    }

    public void dr(long j, boolean z, int i) {
        q q = bn.dr().q(j);
        if (q.n()) {
            com.ss.android.downloadlib.q.o.dr().dr("sendQuickAppEvent ModelBox notValid");
        } else if (q.ge.getQuickAppModel() == null) {
        } else {
            if (q.ge instanceof AdDownloadModel) {
                ((AdDownloadModel) q.ge).setFunnelType(3);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("download_click_type", Integer.valueOf(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            ge(z ? "deeplink_quickapp_success" : "deeplink_quickapp_failed", jSONObject, q);
        }
    }

    public void dr(long j, BaseException baseException) {
        q q = bn.dr().q(j);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(MonitorConstants.EXTRA_DOWNLOAD_TIME, 0);
            if (baseException != null) {
                jSONObject.putOpt("fail_status", Integer.valueOf(baseException.getErrorCode()));
                jSONObject.putOpt("fail_msg", baseException.getErrorMessage());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ge("download_failed", jSONObject, q);
    }

    public void dr(DownloadInfo downloadInfo) {
        com.ss.android.downloadad.api.dr.ge dr = bn.dr().dr(downloadInfo);
        if (dr == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            com.ss.android.downloadlib.rb.bn.o(downloadInfo, jSONObject);
            dr.dr(System.currentTimeMillis());
            dr(dr.wb(), "download_resume", jSONObject, dr);
            ll.dr().dr(dr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void dr(JSONObject jSONObject, com.ss.android.downloadad.api.dr.ge geVar) {
        dr(geVar.wb(), "install_finish", jSONObject, geVar);
    }

    public void dr(DownloadInfo downloadInfo, BaseException baseException) {
        com.ss.android.downloadad.api.dr.ge dr;
        if (downloadInfo == null || (dr = bn.dr().dr(downloadInfo)) == null || dr.o.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            com.ss.android.downloadlib.dr.dr(jSONObject, downloadInfo);
            jSONObject.putOpt("fail_status", Integer.valueOf(dr.a()));
            jSONObject.putOpt("fail_msg", dr.bg());
            jSONObject.put("download_failed_times", dr.n());
            if (downloadInfo.getTotalBytes() > 0) {
                jSONObject.put("download_percent", downloadInfo.getCurBytes() / downloadInfo.getTotalBytes());
            }
            jSONObject.put(MonitorConstants.EXTRA_DOWNLOAD_STATUS, downloadInfo.getRealStatus());
            long currentTimeMillis = System.currentTimeMillis();
            if (dr.l() > 0) {
                jSONObject.put("time_from_start_download", currentTimeMillis - dr.l());
            }
            if (dr.rt() > 0) {
                jSONObject.put("time_from_download_resume", currentTimeMillis - dr.rt());
            }
            int i = 1;
            jSONObject.put("is_update_download", dr.ff() ? 1 : 2);
            jSONObject.put("can_show_notification", g.dr() ? 1 : 2);
            if (!dr.g.get()) {
                i = 2;
            }
            jSONObject.put("has_send_download_failed_finally", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        dr(dr.wb(), "download_cancel", jSONObject, dr);
    }

    public void ge(DownloadInfo downloadInfo, BaseException baseException) {
        if (downloadInfo == null) {
            return;
        }
        com.ss.android.downloadad.api.dr.ge dr = bn.dr().dr(downloadInfo);
        if (dr == null) {
            com.ss.android.downloadlib.q.o.dr().dr("sendDownloadFailedEvent nativeModel null");
        } else if (dr.o.get()) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                com.ss.android.downloadlib.rb.bn.o(downloadInfo, jSONObject);
                com.ss.android.downloadlib.dr.dr(jSONObject, downloadInfo);
                if (baseException != null) {
                    jSONObject.putOpt("fail_status", Integer.valueOf(baseException.getErrorCode()));
                    jSONObject.putOpt("fail_msg", baseException.getErrorMessage());
                    dr.g(baseException.getErrorCode());
                    dr.dr(baseException.getErrorMessage());
                }
                dr.m();
                jSONObject.put("download_failed_times", dr.n());
                if (downloadInfo.getTotalBytes() > 0) {
                    jSONObject.put("download_percent", downloadInfo.getCurBytes() / downloadInfo.getTotalBytes());
                }
                int i = 1;
                jSONObject.put("has_send_download_failed_finally", dr.g.get() ? 1 : 2);
                com.ss.android.downloadlib.rb.bn.dr(dr, jSONObject);
                if (!dr.ff()) {
                    i = 2;
                }
                jSONObject.put("is_update_download", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            dr(dr.wb(), "download_failed", jSONObject, dr);
            ll.dr().dr(dr);
        }
    }

    public void dr(String str, com.ss.android.downloadad.api.dr.dr drVar) {
        dr(str, (JSONObject) null, drVar);
    }

    public void dr(String str, JSONObject jSONObject, long j) {
        com.ss.android.downloadad.api.dr.dr g = bn.dr().g(j);
        if (g != null) {
            dr(str, jSONObject, g);
            return;
        }
        q q = bn.dr().q(j);
        if (q.n()) {
            com.ss.android.downloadlib.q.o.dr().dr("sendUnityEvent ModelBox notValid");
        } else {
            dr(str, jSONObject, q);
        }
    }

    public void dr(String str, JSONObject jSONObject, com.ss.android.downloadad.api.dr.dr drVar) {
        JSONObject jSONObject2 = new JSONObject();
        yk.dr(jSONObject2, "unity_label", str);
        dr("embeded_ad", "ttdownloader_unity", yk.dr(jSONObject, jSONObject2), drVar);
    }

    public void dr(String str, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        ge(str, new q(downloadModel.getId(), downloadModel, downloadEventConfig, downloadController));
    }

    public void dr(String str, long j) {
        com.ss.android.downloadad.api.dr.ge g = bn.dr().g(j);
        if (g != null) {
            ge(str, g);
        } else {
            ge(str, bn.dr().q(j));
        }
    }

    public void ge(String str, com.ss.android.downloadad.api.dr.dr drVar) {
        dr((String) null, str, drVar);
    }

    public void ge(String str, JSONObject jSONObject, com.ss.android.downloadad.api.dr.dr drVar) {
        dr((String) null, str, jSONObject, drVar);
    }

    public void dr(String str, String str2, com.ss.android.downloadad.api.dr.dr drVar) {
        dr(str, str2, (JSONObject) null, drVar);
    }

    public void dr(String str, String str2, JSONObject jSONObject, com.ss.android.downloadad.api.dr.dr drVar) {
        dr(str, str2, jSONObject, 0L, 0, drVar);
    }

    private void dr(String str, String str2, JSONObject jSONObject, long j, int i, com.ss.android.downloadad.api.dr.dr drVar) {
        if (drVar == null) {
            com.ss.android.downloadlib.q.o.dr().dr("onEvent data null");
        } else if ((drVar instanceof q) && ((q) drVar).n()) {
            com.ss.android.downloadlib.q.o.dr().dr("onEvent ModelBox notValid");
        } else {
            try {
                o.dr o = new o.dr().dr(yk.dr(str, drVar.wb(), "embeded_ad")).ge(str2).ge(drVar.o()).dr(drVar.ge()).o(drVar.g());
                if (j <= 0) {
                    j = drVar.yk();
                }
                o.dr dr = o.ge(j).g(drVar.ll()).dr(drVar.v()).dr(yk.dr(dr(drVar), jSONObject)).ge(drVar.t()).dr(drVar.il());
                if (i <= 0) {
                    i = 2;
                }
                dr(dr.dr(i).dr(drVar.cu()).dr());
            } catch (Exception e) {
                com.ss.android.downloadlib.q.o.dr().dr(e, "onEvent");
            }
        }
    }

    private JSONObject dr(com.ss.android.downloadad.api.dr.dr drVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            yk.dr(drVar.rb(), jSONObject);
            yk.dr(drVar.x(), jSONObject);
            jSONObject.putOpt("download_url", drVar.dr());
            jSONObject.putOpt(bg.o, drVar.q());
            jSONObject.putOpt("android_int", Integer.valueOf(Build.VERSION.SDK_INT));
            jSONObject.putOpt("rom_name", com.ss.android.socialbase.appdownloader.bn.q.rb());
            jSONObject.putOpt("rom_version", com.ss.android.socialbase.appdownloader.bn.q.xu());
            jSONObject.putOpt("ttdownloader", 1);
            jSONObject.putOpt("funnel_type", Integer.valueOf(drVar.xu()));
            if (drVar.xu() == 2) {
                com.ss.android.downloadlib.rb.bn.ge(jSONObject, drVar);
            }
            if (com.ss.android.socialbase.appdownloader.bn.q.il()) {
                com.ss.android.downloadlib.rb.bn.dr(jSONObject);
            }
        } catch (Exception e) {
            wb.i().dr(e, "getBaseJson");
        }
        return jSONObject;
    }

    private void dr(com.ss.android.download.api.model.o oVar) {
        if (wb.dr() == null) {
            return;
        }
        if (oVar.cu()) {
            wb.dr().dr(oVar);
        } else {
            wb.dr().ge(oVar);
        }
    }
}
