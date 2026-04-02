package com.amazon.aps.iva.xd0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Set;
/* compiled from: AbstractScopeAdapter.kt */
/* loaded from: classes4.dex */
public abstract class a implements i {
    @Override // com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> a() {
        return i().a();
    }

    @Override // com.amazon.aps.iva.xd0.i
    public Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return i().b(fVar, dVar);
    }

    @Override // com.amazon.aps.iva.xd0.i
    public Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return i().c(fVar, dVar);
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> d() {
        return i().d();
    }

    @Override // com.amazon.aps.iva.xd0.l
    public Collection<com.amazon.aps.iva.oc0.k> e(d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        return i().e(dVar, lVar);
    }

    @Override // com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> f() {
        return i().f();
    }

    @Override // com.amazon.aps.iva.xd0.l
    public final com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return i().g(fVar, dVar);
    }

    public final i h() {
        if (i() instanceof a) {
            i i = i();
            com.amazon.aps.iva.yb0.j.d(i, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
            return ((a) i).h();
        }
        return i();
    }

    public abstract i i();
}
