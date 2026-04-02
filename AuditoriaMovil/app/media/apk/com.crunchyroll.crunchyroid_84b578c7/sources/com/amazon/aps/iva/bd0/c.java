package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.yb0.e0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: JvmPackageScope.kt */
/* loaded from: classes4.dex */
public final class c implements com.amazon.aps.iva.xd0.i {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] f = {e0.c(new com.amazon.aps.iva.yb0.v(e0.a(c.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    public final com.amazon.aps.iva.la0.c b;
    public final m c;
    public final n d;
    public final com.amazon.aps.iva.de0.i e;

    /* compiled from: JvmPackageScope.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.xd0.i[]> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.xd0.i[] invoke() {
            c cVar = c.this;
            m mVar = cVar.c;
            mVar.getClass();
            com.amazon.aps.iva.fc0.l<Object> lVar = m.o[0];
            ArrayList arrayList = new ArrayList();
            for (com.amazon.aps.iva.gd0.t tVar : ((Map) com.amazon.aps.iva.ab.x.T(mVar.k, lVar)).values()) {
                com.amazon.aps.iva.ce0.m a = ((com.amazon.aps.iva.ad0.c) cVar.b.a).d.a(cVar.c, tVar);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return (com.amazon.aps.iva.xd0.i[]) com.amazon.aps.iva.le0.a.b(arrayList).toArray(new com.amazon.aps.iva.xd0.i[0]);
        }
    }

    public c(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.ed0.t tVar, m mVar) {
        com.amazon.aps.iva.yb0.j.f(tVar, "jPackage");
        com.amazon.aps.iva.yb0.j.f(mVar, "packageFragment");
        this.b = cVar;
        this.c = mVar;
        this.d = new n(cVar, tVar, mVar);
        this.e = cVar.b().g(new a());
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> a() {
        com.amazon.aps.iva.xd0.i[] h = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (com.amazon.aps.iva.xd0.i iVar : h) {
            com.amazon.aps.iva.lb0.t.d0(linkedHashSet, iVar.a());
        }
        linkedHashSet.addAll(this.d.a());
        return linkedHashSet;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        i(fVar, dVar);
        com.amazon.aps.iva.xd0.i[] h = h();
        Collection b = this.d.b(fVar, dVar);
        for (com.amazon.aps.iva.xd0.i iVar : h) {
            b = com.amazon.aps.iva.le0.a.a(b, iVar.b(fVar, dVar));
        }
        if (b == null) {
            return b0.b;
        }
        return b;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        i(fVar, dVar);
        com.amazon.aps.iva.xd0.i[] h = h();
        this.d.c(fVar, dVar);
        Collection collection = com.amazon.aps.iva.lb0.z.b;
        for (com.amazon.aps.iva.xd0.i iVar : h) {
            collection = com.amazon.aps.iva.le0.a.a(collection, iVar.c(fVar, dVar));
        }
        if (collection == null) {
            return b0.b;
        }
        return collection;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> d() {
        com.amazon.aps.iva.xd0.i[] h = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (com.amazon.aps.iva.xd0.i iVar : h) {
            com.amazon.aps.iva.lb0.t.d0(linkedHashSet, iVar.d());
        }
        linkedHashSet.addAll(this.d.d());
        return linkedHashSet;
    }

    @Override // com.amazon.aps.iva.xd0.l
    public final Collection<com.amazon.aps.iva.oc0.k> e(com.amazon.aps.iva.xd0.d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        com.amazon.aps.iva.xd0.i[] h = h();
        Collection<com.amazon.aps.iva.oc0.k> e = this.d.e(dVar, lVar);
        for (com.amazon.aps.iva.xd0.i iVar : h) {
            e = com.amazon.aps.iva.le0.a.a(e, iVar.e(dVar, lVar));
        }
        if (e == null) {
            return b0.b;
        }
        return e;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> f() {
        boolean z;
        Iterable nVar;
        com.amazon.aps.iva.xd0.i[] h = h();
        com.amazon.aps.iva.yb0.j.f(h, "<this>");
        if (h.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            nVar = com.amazon.aps.iva.lb0.z.b;
        } else {
            nVar = new com.amazon.aps.iva.lb0.n(h);
        }
        HashSet a2 = com.amazon.aps.iva.xd0.k.a(nVar);
        if (a2 != null) {
            a2.addAll(this.d.f());
            return a2;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.xd0.l
    public final com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        i(fVar, dVar);
        n nVar = this.d;
        nVar.getClass();
        com.amazon.aps.iva.oc0.h hVar = null;
        com.amazon.aps.iva.oc0.e w = nVar.w(fVar, null);
        if (w != null) {
            return w;
        }
        for (com.amazon.aps.iva.xd0.i iVar : h()) {
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

    public final com.amazon.aps.iva.xd0.i[] h() {
        return (com.amazon.aps.iva.xd0.i[]) com.amazon.aps.iva.ab.x.T(this.e, f[0]);
    }

    public final void i(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(bVar, FirebaseAnalytics.Param.LOCATION);
        com.amazon.aps.iva.vc0.a.b(((com.amazon.aps.iva.ad0.c) this.b.a).n, (com.amazon.aps.iva.wc0.d) bVar, this.c, fVar);
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
