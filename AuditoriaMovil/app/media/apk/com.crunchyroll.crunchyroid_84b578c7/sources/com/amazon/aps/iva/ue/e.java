package com.amazon.aps.iva.ue;

import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.ks.b;
/* compiled from: RenewNotificationAnalytics.kt */
/* loaded from: classes.dex */
public final class e extends com.amazon.aps.iva.us.b implements d {
    public final g e;
    public final com.amazon.aps.iva.ds.a f;
    public final com.amazon.aps.iva.vw.a g;

    public e(g gVar, com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.me.j jVar, com.amazon.aps.iva.xb0.a aVar2) {
        super(aVar2);
        this.e = gVar;
        this.f = aVar;
        this.g = jVar;
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        com.amazon.aps.iva.is.a aVar;
        com.amazon.aps.iva.ls.a aVar2 = com.amazon.aps.iva.ls.a.BILLING_NOTIFICATION;
        com.amazon.aps.iva.ks.g y = this.g.y();
        com.amazon.aps.iva.is.a[] aVarArr = new com.amazon.aps.iva.is.a[1];
        g gVar = this.e;
        if (gVar instanceof b) {
            aVar = b.e.a;
        } else if (gVar instanceof a) {
            aVar = b.d.a;
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        aVarArr[0] = aVar;
        this.f.c(defpackage.i.s(aVar2, f, null, y, null, aVarArr, 20));
    }

    @Override // com.amazon.aps.iva.ue.d
    public final void d(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.ls.a aVar;
        g gVar = this.e;
        if (gVar instanceof b) {
            aVar = com.amazon.aps.iva.ls.a.RENEW_INITIAL_SUBSCRIPTION;
        } else if (gVar instanceof a) {
            aVar = com.amazon.aps.iva.ls.a.RENEW_FINAL_SUBSCRIPTION;
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        this.f.e(new com.amazon.aps.iva.es.j(a.C0456a.c(aVar, bVar), com.amazon.aps.iva.js.b.RENEW, this.g.y()));
    }
}
