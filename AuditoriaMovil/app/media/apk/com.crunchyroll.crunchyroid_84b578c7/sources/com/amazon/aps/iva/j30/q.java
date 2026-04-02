package com.amazon.aps.iva.j30;

import com.amazon.aps.iva.js.j0;
import java.util.Iterator;
import java.util.List;
/* compiled from: UpsellV2Presenter.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.n20.f>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar) {
        super(1);
        this.h = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.n20.f> list) {
        com.amazon.aps.iva.b30.c cVar;
        List<? extends com.amazon.aps.iva.n20.f> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "products");
        o oVar = this.h;
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d = oVar.c.R7().d();
        if (d != null) {
            cVar = d.b;
        } else {
            cVar = null;
        }
        o.q6(oVar).P(list2);
        o.q6(oVar).X(list2.size());
        Iterator<? extends com.amazon.aps.iva.n20.f> it = list2.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                String str = it.next().a;
                com.amazon.aps.iva.yb0.j.c(cVar);
                if (com.amazon.aps.iva.yb0.j.a(str, cVar.b)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        oVar.i.invoke(Integer.valueOf(i));
        o.q6(oVar).l(i);
        com.amazon.aps.iva.i20.e eVar = oVar.h;
        com.amazon.aps.iva.yb0.j.c(cVar);
        eVar.b(cVar.b, cVar.c, j0.UPSELL, com.amazon.aps.iva.b30.d.a(cVar), com.amazon.aps.iva.b30.d.d(cVar), com.amazon.aps.iva.b30.d.b(cVar));
        o.q6(oVar).b();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
