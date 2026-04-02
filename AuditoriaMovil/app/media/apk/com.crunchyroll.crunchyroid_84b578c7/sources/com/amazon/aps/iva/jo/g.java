package com.amazon.aps.iva.jo;

import com.amazon.aps.iva.kb0.q;
/* compiled from: CrOwnershipVerificationPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<q, q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(q qVar) {
        j view;
        j view2;
        j view3;
        com.amazon.aps.iva.yb0.j.f(qVar, "it");
        i iVar = this.h;
        iVar.e.K();
        view = iVar.getView();
        view.U1();
        iVar.c.o0(true);
        view2 = iVar.getView();
        view2.f0();
        view3 = iVar.getView();
        view3.closeScreen();
        return q.a;
    }
}
