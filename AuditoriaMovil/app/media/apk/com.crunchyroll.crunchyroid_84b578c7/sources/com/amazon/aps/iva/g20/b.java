package com.amazon.aps.iva.g20;

import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.presentation.multitiersubscription.alreadypremium.SubscriptionAlreadyPremiumLayout;
/* compiled from: CrPlusAlreadyPremiumPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> implements a {
    public final String b;

    public b(SubscriptionAlreadyPremiumLayout subscriptionAlreadyPremiumLayout, String str) {
        super(subscriptionAlreadyPremiumLayout, new j[0]);
        this.b = str;
    }

    @Override // com.amazon.aps.iva.g20.a
    public final void e() {
        getView().M0();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        boolean z;
        String str = this.b;
        if (str != null && !m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            getView().q7();
        } else {
            getView().setTitleWithUsername(str);
        }
    }
}
