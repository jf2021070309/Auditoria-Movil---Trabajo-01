package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.h0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class j0 implements com.amazon.aps.iva.o0.u0 {
    public final /* synthetic */ h0 a;
    public final /* synthetic */ h0.a b;

    public j0(h0 h0Var, h0.a aVar) {
        this.a = h0Var;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        h0 h0Var = this.a;
        h0Var.getClass();
        h0.a<?, ?> aVar = this.b;
        com.amazon.aps.iva.yb0.j.f(aVar, "animation");
        h0Var.a.k(aVar);
    }
}
