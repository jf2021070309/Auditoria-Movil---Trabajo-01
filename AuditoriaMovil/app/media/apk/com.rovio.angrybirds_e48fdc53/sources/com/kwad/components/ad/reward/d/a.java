package com.kwad.components.ad.reward.d;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.y;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    public static void P(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        b bVar = new b();
        String cf = y.cf(context);
        int i = 0;
        if (!TextUtils.isEmpty(cf)) {
            try {
                bVar.parseJson(new JSONObject(cf));
                if (b(bVar.gd, currentTimeMillis)) {
                    i = bVar.rE;
                }
            } catch (Exception e) {
                c.printStackTraceOnly(e);
            }
        }
        bVar.gd = currentTimeMillis;
        bVar.rE = i + 1;
        y.X(context, bVar.toJson().toString());
    }

    private static boolean b(long j, long j2) {
        return j > 0 && j2 > 0 && j / 2460601000L == j2 / 2460601000L;
    }

    public static boolean b(Context context, AdInfo adInfo) {
        if (com.kwad.sdk.core.response.b.a.ay(adInfo)) {
            int max = Math.max(com.kwad.sdk.core.response.b.a.az(adInfo) + 1, 1);
            boolean d = d(context, max);
            c(context, max);
            return d && e(context, com.kwad.sdk.core.response.b.a.aA(adInfo));
        }
        return false;
    }

    private static void c(Context context, int i) {
        int ce = y.ce(context);
        if (ce % i == 0) {
            y.k(context, 1);
        } else {
            y.k(context, ce + 1);
        }
    }

    private static boolean d(Context context, int i) {
        return i != 0 && y.ce(context) % i == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean e(android.content.Context r7, int r8) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            com.kwad.components.ad.reward.d.b r2 = new com.kwad.components.ad.reward.d.b
            r2.<init>()
            java.lang.String r7 = com.kwad.sdk.utils.y.cf(r7)
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            r4 = 0
            if (r3 != 0) goto L2b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L27
            r3.<init>(r7)     // Catch: java.lang.Exception -> L27
            r2.parseJson(r3)     // Catch: java.lang.Exception -> L27
            long r5 = r2.gd     // Catch: java.lang.Exception -> L27
            boolean r7 = b(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r7 == 0) goto L2b
            int r7 = r2.rE     // Catch: java.lang.Exception -> L27
            goto L2c
        L27:
            r7 = move-exception
            com.kwad.sdk.core.e.c.printStackTraceOnly(r7)
        L2b:
            r7 = r4
        L2c:
            if (r7 >= r8) goto L30
            r7 = 1
            return r7
        L30:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.reward.d.a.e(android.content.Context, int):boolean");
    }
}
