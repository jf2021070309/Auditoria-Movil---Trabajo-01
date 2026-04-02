package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.qd0.j;
/* compiled from: FieldOverridabilityCondition.kt */
/* loaded from: classes4.dex */
public final class p implements com.amazon.aps.iva.qd0.j {
    @Override // com.amazon.aps.iva.qd0.j
    public j.b a(com.amazon.aps.iva.oc0.a aVar, com.amazon.aps.iva.oc0.a aVar2, com.amazon.aps.iva.oc0.e eVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "superDescriptor");
        com.amazon.aps.iva.yb0.j.f(aVar2, "subDescriptor");
        if ((aVar2 instanceof n0) && (aVar instanceof n0)) {
            n0 n0Var = (n0) aVar2;
            n0 n0Var2 = (n0) aVar;
            if (!com.amazon.aps.iva.yb0.j.a(n0Var.getName(), n0Var2.getName())) {
                return j.b.UNKNOWN;
            }
            if (com.amazon.aps.iva.ab.x.W(n0Var) && com.amazon.aps.iva.ab.x.W(n0Var2)) {
                return j.b.OVERRIDABLE;
            }
            if (!com.amazon.aps.iva.ab.x.W(n0Var) && !com.amazon.aps.iva.ab.x.W(n0Var2)) {
                return j.b.UNKNOWN;
            }
            return j.b.INCOMPATIBLE;
        }
        return j.b.UNKNOWN;
    }

    @Override // com.amazon.aps.iva.qd0.j
    public j.a b() {
        return j.a.BOTH;
    }
}
