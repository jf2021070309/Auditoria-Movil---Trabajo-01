package com.amazon.aps.iva.ge0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.o0.t1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
/* compiled from: ErrorScope.kt */
/* loaded from: classes4.dex */
public class f implements com.amazon.aps.iva.xd0.i {
    public final String b;

    public f(g gVar, String... strArr) {
        com.amazon.aps.iva.yb0.j.f(gVar, "kind");
        com.amazon.aps.iva.yb0.j.f(strArr, "formatParams");
        String debugMessage = gVar.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        com.amazon.aps.iva.yb0.j.e(format, "format(this, *args)");
        this.b = format;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public Set<com.amazon.aps.iva.nd0.f> a() {
        return b0.b;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public Set<com.amazon.aps.iva.nd0.f> d() {
        return b0.b;
    }

    @Override // com.amazon.aps.iva.xd0.l
    public Collection<com.amazon.aps.iva.oc0.k> e(com.amazon.aps.iva.xd0.d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        return z.b;
    }

    @Override // com.amazon.aps.iva.xd0.i
    public Set<com.amazon.aps.iva.nd0.f> f() {
        return b0.b;
    }

    @Override // com.amazon.aps.iva.xd0.l
    public com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        String format = String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{fVar}, 1));
        com.amazon.aps.iva.yb0.j.e(format, "format(this, *args)");
        return new a(com.amazon.aps.iva.nd0.f.j(format));
    }

    @Override // com.amazon.aps.iva.xd0.i
    /* renamed from: h */
    public Set b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return l1.H(new c(k.c));
    }

    @Override // com.amazon.aps.iva.xd0.i
    /* renamed from: i */
    public Set c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        return k.f;
    }

    public String toString() {
        return t1.b(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
