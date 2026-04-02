package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.ee0.u1;
/* compiled from: signatureEnhancement.kt */
/* loaded from: classes4.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u1, Boolean> {
    public static final o h = new o();

    public o() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(u1 u1Var) {
        boolean z;
        com.amazon.aps.iva.oc0.h k = u1Var.I0().k();
        if (k == null) {
            return Boolean.FALSE;
        }
        com.amazon.aps.iva.nd0.f name = k.getName();
        com.amazon.aps.iva.nd0.c cVar = com.amazon.aps.iva.nc0.c.f;
        if (com.amazon.aps.iva.yb0.j.a(name, cVar.f()) && com.amazon.aps.iva.yb0.j.a(com.amazon.aps.iva.ud0.b.c(k), cVar)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
