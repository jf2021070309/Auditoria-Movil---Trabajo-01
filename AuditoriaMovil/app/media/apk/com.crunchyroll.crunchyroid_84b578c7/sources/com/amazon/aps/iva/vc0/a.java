package com.amazon.aps.iva.vc0;

import com.amazon.aps.iva.nd0.f;
import com.amazon.aps.iva.oc0.e;
import com.amazon.aps.iva.oc0.f0;
import com.amazon.aps.iva.wc0.c;
import com.amazon.aps.iva.wc0.d;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: utils.kt */
/* loaded from: classes4.dex */
public final class a {
    public static final void a(c cVar, d dVar, e eVar, f fVar) {
        j.f(cVar, "<this>");
        j.f(dVar, "from");
        j.f(eVar, "scopeOwner");
        j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (cVar == c.a.a) {
            return;
        }
        dVar.getLocation();
    }

    public static final void b(c cVar, d dVar, f0 f0Var, f fVar) {
        j.f(cVar, "<this>");
        j.f(dVar, "from");
        j.f(f0Var, "scopeOwner");
        j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        f0Var.c().b();
        j.e(fVar.b(), "name.asString()");
        if (cVar != c.a.a) {
            dVar.getLocation();
        }
    }
}
