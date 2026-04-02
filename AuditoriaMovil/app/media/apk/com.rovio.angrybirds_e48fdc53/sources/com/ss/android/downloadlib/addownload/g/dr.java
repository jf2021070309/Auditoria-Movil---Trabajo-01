package com.ss.android.downloadlib.addownload.g;

import android.content.Context;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.addownload.ll;
import com.ss.android.downloadlib.xu;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class dr implements g {
    private static com.ss.android.downloadlib.addownload.dr.o dr;

    public static com.ss.android.downloadlib.addownload.dr.o dr() {
        return dr;
    }

    @Override // com.ss.android.downloadlib.addownload.g.g
    public boolean dr(final com.ss.android.downloadad.api.dr.ge geVar, int i, final o oVar) {
        DownloadInfo ge;
        if (geVar == null || geVar.vj() || !dr(geVar) || (ge = xu.dr((Context) null).ge(geVar.dr())) == null) {
            return false;
        }
        long dr2 = ll.dr(ge.getId(), ge.getCurBytes(), ge.getTotalBytes());
        long totalBytes = ge.getTotalBytes();
        if (dr2 <= 0 || totalBytes <= 0 || totalBytes > dr(geVar.i())) {
            return false;
        }
        dr = new com.ss.android.downloadlib.addownload.dr.o() { // from class: com.ss.android.downloadlib.addownload.g.dr.1
            @Override // com.ss.android.downloadlib.addownload.dr.o
            public void dr() {
                com.ss.android.downloadlib.addownload.dr.o unused = dr.dr = null;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("pause_optimise_type", "apk_size");
                    jSONObject.putOpt("pause_optimise_action", "confirm");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                com.ss.android.downloadlib.g.dr.dr().dr("pause_optimise", jSONObject, geVar);
            }

            @Override // com.ss.android.downloadlib.addownload.dr.o
            public void ge() {
                com.ss.android.downloadlib.addownload.dr.o unused = dr.dr = null;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("pause_optimise_type", "apk_size");
                    jSONObject.putOpt("pause_optimise_action", "cancel");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                com.ss.android.downloadlib.g.dr.dr().dr("pause_optimise", jSONObject, geVar);
                oVar.dr(geVar);
            }
        };
        TTDelegateActivity.dr(geVar, String.format("该下载任务仅需%s，即将下载完成，是否继续下载？", dr(totalBytes - dr2)), "继续", "暂停");
        geVar.v(true);
        return true;
    }

    private int dr(int i) {
        return DownloadSetting.obtain(i).optInt("pause_optimise_apk_size", 100) * 1024 * 1024;
    }

    private boolean dr(com.ss.android.downloadad.api.dr.dr drVar) {
        return com.ss.android.downloadlib.rb.q.dr(drVar).optInt("pause_optimise_apk_size_switch", 0) == 1 && drVar.lp();
    }

    private static String dr(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (j >= 1073741824) {
            return (j / 1073741824) + "G";
        } else if (j >= 1048576) {
            return (j / 1048576) + "M";
        } else {
            return decimalFormat.format(((float) j) / 1048576.0f) + "M";
        }
    }
}
