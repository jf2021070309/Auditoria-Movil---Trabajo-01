package com.amazon.aps.iva.gt;

import com.amazon.aps.iva.vx.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BentoUpsellDialog.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public static final d h = new d();

    public d() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        k kVar = i.f;
        if (kVar != null) {
            return kVar.getHasPremiumBenefit().invoke();
        }
        j.m("dependencies");
        throw null;
    }
}
