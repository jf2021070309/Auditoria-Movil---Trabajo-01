package com.amazon.aps.iva.ge;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.be.a;
import com.amazon.aps.iva.ge.j;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
/* compiled from: SignUpScreenController.kt */
/* loaded from: classes.dex */
public final class g extends f0 implements d {
    public final com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> b;
    public final v0 c;

    public g(com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "navigator");
        this.b = bVar;
        this.c = x.e(new i("", false));
    }

    @Override // com.amazon.aps.iva.ri.a
    public final void K4(j jVar) {
        j jVar2 = jVar;
        com.amazon.aps.iva.yb0.j.f(jVar2, "event");
        boolean a = com.amazon.aps.iva.yb0.j.a(jVar2, j.c.a);
        com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar = this.b;
        if (a) {
            bVar.v1(a.h.a, null);
        } else if (com.amazon.aps.iva.yb0.j.a(jVar2, j.a.a)) {
            bVar.w7(null);
        } else {
            boolean z = jVar2 instanceof j.d;
            v0 v0Var = this.c;
            if (z) {
                String str = ((i) v0Var.getValue()).a;
                com.amazon.aps.iva.yb0.j.f(str, "<this>");
                if (m.h0(str, "+", false)) {
                    bVar.v1(a.m.a, new com.amazon.aps.iva.le.a(((i) v0Var.getValue()).a, true, ((i) v0Var.getValue()).b));
                } else {
                    bVar.v1(a.b.a, new com.amazon.aps.iva.wd.a(((i) v0Var.getValue()).a, ((i) v0Var.getValue()).b));
                }
            } else if (jVar2 instanceof j.b) {
                n.A(v0Var, new e(jVar2));
            } else if (com.amazon.aps.iva.yb0.j.a(jVar2, j.e.a)) {
                n.A(v0Var, f.h);
            }
        }
    }

    @Override // com.amazon.aps.iva.ri.a
    public final u0<i> getState() {
        return this.c;
    }
}
