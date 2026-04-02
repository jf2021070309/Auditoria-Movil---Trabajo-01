package com.amazon.aps.iva.ni;
/* compiled from: WatchMusicPresenter.kt */
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        q view;
        q view2;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        k kVar = this.h;
        view = kVar.getView();
        view.Rd();
        view2 = kVar.getView();
        view2.b();
        x o0 = kVar.b.o0();
        kVar.i.d(th2, new com.amazon.aps.iva.li.b(o0.b, o0.c));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
