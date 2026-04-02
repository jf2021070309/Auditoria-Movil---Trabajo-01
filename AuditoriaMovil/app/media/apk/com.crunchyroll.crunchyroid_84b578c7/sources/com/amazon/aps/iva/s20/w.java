package com.amazon.aps.iva.s20;

import com.amazon.aps.iva.rs.m;
import com.crunchyroll.crunchyroid.R;
/* compiled from: UpgradeViewModel.kt */
/* loaded from: classes2.dex */
public final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c>, com.amazon.aps.iva.e30.a> {
    public final /* synthetic */ z h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar) {
        super(1);
        this.h = zVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.e30.a invoke(com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> dVar) {
        int i;
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> dVar2 = dVar;
        com.amazon.aps.iva.yb0.j.f(dVar2, "value");
        com.amazon.aps.iva.b30.c cVar = dVar2.b;
        boolean z = cVar.i instanceof m.b;
        if (this.h.d.getHasPremiumBenefit()) {
            if (z) {
                i = R.string.extended_upgrade_cta_discount_label;
            } else {
                i = R.string.extended_upgrade_cta_label;
            }
        } else if (z) {
            i = R.string.start_subscription_discount;
        } else {
            i = R.string.start_subscription;
        }
        return new com.amazon.aps.iva.e30.a(com.amazon.aps.iva.e.w.x(cVar.b), i);
    }
}
