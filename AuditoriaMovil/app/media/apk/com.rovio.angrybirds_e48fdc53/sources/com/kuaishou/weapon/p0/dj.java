package com.kuaishou.weapon.p0;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class dj {
    public static JSONObject a() {
        try {
            String str = System.getenv("LD_PRELOAD");
            String str2 = System.getenv("LD_LIBRARY_PATH");
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("1", str2);
            }
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static int b() {
        try {
            String a = bj.a();
            if (TextUtils.isEmpty(a) || a.contains("arm64")) {
                return 0;
            }
            return !a.contains("64") ? 1 : 0;
        } catch (Exception e) {
            return 0;
        }
    }
}
