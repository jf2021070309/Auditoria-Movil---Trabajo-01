package com.amazon.aps.iva.pn;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
/* compiled from: FiltersPresenter.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class c extends i implements l<com.amazon.aps.iva.mn.b, q> {
    public c(e eVar) {
        super(1, eVar, e.class, "onFilterRadioButtonOptionSelected", "onFilterRadioButtonOptionSelected(Lcom/crunchyroll/sortandfilters/FilterOption;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.mn.b bVar) {
        com.amazon.aps.iva.mn.b bVar2 = bVar;
        j.f(bVar2, "p0");
        e eVar = (e) this.receiver;
        eVar.getClass();
        f fVar = eVar.b;
        fVar.i6(bVar2);
        h view = eVar.getView();
        if (fVar.L()) {
            view.u1();
        } else {
            view.V0();
        }
        return q.a;
    }
}
