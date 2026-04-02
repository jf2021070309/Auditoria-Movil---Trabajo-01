package com.kuaishou.weapon.p0;

import android.content.Context;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ci {
    private Context a;

    public ci(Context context) {
        this.a = context;
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

    /* JADX WARN: Removed duplicated region for block: B:81:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0580  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject a() {
        /*
            Method dump skipped, instructions count: 1447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.ci.a():org.json.JSONObject");
    }
}
