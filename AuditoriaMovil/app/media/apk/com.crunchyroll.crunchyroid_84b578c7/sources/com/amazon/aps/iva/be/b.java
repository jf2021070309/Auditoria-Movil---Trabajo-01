package com.amazon.aps.iva.be;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.wd.n;
import com.amazon.aps.iva.wd.s;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AuthDestinations.kt */
/* loaded from: classes.dex */
public final class b extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.ui.c<a> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.ui.c<a> cVar) {
        super(2);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            iVar2.s(-492369756);
            Object t = iVar2.t();
            if (t == i.a.a) {
                com.amazon.aps.iva.ui.c<a> cVar = this.h;
                j.f(cVar, "navigator");
                t = new n(cVar);
                iVar2.n(t);
            }
            iVar2.G();
            s.a((com.amazon.aps.iva.ri.b) t, iVar2, 6);
        }
        return q.a;
    }
}
