package com.amazon.aps.iva.le;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.be.a;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.le.j;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
/* compiled from: VerifyNumberScreenController.kt */
/* loaded from: classes.dex */
public final class g extends f0 implements e {
    public final com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> b;
    public final v0 c;

    public g(com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "navigator");
        this.b = bVar;
        a aVar = (a) bVar.T5();
        this.c = x.e(new i(aVar.b, aVar.c, aVar.d));
    }

    @Override // com.amazon.aps.iva.ri.a
    public final void K4(j jVar) {
        j jVar2 = jVar;
        com.amazon.aps.iva.yb0.j.f(jVar2, "event");
        boolean a = com.amazon.aps.iva.yb0.j.a(jVar2, j.a.a);
        com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar = this.b;
        if (a) {
            bVar.w7(null);
        } else if (com.amazon.aps.iva.yb0.j.a(jVar2, j.b.a)) {
            bVar.v1(a.C0142a.a, null);
        } else if (com.amazon.aps.iva.yb0.j.a(jVar2, j.c.a)) {
            bVar.v1(a.k.a, null);
        } else {
            boolean z = jVar2 instanceof j.e;
            v0 v0Var = this.c;
            if (z) {
                bVar.v1(new a.i(new com.amazon.aps.iva.ee.a(((i) v0Var.getValue()).a, ((i) v0Var.getValue()).b)), null);
            } else if (jVar2 instanceof j.d) {
                n.A(v0Var, new f(jVar2));
            }
        }
    }

    @Override // com.amazon.aps.iva.ri.a
    public final u0<i> getState() {
        return this.c;
    }
}
