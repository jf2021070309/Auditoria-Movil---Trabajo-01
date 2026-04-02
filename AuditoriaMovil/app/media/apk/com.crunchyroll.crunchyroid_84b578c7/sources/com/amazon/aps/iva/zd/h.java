package com.amazon.aps.iva.zd;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.be.a;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.zd.k;
/* compiled from: EnterPasswordScreenController.kt */
/* loaded from: classes.dex */
public final class h extends f0 implements e {
    public final com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> b;
    public final v0 c;

    public h(com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "navigator");
        this.b = bVar;
        this.c = x.e(new j(((a) bVar.T5()).b, ""));
    }

    @Override // com.amazon.aps.iva.ri.a
    public final void K4(k kVar) {
        k kVar2 = kVar;
        com.amazon.aps.iva.yb0.j.f(kVar2, "event");
        boolean a = com.amazon.aps.iva.yb0.j.a(kVar2, k.a.a);
        com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar = this.b;
        if (a) {
            bVar.w7(null);
        } else if (com.amazon.aps.iva.yb0.j.a(kVar2, k.b.a)) {
            bVar.v1(a.k.a, null);
        } else {
            boolean z = kVar2 instanceof k.d;
            v0 v0Var = this.c;
            if (z) {
                bVar.v1(new a.e(((j) v0Var.getValue()).a), null);
            } else if (kVar2 instanceof k.e) {
                bVar.v1(a.g.a, null);
            } else if (kVar2 instanceof k.c) {
                n.A(v0Var, new f(kVar2));
            } else if (kVar2 instanceof k.f) {
                n.A(v0Var, new g(kVar2));
            }
        }
    }

    @Override // com.amazon.aps.iva.ri.a
    public final u0<j> getState() {
        return this.c;
    }
}
