package com.amazon.aps.iva.o0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class g1 implements v2 {
    public final com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> b;
    public final com.amazon.aps.iva.xe0.d c;
    public com.amazon.aps.iva.se0.c2 d;

    /* JADX WARN: Multi-variable type inference failed */
    public g1(com.amazon.aps.iva.ob0.g gVar, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.se0.g0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "parentCoroutineContext");
        com.amazon.aps.iva.yb0.j.f(pVar, "task");
        this.b = pVar;
        this.c = com.amazon.aps.iva.e.z.i(gVar);
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onAbandoned() {
        com.amazon.aps.iva.se0.c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.a(new com.amazon.aps.iva.a0.h1(1));
        }
        this.d = null;
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onForgotten() {
        com.amazon.aps.iva.se0.c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.a(new com.amazon.aps.iva.a0.h1(1));
        }
        this.d = null;
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onRemembered() {
        com.amazon.aps.iva.se0.c2 c2Var = this.d;
        if (c2Var != null) {
            c2Var.a(com.amazon.aps.iva.e.z.h("Old job was still running!", null));
        }
        this.d = com.amazon.aps.iva.se0.i.d(this.c, null, null, this.b, 3);
    }
}
