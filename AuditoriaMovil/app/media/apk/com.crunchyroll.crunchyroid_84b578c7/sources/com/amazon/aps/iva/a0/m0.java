package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.a1.f;
/* compiled from: FocusedBounds.kt */
/* loaded from: classes.dex */
public final class m0 extends f.c implements com.amazon.aps.iva.t1.f, com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.s1.q, com.amazon.aps.iva.kb0.q> {
    public com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.s1.q, com.amazon.aps.iva.kb0.q> o;
    public final com.amazon.aps.iva.t1.j p;

    public m0(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.s1.q, com.amazon.aps.iva.kb0.q> lVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(lVar, "onPositioned");
        this.o = lVar;
        com.amazon.aps.iva.t1.i<com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.s1.q, com.amazon.aps.iva.kb0.q>> iVar = androidx.compose.foundation.k.a;
        com.amazon.aps.iva.t1.j jVar = new com.amazon.aps.iva.t1.j(iVar);
        if (iVar == jVar.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jVar.b.setValue(this);
            this.p = jVar;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // com.amazon.aps.iva.t1.f
    public final com.amazon.aps.iva.ab.a P() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.s1.q qVar) {
        com.amazon.aps.iva.xb0.l lVar;
        com.amazon.aps.iva.s1.q qVar2 = qVar;
        if (this.n) {
            this.o.invoke(qVar2);
            if (this.n) {
                lVar = (com.amazon.aps.iva.xb0.l) l(androidx.compose.foundation.k.a);
            } else {
                lVar = null;
            }
            if (lVar != null) {
                lVar.invoke(qVar2);
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
