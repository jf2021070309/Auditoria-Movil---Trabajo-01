package com.kuaishou.weapon.p0;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ch {
    private Context a;
    private int b;

    public ch(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public String a(String str) {
        JSONObject a;
        try {
            JSONObject a2 = new cl(str, cj.j).a(this.a);
            if (a2 == null || (a = a()) == null) {
                return null;
            }
            a2.put("module_section", a);
            return a2.toString();
        } catch (Throwable th) {
            return null;
        }
    }

    public JSONObject a() {
        long currentTimeMillis;
        JSONObject jSONObject;
        try {
            currentTimeMillis = System.currentTimeMillis();
            jSONObject = new JSONObject();
        } catch (Throwable th) {
        }
        if (WeaponHI.as) {
            h a = h.a(this.a, "re_po_rt");
            int b = a.b(de.o, 0);
            boolean e = a.e("a1_p_s_p_s");
            boolean e2 = a.e("a1_p_s_p_s_c_b");
            if (b == 1 && (e || e2)) {
                try {
                    JSONArray a2 = new w(this.a).a(0);
                    if (a2 != null) {
                        jSONObject.put("10000", a2);
                        try {
                            jSONObject.put("11301", bg.c(com.kwad.sdk.f.b.Fz().Fy()));
                            jSONObject.put("11302", bg.c(com.kwad.sdk.f.b.Fz().getSdkVersion()));
                            jSONObject.put("11303", bg.c(com.kwad.sdk.f.b.Fz().getAppId()));
                        } catch (Throwable th2) {
                        }
                        jSONObject.put("11007", System.currentTimeMillis() - currentTimeMillis);
                        jSONObject.put("11017", jSONObject.toString().length());
                        return jSONObject;
                    }
                } catch (Throwable th3) {
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
