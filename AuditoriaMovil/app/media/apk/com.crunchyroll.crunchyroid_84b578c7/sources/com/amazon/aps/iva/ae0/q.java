package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.oc0.t0;
/* compiled from: DeserializedPackageFragmentImpl.kt */
/* loaded from: classes4.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.b, t0> {
    public final /* synthetic */ r h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar) {
        super(1);
        this.h = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final t0 invoke(com.amazon.aps.iva.nd0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "it");
        com.amazon.aps.iva.ce0.j jVar = this.h.i;
        if (jVar == null) {
            return t0.a;
        }
        return jVar;
    }
}
