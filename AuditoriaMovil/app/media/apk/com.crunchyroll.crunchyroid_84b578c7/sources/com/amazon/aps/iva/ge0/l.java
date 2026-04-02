package com.amazon.aps.iva.ge0;

import com.amazon.aps.iva.o0.t1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
/* compiled from: ThrowingScope.kt */
/* loaded from: classes4.dex */
public final class l extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, String... strArr) {
        super(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        com.amazon.aps.iva.yb0.j.f(gVar, "kind");
        com.amazon.aps.iva.yb0.j.f(strArr, "formatParams");
    }

    @Override // com.amazon.aps.iva.ge0.f, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> a() {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.ge0.f, com.amazon.aps.iva.xd0.i
    public final /* bridge */ /* synthetic */ Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        h(fVar, dVar);
        throw null;
    }

    @Override // com.amazon.aps.iva.ge0.f, com.amazon.aps.iva.xd0.i
    public final /* bridge */ /* synthetic */ Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        i(fVar, dVar);
        throw null;
    }

    @Override // com.amazon.aps.iva.ge0.f, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> d() {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.ge0.f, com.amazon.aps.iva.xd0.l
    public final Collection<com.amazon.aps.iva.oc0.k> e(com.amazon.aps.iva.xd0.d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        throw new IllegalStateException(this.b);
    }

    @Override // com.amazon.aps.iva.ge0.f, com.amazon.aps.iva.xd0.i
    public final Set<com.amazon.aps.iva.nd0.f> f() {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.ge0.f, com.amazon.aps.iva.xd0.l
    public final com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        throw new IllegalStateException(this.b + ", required name: " + fVar);
    }

    @Override // com.amazon.aps.iva.ge0.f
    public final Set h(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        throw new IllegalStateException(this.b + ", required name: " + fVar);
    }

    @Override // com.amazon.aps.iva.ge0.f
    public final Set i(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        throw new IllegalStateException(this.b + ", required name: " + fVar);
    }

    @Override // com.amazon.aps.iva.ge0.f
    public final String toString() {
        return t1.b(new StringBuilder("ThrowingScope{"), this.b, '}');
    }
}
