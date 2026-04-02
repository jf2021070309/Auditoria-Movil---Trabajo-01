package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.a1;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class f1 implements com.amazon.aps.iva.o0.u0 {
    public final /* synthetic */ a1 a;
    public final /* synthetic */ a1.d b;

    public f1(a1 a1Var, a1.d dVar) {
        this.a = a1Var;
        this.b = dVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        a1 a1Var = this.a;
        a1Var.getClass();
        a1.d dVar = this.b;
        com.amazon.aps.iva.yb0.j.f(dVar, "animation");
        a1Var.h.remove(dVar);
    }
}
