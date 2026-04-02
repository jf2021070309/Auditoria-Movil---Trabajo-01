package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class cd {
    private JSONObject a;

    public cd(Context context) {
        if (Engine.loadSuccess) {
            Engine.getInstance(context);
            String abc = Engine.abc();
            if (TextUtils.isEmpty(abc)) {
                return;
            }
            try {
                this.a = new JSONObject(abc);
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
