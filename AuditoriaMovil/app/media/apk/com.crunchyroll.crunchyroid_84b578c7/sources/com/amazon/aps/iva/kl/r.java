package com.amazon.aps.iva.kl;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.ve0.b0;
import com.amazon.aps.iva.ve0.c0;
import com.amazon.aps.iva.ve0.i0;
import com.amazon.aps.iva.ve0.q0;
import com.amazon.aps.iva.ve0.s0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.ve0.z;
/* compiled from: UpNextBannerViewModel.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.ez.b implements k {
    public final com.amazon.aps.iva.ij.g b;
    public final s c;
    public final com.amazon.aps.iva.cj.j d;
    public final v0 e;
    public final i0 f;
    public final i0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.amazon.aps.iva.ve0.f fVar, u0 u0Var, com.amazon.aps.iva.ve0.f fVar2, com.amazon.aps.iva.yy.a aVar, com.amazon.aps.iva.ij.g gVar, t tVar, com.amazon.aps.iva.hj.a aVar2) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(fVar, "state");
        com.amazon.aps.iva.yb0.j.f(u0Var, "nextEpisodeMetadata");
        com.amazon.aps.iva.yb0.j.f(fVar2, "playerControlsVisibility");
        com.amazon.aps.iva.yb0.j.f(aVar, "isAutoPlayEnabled");
        com.amazon.aps.iva.yb0.j.f(gVar, "contentAvailabilityProvider");
        com.amazon.aps.iva.yb0.j.f(aVar2, "playerController");
        this.b = gVar;
        this.c = tVar;
        this.d = aVar2;
        Boolean bool = Boolean.FALSE;
        v0 e = x.e(bool);
        this.e = e;
        c0 c0Var = new c0(new z(new a0(com.amazon.aps.iva.dg.b.n(u0Var, o.h), new p(this, null))), fVar, new q(this, null));
        g0 D = w.D(this);
        s0 s0Var = q0.a.b;
        this.f = com.amazon.aps.iva.dg.b.F(c0Var, D, s0Var, null);
        this.g = com.amazon.aps.iva.dg.b.F(new b0(new com.amazon.aps.iva.ve0.f[]{com.amazon.aps.iva.dg.b.n(u0Var, l.h), fVar, aVar, new n(fVar2), e}, new m(null)), w.D(this), s0Var, bool);
    }

    @Override // com.amazon.aps.iva.kl.k
    public final void F5() {
        this.d.e();
    }

    @Override // com.amazon.aps.iva.kl.k
    public final i0 I7() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.kl.k
    public final i0 isVisible() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.kl.k
    public final void z5() {
        this.e.setValue(Boolean.TRUE);
    }
}
