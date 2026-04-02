package com.amazon.aps.iva.z;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class h1 implements com.amazon.aps.iva.o0.u0 {
    public final /* synthetic */ a1 a;

    public h1(a1 a1Var) {
        this.a = a1Var;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        a1 a1Var = this.a;
        a1Var.f.w(Long.MIN_VALUE);
        Object d = a1Var.d();
        n0<S> n0Var = a1Var.a;
        n0Var.a.setValue(d);
        a1Var.e.w(0L);
        n0Var.b.setValue(Boolean.FALSE);
    }
}
