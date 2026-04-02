package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class cb {
    private JSONObject a;

    public cb(Context context) {
        if (Engine.loadSuccess) {
            Engine.getInstance(context);
            String bcd = Engine.bcd();
            if (TextUtils.isEmpty(bcd) || bcd.length() <= 2) {
                return;
            }
            try {
                this.a = new JSONObject(bcd);
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
