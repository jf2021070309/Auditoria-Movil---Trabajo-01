package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.oc0.q0;
/* compiled from: signatureEnhancement.kt */
/* loaded from: classes4.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.b, e0> {
    public static final p h = new p();

    public p() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final e0 invoke(com.amazon.aps.iva.oc0.b bVar) {
        com.amazon.aps.iva.oc0.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "it");
        q0 M = bVar2.M();
        com.amazon.aps.iva.yb0.j.c(M);
        e0 type = M.getType();
        com.amazon.aps.iva.yb0.j.e(type, "it.extensionReceiverParameter!!.type");
        return type;
    }
}
