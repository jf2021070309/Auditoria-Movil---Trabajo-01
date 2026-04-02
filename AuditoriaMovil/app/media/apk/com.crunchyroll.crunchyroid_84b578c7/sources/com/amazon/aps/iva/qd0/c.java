package com.amazon.aps.iva.qd0;

import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.fe0.d;
import com.amazon.aps.iva.oc0.y0;
/* loaded from: classes4.dex */
public final class c implements d.a {
    public final boolean a;
    public final com.amazon.aps.iva.oc0.a b;
    public final com.amazon.aps.iva.oc0.a c;

    public c(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2, boolean z) {
        this.a = z;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // com.amazon.aps.iva.fe0.d.a
    public final boolean a(c1 c1Var, c1 c1Var2) {
        com.amazon.aps.iva.oc0.a aVar = this.b;
        com.amazon.aps.iva.yb0.j.f(aVar, "$a");
        com.amazon.aps.iva.oc0.a aVar2 = this.c;
        com.amazon.aps.iva.yb0.j.f(aVar2, "$b");
        com.amazon.aps.iva.yb0.j.f(c1Var, "c1");
        com.amazon.aps.iva.yb0.j.f(c1Var2, "c2");
        if (com.amazon.aps.iva.yb0.j.a(c1Var, c1Var2)) {
            return true;
        }
        com.amazon.aps.iva.oc0.h k = c1Var.k();
        com.amazon.aps.iva.oc0.h k2 = c1Var2.k();
        if ((k instanceof y0) && (k2 instanceof y0)) {
            return g.a.b((y0) k, (y0) k2, this.a, new e(aVar, aVar2));
        }
        return false;
    }
}
