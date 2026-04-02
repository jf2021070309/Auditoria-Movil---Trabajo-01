package com.amazon.aps.iva.zm;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: WelcomeScreenController.kt */
/* loaded from: classes2.dex */
public final class i extends f0 implements e {
    public final v0 b;

    public i(com.amazon.aps.iva.ui.b bVar, com.amazon.aps.iva.dm.a aVar) {
        j.f(aVar, "profilesGateway");
        j.f(bVar, "navigator");
        com.amazon.aps.iva.an.b bVar2 = (com.amazon.aps.iva.an.b) bVar.T5();
        this.b = x.e(new g(new h(bVar2.b, bVar2.d, bVar2.c)));
    }

    @Override // com.amazon.aps.iva.ri.a
    public final u0<g> getState() {
        return this.b;
    }
}
