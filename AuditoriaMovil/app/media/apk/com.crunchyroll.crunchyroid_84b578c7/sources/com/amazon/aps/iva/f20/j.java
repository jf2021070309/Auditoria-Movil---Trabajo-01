package com.amazon.aps.iva.f20;

import android.content.Context;
import com.amazon.aps.iva.b30.l;
import com.amazon.aps.iva.b30.m;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.f20.e;
import com.amazon.aps.iva.g30.g;
import com.amazon.aps.iva.j30.y;
import com.amazon.aps.iva.ph.a;
import com.amazon.aps.iva.rs.q;
import com.amazon.aps.iva.yw.n;
import com.amazon.aps.iva.yw.o;
import com.amazon.aps.iva.yw.p;
import com.amazon.aps.iva.yw.r;
import com.amazon.aps.iva.yw.s;
import com.amazon.aps.iva.yw.t;
import com.amazon.aps.iva.yw.u;
import com.amazon.aps.iva.yw.v;
import com.amazon.aps.iva.yw.w;
import com.amazon.aps.iva.yw.x;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
import com.ellation.crunchyroll.application.d;
import com.ellation.crunchyroll.extension.LifecycleExtensionsKt;
import com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2.UpsellV2Activity;
import com.google.gson.Gson;
/* compiled from: MultitierSubscriptionFeature.kt */
/* loaded from: classes2.dex */
public final class j implements com.amazon.aps.iva.ph.a, i {
    public final com.amazon.aps.iva.xb0.a<Boolean> b;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.bo.f> c;
    public final h d;
    public final SubscriptionProcessorService e;
    public final b f;
    public final com.amazon.aps.iva.xb0.a<q> g;
    public final com.amazon.aps.iva.xb0.a<Boolean> h;
    public final com.amazon.aps.iva.xb0.a<Boolean> i;
    public final com.amazon.aps.iva.xb0.a<Boolean> j;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.vw.a> k;
    public final com.amazon.aps.iva.xb0.q<Context, com.amazon.aps.iva.wy.h, com.amazon.aps.iva.ls.a, com.amazon.aps.iva.mh.j> l;
    public final com.amazon.aps.iva.ct.j m;
    public final com.amazon.aps.iva.xb0.a<Boolean> n;
    public final com.amazon.aps.iva.xb0.a<Boolean> o;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.wh.c> p;
    public final com.amazon.aps.iva.xb0.a<Boolean> q;
    public final com.amazon.aps.iva.b30.h r;
    public final com.amazon.aps.iva.rs.f s;
    public final com.amazon.aps.iva.y20.a t;
    public final m u;

    public j(com.amazon.aps.iva.ya0.f fVar, p pVar, com.amazon.aps.iva.yw.q qVar, com.amazon.aps.iva.sz.b bVar, SubscriptionProcessorService subscriptionProcessorService, r rVar, s sVar, t tVar, u uVar, v vVar, w wVar, com.amazon.aps.iva.ct.k kVar, x xVar, com.amazon.aps.iva.yw.m mVar, n nVar, o oVar) {
        com.amazon.aps.iva.l30.a aVar = com.amazon.aps.iva.l30.a.a;
        this.b = pVar;
        this.c = qVar;
        this.d = bVar;
        this.e = subscriptionProcessorService;
        this.f = aVar;
        this.g = rVar;
        this.h = sVar;
        this.i = tVar;
        this.j = uVar;
        this.k = vVar;
        this.l = wVar;
        this.m = kVar;
        this.n = xVar;
        this.o = mVar;
        this.p = nVar;
        this.q = oVar;
        com.amazon.aps.iva.b30.h hVar = new com.amazon.aps.iva.b30.h(new com.amazon.aps.iva.b30.i(fVar, new Gson()));
        com.amazon.aps.iva.b30.g gVar = new com.amazon.aps.iva.b30.g(subscriptionProcessorService);
        com.amazon.aps.iva.xe0.d j = z.j();
        if (com.amazon.aps.iva.b30.j.b == null) {
            com.amazon.aps.iva.b30.j.b = new l(gVar, hVar, j);
            this.r = hVar;
            com.amazon.aps.iva.rs.f c = e.a.a(fVar).c();
            this.s = c;
            this.t = new com.amazon.aps.iva.y20.a(c, hVar);
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            m mVar2 = new m(c, bVar, new com.amazon.aps.iva.g30.d(new com.amazon.aps.iva.fs.d(), null), z.j(), pVar);
            d.a.a().Lf(mVar2);
            this.u = mVar2;
            return;
        }
        throw new IllegalStateException("Synchronizer is already initialized!");
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.xb0.a<Boolean> a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ph.a, com.amazon.aps.iva.f20.i
    public final k b(com.amazon.aps.iva.i5.o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "lifecycleOwner");
        return new k(new com.amazon.aps.iva.j30.m(new y(null), LifecycleExtensionsKt.a(oVar), com.amazon.aps.iva.j30.e.h));
    }

    @Override // com.amazon.aps.iva.ph.a, com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.wh.d c() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.bo.f> d() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.xh.b e(UpsellV2Activity upsellV2Activity) {
        com.amazon.aps.iva.yb0.j.f(upsellV2Activity, "lifecycleOwner");
        return a.C0616a.a(this, upsellV2Activity, com.amazon.aps.iva.xh.a.CR_PLUS, null, null, null, 16);
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.xb0.a<q> f() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.ct.j g() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.f20.i
    public final SubscriptionProcessorService getSubscriptionProcessorService() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.f20.i
    public final b h() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.vw.a> i() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.wh.c> j() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.ph.a
    public final com.amazon.aps.iva.uh.a k() {
        return this.t;
    }

    @Override // com.amazon.aps.iva.ph.a
    public final com.amazon.aps.iva.wh.e l() {
        return this.u;
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.xb0.a<Boolean> m() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.xb0.a<Boolean> n() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.f20.i
    public final h o() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ph.a
    public final com.amazon.aps.iva.z20.g p(androidx.fragment.app.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "activity");
        return new com.amazon.aps.iva.z20.g(hVar, this.q);
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.xb0.q<Context, com.amazon.aps.iva.wy.h, com.amazon.aps.iva.ls.a, com.amazon.aps.iva.mh.j> q() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.ph.a
    public final com.amazon.aps.iva.s20.g r(com.amazon.aps.iva.i5.o oVar, com.amazon.aps.iva.xh.a aVar, String str, com.amazon.aps.iva.vw.a aVar2, com.amazon.aps.iva.js.i iVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "lifecycleOwner");
        com.amazon.aps.iva.yb0.j.f(aVar, "successScreenType");
        com.amazon.aps.iva.yb0.j.f(iVar, "eventSourceProperty");
        return new com.amazon.aps.iva.s20.g(LifecycleExtensionsKt.a(oVar), aVar, str, aVar2, iVar);
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.xb0.a<Boolean> s() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.xb0.a<Boolean> t() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.f20.i
    public final com.amazon.aps.iva.xb0.a<Boolean> u() {
        return this.o;
    }

    public final com.amazon.aps.iva.g30.f v(androidx.fragment.app.h hVar) {
        com.amazon.aps.iva.g30.g a = g.a.a(hVar, null, null, 14);
        m mVar = this.u;
        com.amazon.aps.iva.yb0.j.f(mVar, "monitor");
        return new com.amazon.aps.iva.g30.f(mVar, a);
    }
}
