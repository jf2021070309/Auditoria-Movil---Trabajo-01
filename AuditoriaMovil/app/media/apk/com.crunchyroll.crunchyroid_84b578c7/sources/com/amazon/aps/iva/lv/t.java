package com.amazon.aps.iva.lv;

import com.ellation.crunchyroll.api.etp.error.NotFoundException;
/* compiled from: CrunchylistsPresenter.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        v view;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        com.amazon.aps.iva.pv.a aVar = (com.amazon.aps.iva.pv.a) th2;
        boolean z = aVar.d instanceof NotFoundException;
        o oVar = this.h;
        if (!z) {
            oVar.b.Z1(aVar.b, aVar.c);
        }
        view = oVar.getView();
        view.F(com.amazon.aps.iva.bt.c.b);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
