package com.amazon.aps.iva.bw;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.sv.q1;
/* compiled from: LicenseExpirationProvider.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes2.dex */
public final class n implements m {
    public final e a;
    public final q1 b;

    public n(e eVar, q1 q1Var) {
        com.amazon.aps.iva.yb0.j.f(eVar, "licenseManager");
        com.amazon.aps.iva.yb0.j.f(q1Var, "downloadsProvider");
        this.a = eVar;
        this.b = q1Var;
    }

    @Override // com.amazon.aps.iva.bw.m
    public final Object a(String str, com.amazon.aps.iva.qb0.c cVar) {
        com.amazon.aps.iva.m6.m mVar;
        byte[] bArr;
        com.amazon.aps.iva.m6.c g = this.b.g(str);
        if (g != null && (mVar = g.a) != null && (bArr = mVar.f) != null) {
            Object g2 = this.a.g(bArr, cVar);
            if (g2 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return g2;
            }
            return (l) g2;
        }
        return null;
    }
}
