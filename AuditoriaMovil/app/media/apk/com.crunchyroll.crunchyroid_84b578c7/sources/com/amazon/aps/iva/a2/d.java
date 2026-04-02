package com.amazon.aps.iva.a2;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.u1.i1;
/* compiled from: SemanticsModifier.kt */
/* loaded from: classes.dex */
public final class d extends f.c implements i1 {
    public boolean o;
    public final boolean p;
    public com.amazon.aps.iva.xb0.l<? super c0, com.amazon.aps.iva.kb0.q> q;

    public d(boolean z, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "properties");
        this.o = z;
        this.p = false;
        this.q = lVar;
    }

    @Override // com.amazon.aps.iva.u1.i1
    public final boolean J() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.u1.i1
    public final boolean d1() {
        return this.o;
    }

    @Override // com.amazon.aps.iva.u1.i1
    public final void o0(l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "<this>");
        this.q.invoke(lVar);
    }
}
