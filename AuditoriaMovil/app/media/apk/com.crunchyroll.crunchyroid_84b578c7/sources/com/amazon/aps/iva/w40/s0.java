package com.amazon.aps.iva.w40;

import com.amazon.aps.iva.ez.g;
/* compiled from: SimulcastViewModel.kt */
/* loaded from: classes2.dex */
public final class s0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p0 p0Var) {
        super(1);
        this.h = p0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "it");
        this.h.f.k(new g.a(null, th2));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
