package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.l0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.fd0.a;
import com.amazon.aps.iva.fe0.b;
import com.amazon.aps.iva.xc0.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: AbstractSignatureParts.kt */
/* loaded from: classes4.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a.C0248a, Iterable<? extends a.C0248a>> {
    public final /* synthetic */ a<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Iterable<? extends a.C0248a> invoke(a.C0248a c0248a) {
        a.C0248a c0248a2;
        com.amazon.aps.iva.ee0.y g;
        l0 l0Var;
        com.amazon.aps.iva.ee0.y g2;
        a.C0248a c0248a3 = c0248a;
        com.amazon.aps.iva.yb0.j.f(c0248a3, "it");
        a<Object> aVar = this.h;
        boolean z = ((v) aVar).e;
        com.amazon.aps.iva.he0.h hVar = c0248a3.a;
        if (z) {
            if (hVar != null && (g2 = b.a.g(hVar)) != null) {
                l0Var = b.a.h(g2);
            } else {
                l0Var = null;
            }
            if (l0Var != null) {
                return null;
            }
        }
        if (hVar == null) {
            return null;
        }
        m0 i = b.a.i(hVar);
        if (i == null && ((g = b.a.g(hVar)) == null || (i = b.a.W(g)) == null)) {
            i = b.a.i(hVar);
            com.amazon.aps.iva.yb0.j.c(i);
        }
        c1 f0 = b.a.f0(i);
        if (f0 == null) {
            return null;
        }
        List r = b.a.r(f0);
        List o = b.a.o(hVar);
        Iterator it = r.iterator();
        Iterator it2 = o.iterator();
        ArrayList arrayList = new ArrayList(Math.min(com.amazon.aps.iva.lb0.r.Y(r), com.amazon.aps.iva.lb0.r.Y(o)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            com.amazon.aps.iva.he0.k kVar = (com.amazon.aps.iva.he0.k) it2.next();
            com.amazon.aps.iva.he0.m mVar = (com.amazon.aps.iva.he0.m) next;
            boolean S = b.a.S(kVar);
            z zVar = c0248a3.b;
            if (S) {
                c0248a2 = new a.C0248a(null, zVar, mVar);
            } else {
                u1 v = b.a.v(kVar);
                aVar.getClass();
                com.amazon.aps.iva.xc0.e e = ((v) aVar).e();
                com.amazon.aps.iva.yb0.j.f(v, "<this>");
                c0248a2 = new a.C0248a(v, e.b(zVar, v.getAnnotations()), mVar);
            }
            arrayList.add(c0248a2);
        }
        return arrayList;
    }
}
