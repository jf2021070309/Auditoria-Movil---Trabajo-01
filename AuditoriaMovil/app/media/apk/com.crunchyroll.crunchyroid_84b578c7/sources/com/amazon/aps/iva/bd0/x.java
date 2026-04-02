package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.xd0.i;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes4.dex */
public final class x extends y {
    public static final /* synthetic */ int p = 0;
    public final com.amazon.aps.iva.ed0.g n;
    public final com.amazon.aps.iva.zc0.c o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.ed0.g gVar, com.amazon.aps.iva.zc0.c cVar2) {
        super(cVar);
        com.amazon.aps.iva.yb0.j.f(gVar, "jClass");
        com.amazon.aps.iva.yb0.j.f(cVar2, "ownerDescriptor");
        this.n = gVar;
        this.o = cVar2;
    }

    public static n0 v(n0 n0Var) {
        if (n0Var.getKind().isReal()) {
            return n0Var;
        }
        Collection<? extends com.amazon.aps.iva.oc0.b> k = n0Var.k();
        com.amazon.aps.iva.yb0.j.e(k, "this.overriddenDescriptors");
        Collection<? extends com.amazon.aps.iva.oc0.b> collection = k;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(collection));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            n0 n0Var2 = (n0) it.next();
            com.amazon.aps.iva.yb0.j.e(n0Var2, "it");
            arrayList.add(v(n0Var2));
        }
        return (n0) com.amazon.aps.iva.lb0.x.P0(com.amazon.aps.iva.lb0.x.n0(arrayList));
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    public final com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return null;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final Set h(com.amazon.aps.iva.xd0.d dVar, i.a.C0852a c0852a) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        return b0.b;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final Set i(com.amazon.aps.iva.xd0.d dVar, i.a.C0852a c0852a) {
        Set<com.amazon.aps.iva.nd0.f> set;
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        Set b1 = com.amazon.aps.iva.lb0.x.b1(this.e.invoke().a());
        com.amazon.aps.iva.zc0.c cVar = this.o;
        x u = com.amazon.aps.iva.dg.b.u(cVar);
        if (u != null) {
            set = u.a();
        } else {
            set = null;
        }
        if (set == null) {
            set = b0.b;
        }
        b1.addAll(set);
        if (this.n.u()) {
            b1.addAll(f1.K(com.amazon.aps.iva.lc0.o.c, com.amazon.aps.iva.lc0.o.a));
        }
        com.amazon.aps.iva.la0.c cVar2 = this.b;
        b1.addAll(((com.amazon.aps.iva.ad0.c) cVar2.a).x.g(cVar2, cVar));
        return b1;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final void j(ArrayList arrayList, com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.la0.c cVar = this.b;
        ((com.amazon.aps.iva.ad0.c) cVar.a).x.c(cVar, this.o, fVar, arrayList);
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final b k() {
        return new a(this.n, s.h);
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final void m(LinkedHashSet linkedHashSet, com.amazon.aps.iva.nd0.f fVar) {
        Collection c1;
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.zc0.c cVar = this.o;
        x u = com.amazon.aps.iva.dg.b.u(cVar);
        if (u == null) {
            c1 = b0.b;
        } else {
            c1 = com.amazon.aps.iva.lb0.x.c1(u.b(fVar, com.amazon.aps.iva.wc0.d.WHEN_GET_SUPER_MEMBERS));
        }
        com.amazon.aps.iva.zc0.c cVar2 = this.o;
        com.amazon.aps.iva.ad0.c cVar3 = (com.amazon.aps.iva.ad0.c) this.b.a;
        linkedHashSet.addAll(com.amazon.aps.iva.hc.m.w(fVar, c1, linkedHashSet, cVar2, cVar3.f, cVar3.u.a()));
        if (this.n.u()) {
            if (com.amazon.aps.iva.yb0.j.a(fVar, com.amazon.aps.iva.lc0.o.c)) {
                linkedHashSet.add(com.amazon.aps.iva.qd0.h.f(cVar));
            } else if (com.amazon.aps.iva.yb0.j.a(fVar, com.amazon.aps.iva.lc0.o.a)) {
                linkedHashSet.add(com.amazon.aps.iva.qd0.h.g(cVar));
            }
        }
    }

    @Override // com.amazon.aps.iva.bd0.y, com.amazon.aps.iva.bd0.o
    public final void n(ArrayList arrayList, com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        t tVar = new t(fVar);
        com.amazon.aps.iva.zc0.c cVar = this.o;
        com.amazon.aps.iva.me0.a.b(f1.J(cVar), com.amazon.aps.iva.a0.k.b, new w(cVar, linkedHashSet, tVar));
        boolean z = !arrayList.isEmpty();
        com.amazon.aps.iva.la0.c cVar2 = this.b;
        if (z) {
            com.amazon.aps.iva.zc0.c cVar3 = this.o;
            com.amazon.aps.iva.ad0.c cVar4 = (com.amazon.aps.iva.ad0.c) cVar2.a;
            arrayList.addAll(com.amazon.aps.iva.hc.m.w(fVar, linkedHashSet, arrayList, cVar3, cVar4.f, cVar4.u.a()));
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                n0 v = v((n0) obj);
                Object obj2 = linkedHashMap.get(v);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(v, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Collection collection = (Collection) entry.getValue();
                com.amazon.aps.iva.zc0.c cVar5 = this.o;
                com.amazon.aps.iva.ad0.c cVar6 = (com.amazon.aps.iva.ad0.c) cVar2.a;
                com.amazon.aps.iva.lb0.t.d0(arrayList2, com.amazon.aps.iva.hc.m.w(fVar, collection, arrayList, cVar5, cVar6.f, cVar6.u.a()));
            }
            arrayList.addAll(arrayList2);
        }
        if (this.n.u() && com.amazon.aps.iva.yb0.j.a(fVar, com.amazon.aps.iva.lc0.o.b)) {
            com.amazon.aps.iva.a60.b.i(arrayList, com.amazon.aps.iva.qd0.h.e(cVar));
        }
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final Set o(com.amazon.aps.iva.xd0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        Set b1 = com.amazon.aps.iva.lb0.x.b1(this.e.invoke().c());
        u uVar = u.h;
        com.amazon.aps.iva.zc0.c cVar = this.o;
        com.amazon.aps.iva.me0.a.b(f1.J(cVar), com.amazon.aps.iva.a0.k.b, new w(cVar, b1, uVar));
        if (this.n.u()) {
            b1.add(com.amazon.aps.iva.lc0.o.b);
        }
        return b1;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final com.amazon.aps.iva.oc0.k q() {
        return this.o;
    }
}
