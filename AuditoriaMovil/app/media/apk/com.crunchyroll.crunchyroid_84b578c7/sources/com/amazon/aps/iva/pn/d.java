package com.amazon.aps.iva.pn;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: FiltersPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ com.amazon.aps.iva.mn.c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, com.amazon.aps.iva.mn.c cVar) {
        super(1);
        this.h = eVar;
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.amazon.aps.iva.mn.b bVar = ((com.amazon.aps.iva.mn.a) this.i).b;
        e eVar = this.h;
        eVar.getClass();
        j.f(bVar, "filter");
        f fVar = eVar.b;
        fVar.P3(bVar, booleanValue);
        h view = eVar.getView();
        if (fVar.L()) {
            view.u1();
        } else {
            view.V0();
        }
        return q.a;
    }
}
