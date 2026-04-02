package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.p4.n;
/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class n1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.kb0.j<? extends com.amazon.aps.iva.q4.b, ? extends com.amazon.aps.iva.p4.n>, n.c, com.amazon.aps.iva.kb0.j<? extends com.amazon.aps.iva.q4.b, ? extends com.amazon.aps.iva.p4.n>> {
    public static final n1 h = new n1();

    public n1() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.j<? extends com.amazon.aps.iva.q4.b, ? extends com.amazon.aps.iva.p4.n> invoke(com.amazon.aps.iva.kb0.j<? extends com.amazon.aps.iva.q4.b, ? extends com.amazon.aps.iva.p4.n> jVar, n.c cVar) {
        com.amazon.aps.iva.kb0.j<? extends com.amazon.aps.iva.q4.b, ? extends com.amazon.aps.iva.p4.n> jVar2 = jVar;
        n.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(jVar2, "acc");
        com.amazon.aps.iva.yb0.j.f(cVar2, "cur");
        boolean z = cVar2 instanceof com.amazon.aps.iva.q4.b;
        B b = jVar2.c;
        if (z) {
            return new com.amazon.aps.iva.kb0.j<>(cVar2, b);
        }
        return new com.amazon.aps.iva.kb0.j<>(jVar2.b, ((com.amazon.aps.iva.p4.n) b).d(cVar2));
    }
}
