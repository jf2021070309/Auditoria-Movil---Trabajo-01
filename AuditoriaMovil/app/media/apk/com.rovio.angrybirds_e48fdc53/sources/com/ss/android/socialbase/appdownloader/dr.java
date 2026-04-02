package com.ss.android.socialbase.appdownloader;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class dr {
    public String dr;
    public String g;
    public int ge = -1;
    public String o;
    public String q;

    public String dr() {
        return ge().toString();
    }

    public JSONObject ge() {
        JSONObject jSONObject = new JSONObject();
        dr(jSONObject);
        return jSONObject;
    }

    public void dr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ah_plan_type", this.dr);
            jSONObject.put("error_code", String.valueOf(this.ge));
            jSONObject.put("error_msg", this.o);
            jSONObject.put("real_device_plan", this.g);
            jSONObject.put(DownloadSettingKeys.AhPlans.KEY_AH_DEVICE_PLANS, this.q);
        } catch (Throwable th) {
        }
    }

    public static dr dr(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        dr drVar = new dr();
        try {
            JSONObject jSONObject = new JSONObject(str);
            drVar.q = jSONObject.optString(DownloadSettingKeys.AhPlans.KEY_AH_DEVICE_PLANS, null);
            drVar.g = jSONObject.optString("real_device_plan", null);
            drVar.o = jSONObject.optString("error_msg", null);
            drVar.dr = jSONObject.optString("ah_plan_type", null);
            String optString = jSONObject.optString("error_code");
            if (TextUtils.isEmpty(optString)) {
                drVar.ge = -1;
            } else {
                drVar.ge = Integer.parseInt(optString);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return drVar;
    }
}
