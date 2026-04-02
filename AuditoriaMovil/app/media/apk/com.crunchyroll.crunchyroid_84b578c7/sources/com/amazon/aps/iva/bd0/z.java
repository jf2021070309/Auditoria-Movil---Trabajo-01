package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.f0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.r1;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ee0.v1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: LazyJavaTypeParameterDescriptor.kt */
/* loaded from: classes4.dex */
public final class z extends com.amazon.aps.iva.rc0.c {
    public final com.amazon.aps.iva.la0.c l;
    public final com.amazon.aps.iva.ed0.x m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.ed0.x xVar, int i, com.amazon.aps.iva.oc0.k kVar) {
        super(cVar.b(), kVar, new com.amazon.aps.iva.ad0.e(cVar, xVar, false), xVar.getName(), v1.INVARIANT, false, i, ((com.amazon.aps.iva.ad0.c) cVar.a).m);
        com.amazon.aps.iva.yb0.j.f(xVar, "javaTypeParameter");
        com.amazon.aps.iva.yb0.j.f(kVar, "containingDeclaration");
        this.l = cVar;
        this.m = xVar;
    }

    @Override // com.amazon.aps.iva.rc0.k
    public final List<e0> E0(List<? extends e0> list) {
        e0 a;
        com.amazon.aps.iva.la0.c cVar = this.l;
        com.amazon.aps.iva.fd0.t tVar = ((com.amazon.aps.iva.ad0.c) cVar.a).r;
        tVar.getClass();
        List<? extends e0> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (e0 e0Var : list2) {
            com.amazon.aps.iva.fd0.s sVar = com.amazon.aps.iva.fd0.s.h;
            com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
            com.amazon.aps.iva.yb0.j.f(sVar, "predicate");
            if (!s1.c(e0Var, sVar) && (a = tVar.a(new com.amazon.aps.iva.fd0.v(this, false, cVar, com.amazon.aps.iva.xc0.c.TYPE_PARAMETER_BOUNDS), e0Var, com.amazon.aps.iva.lb0.z.b, null, false)) != null) {
                e0Var = a;
            }
            arrayList.add(e0Var);
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.rc0.k
    public final void G0(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "type");
    }

    @Override // com.amazon.aps.iva.rc0.k
    public final List<e0> H0() {
        Collection<com.amazon.aps.iva.ed0.j> upperBounds = this.m.getUpperBounds();
        boolean isEmpty = upperBounds.isEmpty();
        com.amazon.aps.iva.la0.c cVar = this.l;
        if (isEmpty) {
            m0 f = cVar.a().j().f();
            com.amazon.aps.iva.yb0.j.e(f, "c.module.builtIns.anyType");
            m0 p = cVar.a().j().p();
            com.amazon.aps.iva.yb0.j.e(p, "c.module.builtIns.nullableAnyType");
            return f1.J(f0.c(f, p));
        }
        Collection<com.amazon.aps.iva.ed0.j> collection = upperBounds;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(collection));
        for (com.amazon.aps.iva.ed0.j jVar : collection) {
            arrayList.add(((com.amazon.aps.iva.cd0.d) cVar.e).d(jVar, com.amazon.aps.iva.a60.b.w(r1.COMMON, false, false, this, 3)));
        }
        return arrayList;
    }
}
