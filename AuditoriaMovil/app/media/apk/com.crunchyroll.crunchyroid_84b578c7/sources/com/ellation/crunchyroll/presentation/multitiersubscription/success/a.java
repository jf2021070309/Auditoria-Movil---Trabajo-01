package com.ellation.crunchyroll.presentation.multitiersubscription.success;

import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.g30.g;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: SubscriptionSuccessRouter.kt */
/* loaded from: classes2.dex */
public final class a implements g {
    public final Context a;
    public final com.amazon.aps.iva.vw.a b;

    public a(Context context, com.amazon.aps.iva.vw.a aVar) {
        j.f(context, "context");
        this.a = context;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.g30.g
    public final void a(com.amazon.aps.iva.wh.a aVar, String str, l0 l0Var, boolean z) {
        j.f(aVar, FirebaseAnalytics.Event.PURCHASE);
        j.f(str, "productTitle");
        j.f(l0Var, "upsellType");
        SubscriptionSuccessActivity.n.getClass();
        Context context = this.a;
        j.f(context, "context");
        Intent intent = new Intent(context, SubscriptionSuccessActivity.class);
        intent.putExtra("product_purchase_key", aVar);
        intent.putExtra("product_title", str);
        intent.putExtra("upsell_type", l0Var);
        intent.putExtra("track_acquisition_completed", z);
        intent.putExtra("experiment", this.b);
        context.startActivity(intent);
    }
}
