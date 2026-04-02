package com.amazon.aps.iva.yw;

import android.content.SharedPreferences;
import com.crunchyroll.billingnotifications.cancelled.CancellationCompleteActivity;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.application.a;
/* compiled from: FeaturesProvider.kt */
/* loaded from: classes2.dex */
public final class h implements com.amazon.aps.iva.me.a {
    public final com.amazon.aps.iva.cx.d a;
    public final com.amazon.aps.iva.ts.a b;
    public final SubscriptionProcessorService c;
    public final SharedPreferences d;
    public final String e;
    public final g f;

    public h(d0 d0Var, com.amazon.aps.iva.ya0.f fVar) {
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.cx.d.class, "billing_notifications");
            if (c != null) {
                this.a = (com.amazon.aps.iva.cx.d) c;
                this.b = com.amazon.aps.iva.ts.b.d;
                this.c = d0Var.b.getSubscriptionProcessorService();
                CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
                this.d = CrunchyrollApplication.a.a().getSharedPreferences("billing_notifications_store", 0);
                com.amazon.aps.iva.ts.b.a.getClass();
                this.e = com.amazon.aps.iva.ts.a.e;
                this.f = new g(fVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.BillingNotificationsConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.me.a
    public final com.amazon.aps.iva.xb0.a a(CancellationCompleteActivity cancellationCompleteActivity) {
        com.amazon.aps.iva.yb0.j.f(cancellationCompleteActivity, "context");
        return new f(cancellationCompleteActivity);
    }

    @Override // com.amazon.aps.iva.me.a
    public final String b() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.me.a
    public final com.amazon.aps.iva.ve.a c() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.me.a
    public final com.amazon.aps.iva.xb0.l<String, String> d() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.me.a
    public final com.amazon.aps.iva.me.j e() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.me.a
    public final SharedPreferences g() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.me.a
    public final SubscriptionProcessorService getSubscriptionProcessorService() {
        return this.c;
    }
}
