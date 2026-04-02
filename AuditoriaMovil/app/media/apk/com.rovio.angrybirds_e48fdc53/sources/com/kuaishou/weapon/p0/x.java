package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class x {
    public JSONArray a(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            String d = bg.d();
            if (!TextUtils.isEmpty(d) && !d.startsWith("RISK")) {
                JSONArray jSONArray2 = new JSONArray(d);
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("1", jSONArray2.getJSONObject(i).getString("appName"));
                    jSONObject.put("2", jSONArray2.getJSONObject(i).getString("pkgName"));
                    jSONObject.put("3", jSONArray2.getJSONObject(i).getString("appVersion"));
                    jSONObject.put("5", jSONArray2.getJSONObject(i).getString("system_app"));
                    jSONObject.put("6", jSONArray2.getJSONObject(i).getString("firstInstallTime"));
                    jSONObject.put("7", jSONArray2.getJSONObject(i).getString("lastUpdateTime"));
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
