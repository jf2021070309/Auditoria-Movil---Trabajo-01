package com.amazon.aps.iva.se0;
/* compiled from: Builders.common.kt */
/* loaded from: classes4.dex */
public final class s1 extends c2 {
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> d;

    public s1(com.amazon.aps.iva.ob0.g gVar, com.amazon.aps.iva.xb0.p<? super g0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar) {
        super(gVar, false);
        this.d = com.amazon.aps.iva.a60.b.o(pVar, this, this);
    }

    @Override // com.amazon.aps.iva.se0.o1
    public final void p0() {
        try {
            com.amazon.aps.iva.cq.b.j0(com.amazon.aps.iva.kb0.q.a, com.amazon.aps.iva.a60.b.s(this.d), null);
        } catch (Throwable th) {
            resumeWith(com.amazon.aps.iva.ab.x.H(th));
            throw th;
        }
    }
}
