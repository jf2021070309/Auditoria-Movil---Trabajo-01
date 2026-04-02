package com.amazon.aps.iva.ni;
/* compiled from: WatchMusicPresenter.kt */
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(p pVar) {
        q view;
        q view2;
        p pVar2 = pVar;
        com.amazon.aps.iva.yb0.j.f(pVar2, "data");
        k kVar = this.h;
        view = kVar.getView();
        view.Yc(pVar2.b);
        view2 = kVar.getView();
        view2.b();
        kVar.i.c(new com.amazon.aps.iva.li.a(pVar2.a));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
