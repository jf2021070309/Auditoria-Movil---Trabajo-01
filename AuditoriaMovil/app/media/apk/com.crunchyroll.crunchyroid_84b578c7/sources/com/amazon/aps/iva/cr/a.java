package com.amazon.aps.iva.cr;

import com.amazon.aps.iva.aq.b;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.x;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: RumOkHttpUploaderV2.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.qp.a {
    public final b l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, okhttp3.OkHttpClient r17, com.amazon.aps.iva.aq.a r18, com.amazon.aps.iva.aq.b r19) {
        /*
            r12 = this;
            r0 = r13
            r1 = r19
            java.lang.String r2 = "endpoint"
            com.amazon.aps.iva.yb0.j.f(r13, r2)
            java.lang.String r2 = "clientToken"
            r5 = r14
            com.amazon.aps.iva.yb0.j.f(r14, r2)
            java.lang.String r2 = "source"
            r6 = r15
            com.amazon.aps.iva.yb0.j.f(r15, r2)
            java.lang.String r2 = "sdkVersion"
            r7 = r16
            com.amazon.aps.iva.yb0.j.f(r7, r2)
            java.lang.String r2 = "appVersionProvider"
            com.amazon.aps.iva.yb0.j.f(r1, r2)
            com.amazon.aps.iva.qp.a$a r2 = com.amazon.aps.iva.qp.a.EnumC0653a.RUM
            java.lang.String r3 = "trackType"
            com.amazon.aps.iva.yb0.j.f(r2, r3)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.getTrackName()
            java.lang.Object[] r0 = new java.lang.Object[]{r13, r2}
            r2 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "%s/api/v2/%s"
            java.lang.String r4 = java.lang.String.format(r3, r2, r0)
            java.lang.String r0 = "format(locale, format, *args)"
            com.amazon.aps.iva.yb0.j.e(r4, r0)
            java.lang.String r9 = "text/plain;charset=UTF-8"
            com.amazon.aps.iva.iq.a r11 = com.amazon.aps.iva.dq.c.a
            r3 = r12
            r8 = r17
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r12
            r0.l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cr.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, okhttp3.OkHttpClient, com.amazon.aps.iva.aq.a, com.amazon.aps.iva.aq.b):void");
    }

    @Override // com.amazon.aps.iva.qp.a
    public final Map<String, Object> a() {
        j[] jVarArr = new j[2];
        boolean z = false;
        jVarArr[0] = new j("ddsource", this.d);
        ArrayList M = f1.M(com.amazon.aps.iva.oa.a.a("service:", com.amazon.aps.iva.lp.a.q), com.amazon.aps.iva.oa.a.a("version:", this.l.getVersion()), "sdk_version:" + this.e, com.amazon.aps.iva.oa.a.a("env:", com.amazon.aps.iva.lp.a.w));
        if (com.amazon.aps.iva.lp.a.x.length() > 0) {
            z = true;
        }
        if (z) {
            M.add("variant:" + com.amazon.aps.iva.lp.a.x);
        }
        jVarArr[1] = new j("ddtags", x.B0(M, ",", null, null, null, 62));
        return i0.U(jVarArr);
    }
}
