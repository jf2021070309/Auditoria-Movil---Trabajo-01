package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class av {
    private JSONObject a;

    public av(Context context, int i) {
        if (Engine.loadSuccess) {
            try {
                String pqr = Engine.getInstance(context).pqr(Integer.valueOf(cj.c).intValue(), 4, i, "");
                if (TextUtils.isEmpty(pqr)) {
                    return;
                }
                this.a = new JSONObject(pqr);
            } catch (Throwable th) {
            }
        }
    }

    public String a(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                if (string.length() > 2) {
                    return string;
                }
                return null;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
