package com.amazon.aps.iva.t20;

import com.amazon.aps.iva.js.j0;
import java.util.Iterator;
import java.util.List;
/* compiled from: ManageMembershipPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.n20.f>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar) {
        super(1);
        this.h = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.n20.f> list) {
        com.amazon.aps.iva.b30.c cVar;
        String str;
        List<? extends com.amazon.aps.iva.n20.f> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "tiers");
        e eVar = this.h;
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d = eVar.c.R7().d();
        if (d != null) {
            cVar = d.b;
        } else {
            cVar = null;
        }
        com.amazon.aps.iva.yb0.j.c(cVar);
        Iterator<? extends com.amazon.aps.iva.n20.f> it = list2.iterator();
        int i = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            str = cVar.b;
            if (hasNext) {
                if (com.amazon.aps.iva.yb0.j.a(it.next().a, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        e.q6(eVar).P(list2);
        e.q6(eVar).X(list2.size());
        e.q6(eVar).dd(i);
        e.q6(eVar).l(i);
        e.q6(eVar).R9(str, eVar.b.b);
        eVar.d.b(cVar.b, cVar.c, j0.UPSELL, null, null, null);
        e.q6(eVar).b();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
