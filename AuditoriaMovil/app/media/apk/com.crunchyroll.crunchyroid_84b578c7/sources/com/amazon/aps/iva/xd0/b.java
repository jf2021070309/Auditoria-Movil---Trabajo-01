package com.amazon.aps.iva.xd0;

import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.xd0.i;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: ChainedMemberScope.kt */
/* loaded from: classes4.dex */
public final class b implements i {
    public final String b;
    public final i[] c;

    /* compiled from: ChainedMemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static i a(String str, Iterable iterable) {
            com.amazon.aps.iva.yb0.j.f(str, "debugName");
            com.amazon.aps.iva.me0.c cVar = new com.amazon.aps.iva.me0.c();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (iVar != i.b.b) {
                    if (iVar instanceof b) {
                        t.e0(cVar, ((b) iVar).c);
                    } else {
                        cVar.add(iVar);
                    }
                }
            }
            int i = cVar.b;
            if (i != 0) {
                if (i != 1) {
                    return new b(str, (i[]) cVar.toArray(new i[0]));
                }
                return (i) cVar.get(0);
            }
            return i.b.b;
        }
    }

    public b(String str, i[] iVarArr) {
        this.b = str;
        this.c = iVarArr;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (i iVar : this.c) {
            t.d0(linkedHashSet, iVar.a());
        }
        return linkedHashSet;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        i[] iVarArr = this.c;
        int length = iVarArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (i iVar : iVarArr) {
                    collection = com.amazon.aps.iva.le0.a.a(collection, iVar.b(fVar, dVar));
                }
                if (collection == null) {
                    return b0.b;
                }
                return collection;
            }
            return iVarArr[0].b(fVar, dVar);
        }
        return z.b;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        i[] iVarArr = this.c;
        int length = iVarArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection collection = null;
                for (i iVar : iVarArr) {
                    collection = com.amazon.aps.iva.le0.a.a(collection, iVar.c(fVar, dVar));
                }
                if (collection == null) {
                    return b0.b;
                }
                return collection;
            }
            return iVarArr[0].c(fVar, dVar);
        }
        return z.b;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (i iVar : this.c) {
            t.d0(linkedHashSet, iVar.d());
        }
        return linkedHashSet;
    }

    @Override // com.amazon.aps.iva.xd0.l
    public final Collection<com.amazon.aps.iva.oc0.k> e(d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        i[] iVarArr = this.c;
        int length = iVarArr.length;
        if (length != 0) {
            if (length != 1) {
                Collection<com.amazon.aps.iva.oc0.k> collection = null;
                for (i iVar : iVarArr) {
                    collection = com.amazon.aps.iva.le0.a.a(collection, iVar.e(dVar, lVar));
                }
                if (collection == null) {
                    return b0.b;
                }
                return collection;
            }
            return iVarArr[0].e(dVar, lVar);
        }
        return z.b;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> f() {
        boolean z;
        Iterable nVar;
        i[] iVarArr = this.c;
        com.amazon.aps.iva.yb0.j.f(iVarArr, "<this>");
        if (iVarArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            nVar = z.b;
        } else {
            nVar = new com.amazon.aps.iva.lb0.n(iVarArr);
        }
        return k.a(nVar);
    }

    @Override // com.amazon.aps.iva.xd0.l
    public final com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        com.amazon.aps.iva.oc0.h hVar = null;
        for (i iVar : this.c) {
            com.amazon.aps.iva.oc0.h g = iVar.g(fVar, dVar);
            if (g != null) {
                if ((g instanceof com.amazon.aps.iva.oc0.i) && ((com.amazon.aps.iva.oc0.i) g).g0()) {
                    if (hVar == null) {
                        hVar = g;
                    }
                } else {
                    return g;
                }
            }
        }
        return hVar;
    }

    public final String toString() {
        return this.b;
    }
}
