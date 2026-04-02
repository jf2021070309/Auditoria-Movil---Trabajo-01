package com.amazon.aps.iva.me;

import android.content.SharedPreferences;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.ve.b;
import com.amazon.aps.iva.ve.k;
import com.amazon.aps.iva.ve.m;
import com.amazon.aps.iva.xb0.l;
import com.crunchyroll.billingnotifications.cancelled.CancellationCompleteActivity;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
import com.ellation.crunchyroll.application.d;
/* compiled from: BillingNotificationFeature.kt */
/* loaded from: classes.dex */
public final class b implements c, a {
    public final /* synthetic */ a a;
    public final com.amazon.aps.iva.ve.c b;
    public final com.amazon.aps.iva.ve.d c;
    public final m d;

    public b(com.amazon.aps.iva.yw.h hVar) {
        this.a = hVar;
        com.amazon.aps.iva.ve.b.a.getClass();
        com.amazon.aps.iva.ve.c cVar = b.a.b;
        this.b = cVar;
        SharedPreferences g = g();
        String b = b();
        com.amazon.aps.iva.yb0.j.f(g, "sharedPreferences");
        com.amazon.aps.iva.yb0.j.f(b, "environment");
        com.amazon.aps.iva.ve.d dVar = new com.amazon.aps.iva.ve.d(g, b);
        this.c = dVar;
        SubscriptionProcessorService subscriptionProcessorService = getSubscriptionProcessorService();
        com.amazon.aps.iva.ve.a c = c();
        j e = e();
        c.b bVar = c.b.a;
        com.amazon.aps.iva.yb0.j.f(subscriptionProcessorService, "subscriptionProcessorService");
        com.amazon.aps.iva.yb0.j.f(c, "billingNotificationsConfiguration");
        com.amazon.aps.iva.yb0.j.f(e, "billingNotificationsConfig");
        com.amazon.aps.iva.yb0.j.f(cVar, "billingStateMonitor");
        this.d = new m(new k(subscriptionProcessorService, c, e, cVar, dVar, bVar), dVar, d.a.a());
    }

    @Override // com.amazon.aps.iva.me.a
    public final com.amazon.aps.iva.xb0.a a(CancellationCompleteActivity cancellationCompleteActivity) {
        com.amazon.aps.iva.yb0.j.f(cancellationCompleteActivity, "context");
        return this.a.a(cancellationCompleteActivity);
    }

    @Override // com.amazon.aps.iva.me.a
    public final String b() {
        return this.a.b();
    }

    @Override // com.amazon.aps.iva.me.a
    public final com.amazon.aps.iva.ve.a c() {
        return this.a.c();
    }

    @Override // com.amazon.aps.iva.me.a
    public final l<String, String> d() {
        return this.a.d();
    }

    @Override // com.amazon.aps.iva.me.a
    public final j e() {
        return this.a.e();
    }

    @Override // com.amazon.aps.iva.me.c
    public final com.amazon.aps.iva.ve.e f() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.me.a
    public final SharedPreferences g() {
        return this.a.g();
    }

    @Override // com.amazon.aps.iva.me.a
    public final SubscriptionProcessorService getSubscriptionProcessorService() {
        return this.a.getSubscriptionProcessorService();
    }

    public final h h() {
        j e = e();
        com.amazon.aps.iva.yb0.j.f(e, "config");
        com.amazon.aps.iva.ve.c cVar = this.b;
        com.amazon.aps.iva.yb0.j.f(cVar, "monitor");
        com.amazon.aps.iva.ve.d dVar = this.c;
        com.amazon.aps.iva.yb0.j.f(dVar, "billingStatusStorage");
        d dVar2 = d.h;
        com.amazon.aps.iva.yb0.j.f(dVar2, "inGraceNotificationLauncher");
        e eVar = e.h;
        com.amazon.aps.iva.yb0.j.f(eVar, "renewNotificationLauncher");
        f fVar = f.h;
        com.amazon.aps.iva.yb0.j.f(fVar, "cancellationCompleteLauncher");
        g gVar = g.h;
        com.amazon.aps.iva.yb0.j.f(gVar, "onHoldNotificationLauncher");
        return new h(e, cVar, dVar, gVar, dVar2, eVar, fVar);
    }
}
