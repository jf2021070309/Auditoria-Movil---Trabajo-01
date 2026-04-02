package com.amazon.aps.iva.sd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.lc0.o;
/* compiled from: constantValues.kt */
/* loaded from: classes4.dex */
public final class b0 extends r {
    public b0(long j) {
        super(Long.valueOf(j));
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final e0 a(com.amazon.aps.iva.oc0.c0 c0Var) {
        m0 m0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var, "module");
        com.amazon.aps.iva.oc0.e a = com.amazon.aps.iva.oc0.u.a(c0Var, o.a.U);
        if (a != null) {
            m0Var = a.m();
        } else {
            m0Var = null;
        }
        if (m0Var == null) {
            return com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.NOT_FOUND_UNSIGNED_TYPE, "ULong");
        }
        return m0Var;
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final String toString() {
        return ((Number) this.a).longValue() + ".toULong()";
    }
}
