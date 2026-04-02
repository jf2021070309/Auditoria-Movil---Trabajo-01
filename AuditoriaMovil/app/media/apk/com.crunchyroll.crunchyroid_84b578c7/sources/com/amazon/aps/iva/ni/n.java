package com.amazon.aps.iva.ni;
/* compiled from: WatchMusicPresenter.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        q view;
        q view2;
        com.amazon.aps.iva.yb0.j.f(th, "it");
        k kVar = this.h;
        view = kVar.getView();
        view.sh();
        view2 = kVar.getView();
        view2.V5();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
