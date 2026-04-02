package com.amazon.aps.iva.nj;

import com.amazon.aps.iva.ag.c;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.d;
import com.amazon.aps.iva.fj.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.pj.i;
import com.amazon.aps.iva.qj.n;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: DatadogComponent.kt */
/* loaded from: classes.dex */
public final class b extends f<a> {
    public final com.amazon.aps.iva.ag.b c;
    public final List<d<? extends com.amazon.aps.iva.pj.a>> d;

    public b() {
        c.a.getClass();
        com.amazon.aps.iva.ag.b bVar = c.b;
        if (bVar != null) {
            this.c = bVar;
            this.d = f1.J(e0.a(i.class));
            return;
        }
        j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void d(l<? super a, q> lVar) {
        j.f(lVar, "block");
        lVar.invoke(new a());
    }

    @Override // com.amazon.aps.iva.fj.a
    public final List<d<? extends com.amazon.aps.iva.pj.a>> f() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final Object g(com.amazon.aps.iva.pj.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        String str;
        if (aVar instanceof i.a) {
            i.a aVar2 = (i.a) aVar;
            Throwable th = aVar2.d;
            n nVar = aVar2.b;
            if (th == null || (str = th.getMessage()) == null) {
                if (th != null) {
                    str = th.toString();
                } else {
                    str = nVar.c;
                }
            }
            LinkedHashMap V = i0.V(new com.amazon.aps.iva.kb0.j("errorCode", nVar.b), new com.amazon.aps.iva.kb0.j("errorMessage", str));
            String str2 = aVar2.a.a;
            if (str2 != null) {
                V.put("mediaId", str2);
            }
            String str3 = aVar2.e;
            if (str3 != null) {
                V.put("errorSegment", str3);
            }
            q qVar = q.a;
            this.c.b(th, V);
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void dismiss() {
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void init() {
    }
}
