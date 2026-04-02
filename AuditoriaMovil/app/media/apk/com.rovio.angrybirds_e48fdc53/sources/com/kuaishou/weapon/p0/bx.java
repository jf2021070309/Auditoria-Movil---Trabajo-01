package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class bx {
    private JSONObject a;

    public bx(Context context) {
        if (Engine.loadSuccess) {
            String cde = Engine.getInstance(context).cde();
            if (TextUtils.isEmpty(cde)) {
                return;
            }
            try {
                this.a = new JSONObject(cde);
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
                return new JSONArray(string);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
