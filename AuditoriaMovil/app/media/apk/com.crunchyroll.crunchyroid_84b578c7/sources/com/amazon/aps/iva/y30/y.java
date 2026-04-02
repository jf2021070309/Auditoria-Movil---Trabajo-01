package com.amazon.aps.iva.y30;
/* compiled from: SettingsListPresenter.kt */
/* loaded from: classes2.dex */
public final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ w h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w wVar) {
        super(1);
        this.h = wVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
        com.amazon.aps.iva.yb0.j.f(qVar, "$this$observeEvent");
        w.q6(this.h).showSnackbar(com.amazon.aps.iva.bt.c.b);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
