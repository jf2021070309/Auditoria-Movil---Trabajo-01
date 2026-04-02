package com.amazon.aps.iva.g30;

import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: SubscriptionSuccessLauncher.kt */
/* loaded from: classes2.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.wh.a, q> {
    public final /* synthetic */ f h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(1);
        this.h = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.wh.a aVar) {
        com.amazon.aps.iva.wh.a aVar2 = aVar;
        j.f(aVar2, FirebaseAnalytics.Event.PURCHASE);
        this.h.b.a(aVar2, aVar2.b.c, l0.ASYNC, false);
        return q.a;
    }
}
