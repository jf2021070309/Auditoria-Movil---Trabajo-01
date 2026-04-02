package com.amazon.aps.iva.a40;

import com.amazon.aps.iva.kb0.q;
/* compiled from: ChangePasswordPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(1);
        this.h = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        m view;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "throwable");
        j jVar = this.h;
        view = jVar.getView();
        view.b();
        jVar.getView().showSnackbar(new com.amazon.aps.iva.bt.b(0, jVar.d.a(th2), new String[0], 1));
        return q.a;
    }
}
