package com.amazon.aps.iva.o0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class n0 implements v2 {
    public final com.amazon.aps.iva.se0.g0 b;

    public n0(com.amazon.aps.iva.xe0.d dVar) {
        this.b = dVar;
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onAbandoned() {
        com.amazon.aps.iva.e.z.l(this.b, new com.amazon.aps.iva.a0.h1(1));
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onForgotten() {
        com.amazon.aps.iva.e.z.l(this.b, new com.amazon.aps.iva.a0.h1(1));
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onRemembered() {
    }
}
