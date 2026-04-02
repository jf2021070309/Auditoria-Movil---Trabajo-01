package com.amazon.aps.iva.f0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class r0 implements com.amazon.aps.iva.o0.u0 {
    public final /* synthetic */ o0 a;
    public final /* synthetic */ Object b;

    public r0(o0 o0Var, Object obj) {
        this.a = o0Var;
        this.b = obj;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        this.a.c.add(this.b);
    }
}
