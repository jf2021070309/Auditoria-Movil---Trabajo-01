package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ar {
    private JSONObject a;

    public ar(Context context) {
        if (Engine.loadSuccess) {
            try {
                String klm = Engine.getInstance(context).klm(56, context.getPackageName());
                if (TextUtils.isEmpty(klm)) {
                    return;
                }
                this.a = new JSONObject(klm);
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
