package com.amazon.aps.iva.jo;

import com.amazon.aps.iva.kb0.q;
/* compiled from: CrOwnershipVerificationPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        i iVar = this.h;
        iVar.e.g(th2.toString());
        iVar.getView().b();
        iVar.getView().U1();
        iVar.getView().showSnackbar(new com.amazon.aps.iva.bt.b(0, iVar.d.a(th2), new String[0], 1));
        return q.a;
    }
}
