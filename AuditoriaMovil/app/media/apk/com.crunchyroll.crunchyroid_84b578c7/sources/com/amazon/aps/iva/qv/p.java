package com.amazon.aps.iva.qv;

import com.amazon.aps.iva.gv.i;
import com.amazon.aps.iva.qv.r;
/* compiled from: ModifyCrunchylistPresenter.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nv.e, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ r h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar) {
        super(1);
        this.h = rVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.nv.e eVar) {
        com.amazon.aps.iva.nv.e eVar2 = eVar;
        com.amazon.aps.iva.yb0.j.f(eVar2, "crunchylistItemUiModel");
        r rVar = this.h;
        if (rVar.d instanceof i.a) {
            com.amazon.aps.iva.yu.v vVar = rVar.c;
            com.amazon.aps.iva.yb0.j.c(vVar);
            vVar.H().e(rVar.getView(), new r.c(new n(rVar, eVar2)));
            vVar.o7(eVar2.d);
        } else {
            rVar.getView().Kd(eVar2, new a(eVar2.e));
            rVar.e.b();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
