package com.amazon.aps.iva.l10;

import com.amazon.aps.iva.kb0.q;
/* compiled from: GenresListPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar) {
        super(1);
        this.h = kVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        l view;
        com.amazon.aps.iva.yb0.j.f(th, "it");
        view = this.h.getView();
        view.c();
        return q.a;
    }
}
