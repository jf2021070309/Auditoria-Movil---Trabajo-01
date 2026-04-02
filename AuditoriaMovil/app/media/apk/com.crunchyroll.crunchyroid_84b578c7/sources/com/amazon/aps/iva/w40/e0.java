package com.amazon.aps.iva.w40;
/* compiled from: SimulcastPresenter.kt */
/* loaded from: classes2.dex */
public final class e0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ b0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(b0 b0Var) {
        super(1);
        this.h = b0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "ex");
        boolean z = th2 instanceof f;
        b0 b0Var = this.h;
        if (z) {
            b0.q6(b0Var).v0();
        } else {
            b0.q6(b0Var).c();
        }
        b0.q6(b0Var).h2();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
