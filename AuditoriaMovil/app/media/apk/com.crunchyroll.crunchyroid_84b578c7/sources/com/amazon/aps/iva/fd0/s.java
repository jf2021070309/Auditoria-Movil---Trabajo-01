package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.ee0.l0;
import com.amazon.aps.iva.ee0.u1;
/* compiled from: signatureEnhancement.kt */
/* loaded from: classes4.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u1, Boolean> {
    public static final s h = new s();

    public s() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(u1 u1Var) {
        u1 u1Var2 = u1Var;
        com.amazon.aps.iva.yb0.j.f(u1Var2, "it");
        return Boolean.valueOf(u1Var2 instanceof l0);
    }
}
