package com.amazon.aps.iva.fx;

import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
/* compiled from: DownloadingFeatureFactory.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.zv.a, com.amazon.aps.iva.ct.j {
    public final /* synthetic */ com.amazon.aps.iva.ct.k b = com.ellation.crunchyroll.application.f.a(null, 3);
    public final /* synthetic */ com.amazon.aps.iva.ct.a c;

    public c(com.amazon.aps.iva.ct.c cVar) {
        this.c = cVar;
    }

    @Override // com.amazon.aps.iva.ct.j
    public final boolean C() {
        return this.b.C();
    }

    @Override // com.amazon.aps.iva.ct.j
    public final boolean G1() {
        return this.b.G1();
    }

    @Override // com.amazon.aps.iva.xe.d
    public final Map<String, Benefit> I0() {
        return this.b.I0();
    }

    @Override // com.amazon.aps.iva.ct.j
    public final List<Benefit> R0() {
        return this.b.q();
    }

    @Override // com.amazon.aps.iva.ct.j
    public final boolean R1() {
        return this.b.R1();
    }

    @Override // com.amazon.aps.iva.xe.d
    public final void X0(List<String> list) {
        this.b.X0(list);
    }

    @Override // com.amazon.aps.iva.zv.a
    public final Object a(com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
        return this.c.a((com.amazon.aps.iva.nw.d) dVar);
    }

    @Override // com.amazon.aps.iva.xe.d
    public final void clear() {
        this.b.clear();
    }

    @Override // com.amazon.aps.iva.xe.d
    public final void f1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        this.b.f1(str);
    }

    @Override // com.amazon.aps.iva.zv.a, com.amazon.aps.iva.ct.j
    public final boolean getHasPremiumBenefit() {
        return this.b.getHasPremiumBenefit();
    }

    @Override // com.amazon.aps.iva.ct.j
    public final boolean m() {
        return this.b.m();
    }

    @Override // com.amazon.aps.iva.xe.d
    public final void n1(List<? extends Benefit> list) {
        com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
        this.b.n1(list);
    }

    @Override // com.amazon.aps.iva.zv.a, com.amazon.aps.iva.ct.j
    public final boolean r() {
        return this.b.r();
    }

    @Override // com.amazon.aps.iva.xe.d
    public final Benefit v(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        return this.b.v(str);
    }

    @Override // com.amazon.aps.iva.ct.j
    public final boolean z0() {
        return this.b.z0();
    }
}
