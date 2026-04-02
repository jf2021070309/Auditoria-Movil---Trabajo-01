package com.amazon.aps.iva.vd0;

import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.nd0.f;
import com.amazon.aps.iva.oc0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SyntheticJavaPartsProvider.kt */
/* loaded from: classes4.dex */
public final class a implements d {
    public final List<d> b = z.b;

    @Override // com.amazon.aps.iva.vd0.d
    public final void a(com.amazon.aps.iva.la0.c cVar, e eVar, f fVar, ArrayList arrayList) {
        j.f(cVar, "_context_receiver_0");
        j.f(eVar, "thisDescriptor");
        j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        for (d dVar : this.b) {
            dVar.a(cVar, eVar, fVar, arrayList);
        }
    }

    @Override // com.amazon.aps.iva.vd0.d
    public final void b(com.amazon.aps.iva.la0.c cVar, e eVar, f fVar, com.amazon.aps.iva.mb0.a aVar) {
        j.f(cVar, "_context_receiver_0");
        j.f(eVar, "thisDescriptor");
        j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        for (d dVar : this.b) {
            dVar.b(cVar, eVar, fVar, aVar);
        }
    }

    @Override // com.amazon.aps.iva.vd0.d
    public final void c(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.zc0.c cVar2, f fVar, ArrayList arrayList) {
        j.f(cVar, "_context_receiver_0");
        j.f(cVar2, "thisDescriptor");
        j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        for (d dVar : this.b) {
            dVar.c(cVar, cVar2, fVar, arrayList);
        }
    }

    @Override // com.amazon.aps.iva.vd0.d
    public final ArrayList d(com.amazon.aps.iva.la0.c cVar, e eVar) {
        j.f(cVar, "_context_receiver_0");
        j.f(eVar, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.b) {
            t.d0(arrayList, dVar.d(cVar, eVar));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.vd0.d
    public final ArrayList e(com.amazon.aps.iva.la0.c cVar, e eVar) {
        j.f(cVar, "_context_receiver_0");
        j.f(eVar, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.b) {
            t.d0(arrayList, dVar.e(cVar, eVar));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.vd0.d
    public final void f(com.amazon.aps.iva.la0.c cVar, e eVar, ArrayList arrayList) {
        j.f(cVar, "_context_receiver_0");
        j.f(eVar, "thisDescriptor");
        for (d dVar : this.b) {
            dVar.f(cVar, eVar, arrayList);
        }
    }

    @Override // com.amazon.aps.iva.vd0.d
    public final ArrayList g(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.zc0.c cVar2) {
        j.f(cVar, "_context_receiver_0");
        j.f(cVar2, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.b) {
            t.d0(arrayList, dVar.g(cVar, cVar2));
        }
        return arrayList;
    }
}
