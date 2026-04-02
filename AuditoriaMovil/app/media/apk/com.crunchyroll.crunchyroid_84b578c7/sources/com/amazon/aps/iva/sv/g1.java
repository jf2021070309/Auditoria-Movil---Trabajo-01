package com.amazon.aps.iva.sv;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class g1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.g0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ Throwable h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Throwable th) {
        super(1);
        this.h = th;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.g0 g0Var) {
        com.ellation.crunchyroll.downloading.g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$notify");
        g0Var2.J3(new com.amazon.aps.iva.nw.g(this.h, com.amazon.aps.iva.nw.l.NETWORK_EXCEPTION));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
