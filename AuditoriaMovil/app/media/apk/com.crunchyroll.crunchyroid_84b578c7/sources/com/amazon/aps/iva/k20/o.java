package com.amazon.aps.iva.k20;
/* compiled from: CancellationRescuePresenter.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar) {
        super(1);
        this.h = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "it");
        this.h.getView().b();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
