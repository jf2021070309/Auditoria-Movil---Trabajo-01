package com.amazon.aps.iva.o0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class t0 implements v2 {
    public final com.amazon.aps.iva.xb0.l<v0, u0> b;
    public u0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public t0(com.amazon.aps.iva.xb0.l<? super v0, ? extends u0> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "effect");
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onForgotten() {
        u0 u0Var = this.c;
        if (u0Var != null) {
            u0Var.dispose();
        }
        this.c = null;
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onRemembered() {
        this.c = this.b.invoke(x0.a);
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onAbandoned() {
    }
}
