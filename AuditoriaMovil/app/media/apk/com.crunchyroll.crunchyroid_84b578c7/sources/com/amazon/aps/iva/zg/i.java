package com.amazon.aps.iva.zg;
/* compiled from: EmailVerificationBannerPresenter.kt */
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar) {
        super(1);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "it");
        boolean z = th2 instanceof b;
        g gVar = this.h;
        if (z) {
            g.q6(gVar).showSnackbar(c.b);
        } else {
            g.q6(gVar).showSnackbar(com.amazon.aps.iva.bt.c.b);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
