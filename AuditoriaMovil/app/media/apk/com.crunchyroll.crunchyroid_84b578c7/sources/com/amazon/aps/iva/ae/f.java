package com.amazon.aps.iva.ae;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ae.i;
import com.amazon.aps.iva.be.a;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: LogInScreenController.kt */
/* loaded from: classes.dex */
public final class f extends f0 implements d {
    public final com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> b;
    public final v0 c;

    public f(com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar) {
        j.f(bVar, "navigator");
        this.b = bVar;
        this.c = x.e(new h(""));
    }

    @Override // com.amazon.aps.iva.ri.a
    public final void K4(i iVar) {
        i iVar2 = iVar;
        j.f(iVar2, "event");
        boolean a = j.a(iVar2, i.b.a);
        com.amazon.aps.iva.ui.b<com.amazon.aps.iva.be.a> bVar = this.b;
        if (a) {
            bVar.v1(a.k.a, null);
        } else if (j.a(iVar2, i.a.a)) {
            bVar.w7(null);
        } else {
            boolean z = iVar2 instanceof i.e;
            v0 v0Var = this.c;
            if (z) {
                String str = ((h) v0Var.getValue()).a;
                j.f(str, "<this>");
                if (m.h0(str, "+", false)) {
                    bVar.v1(a.m.a, new com.amazon.aps.iva.le.a(((h) v0Var.getValue()).a, false, false));
                } else {
                    bVar.v1(a.d.a, new com.amazon.aps.iva.zd.a(((h) v0Var.getValue()).a));
                }
            } else if (j.a(iVar2, i.c.a)) {
                bVar.v1(a.f.a, null);
            } else if (iVar2 instanceof i.d) {
                n.A(v0Var, new e(iVar2));
            }
        }
    }

    @Override // com.amazon.aps.iva.ri.a
    public final u0<h> getState() {
        return this.c;
    }
}
