package com.amazon.aps.iva.u40;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.js.e;
import com.amazon.aps.iva.kb0.q;
/* compiled from: SignInPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ g h;
    public final /* synthetic */ com.amazon.aps.iva.ez.g<String> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, com.amazon.aps.iva.ez.g<String> gVar2) {
        super(1);
        this.h = gVar;
        this.i = gVar2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        g.a aVar;
        Throwable th2;
        Throwable th3 = th;
        com.amazon.aps.iva.yb0.j.f(th3, "exception");
        g gVar = this.h;
        com.amazon.aps.iva.us.n nVar = gVar.h;
        com.amazon.aps.iva.ez.g<String> gVar2 = this.i;
        gVar2.getClass();
        if (gVar2 instanceof g.a) {
            aVar = (g.a) gVar2;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            th2 = aVar.a;
        } else {
            th2 = null;
        }
        nVar.f(String.valueOf(th2), e.b.a, null);
        gVar.r6(th3);
        return q.a;
    }
}
