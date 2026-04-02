package com.amazon.aps.iva.qe;

import com.amazon.aps.iva.ks.b;
/* compiled from: InGraceNotificationAnalytics.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.us.b implements b {
    public final d e;
    public final com.amazon.aps.iva.ds.a f;
    public final com.amazon.aps.iva.vw.a g;

    public c(d dVar, com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.me.j jVar, com.amazon.aps.iva.xb0.a aVar2) {
        super(aVar2);
        this.e = dVar;
        this.f = aVar;
        this.g = jVar;
    }

    public static com.amazon.aps.iva.ks.b P(d dVar) {
        if (dVar instanceof i) {
            return b.c.a;
        }
        if (dVar instanceof h) {
            return b.C0457b.a;
        }
        throw new com.amazon.aps.iva.kb0.h();
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.f.c(defpackage.i.s(com.amazon.aps.iva.ls.a.BILLING_NOTIFICATION, f, null, this.g.y(), null, new com.amazon.aps.iva.is.a[]{P(this.e)}, 20));
    }

    @Override // com.amazon.aps.iva.qe.b
    public final void h(com.amazon.aps.iva.fs.b bVar) {
        String b = P(this.e).b();
        com.amazon.aps.iva.yb0.j.f(b, "screen");
        String str = bVar.b;
        if (str == null) {
            str = "";
        }
        this.f.e(new com.amazon.aps.iva.es.j(new com.amazon.aps.iva.ks.a(str, b, bVar.a, ""), com.amazon.aps.iva.js.b.PAYMENT_UPDATE, this.g.y()));
    }

    @Override // com.amazon.aps.iva.qe.b
    public final void r(com.amazon.aps.iva.fs.b bVar) {
        String b = P(this.e).b();
        com.amazon.aps.iva.yb0.j.f(b, "screen");
        String str = bVar.b;
        if (str == null) {
            str = "";
        }
        this.f.e(new com.amazon.aps.iva.es.j(new com.amazon.aps.iva.ks.a(str, b, bVar.a, ""), com.amazon.aps.iva.js.b.NOT_NOW, this.g.y()));
    }
}
