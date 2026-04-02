package com.amazon.aps.iva.r10;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.es.t0;
import com.amazon.aps.iva.es.u0;
import com.amazon.aps.iva.es.v0;
import com.amazon.aps.iva.jt.a;
import com.amazon.aps.iva.r10.n;
import com.amazon.aps.iva.ws.d;
import com.ellation.crunchyroll.model.Panel;
import java.io.IOException;
/* compiled from: HistoryAnalytics.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.us.f implements c {
    public final com.amazon.aps.iva.ds.a g;
    public final com.amazon.aps.iva.ws.d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.amazon.aps.iva.ws.f fVar, n.e eVar, com.amazon.aps.iva.xb0.a aVar) {
        super(aVar, eVar, d.h);
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.g = cVar;
        this.h = fVar;
    }

    @Override // com.amazon.aps.iva.r10.c
    public final void C(IOException iOException) {
        Throwable cause = iOException.getCause();
        this.g.e(new t0((cause == null || (r2 = cause.getMessage()) == null) ? "" : ""));
    }

    @Override // com.amazon.aps.iva.r10.c
    public final void H() {
        this.g.e(new u0());
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.g.c(defpackage.i.s(com.amazon.aps.iva.ls.a.HISTORY, f, null, null, null, new com.amazon.aps.iva.is.a[0], 28));
    }

    @Override // com.amazon.aps.iva.r10.c
    public final void f(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "e");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        l1.L(this.g, th, new com.amazon.aps.iva.es.w(message, com.amazon.aps.iva.ls.a.HISTORY, null, null, null, 60));
    }

    @Override // com.amazon.aps.iva.r10.c
    public final void l(int i) {
        this.g.e(new com.amazon.aps.iva.es.n0(i));
    }

    @Override // com.amazon.aps.iva.r10.c
    public final void n(IOException iOException) {
        String str;
        Throwable cause = iOException.getCause();
        if (cause != null) {
            str = cause.getMessage();
        } else {
            str = null;
        }
        this.g.e(new com.amazon.aps.iva.es.l0(str));
    }

    @Override // com.amazon.aps.iva.r10.c
    public final void o(int i) {
        this.g.e(new v0(Integer.valueOf(i)));
    }

    @Override // com.amazon.aps.iva.r10.c
    public final void t() {
        this.g.e(new com.amazon.aps.iva.es.m0());
    }

    @Override // com.amazon.aps.iva.r10.c
    public final void u(Panel panel, int i) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        d.b.a(this.h, panel, a.C0423a.a(com.amazon.aps.iva.js.k.CARD, 0, i, null, null, 56), null, null, null, 28);
    }
}
