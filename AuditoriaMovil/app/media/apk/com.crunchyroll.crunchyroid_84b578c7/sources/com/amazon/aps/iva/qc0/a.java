package com.amazon.aps.iva.qc0;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.nd0.f;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
/* compiled from: AdditionalClassPartsProvider.kt */
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: AdditionalClassPartsProvider.kt */
    /* renamed from: com.amazon.aps.iva.qc0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0644a implements a {
        public static final C0644a a = new C0644a();

        @Override // com.amazon.aps.iva.qc0.a
        public final Collection a(com.amazon.aps.iva.ce0.d dVar) {
            j.f(dVar, "classDescriptor");
            return z.b;
        }

        @Override // com.amazon.aps.iva.qc0.a
        public final Collection c(com.amazon.aps.iva.ce0.d dVar) {
            j.f(dVar, "classDescriptor");
            return z.b;
        }

        @Override // com.amazon.aps.iva.qc0.a
        public final Collection d(f fVar, com.amazon.aps.iva.ce0.d dVar) {
            j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            j.f(dVar, "classDescriptor");
            return z.b;
        }

        @Override // com.amazon.aps.iva.qc0.a
        public final Collection e(com.amazon.aps.iva.ce0.d dVar) {
            return z.b;
        }
    }

    Collection a(com.amazon.aps.iva.ce0.d dVar);

    Collection c(com.amazon.aps.iva.ce0.d dVar);

    Collection d(f fVar, com.amazon.aps.iva.ce0.d dVar);

    Collection e(com.amazon.aps.iva.ce0.d dVar);
}
