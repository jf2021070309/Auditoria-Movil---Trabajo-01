package com.amazon.aps.iva.f20;

import com.amazon.aps.iva.j30.m;
import com.amazon.aps.iva.kb0.q;
import com.crunchyroll.crunchyroid.R;
/* compiled from: SubscriptionFlowRouterImpl.kt */
/* loaded from: classes2.dex */
public final class k implements com.amazon.aps.iva.k50.j {
    public final com.amazon.aps.iva.j30.f a;

    public k(m mVar) {
        this.a = mVar;
    }

    @Override // com.amazon.aps.iva.k50.j
    public final void a(com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.a<q> aVar2) {
        com.amazon.aps.iva.yb0.j.f(aVar, "onSubscriptionCancelled");
        com.amazon.aps.iva.yb0.j.f(aVar2, "onSubscriptionComplete");
        this.a.a(aVar, aVar2);
    }

    @Override // com.amazon.aps.iva.k50.j
    public final void b(com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2) {
        this.a.b(new com.amazon.aps.iva.j30.g(R.string.upsell_subscription_button_text, R.string.upsell_subscription_discount_button_text, true), aVar, aVar2);
    }

    @Override // com.amazon.aps.iva.k50.j
    public final void c(com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.a<q> aVar2) {
        this.a.b(new com.amazon.aps.iva.j30.g(R.string.start_subscription, R.string.start_subscription_discount, false), aVar, aVar2);
    }
}
