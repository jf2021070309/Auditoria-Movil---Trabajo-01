package com.ss.android.downloadlib.addownload.ge;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class xu {
    private static volatile xu dr;

    private xu() {
    }

    public static xu dr() {
        if (dr == null) {
            synchronized (g.class) {
                if (dr == null) {
                    dr = new xu();
                }
            }
        }
        return dr;
    }

    public void dr(int i, int i2, com.ss.android.downloadad.api.dr.ge geVar) {
        if (geVar == null) {
            return;
        }
        DownloadSetting obtain = DownloadSetting.obtain(geVar.i());
        if (obtain.optInt("report_api_hijack", 0) == 0) {
            return;
        }
        int i3 = i2 - i;
        if (i > 0 && i3 > obtain.optInt("check_api_hijack_version_code_diff", TTAdConstant.SHOW_POLL_TIME_SPLASH_DEFAULT)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version_code_diff", i3);
                jSONObject.put("installed_version_code", i2);
                jSONObject.put("hijack_type", 1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            com.ss.android.downloadlib.g.dr.dr().ge("api_hijack", jSONObject, geVar);
        }
    }
}
