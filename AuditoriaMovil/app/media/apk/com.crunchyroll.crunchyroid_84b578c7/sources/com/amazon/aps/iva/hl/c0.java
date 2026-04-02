package com.amazon.aps.iva.hl;

import android.app.Activity;
import android.content.Context;
import com.amazon.aps.iva.dj.f;
import com.amazon.aps.iva.dj.h;
import com.amazon.aps.iva.ph.a;
/* compiled from: RestrictionOverlayModule.kt */
/* loaded from: classes2.dex */
public final class c0 implements y {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] g = {com.amazon.aps.iva.k.q.a(c0.class, "viewModel", "getViewModel()Lcom/crunchyroll/player/presentation/restrictionoverlay/RestrictionOverlayViewModelImpl;", 0)};
    public final com.amazon.aps.iva.ez.a a;
    public final com.amazon.aps.iva.cj.z b;
    public final com.amazon.aps.iva.xh.b c;
    public final u d;
    public final com.amazon.aps.iva.rf.d e;
    public final com.amazon.aps.iva.dj.g f;

    public c0(Context context, com.amazon.aps.iva.el.p0 p0Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        Activity a = com.amazon.aps.iva.xw.q.a(context);
        com.amazon.aps.iva.yb0.j.d(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.a = new com.amazon.aps.iva.ez.a(o0.class, new a0((androidx.fragment.app.h) a), new b0(context, p0Var));
        Activity a2 = com.amazon.aps.iva.xw.q.a(context);
        com.amazon.aps.iva.yb0.j.d(a2, "null cannot be cast to non-null type com.crunchyroll.player.PlayerScreen");
        com.amazon.aps.iva.cj.z zVar = (com.amazon.aps.iva.cj.z) a2;
        this.b = zVar;
        com.amazon.aps.iva.cj.k kVar = com.amazon.aps.iva.cj.n.d;
        if (kVar != null) {
            com.amazon.aps.iva.ph.a c = kVar.c();
            Activity a3 = com.amazon.aps.iva.xw.q.a(context);
            com.amazon.aps.iva.yb0.j.d(a3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            com.amazon.aps.iva.xh.b a4 = a.C0616a.a(c, (androidx.fragment.app.h) a3, null, null, null, null, 30);
            this.c = a4;
            com.amazon.aps.iva.cj.k kVar2 = com.amazon.aps.iva.cj.n.d;
            if (kVar2 != null) {
                Activity a5 = com.amazon.aps.iva.xw.q.a(context);
                com.amazon.aps.iva.yb0.j.d(a5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                com.amazon.aps.iva.k50.j n = kVar2.n((androidx.fragment.app.h) a5);
                com.amazon.aps.iva.dj.f.a.getClass();
                com.amazon.aps.iva.dj.g gVar = f.a.b;
                com.amazon.aps.iva.dj.m mVar = gVar.e;
                com.amazon.aps.iva.yb0.j.f(n, "subscriptionFlowRouter");
                com.amazon.aps.iva.yb0.j.f(a4, "upgradeFlowRouter");
                com.amazon.aps.iva.yb0.j.f(mVar, "playerUpsellFlowEnteredAnalytics");
                this.d = new u(zVar, n, a4, mVar);
                this.e = new com.amazon.aps.iva.rf.d(context, new z(context));
                this.f = gVar;
                return;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.hl.y
    public final com.amazon.aps.iva.xh.b a() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.hl.y
    public final o0 b() {
        return (o0) this.a.getValue(this, g[0]);
    }

    @Override // com.amazon.aps.iva.hl.y
    public final void c() {
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        defpackage.i iVar = defpackage.i.d;
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.MATURE_WALL;
        com.amazon.aps.iva.dj.i a = h.a.a();
        com.amazon.aps.iva.cj.h hVar = com.amazon.aps.iva.cj.n.e;
        if (hVar != null) {
            com.amazon.aps.iva.ks.a aVar2 = new com.amazon.aps.iva.ks.a(null, a.a(((com.amazon.aps.iva.nk.j) hVar.getState().getValue()).h.i).name(), null, "");
            com.amazon.aps.iva.yb0.j.f(aVar, "analyticsScreen");
            cVar.c(new com.amazon.aps.iva.es.j(aVar, defpackage.i.t(iVar, 0.0f, null, null, aVar2, null, 14)));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("player");
        throw null;
    }

    @Override // com.amazon.aps.iva.hl.y
    public final com.amazon.aps.iva.rf.d d() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.hl.y
    public final u e() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.hl.y
    public final com.amazon.aps.iva.cj.z f() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.hl.y
    public final com.amazon.aps.iva.dj.g g() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.hl.y
    public final void h(com.amazon.aps.iva.ks.p pVar, com.amazon.aps.iva.ks.e eVar) {
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        defpackage.i iVar = defpackage.i.d;
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.MATURE_WALL;
        com.amazon.aps.iva.js.i iVar2 = com.amazon.aps.iva.js.i.CR_VOD_PARENTAL_CONTROLS;
        com.amazon.aps.iva.yb0.j.f(aVar, "analyticsScreen");
        com.amazon.aps.iva.ak.b bVar = new com.amazon.aps.iva.ak.b(2);
        bVar.a(defpackage.i.t(iVar, 0.0f, eVar, null, null, iVar2, 26));
        bVar.b(new com.amazon.aps.iva.is.a[]{pVar});
        cVar.c(new com.amazon.aps.iva.es.j(aVar, (com.amazon.aps.iva.is.a[]) bVar.d(new com.amazon.aps.iva.is.a[bVar.c()])));
    }
}
