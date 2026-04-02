package com.amazon.aps.iva.hl;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.nf.c;
import com.amazon.aps.iva.ve0.q0;
import com.amazon.aps.iva.ve0.r0;
/* compiled from: RestrictionOverlayViewModel.kt */
/* loaded from: classes2.dex */
public final class o0 extends com.amazon.aps.iva.i5.f0 implements m0 {
    public final LiveData<Boolean> b;
    public final com.amazon.aps.iva.ve0.i0 c;
    public final com.amazon.aps.iva.ve0.i0 d;

    public o0(com.amazon.aps.iva.tk.a aVar, k0 k0Var) {
        com.amazon.aps.iva.yb0.j.f(aVar, "fullScreenStateDataProvider");
        this.b = aVar.D();
        n0 n0Var = new n0(k0Var.b(com.amazon.aps.iva.e.w.D(this)));
        com.amazon.aps.iva.se0.g0 D = com.amazon.aps.iva.e.w.D(this);
        r0 r0Var = q0.a.a;
        this.c = com.amazon.aps.iva.dg.b.F(n0Var, D, r0Var, com.amazon.aps.iva.ab.x.m0(com.amazon.aps.iva.lb0.z.b));
        this.d = com.amazon.aps.iva.dg.b.F(k0Var.a(com.amazon.aps.iva.e.w.D(this)), com.amazon.aps.iva.e.w.D(this), r0Var, c.C0538c.a);
    }

    @Override // com.amazon.aps.iva.hl.m0
    public final com.amazon.aps.iva.ve0.i0 B5() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.hl.m0
    public final LiveData<Boolean> e7() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.hl.m0
    public final com.amazon.aps.iva.ve0.i0 y2() {
        return this.c;
    }
}
