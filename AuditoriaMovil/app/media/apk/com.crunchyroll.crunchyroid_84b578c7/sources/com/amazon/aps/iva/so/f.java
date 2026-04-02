package com.amazon.aps.iva.so;

import com.amazon.aps.iva.kb0.q;
/* compiled from: WatchScreenAssetsPresenter.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(1);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        h view;
        h view2;
        com.amazon.aps.iva.yb0.j.f(th, "it");
        g gVar = this.h;
        view = gVar.getView();
        view.Od();
        view2 = gVar.getView();
        view2.c();
        return q.a;
    }
}
