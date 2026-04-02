package com.amazon.aps.iva.z;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class b1 implements com.amazon.aps.iva.o0.u0 {
    public final /* synthetic */ a1 a;
    public final /* synthetic */ a1 b;

    public b1(a1 a1Var, a1 a1Var2) {
        this.a = a1Var;
        this.b = a1Var2;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        a1 a1Var = this.a;
        a1Var.getClass();
        a1 a1Var2 = this.b;
        com.amazon.aps.iva.yb0.j.f(a1Var2, "transition");
        a1Var.i.remove(a1Var2);
    }
}
