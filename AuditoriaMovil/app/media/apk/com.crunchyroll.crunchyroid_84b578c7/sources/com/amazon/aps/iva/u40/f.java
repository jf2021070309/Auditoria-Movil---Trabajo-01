package com.amazon.aps.iva.u40;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.api.etp.error.PasswordResetRequiredException;
/* compiled from: SignInPresenter.kt */
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
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "exception");
        boolean z = th2 instanceof PasswordResetRequiredException;
        g gVar = this.h;
        if (z) {
            String t1 = g.s6(gVar).t1();
            if (!com.amazon.aps.iva.oe0.q.i0(t1, "@", false)) {
                t1 = null;
            }
            ((l) gVar.getView()).z5(t1);
            ((l) gVar.getView()).b();
            ((l) gVar.getView()).U1();
        } else {
            gVar.q6(th2);
        }
        return q.a;
    }
}
