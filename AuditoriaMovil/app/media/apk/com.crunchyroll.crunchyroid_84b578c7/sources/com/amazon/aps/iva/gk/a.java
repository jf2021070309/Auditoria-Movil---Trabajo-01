package com.amazon.aps.iva.gk;

import com.amazon.aps.iva.a6.p1;
import com.amazon.aps.iva.o6.o0;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.f;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.q5.u0;
import com.amazon.aps.iva.s6.g;
import com.amazon.aps.iva.s6.w;
import com.amazon.aps.iva.s6.x;
import com.amazon.aps.iva.t6.d;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
/* compiled from: BasePlayerTrackSelector.kt */
/* loaded from: classes.dex */
public abstract class a extends w {
    public final w d;

    public a(g gVar) {
        this.d = gVar;
    }

    @Override // com.amazon.aps.iva.s6.w
    public final u0 I() {
        u0 I = this.d.I();
        j.e(I, "trackSelector.parameters");
        return I;
    }

    @Override // com.amazon.aps.iva.s6.w
    public final void N(w.a aVar, d dVar) {
        j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        j.f(dVar, "bandwidthMeter");
        this.d.N(aVar, dVar);
        this.b = aVar;
        this.c = dVar;
    }

    @Override // com.amazon.aps.iva.s6.w
    public final boolean Q() {
        return this.d.Q();
    }

    @Override // com.amazon.aps.iva.s6.w
    public final void R(Object obj) {
        this.d.R(obj);
    }

    @Override // com.amazon.aps.iva.s6.w
    public final x S(p1[] p1VarArr, o0 o0Var, v.b bVar, r0 r0Var) {
        j.f(p1VarArr, "rendererCapabilities");
        j.f(o0Var, "trackGroups");
        j.f(bVar, "periodId");
        j.f(r0Var, "timeline");
        x S = this.d.S(p1VarArr, o0Var, bVar, r0Var);
        j.e(S, "trackSelector.selectTrac…oups, periodId, timeline)");
        return S;
    }

    @Override // com.amazon.aps.iva.s6.w
    public final void T(f fVar) {
        j.f(fVar, "audioAttributes");
        this.d.T(fVar);
    }

    @Override // com.amazon.aps.iva.s6.w
    public final void U(u0 u0Var) {
        j.f(u0Var, "parameters");
        this.d.U(u0Var);
    }

    @Override // com.amazon.aps.iva.s6.w
    public final void release() {
        this.d.release();
        super.release();
    }
}
