package com.amazon.aps.iva.vx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: HomeFeedFeature.kt */
/* loaded from: classes2.dex */
public final class k implements j {
    public final /* synthetic */ j a;

    public k(com.amazon.aps.iva.ix.i iVar) {
        this.a = iVar;
    }

    @Override // com.amazon.aps.iva.vx.j
    public final boolean b(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        return this.a.b(intent);
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.ph.a c() {
        return this.a.c();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final String d() {
        return this.a.d();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.ct.d e() {
        return this.a.e();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final n f() {
        return this.a.f();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.rh.a g() {
        return this.a.g();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final EtpContentService getEtpContentService() {
        return this.a.getEtpContentService();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.xb0.a<Boolean> getHasPremiumBenefit() {
        return this.a.getHasPremiumBenefit();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.n70.d h(Activity activity, com.amazon.aps.iva.gn.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "shareComponent");
        return this.a.h(activity, cVar);
    }

    @Override // com.amazon.aps.iva.vx.j
    public final a i() {
        return this.a.i();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final boolean j() {
        return this.a.j();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final void k(com.amazon.aps.iva.i5.o oVar, com.ellation.crunchyroll.feed.l lVar) {
        this.a.k(oVar, lVar);
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.n70.d l(Activity activity, com.amazon.aps.iva.gn.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "shareComponent");
        return this.a.l(activity, cVar);
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.xb0.l<Context, com.amazon.aps.iva.yh.c> m() {
        return this.a.m();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.xb0.a<Boolean> n() {
        return this.a.n();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final View o(Context context) {
        return this.a.o(context);
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.nh.d p() {
        return this.a.p();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.vw.a q() {
        return this.a.q();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.n60.b r() {
        return this.a.r();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final void s(com.amazon.aps.iva.i5.o oVar, u uVar) {
        this.a.s(oVar, uVar);
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.xb0.l<Activity, com.amazon.aps.iva.oh.g> t() {
        return this.a.t();
    }

    @Override // com.amazon.aps.iva.vx.j
    public final com.amazon.aps.iva.xb0.a<Boolean> u() {
        return this.a.u();
    }
}
