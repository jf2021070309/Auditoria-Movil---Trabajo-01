package com.kuaishou.weapon.p0;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class cg {
    private Context a;
    private int b;

    public cg(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public String a(String str) {
        JSONObject a;
        try {
            JSONObject a2 = new cl(str, cj.j).a(this.a);
            if (a2 != null && (a = a()) != null && a.length() != 0) {
                a2.put("module_section", a);
                return a2.toString();
            }
            return null;
        } catch (Throwable th) {
            return null;
        }
    }

    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (h.a(this.a, "re_po_rt").b(de.y, 1) == 1) {
                try {
                    JSONArray a = new x().a(this.a);
                    if (a != null && a.length() > 0) {
                        jSONObject.put("10000", a);
                        try {
                            jSONObject.put("11203", bg.b(com.kwad.sdk.f.b.Fz().Fx()));
                            jSONObject.put("11301", bg.c(com.kwad.sdk.f.b.Fz().Fy()));
                            jSONObject.put("11302", bg.c(com.kwad.sdk.f.b.Fz().getSdkVersion()));
                            jSONObject.put("11303", bg.c(com.kwad.sdk.f.b.Fz().getAppId()));
                        } catch (Throwable th) {
                        }
                        return jSONObject;
                    }
                } catch (Throwable th2) {
                }
                return jSONObject;
            }
            return null;
        } catch (Throwable th3) {
            return null;
        }
    }
}
