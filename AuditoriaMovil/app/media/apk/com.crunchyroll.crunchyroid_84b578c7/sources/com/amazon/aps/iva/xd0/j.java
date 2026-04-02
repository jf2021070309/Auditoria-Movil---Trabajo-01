package com.amazon.aps.iva.xd0;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.s0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: MemberScopeImpl.kt */
/* loaded from: classes4.dex */
public abstract class j implements i {
    @Override // com.amazon.aps.iva.xd0.i
    public Set<com.amazon.aps.iva.nd0.f> a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : e(d.p, com.amazon.aps.iva.me0.b.a)) {
            if (obj instanceof s0) {
                com.amazon.aps.iva.nd0.f name = ((s0) obj).getName();
                com.amazon.aps.iva.yb0.j.e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return z.b;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return z.b;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public Set<com.amazon.aps.iva.nd0.f> d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : e(d.q, com.amazon.aps.iva.me0.b.a)) {
            if (obj instanceof s0) {
                com.amazon.aps.iva.nd0.f name = ((s0) obj).getName();
                com.amazon.aps.iva.yb0.j.e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // com.amazon.aps.iva.xd0.l
    public Collection<com.amazon.aps.iva.oc0.k> e(d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        return z.b;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public Set<com.amazon.aps.iva.nd0.f> f() {
        return null;
    }

    @Override // com.amazon.aps.iva.xd0.l
    public com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return null;
    }
}
