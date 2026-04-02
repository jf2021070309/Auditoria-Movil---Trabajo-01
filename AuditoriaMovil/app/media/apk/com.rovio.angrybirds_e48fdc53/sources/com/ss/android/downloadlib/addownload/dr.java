package com.ss.android.downloadlib.addownload;

import android.os.Looper;
import android.os.Message;
import com.ss.android.download.api.constant.BaseConstants;
import com.ss.android.downloadlib.rb.cu;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.ss.android.socialbase.downloader.utils.SystemUtils;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class dr implements cu.dr {
    private static final String dr = dr.class.getSimpleName();
    private static dr ge;
    private long g;
    private cu o = new cu(Looper.getMainLooper(), this);

    public static dr dr() {
        if (ge == null) {
            synchronized (dr.class) {
                if (ge == null) {
                    ge = new dr();
                }
            }
        }
        return ge;
    }

    private dr() {
    }

    public void dr(DownloadInfo downloadInfo, long j, long j2, String str, String str2, String str3, String str4) {
        com.ss.android.downloadlib.addownload.ge.dr drVar = new com.ss.android.downloadlib.addownload.ge.dr(downloadInfo.getId(), j, j2, str, str2, str3, str4);
        DownloadSetting obtain = DownloadSetting.obtain(downloadInfo.getId());
        if (obtain.optInt("back_miui_silent_install", 1) == 0 && ((com.ss.android.socialbase.appdownloader.bn.q.yk() || com.ss.android.socialbase.appdownloader.bn.q.cu()) && SystemUtils.checkServiceExists(wb.getContext(), "com.miui.securitycore", "com.miui.enterprise.service.EntInstallService"))) {
            if (DownloadUtils.getBoolean(downloadInfo.getTempCacheData().get("extra_silent_install_succeed"), false)) {
                Message obtainMessage = this.o.obtainMessage(200, drVar);
                obtainMessage.arg1 = 2;
                this.o.sendMessageDelayed(obtainMessage, obtain.optInt("check_silent_install_interval", BaseConstants.Time.MINUTE));
                return;
            }
            com.ss.android.downloadad.api.dr.ge g = com.ss.android.downloadlib.addownload.ge.bn.dr().g(drVar.ge);
            JSONObject jSONObject = new JSONObject();
            int i = -1;
            try {
                jSONObject.put("ttdownloader_type", "miui_silent_install");
                jSONObject.put("ttdownloader_message", "miui_silent_install_failed: has not started service");
                i = 5;
            } catch (Exception e) {
            }
            wb.bn().dr(null, new BaseException(i, jSONObject.toString()), i);
            com.ss.android.downloadlib.g.dr.dr().dr("embeded_ad", "ah_result", jSONObject, g);
        }
        if (com.ss.android.downloadlib.rb.q.o()) {
            long currentTimeMillis = System.currentTimeMillis() - this.g;
            long g2 = com.ss.android.downloadlib.rb.q.g();
            if (currentTimeMillis >= com.ss.android.downloadlib.rb.q.q()) {
                this.g = System.currentTimeMillis();
            } else {
                long q = com.ss.android.downloadlib.rb.q.q() - currentTimeMillis;
                g2 += q;
                this.g = System.currentTimeMillis() + q;
            }
            cu cuVar = this.o;
            cuVar.sendMessageDelayed(cuVar.obtainMessage(200, drVar), g2);
        }
    }

    private void dr(com.ss.android.downloadlib.addownload.ge.dr drVar, int i) {
        if (wb.t() == null || wb.t().dr() || drVar == null) {
            return;
        }
        if (2 == i) {
            com.ss.android.downloadad.api.dr.ge g = com.ss.android.downloadlib.addownload.ge.bn.dr().g(drVar.ge);
            JSONObject jSONObject = new JSONObject();
            int i2 = -1;
            try {
                jSONObject.put("ttdownloader_type", "miui_silent_install");
                if (com.ss.android.downloadlib.rb.yk.g(wb.getContext(), drVar.g)) {
                    jSONObject.put("ttdownloader_message", "miui_silent_install_succeed");
                    i2 = 4;
                } else {
                    jSONObject.put("ttdownloader_message", "miui_silent_install_failed: has started service");
                    i2 = 5;
                }
            } catch (Exception e) {
            }
            wb.bn().dr(null, new BaseException(i2, jSONObject.toString()), i2);
            com.ss.android.downloadlib.g.dr.dr().dr("embeded_ad", "ah_result", jSONObject, g);
        }
        if (com.ss.android.downloadlib.rb.yk.g(wb.getContext(), drVar.g)) {
            com.ss.android.downloadlib.g.dr.dr().dr("delayinstall_installed", drVar.ge);
        } else if (!com.ss.android.downloadlib.rb.yk.dr(drVar.rb)) {
            com.ss.android.downloadlib.g.dr.dr().dr("delayinstall_file_lost", drVar.ge);
        } else if (com.ss.android.downloadlib.addownload.dr.dr.dr().dr(drVar.g)) {
            com.ss.android.downloadlib.g.dr.dr().dr("delayinstall_conflict_with_back_dialog", drVar.ge);
        } else {
            com.ss.android.downloadlib.g.dr.dr().dr("delayinstall_install_start", drVar.ge);
            com.ss.android.socialbase.appdownloader.g.dr(wb.getContext(), (int) drVar.dr);
        }
    }

    @Override // com.ss.android.downloadlib.rb.cu.dr
    public void dr(Message message) {
        if (message.what == 200) {
            dr((com.ss.android.downloadlib.addownload.ge.dr) message.obj, message.arg1);
        }
    }
}
