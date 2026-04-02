package com.amazon.aps.iva.sd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
/* compiled from: constantValues.kt */
/* loaded from: classes4.dex */
public final class i extends g<Double> {
    public i(double d) {
        super(Double.valueOf(d));
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final e0 a(com.amazon.aps.iva.oc0.c0 c0Var) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "module");
        com.amazon.aps.iva.lc0.k j = c0Var.j();
        j.getClass();
        m0 t = j.t(com.amazon.aps.iva.lc0.l.DOUBLE);
        if (t != null) {
            return t;
        }
        com.amazon.aps.iva.lc0.k.a(61);
        throw null;
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final String toString() {
        return ((Number) this.a).doubleValue() + ".toDouble()";
    }
}
