package com.amazon.aps.iva.ni;

import androidx.lifecycle.LiveData;
import java.util.List;
/* compiled from: WatchMusicViewModel.kt */
/* loaded from: classes.dex */
public final class w extends com.amazon.aps.iva.ez.b implements r {
    public final com.amazon.aps.iva.ji.a b;
    public final com.amazon.aps.iva.at.d c;
    public final com.amazon.aps.iva.yh.c d;
    public final com.amazon.aps.iva.ti.a e;
    public final com.amazon.aps.iva.az.d f;
    public final androidx.lifecycle.c g;
    public final com.amazon.aps.iva.az.d h;
    public final androidx.lifecycle.c i;
    public final com.amazon.aps.iva.az.d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.amazon.aps.iva.l50.c cVar, androidx.lifecycle.p pVar, com.amazon.aps.iva.ji.b bVar, com.amazon.aps.iva.at.f fVar, com.amazon.aps.iva.yh.d dVar) {
        super(bVar);
        com.amazon.aps.iva.yb0.j.f(pVar, "savedStateHandle");
        com.amazon.aps.iva.yb0.j.f(bVar, "interactor");
        com.amazon.aps.iva.yb0.j.f(fVar, "contentAvailabilityProvider");
        com.amazon.aps.iva.yb0.j.f(dVar, "multipleArtistsFormatter");
        this.b = bVar;
        this.c = fVar;
        this.d = dVar;
        com.amazon.aps.iva.ti.a t = com.amazon.aps.iva.ab.x.t(pVar, "watch_music_state", new x(cVar.b, cVar.c), com.amazon.aps.iva.e.w.D(this));
        this.e = t;
        com.amazon.aps.iva.az.d d = com.amazon.aps.iva.xy.m.d(t, com.amazon.aps.iva.e.w.D(this), null, new v(this, null), 6);
        this.f = d;
        this.g = com.amazon.aps.iva.i5.j.b(d, com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
        com.amazon.aps.iva.az.d d2 = com.amazon.aps.iva.xy.m.d(com.amazon.aps.iva.xy.m.a(d), com.amazon.aps.iva.e.w.D(this), null, new t(this, null), 6);
        this.h = d2;
        s sVar = new s(this);
        com.amazon.aps.iva.xy.d dVar2 = com.amazon.aps.iva.xy.d.h;
        com.amazon.aps.iva.yb0.j.f(dVar2, "mapLoading");
        com.amazon.aps.iva.xy.e eVar = com.amazon.aps.iva.xy.e.h;
        com.amazon.aps.iva.yb0.j.f(eVar, "mapFailure");
        this.i = com.amazon.aps.iva.i5.j.b(new com.amazon.aps.iva.xy.c(d2, dVar2, eVar, sVar), com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
        this.j = new com.amazon.aps.iva.az.d(null, new u(this, null), com.amazon.aps.iva.e.w.D(this), com.amazon.aps.iva.xy.m.a(d2));
    }

    @Override // com.amazon.aps.iva.ni.r
    public final void C0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "currentAssetId");
        com.amazon.aps.iva.ti.a aVar = this.e;
        aVar.d(x.a((x) aVar.getValue(), str, 2));
    }

    @Override // com.amazon.aps.iva.ni.r
    public final androidx.lifecycle.c E0() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.ni.r
    public final LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.ci.h>>> W() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.ni.r
    public final com.amazon.aps.iva.az.b a5() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.ni.r
    public final void f3(String str, com.amazon.aps.iva.x50.t tVar) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.yb0.j.f(tVar, "assetType");
        this.e.d(new x(str, tVar));
    }

    @Override // com.amazon.aps.iva.ni.r
    public final void i0() {
        this.h.e(false);
    }

    @Override // com.amazon.aps.iva.ni.r
    public final void l0(boolean z) {
        x xVar;
        com.amazon.aps.iva.ti.a aVar = this.e;
        if (z) {
            xVar = x.a((x) aVar.getValue(), null, 3);
        } else {
            xVar = (x) aVar.getValue();
        }
        aVar.d(xVar);
    }

    @Override // com.amazon.aps.iva.ni.r
    public final x o0() {
        return (x) this.e.getValue();
    }
}
