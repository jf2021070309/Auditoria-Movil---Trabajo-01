package com.amazon.aps.iva.qo;

import com.ellation.crunchyroll.api.etp.error.NotFoundException;
/* compiled from: WatchScreenPresenter.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ l h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(l lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "error");
        l lVar = this.h;
        l.q6(lVar).b();
        boolean z = th2 instanceof NotFoundException;
        w wVar = lVar.b;
        if (z) {
            l.q6(lVar).z3(wVar.o0().e);
        } else {
            l.q6(lVar).c();
        }
        lVar.e.y(wVar.getCurrentAsset(), th2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
