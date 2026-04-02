package com.amazon.aps.iva.se;

import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.ks.b;
import com.amazon.aps.iva.me.j;
/* compiled from: OnHoldNotificationAnalytics.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.us.b implements b {
    public final com.amazon.aps.iva.ds.a e;
    public final com.amazon.aps.iva.vw.a f;

    public c(com.amazon.aps.iva.ds.a aVar, j jVar, com.amazon.aps.iva.xb0.a aVar2) {
        super(aVar2);
        this.e = aVar;
        this.f = jVar;
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.e.c(i.s(com.amazon.aps.iva.ls.a.BILLING_NOTIFICATION, f, null, this.f.y(), null, new com.amazon.aps.iva.is.a[]{b.a.a}, 20));
    }

    @Override // com.amazon.aps.iva.se.b
    public final void d(com.amazon.aps.iva.fs.b bVar) {
        this.e.e(new com.amazon.aps.iva.es.j(a.C0456a.c(com.amazon.aps.iva.ls.a.ACCOUNT_HOLD_NOTIFICATION, bVar), com.amazon.aps.iva.js.b.PAYMENT_UPDATE, this.f.y()));
    }
}
