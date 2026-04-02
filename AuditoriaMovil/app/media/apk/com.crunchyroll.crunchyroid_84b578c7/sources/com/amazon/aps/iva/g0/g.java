package com.amazon.aps.iva.g0;
/* compiled from: BringIntoViewRequester.kt */
/* loaded from: classes.dex */
public final class g extends a {
    public d q;

    public g(d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "requester");
        this.q = dVar;
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void m1() {
        d dVar = this.q;
        com.amazon.aps.iva.yb0.j.f(dVar, "requester");
        d dVar2 = this.q;
        if (dVar2 instanceof e) {
            com.amazon.aps.iva.yb0.j.d(dVar2, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((e) dVar2).a.k(this);
        }
        if (dVar instanceof e) {
            ((e) dVar).a.b(this);
        }
        this.q = dVar;
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void n1() {
        d dVar = this.q;
        if (dVar instanceof e) {
            com.amazon.aps.iva.yb0.j.d(dVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((e) dVar).a.k(this);
        }
    }
}
