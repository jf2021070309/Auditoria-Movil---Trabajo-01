package com.amazon.aps.iva.cv;

import com.ellation.crunchyroll.api.etp.error.ConflictException;
/* compiled from: CrunchylistPresenter.kt */
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ p h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar) {
        super(1);
        this.h = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        com.amazon.aps.iva.u70.i iVar;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "throwable");
        boolean z = th2.getCause() instanceof ConflictException;
        p pVar = this.h;
        if (z && pVar.getView().Hc()) {
            pVar.getView().a1();
        }
        x q6 = p.q6(pVar);
        if (th2.getCause() instanceof ConflictException) {
            iVar = new com.amazon.aps.iva.hv.q(((com.amazon.aps.iva.hv.r) th2).c);
        } else {
            iVar = com.amazon.aps.iva.bt.c.b;
        }
        q6.showSnackbar(iVar);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
