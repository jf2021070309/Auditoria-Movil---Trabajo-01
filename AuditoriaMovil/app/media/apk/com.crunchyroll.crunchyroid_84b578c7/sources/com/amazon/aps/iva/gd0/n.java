package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.m0;
/* compiled from: JavaFlexibleTypeDeserializer.kt */
/* loaded from: classes4.dex */
public final class n implements com.amazon.aps.iva.ae0.t {
    public static final n a = new n();

    @Override // com.amazon.aps.iva.ae0.t
    public final e0 a(com.amazon.aps.iva.id0.p pVar, String str, m0 m0Var, m0 m0Var2) {
        com.amazon.aps.iva.yb0.j.f(pVar, "proto");
        com.amazon.aps.iva.yb0.j.f(str, "flexibleId");
        com.amazon.aps.iva.yb0.j.f(m0Var, "lowerBound");
        com.amazon.aps.iva.yb0.j.f(m0Var2, "upperBound");
        if (!com.amazon.aps.iva.yb0.j.a(str, "kotlin.jvm.PlatformType")) {
            return com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.ERROR_FLEXIBLE_TYPE, str, m0Var.toString(), m0Var2.toString());
        }
        if (pVar.g(com.amazon.aps.iva.ld0.a.g)) {
            return new com.amazon.aps.iva.cd0.h(m0Var, m0Var2);
        }
        return f0.c(m0Var, m0Var2);
    }
}
