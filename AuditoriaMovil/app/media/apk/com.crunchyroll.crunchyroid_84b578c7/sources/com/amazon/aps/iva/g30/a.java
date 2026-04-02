package com.amazon.aps.iva.g30;

import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.presentation.multitiersubscription.success.bento.BentoCheckoutSuccessActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: SubscriptionSuccessRouter.kt */
/* loaded from: classes2.dex */
public final class a implements g {
    public final Context a;
    public final com.amazon.aps.iva.vw.a b;
    public final com.amazon.aps.iva.xh.a c;
    public final String d;

    public a(Context context, com.amazon.aps.iva.vw.a aVar, com.amazon.aps.iva.xh.a aVar2, String str) {
        j.f(context, "context");
        this.a = context;
        this.b = aVar;
        this.c = aVar2;
        this.d = str;
    }

    @Override // com.amazon.aps.iva.g30.g
    public final void a(com.amazon.aps.iva.wh.a aVar, String str, l0 l0Var, boolean z) {
        j.f(aVar, FirebaseAnalytics.Event.PURCHASE);
        j.f(str, "productTitle");
        j.f(l0Var, "upsellType");
        BentoCheckoutSuccessActivity.l.getClass();
        Context context = this.a;
        j.f(context, "context");
        com.amazon.aps.iva.xh.a aVar2 = this.c;
        j.f(aVar2, "screenType");
        Intent intent = new Intent(context, BentoCheckoutSuccessActivity.class);
        intent.putExtra("bento_product_purchase_key", aVar);
        intent.putExtra("bento_upsell_type", l0Var);
        intent.putExtra("bento_screen_type", aVar2);
        intent.putExtra("bento_redirect_url", this.d);
        intent.putExtra("experiment", this.b);
        context.startActivity(intent);
    }
}
