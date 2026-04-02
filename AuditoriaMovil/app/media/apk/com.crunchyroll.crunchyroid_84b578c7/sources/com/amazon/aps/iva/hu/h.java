package com.amazon.aps.iva.hu;

import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.wy.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: LocalCommentsViewModel.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.ez.b implements g {
    public final v<List<x>> b;
    public final v<com.amazon.aps.iva.ez.d<q>> c;

    public h() {
        super(new j[0]);
        this.b = new v<>(z.b);
        this.c = new v<>();
    }

    @Override // com.amazon.aps.iva.hu.g
    public final v b7() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.hu.g
    public final void n1(x xVar) {
        v<List<x>> vVar = this.b;
        List<x> d = vVar.d();
        com.amazon.aps.iva.yb0.j.c(d);
        vVar.k(com.amazon.aps.iva.lb0.x.L0(d, f1.J(xVar)));
        this.c.k(new com.amazon.aps.iva.ez.d<>(q.a));
    }

    @Override // com.amazon.aps.iva.hu.g
    public final void n8() {
        this.b.k(z.b);
    }

    @Override // com.amazon.aps.iva.vt.h
    public final void o(x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "updatedModel");
        v<List<x>> vVar = this.b;
        List<x> d = vVar.d();
        com.amazon.aps.iva.yb0.j.c(d);
        Iterator<x> it = d.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (com.amazon.aps.iva.yb0.j.a(it.next().b, xVar.b)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            List<x> d2 = vVar.d();
            com.amazon.aps.iva.yb0.j.c(d2);
            ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(d2);
            Z0.set(i, xVar);
            vVar.k(Z0);
        }
    }

    @Override // com.amazon.aps.iva.hu.g
    public final v o2() {
        return this.b;
    }
}
