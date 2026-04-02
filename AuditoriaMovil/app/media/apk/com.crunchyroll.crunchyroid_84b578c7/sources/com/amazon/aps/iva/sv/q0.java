package com.amazon.aps.iva.sv;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class q0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.ellation.crunchyroll.downloading.e0 h;
    public final /* synthetic */ Throwable i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.ellation.crunchyroll.downloading.e0 e0Var, Throwable th) {
        super(1);
        this.h = e0Var;
        this.i = th;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
        com.ellation.crunchyroll.downloading.g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$notify");
        g0Var2.z3(this.h, this.i);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
