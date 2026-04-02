package com.amazon.aps.iva.pi;

import android.content.Context;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.ni.r;
import com.amazon.aps.iva.ni.w;
import com.amazon.aps.iva.ve0.j0;
import com.amazon.aps.iva.ve0.z;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
/* compiled from: WatchMusicPlayerViewModelImpl.kt */
/* loaded from: classes.dex */
public final class p extends com.amazon.aps.iva.ez.b implements g, com.amazon.aps.iva.ij.o {
    public final r b;
    public final com.amazon.aps.iva.cj.i c;
    public final b d;
    public final com.amazon.aps.iva.yh.c e;
    public final com.amazon.aps.iva.ye.f f;
    public final v<Boolean> g;
    public final n h;
    public final com.amazon.aps.iva.az.d i;
    public final j0 j;
    public final j0 k;
    public final m l;
    public final com.amazon.aps.iva.az.d m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar, com.amazon.aps.iva.cj.i iVar, c cVar, a aVar, com.amazon.aps.iva.yh.d dVar, com.amazon.aps.iva.ye.f fVar, Context context) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(iVar, "player");
        com.amazon.aps.iva.yb0.j.f(dVar, "multipleArtistsFormatter");
        com.amazon.aps.iva.yb0.j.f(fVar, "castStateProvider");
        this.b = wVar;
        this.c = iVar;
        this.d = cVar;
        this.e = dVar;
        this.f = fVar;
        v<Boolean> vVar = new v<>();
        this.g = vVar;
        com.amazon.aps.iva.az.d dVar2 = wVar.f;
        this.h = new n(com.amazon.aps.iva.xy.m.a(dVar2), this);
        com.amazon.aps.iva.xy.b a = com.amazon.aps.iva.xy.m.a(dVar2);
        this.i = new com.amazon.aps.iva.az.d(null, new l(this, null), com.amazon.aps.iva.e.w.D(this), a);
        this.j = new j0(new k(null));
        this.k = new j0(new i(null));
        com.amazon.aps.iva.az.d dVar3 = wVar.j;
        this.l = new m(dVar3, this);
        z zVar = new z(dVar3);
        this.m = new com.amazon.aps.iva.az.d(null, new o(this, null), com.amazon.aps.iva.e.w.D(this), zVar);
        iVar.R(this, new com.amazon.aps.iva.gj.a(false, true, false), aVar, context);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new j(this, null), 3);
        if (fVar.isTryingToCast()) {
            vVar.k(Boolean.TRUE);
            com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new h(this, null), 3);
            return;
        }
        iVar.O(true);
    }

    @Override // com.amazon.aps.iva.ij.o
    public final com.amazon.aps.iva.ve0.f<Playhead> A4() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.ij.o
    public final com.amazon.aps.iva.az.b V2() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.ij.o
    public final com.amazon.aps.iva.ve0.f<com.amazon.aps.iva.kj.e> f2() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.ij.o
    public final com.amazon.aps.iva.az.b f5() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.pi.g
    public final void k() {
        this.i.e(true);
        this.m.e(true);
    }

    @Override // com.amazon.aps.iva.ez.b, com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        super.onCleared();
        this.c.release();
    }

    @Override // com.amazon.aps.iva.ij.o
    public final com.amazon.aps.iva.ve0.f<com.amazon.aps.iva.kj.e> u3() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.ij.o
    public final com.amazon.aps.iva.ve0.f<Long> x2() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.pi.g
    public final v z7() {
        return this.g;
    }
}
