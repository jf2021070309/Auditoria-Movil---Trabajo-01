package com.amazon.aps.iva.k10;

import com.amazon.aps.iva.kb0.q;
/* compiled from: ForgotPasswordPresenter.kt */
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
        j view;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        g gVar = this.h;
        view = gVar.getView();
        view.showSnackbar(new com.amazon.aps.iva.bt.b(0, gVar.c.a(th2), new String[0], 1));
        gVar.getView().b();
        return q.a;
    }
}
