package com.amazon.aps.iva.hl;

import com.amazon.aps.iva.dj.g;
import com.amazon.aps.iva.dj.h;
/* compiled from: StreamsLimitOverlayAnalytics.kt */
/* loaded from: classes2.dex */
public final class q0 {
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ks.w> a;
    public final com.amazon.aps.iva.xb0.a<String> b;
    public final com.amazon.aps.iva.ds.a c;

    public q0(com.amazon.aps.iva.ds.a aVar, g.j jVar, com.amazon.aps.iva.xb0.a aVar2) {
        this.a = jVar;
        this.b = aVar2;
        this.c = aVar;
    }

    public final void a() {
        this.c.e(new com.amazon.aps.iva.es.w(this.a.invoke(), com.amazon.aps.iva.js.i.CR_VOD_STREAM_LIMIT));
    }

    public final void b() {
        this.c.c(new com.amazon.aps.iva.es.j(com.amazon.aps.iva.ls.a.STREAM_LIMIT_REACHED, new com.amazon.aps.iva.es.p0("eventSource", com.amazon.aps.iva.js.i.CR_VOD_STREAM_LIMIT), this.a.invoke()));
    }

    public final void c(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "analyticsClickedView");
        this.c.e(new com.amazon.aps.iva.es.z(new com.amazon.aps.iva.ks.u(com.amazon.aps.iva.js.l0.UPGRADE), new com.amazon.aps.iva.ks.a(bVar.b, h.a.a().a(this.b.invoke()).name(), bVar.a, ""), this.a.invoke(), com.amazon.aps.iva.js.i.CR_VOD_STREAM_LIMIT));
    }
}
