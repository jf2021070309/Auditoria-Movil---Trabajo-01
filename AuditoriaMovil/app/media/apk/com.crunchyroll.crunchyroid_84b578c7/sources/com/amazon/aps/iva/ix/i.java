package com.amazon.aps.iva.ix;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.amazon.aps.iva.cx.p;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.n60.b;
import com.amazon.aps.iva.nz.b;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.se0.t1;
import com.amazon.aps.iva.vx.u;
import com.amazon.aps.iva.vz.b;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.yw.d0;
import com.ellation.crunchyroll.api.etp.EtpNetworkModule;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.application.a;
/* compiled from: HomeFeedFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.vx.j {
    public final f a = f.h;
    public final e b = e.h;
    public final String c;
    public final EtpContentService d;
    public final m e;
    public final com.amazon.aps.iva.ct.d f;
    public final com.amazon.aps.iva.vw.a g;
    public final c h;
    public final h i;
    public final d j;
    public final com.amazon.aps.iva.vx.a k;
    public final com.amazon.aps.iva.s20.h l;
    public final /* synthetic */ EtpNetworkModule m;
    public final /* synthetic */ com.amazon.aps.iva.ph.a n;

    public i(com.amazon.aps.iva.ya0.f fVar, com.amazon.aps.iva.f20.j jVar, EtpNetworkModule etpNetworkModule, com.amazon.aps.iva.c20.a aVar, com.amazon.aps.iva.cx.c cVar) {
        this.m = etpNetworkModule;
        this.n = jVar;
        com.amazon.aps.iva.ts.b.a.getClass();
        this.c = com.amazon.aps.iva.ts.a.j;
        this.d = etpNetworkModule.getEtpContentService();
        this.e = new m(jVar);
        d.a.a(com.amazon.aps.iva.ls.a.HOME);
        this.f = etpNetworkModule.getUserBenefitsChangeMonitor();
        this.g = aVar;
        this.h = c.h;
        this.i = new h(etpNetworkModule);
        this.j = d.h;
        this.k = cVar;
        com.amazon.aps.iva.b30.h hVar = jVar.r;
        com.amazon.aps.iva.yb0.j.f(hVar, "subscriptionProductStore");
        this.l = new com.amazon.aps.iva.s20.h(fVar, hVar);
    }

    @Override // com.amazon.aps.iva.vx.j
    public final boolean b(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        return n.w(intent);
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.ph.a c() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final String d() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.ct.d e() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.vx.n f() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.rh.a g() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final EtpContentService getEtpContentService() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.xb0.a<Boolean> getHasPremiumBenefit() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.n70.d h(Activity activity, com.amazon.aps.iva.gn.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "shareComponent");
        return new com.amazon.aps.iva.gi.a(a.h, cVar, new com.amazon.aps.iva.ii.a(activity));
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.vx.a i() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final boolean j() {
        com.amazon.aps.iva.ts.a aVar = com.amazon.aps.iva.ts.b.a;
        com.amazon.aps.iva.ts.b.a.getClass();
        return false;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final void k(o oVar, com.ellation.crunchyroll.feed.l lVar) {
        com.amazon.aps.iva.ye0.c cVar = r0.a;
        t1 t1Var = com.amazon.aps.iva.xe0.k.a;
        com.amazon.aps.iva.yb0.j.f(t1Var, "dispatcher");
        com.amazon.aps.iva.nz.c cVar2 = b.a.a;
        if (cVar2 == null) {
            cVar2 = new com.amazon.aps.iva.nz.c(t1Var);
            b.a.a = cVar2;
        }
        cVar2.a(oVar, new g(lVar));
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.n70.d l(Activity activity, com.amazon.aps.iva.gn.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "shareComponent");
        return new com.amazon.aps.iva.gi.e(b.h, cVar, new com.amazon.aps.iva.ii.a(activity));
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.xb0.l<Context, com.amazon.aps.iva.yh.c> m() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.xb0.a<Boolean> n() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final View o(Context context) {
        return new com.amazon.aps.iva.xz.b(context, b.a.a(), com.amazon.aps.iva.ls.a.HOME);
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.nh.d p() {
        return ((d0) com.ellation.crunchyroll.application.e.a()).y;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.vw.a q() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.n60.b r() {
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(p.class, "app_resume_screens_reload_intervals");
            if (c != null) {
                return b.a.a((p) c);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.ScreenReloadIntervalsImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final void s(o oVar, u uVar) {
        this.m.getPolicyChangeMonitor().observePolicyChange(oVar, uVar);
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.xb0.l<Activity, com.amazon.aps.iva.oh.g> t() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.xb0.a<Boolean> u() {
        return this.i;
    }
}
