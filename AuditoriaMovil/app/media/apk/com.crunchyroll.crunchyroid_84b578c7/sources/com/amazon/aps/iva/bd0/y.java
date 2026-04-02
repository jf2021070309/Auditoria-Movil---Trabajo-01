package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.bd0.o;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.oc0.q0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
/* compiled from: LazyJavaStaticScope.kt */
/* loaded from: classes4.dex */
public abstract class y extends o {
    public y(com.amazon.aps.iva.la0.c cVar) {
        super(cVar, null);
    }

    @Override // com.amazon.aps.iva.bd0.o
    public void n(ArrayList arrayList, com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final q0 p() {
        return null;
    }

    @Override // com.amazon.aps.iva.bd0.o
    public final o.a s(com.amazon.aps.iva.ed0.q qVar, ArrayList arrayList, e0 e0Var, List list) {
        com.amazon.aps.iva.yb0.j.f(qVar, FirebaseAnalytics.Param.METHOD);
        com.amazon.aps.iva.yb0.j.f(list, "valueParameters");
        return new o.a(list, arrayList, com.amazon.aps.iva.lb0.z.b, e0Var);
    }
}
