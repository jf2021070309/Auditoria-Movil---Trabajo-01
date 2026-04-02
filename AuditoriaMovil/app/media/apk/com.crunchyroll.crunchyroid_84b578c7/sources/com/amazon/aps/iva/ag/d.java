package com.amazon.aps.iva.ag;

import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
/* compiled from: DatadogWrapperImpl.kt */
/* loaded from: classes.dex */
public final class d implements b {
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01de, code lost:
        if (r6 == null) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(android.app.Application r39, java.lang.String r40, java.lang.String r41, boolean r42, java.lang.String r43, float r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 1601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ag.d.<init>(android.app.Application, java.lang.String, java.lang.String, boolean, java.lang.String, float, boolean):void");
    }

    @Override // com.amazon.aps.iva.ag.b
    public final void a() {
        com.amazon.aps.iva.sq.c.a.remove("subStatus");
    }

    @Override // com.amazon.aps.iva.ag.b
    public final void b(Throwable th, LinkedHashMap linkedHashMap) {
        com.amazon.aps.iva.sq.c.c.r("Video Error", com.amazon.aps.iva.sq.e.LOGGER, th, linkedHashMap);
    }

    @Override // com.amazon.aps.iva.ag.b
    public final void c(String str) {
        j.f(str, "userId");
        com.amazon.aps.iva.jp.c.a(str);
    }

    @Override // com.amazon.aps.iva.ag.b
    public final void d() {
        com.amazon.aps.iva.jp.c.a(null);
    }

    @Override // com.amazon.aps.iva.ag.b
    public final void e(String str, String str2) {
        j.f(str, "key");
        j.f(str2, "value");
        com.amazon.aps.iva.sq.c.a.put(str, str2);
    }
}
