package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ce {
    private JSONObject a;

    public ce(Context context) {
        if (Engine.loadSuccess) {
            String nop = Engine.getInstance(context).nop();
            if (TextUtils.isEmpty(nop)) {
                return;
            }
            try {
                this.a = new JSONObject(nop);
            } catch (Exception e) {
            }
        }
    }

    public String a(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public JSONArray b(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray(string);
                try {
                    if (jSONArray.length() > 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String a = f.a(jSONObject2.optString("1"));
                            String a2 = f.a(jSONObject2.optString("2"));
                            if (!TextUtils.isEmpty(a)) {
                                jSONObject2.put("1", a);
                            }
                            if (!TextUtils.isEmpty(a2)) {
                                jSONObject2.put("2", a2);
                            }
                        }
                    }
                } catch (Throwable th) {
                }
                return jSONArray;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
