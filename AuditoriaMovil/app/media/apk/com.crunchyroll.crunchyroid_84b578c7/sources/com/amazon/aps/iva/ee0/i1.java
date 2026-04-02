package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.ee0.e1;
import com.amazon.aps.iva.ee0.g1;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: TypeParameterUpperBoundEraser.kt */
/* loaded from: classes4.dex */
public final class i1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g1.a, e0> {
    public final /* synthetic */ g1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(g1 g1Var) {
        super(1);
        this.h = g1Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final e0 invoke(g1.a aVar) {
        j1 t;
        g1.a aVar2 = aVar;
        com.amazon.aps.iva.oc0.y0 y0Var = aVar2.a;
        g1 g1Var = this.h;
        g1Var.getClass();
        x xVar = aVar2.b;
        Set<com.amazon.aps.iva.oc0.y0> c = xVar.c();
        if (c != null && c.contains(y0Var.a())) {
            return g1Var.a(xVar);
        }
        m0 m = y0Var.m();
        com.amazon.aps.iva.yb0.j.e(m, "typeParameter.defaultType");
        LinkedHashSet<com.amazon.aps.iva.oc0.y0> linkedHashSet = new LinkedHashSet();
        com.amazon.aps.iva.da0.a.m(m, m, linkedHashSet, c);
        int w = com.amazon.aps.iva.aq.k.w(com.amazon.aps.iva.lb0.r.Y(linkedHashSet));
        if (w < 16) {
            w = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(w);
        for (com.amazon.aps.iva.oc0.y0 y0Var2 : linkedHashSet) {
            if (c != null && c.contains(y0Var2)) {
                t = s1.n(y0Var2, xVar);
            } else {
                t = g1Var.a.t(y0Var2, xVar, g1Var, g1Var.b(y0Var2, xVar.d(y0Var)));
            }
            linkedHashMap.put(y0Var2.h(), t);
        }
        e1.a aVar3 = e1.b;
        boolean z = false;
        q1 e = q1.e(new d1(linkedHashMap, false));
        List<e0> upperBounds = y0Var.getUpperBounds();
        com.amazon.aps.iva.yb0.j.e(upperBounds, "typeParameter.upperBounds");
        com.amazon.aps.iva.mb0.f c2 = g1Var.c(e, upperBounds, xVar);
        if (!c2.isEmpty()) {
            g1Var.b.getClass();
            if (c2.b.i == 1) {
                z = true;
            }
            if (z) {
                return (e0) com.amazon.aps.iva.lb0.x.O0(c2);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
        }
        return g1Var.a(xVar);
    }
}
