package com.amazon.aps.iva.xd0;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.x0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
/* compiled from: InnerClassesScopeWrapper.kt */
/* loaded from: classes4.dex */
public final class g extends j {
    public final i b;

    public g(i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "workerScope");
        this.b = iVar;
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> a() {
        return this.b.a();
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> d() {
        return this.b.d();
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    public final Collection e(d dVar, com.amazon.aps.iva.xb0.l lVar) {
        d dVar2;
        Collection collection;
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        int i = d.l & dVar.b;
        if (i == 0) {
            dVar2 = null;
        } else {
            dVar2 = new d(i, dVar.a);
        }
        if (dVar2 == null) {
            collection = z.b;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.b.e(dVar2, lVar)) {
                if (obj instanceof com.amazon.aps.iva.oc0.i) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> f() {
        return this.b.f();
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    public final com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.oc0.e eVar;
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        com.amazon.aps.iva.oc0.h g = this.b.g(fVar, dVar);
        if (g == null) {
            return null;
        }
        if (g instanceof com.amazon.aps.iva.oc0.e) {
            eVar = (com.amazon.aps.iva.oc0.e) g;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        if (!(g instanceof x0)) {
            return null;
        }
        return (x0) g;
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
