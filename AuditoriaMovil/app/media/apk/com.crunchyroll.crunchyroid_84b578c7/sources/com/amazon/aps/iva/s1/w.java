package com.amazon.aps.iva.s1;

import com.amazon.aps.iva.a1.f;
/* compiled from: LayoutModifier.kt */
/* loaded from: classes.dex */
public final class w extends f.c implements com.amazon.aps.iva.u1.x {
    public com.amazon.aps.iva.xb0.q<? super f0, ? super c0, ? super com.amazon.aps.iva.o2.a, ? extends e0> o;

    public w(com.amazon.aps.iva.xb0.q<? super f0, ? super c0, ? super com.amazon.aps.iva.o2.a, ? extends e0> qVar) {
        com.amazon.aps.iva.yb0.j.f(qVar, "measureBlock");
        this.o = qVar;
    }

    @Override // com.amazon.aps.iva.u1.x
    public final e0 f(f0 f0Var, c0 c0Var, long j) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "$this$measure");
        return this.o.invoke(f0Var, c0Var, new com.amazon.aps.iva.o2.a(j));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.o + ')';
    }
}
