package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.jni.Engine;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class au {
    private JSONObject a;
    private boolean b;

    public au(Context context) {
        if (Engine.loadSuccess) {
            try {
                String pqr = Engine.getInstance(context).pqr(Integer.valueOf(cj.g).intValue(), 0, 200, "");
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

    public boolean a() {
        return this.b;
    }

    public List b(String str) {
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString(str);
                if (TextUtils.isEmpty(string) || string.length() <= 3) {
                    return null;
                }
                String a = i.a("98bb0a15913e0654348b", "0805");
                JSONArray jSONArray = new JSONArray(string);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string2 = jSONArray.getString(i);
                    if (string2.contains(a)) {
                        this.b = true;
                    } else {
                        arrayList.add(string2);
                    }
                }
                if (arrayList.size() > 0) {
                    return arrayList;
                }
                return null;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }
}
