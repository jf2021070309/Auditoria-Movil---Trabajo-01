package com.amazon.aps.iva.il;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qj.r;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.i0;
import com.amazon.aps.iva.ve0.q0;
/* compiled from: SkipSegmentButtonViewModel.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.ez.b implements f {
    public final g0 b;
    public final com.amazon.aps.iva.cj.h c;
    public final com.amazon.aps.iva.hj.a d;
    public final a e;
    public final com.amazon.aps.iva.xb0.a<q> f;
    public final com.amazon.aps.iva.xb0.a<q> g;
    public boolean h;
    public final i0 i;
    public final i0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, com.amazon.aps.iva.cj.h hVar, com.amazon.aps.iva.hj.a aVar, b bVar, com.crunchyroll.player.presentation.controls.a aVar2, com.crunchyroll.player.presentation.controls.b bVar2) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(aVar, "playerController");
        com.amazon.aps.iva.yb0.j.f(bVar, "skipSegmentAnalytics");
        this.b = lifecycleCoroutineScopeImpl;
        this.c = hVar;
        this.d = aVar;
        this.e = bVar;
        this.f = aVar2;
        this.g = bVar2;
        this.i = com.amazon.aps.iva.dg.b.F(com.amazon.aps.iva.dg.b.m(new j(hVar.getState())), w.D(this), q0.a.a, null);
        this.j = com.amazon.aps.iva.dg.b.F(new i(com.amazon.aps.iva.dg.b.m(new h(hVar.getState())), this), w.D(this), q0.a.b, null);
    }

    @Override // com.amazon.aps.iva.il.f
    public final void L3() {
        r rVar = (r) this.j.getValue();
        if (rVar != null) {
            this.e.a(rVar.c);
            long j = rVar.a;
            this.d.c(j - 3000);
        }
    }

    @Override // com.amazon.aps.iva.il.f
    public final i0 w0() {
        return this.j;
    }
}
