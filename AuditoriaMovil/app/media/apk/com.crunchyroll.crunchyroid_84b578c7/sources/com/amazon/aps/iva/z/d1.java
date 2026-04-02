package com.amazon.aps.iva.z;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.z.a1;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class d1 implements com.amazon.aps.iva.o0.u0 {
    public final /* synthetic */ a1 a;
    public final /* synthetic */ a1.a b;

    public d1(a1 a1Var, a1.a aVar) {
        this.a = a1Var;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        p3 p3Var;
        a1 a1Var = this.a;
        a1Var.getClass();
        a1.a aVar = this.b;
        com.amazon.aps.iva.yb0.j.f(aVar, "deferredAnimation");
        a1.a.C0904a c0904a = (a1.a.C0904a) aVar.c.getValue();
        if (c0904a != null && (p3Var = c0904a.b) != null) {
            a1Var.h.remove(p3Var);
        }
    }
}
