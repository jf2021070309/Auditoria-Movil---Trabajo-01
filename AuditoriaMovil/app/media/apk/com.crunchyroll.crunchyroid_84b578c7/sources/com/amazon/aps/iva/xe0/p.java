package com.amazon.aps.iva.xe0;
/* compiled from: Scopes.kt */
/* loaded from: classes4.dex */
public class p<T> extends com.amazon.aps.iva.se0.a<T> implements com.amazon.aps.iva.qb0.d {
    public final com.amazon.aps.iva.ob0.d<T> d;

    public p(com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.ob0.g gVar) {
        super(gVar, true);
        this.d = dVar;
    }

    @Override // com.amazon.aps.iva.se0.o1
    public final boolean f0() {
        return true;
    }

    @Override // com.amazon.aps.iva.qb0.d
    public final com.amazon.aps.iva.qb0.d getCallerFrame() {
        com.amazon.aps.iva.ob0.d<T> dVar = this.d;
        if (dVar instanceof com.amazon.aps.iva.qb0.d) {
            return (com.amazon.aps.iva.qb0.d) dVar;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.se0.o1
    public void x(Object obj) {
        com.amazon.aps.iva.cq.b.j0(com.amazon.aps.iva.aq.k.z(obj), com.amazon.aps.iva.a60.b.s(this.d), null);
    }

    @Override // com.amazon.aps.iva.se0.o1
    public void y(Object obj) {
        this.d.resumeWith(com.amazon.aps.iva.aq.k.z(obj));
    }
}
