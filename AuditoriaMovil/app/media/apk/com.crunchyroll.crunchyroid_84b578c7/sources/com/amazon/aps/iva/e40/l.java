package com.amazon.aps.iva.e40;

import com.amazon.aps.iva.kb0.q;
/* compiled from: PremiumMembershipPresenter.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ m h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar) {
        super(1);
        this.h = mVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        n view;
        n view2;
        com.amazon.aps.iva.yb0.j.f(th, "it");
        m mVar = this.h;
        view = mVar.getView();
        view.F7();
        view2 = mVar.getView();
        view2.b();
        mVar.d.c();
        return q.a;
    }
}
