package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class by {
    private JSONObject a;

    public by(Context context) {
        if (Engine.loadSuccess) {
            String fgh = Engine.getInstance(context).fgh();
            if (TextUtils.isEmpty(fgh)) {
                return;
            }
            try {
                this.a = new JSONObject(fgh);
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
}
