package com.amazon.aps.iva.s50;

import com.amazon.aps.iva.i5.u;
/* compiled from: ShowRatingViewModel.kt */
/* loaded from: classes2.dex */
public final class j implements h {
    public final com.amazon.aps.iva.n50.c a;
    public final u b;

    public j(com.amazon.aps.iva.n50.d dVar) {
        this.a = dVar;
        this.b = com.amazon.aps.iva.ez.h.b(dVar.f, i.h);
    }

    @Override // com.amazon.aps.iva.s50.h
    public final u a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.s50.h
    public final void m(com.amazon.aps.iva.m50.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "showRatingInput");
        this.a.m(bVar);
    }
}
