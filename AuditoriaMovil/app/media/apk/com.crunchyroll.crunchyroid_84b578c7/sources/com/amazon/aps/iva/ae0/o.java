package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.ee0.f1;
import java.util.Iterator;
/* compiled from: DeserializedClassDataFinder.kt */
/* loaded from: classes4.dex */
public final class o implements i {
    public final com.amazon.aps.iva.oc0.g0 a;

    public o(com.amazon.aps.iva.oc0.g0 g0Var) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "packageFragmentProvider");
        this.a = g0Var;
    }

    @Override // com.amazon.aps.iva.ae0.i
    public final h a(com.amazon.aps.iva.nd0.b bVar) {
        h a;
        com.amazon.aps.iva.yb0.j.f(bVar, "classId");
        com.amazon.aps.iva.nd0.c h = bVar.h();
        com.amazon.aps.iva.yb0.j.e(h, "classId.packageFqName");
        Iterator it = f1.O(this.a, h).iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.oc0.f0 f0Var = (com.amazon.aps.iva.oc0.f0) it.next();
            if ((f0Var instanceof p) && (a = ((p) f0Var).E0().a(bVar)) != null) {
                return a;
            }
        }
        return null;
    }
}
