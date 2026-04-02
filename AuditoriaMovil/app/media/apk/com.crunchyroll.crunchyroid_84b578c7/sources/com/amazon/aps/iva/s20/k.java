package com.amazon.aps.iva.s20;

import com.amazon.aps.iva.js.j0;
import java.util.Iterator;
import java.util.List;
/* compiled from: UpgradePresenter.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.n20.f>, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ n h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar) {
        super(1);
        this.h = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.n20.f> list) {
        com.amazon.aps.iva.b30.c cVar;
        j0 j0Var;
        List<? extends com.amazon.aps.iva.n20.f> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "products");
        n nVar = this.h;
        com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c> d = nVar.b.R7().d();
        if (d != null) {
            cVar = d.b;
        } else {
            cVar = null;
        }
        Iterator<? extends com.amazon.aps.iva.n20.f> it = list2.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                String str = it.next().a;
                com.amazon.aps.iva.yb0.j.c(cVar);
                if (com.amazon.aps.iva.yb0.j.a(str, cVar.b)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1) {
            nVar.b.l(0);
        } else {
            i = i2;
        }
        n.q6(nVar).P(list2);
        n.q6(nVar).X(list2.size());
        nVar.f.invoke(Integer.valueOf(i));
        n.q6(nVar).l(i);
        com.amazon.aps.iva.i20.e eVar = nVar.d;
        com.amazon.aps.iva.yb0.j.c(cVar);
        String str2 = cVar.b;
        String str3 = cVar.c;
        if (nVar.g) {
            j0Var = j0.UPGRADE;
        } else {
            j0Var = j0.UPSELL;
        }
        eVar.b(str2, str3, j0Var, com.amazon.aps.iva.b30.d.a(cVar), com.amazon.aps.iva.b30.d.d(cVar), com.amazon.aps.iva.b30.d.b(cVar));
        n.q6(nVar).b();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
