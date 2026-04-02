package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class bb {
    private JSONObject a;

    public bb(Context context, String str, int i) {
        if (Engine.loadSuccess) {
            try {
                String pqr = Engine.getInstance(context).pqr(i, 0, ct.a() ? 1 : 0, str);
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
                return jSONObject.getString(str);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
