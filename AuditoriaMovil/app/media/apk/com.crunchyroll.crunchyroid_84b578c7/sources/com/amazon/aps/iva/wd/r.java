package com.amazon.aps.iva.wd;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.be.a;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.wd.u;
/* compiled from: CreatePasswordScreenController.kt */
/* loaded from: classes.dex */
public final class r extends f0 implements o {
    public final com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> b;
    public final v0 c;

    public r(com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "navigator");
        this.b = bVar;
        a aVar = (a) bVar.T5();
        this.c = x.e(new t(aVar.b, "", aVar.c));
    }

    @Override // com.amazon.aps.iva.ri.a
    public final void K4(u uVar) {
        u uVar2 = uVar;
        com.amazon.aps.iva.yb0.j.f(uVar2, "event");
        boolean z = uVar2 instanceof u.b;
        com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar = this.b;
        if (z) {
            bVar.v1(a.g.a, null);
        } else if (uVar2 instanceof u.e) {
            bVar.v1(new a.j(((u.e) uVar2).a), null);
        } else if (uVar2 instanceof u.f) {
            bVar.v1(new a.l(((u.f) uVar2).a), null);
        } else if (com.amazon.aps.iva.yb0.j.a(uVar2, u.a.a)) {
            bVar.w7(null);
        } else {
            boolean z2 = uVar2 instanceof u.c;
            v0 v0Var = this.c;
            if (z2) {
                com.amazon.aps.iva.gr.n.A(v0Var, new p(uVar2));
            } else if (uVar2 instanceof u.d) {
                com.amazon.aps.iva.gr.n.A(v0Var, new q(uVar2));
            }
        }
    }

    @Override // com.amazon.aps.iva.ri.a
    public final u0<t> getState() {
        return this.c;
    }
}
