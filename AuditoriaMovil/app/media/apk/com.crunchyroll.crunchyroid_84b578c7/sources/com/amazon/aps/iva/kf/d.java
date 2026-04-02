package com.amazon.aps.iva.kf;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ks.a;
/* compiled from: ConnectedAppsAnalytics.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.us.b implements c {
    public final com.amazon.aps.iva.ds.a e;
    public final com.amazon.aps.iva.ls.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.xb0.a aVar2) {
        super(aVar2);
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.e = cVar;
        this.f = aVar;
    }

    @Override // com.amazon.aps.iva.kf.c
    public final void A(String str, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, "platform");
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.e.e(new com.amazon.aps.iva.es.w(a.C0456a.c(this.f, bVar), str));
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.e.c(defpackage.i.s(this.f, f, null, null, null, new com.amazon.aps.iva.is.a[0], 28));
    }

    @Override // com.amazon.aps.iva.kf.c
    public final void a(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "e");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        l1.L(this.e, th, new com.amazon.aps.iva.es.w(message, this.f, null, null, null, 60));
    }

    @Override // com.amazon.aps.iva.kf.c
    public final void v(String str, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, "platform");
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.e.e(new com.amazon.aps.iva.es.x(a.C0456a.c(this.f, bVar), str));
    }
}
