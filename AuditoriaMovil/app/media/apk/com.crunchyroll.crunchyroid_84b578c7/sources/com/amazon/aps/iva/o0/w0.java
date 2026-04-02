package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: CompositionLocal.kt */
/* loaded from: classes.dex */
public final class w0<T> extends g2<T> {
    public final h3<T> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(h3<T> h3Var, com.amazon.aps.iva.xb0.a<? extends T> aVar) {
        super(aVar);
        com.amazon.aps.iva.yb0.j.f(h3Var, "policy");
        com.amazon.aps.iva.yb0.j.f(aVar, "defaultFactory");
        this.b = h3Var;
    }

    @Override // com.amazon.aps.iva.o0.k0
    public final p3 a(Object obj, i iVar) {
        iVar.s(-84026900);
        e0.b bVar = e0.a;
        iVar.s(-492369756);
        Object t = iVar.t();
        if (t == i.a.a) {
            t = com.amazon.aps.iva.cq.b.b0(obj, this.b);
            iVar.n(t);
        }
        iVar.G();
        q1 q1Var = (q1) t;
        q1Var.setValue(obj);
        iVar.G();
        return q1Var;
    }
}
