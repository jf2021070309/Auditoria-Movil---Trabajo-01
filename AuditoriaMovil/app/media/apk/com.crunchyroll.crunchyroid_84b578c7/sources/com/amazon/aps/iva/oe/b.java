package com.amazon.aps.iva.oe;

import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.me.j;
/* compiled from: BillingNotificationCardAnalytics.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ds.a a = com.amazon.aps.iva.ds.c.b;
    public final com.amazon.aps.iva.vw.a b;

    public b(j jVar) {
        this.b = jVar;
    }

    @Override // com.amazon.aps.iva.oe.a
    public final void h(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new com.amazon.aps.iva.es.j(a.C0456a.c(com.amazon.aps.iva.ls.a.MEMBERSHIP_PLAN_IN_GRACE_NOTIFICATION, bVar), com.amazon.aps.iva.js.b.PAYMENT_UPDATE, this.b.y()));
    }

    @Override // com.amazon.aps.iva.oe.a
    public final void i(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new com.amazon.aps.iva.es.j(a.C0456a.c(com.amazon.aps.iva.ls.a.MEMBERSHIP_PLAN_RENEW_NOTIFICATION, bVar), com.amazon.aps.iva.js.b.RENEW, this.b.y()));
    }
}
