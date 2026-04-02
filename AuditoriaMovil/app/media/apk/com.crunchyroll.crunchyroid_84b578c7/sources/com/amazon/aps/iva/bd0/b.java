package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.lb0.b0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Set;
/* compiled from: DeclaredMemberIndex.kt */
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: DeclaredMemberIndex.kt */
    /* loaded from: classes4.dex */
    public static final class a implements b {
        public static final a a = new a();

        @Override // com.amazon.aps.iva.bd0.b
        public final Set<com.amazon.aps.iva.nd0.f> a() {
            return b0.b;
        }

        @Override // com.amazon.aps.iva.bd0.b
        public final Set<com.amazon.aps.iva.nd0.f> b() {
            return b0.b;
        }

        @Override // com.amazon.aps.iva.bd0.b
        public final Set<com.amazon.aps.iva.nd0.f> c() {
            return b0.b;
        }

        @Override // com.amazon.aps.iva.bd0.b
        public final com.amazon.aps.iva.ed0.n d(com.amazon.aps.iva.nd0.f fVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            return null;
        }

        @Override // com.amazon.aps.iva.bd0.b
        public final Collection e(com.amazon.aps.iva.nd0.f fVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            return com.amazon.aps.iva.lb0.z.b;
        }

        @Override // com.amazon.aps.iva.bd0.b
        public final com.amazon.aps.iva.ed0.v f(com.amazon.aps.iva.nd0.f fVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            return null;
        }
    }

    Set<com.amazon.aps.iva.nd0.f> a();

    Set<com.amazon.aps.iva.nd0.f> b();

    Set<com.amazon.aps.iva.nd0.f> c();

    com.amazon.aps.iva.ed0.n d(com.amazon.aps.iva.nd0.f fVar);

    Collection<com.amazon.aps.iva.ed0.q> e(com.amazon.aps.iva.nd0.f fVar);

    com.amazon.aps.iva.ed0.v f(com.amazon.aps.iva.nd0.f fVar);
}
