package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108;

import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.h;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public class c {
    private static String a(int i) {
        return "tnc_config" + i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r2, int r3, int r4) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            if (r3 == r1) goto L6
            goto L29
        L6:
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.h r3 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.h.a()     // Catch: java.lang.Exception -> L2b
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.f r3 = r3.a(r4)     // Catch: java.lang.Exception -> L2b
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.b r3 = r3.b()     // Catch: java.lang.Exception -> L2b
            if (r3 == 0) goto L29
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.h r3 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.h.a()     // Catch: java.lang.Exception -> L2b
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.f r3 = r3.a(r4)     // Catch: java.lang.Exception -> L2b
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.b r3 = r3.b()     // Catch: java.lang.Exception -> L2b
            java.lang.String r4 = a(r4)     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r3.a(r2, r4, r0)     // Catch: java.lang.Exception -> L2b
            goto L2d
        L29:
            r2 = r0
            goto L2d
        L2b:
            r2 = move-exception
            goto L29
        L2d:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L35
            java.lang.String r0 = java.lang.String.valueOf(r2)
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.c.a(android.content.Context, int, int):java.lang.String");
    }

    public static void a(Context context, int i, String str, int i2) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i == 1) {
                linkedHashMap.put(a(i2), str);
            }
            b.a("MultiProcessFileUtils", "saveData = " + str);
            if (h.a().a(i2).b() != null) {
                h.a().a(i2).b().a(context, linkedHashMap);
            }
        } catch (Exception e) {
        }
    }
}
