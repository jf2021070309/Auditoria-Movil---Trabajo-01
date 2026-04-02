package com.amazon.aps.iva.xd0;

import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.xd0.l;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: GivenFunctionsMemberScope.kt */
/* loaded from: classes4.dex */
public abstract class e extends j {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] d = {e0.c(new v(e0.a(e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    public final com.amazon.aps.iva.oc0.e b;
    public final com.amazon.aps.iva.de0.i c;

    /* compiled from: GivenFunctionsMemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.oc0.k>> {
        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [com.amazon.aps.iva.lb0.z] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends com.amazon.aps.iva.oc0.k> invoke() {
            ?? r8;
            e eVar = e.this;
            List<com.amazon.aps.iva.oc0.v> h = eVar.h();
            List<com.amazon.aps.iva.oc0.v> list = h;
            ArrayList arrayList = new ArrayList(3);
            Collection<com.amazon.aps.iva.ee0.e0> g = eVar.b.h().g();
            com.amazon.aps.iva.yb0.j.e(g, "containingClass.typeConstructor.supertypes");
            ArrayList arrayList2 = new ArrayList();
            for (com.amazon.aps.iva.ee0.e0 e0Var : g) {
                t.d0(arrayList2, l.a.a(e0Var.l(), null, 3));
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof com.amazon.aps.iva.oc0.b) {
                    arrayList3.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                com.amazon.aps.iva.nd0.f name = ((com.amazon.aps.iva.oc0.b) next2).getName();
                Object obj = linkedHashMap.get(name);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(name, obj);
                }
                ((List) obj).add(next2);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                com.amazon.aps.iva.nd0.f fVar = (com.amazon.aps.iva.nd0.f) entry.getKey();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj2 : (List) entry.getValue()) {
                    Boolean valueOf = Boolean.valueOf(((com.amazon.aps.iva.oc0.b) obj2) instanceof com.amazon.aps.iva.oc0.v);
                    Object obj3 = linkedHashMap2.get(valueOf);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap2.put(valueOf, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                    com.amazon.aps.iva.qd0.n nVar = com.amazon.aps.iva.qd0.n.f;
                    List list2 = (List) entry2.getValue();
                    if (booleanValue) {
                        r8 = new ArrayList();
                        for (Object obj4 : h) {
                            if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.oc0.v) obj4).getName(), fVar)) {
                                r8.add(obj4);
                            }
                        }
                    } else {
                        r8 = z.b;
                    }
                    nVar.h(fVar, list2, r8, eVar.b, new f(arrayList, eVar));
                }
            }
            return x.L0(com.amazon.aps.iva.a60.b.l(arrayList), list);
        }
    }

    public e(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.oc0.e eVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        com.amazon.aps.iva.yb0.j.f(eVar, "containingClass");
        this.b = eVar;
        this.c = lVar.g(new a());
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        com.amazon.aps.iva.fc0.l<Object> lVar = d[0];
        com.amazon.aps.iva.me0.c cVar = new com.amazon.aps.iva.me0.c();
        for (Object obj : (List) com.amazon.aps.iva.ab.x.T(this.c, lVar)) {
            if ((obj instanceof s0) && com.amazon.aps.iva.yb0.j.a(((s0) obj).getName(), fVar)) {
                cVar.add(obj);
            }
        }
        return cVar;
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        com.amazon.aps.iva.fc0.l<Object> lVar = d[0];
        com.amazon.aps.iva.me0.c cVar = new com.amazon.aps.iva.me0.c();
        for (Object obj : (List) com.amazon.aps.iva.ab.x.T(this.c, lVar)) {
            if ((obj instanceof n0) && com.amazon.aps.iva.yb0.j.a(((n0) obj).getName(), fVar)) {
                cVar.add(obj);
            }
        }
        return cVar;
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    public final Collection<com.amazon.aps.iva.oc0.k> e(d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        if (!dVar.a(d.n.b)) {
            return z.b;
        }
        return (List) com.amazon.aps.iva.ab.x.T(this.c, d[0]);
    }

    public abstract List<com.amazon.aps.iva.oc0.v> h();
}
