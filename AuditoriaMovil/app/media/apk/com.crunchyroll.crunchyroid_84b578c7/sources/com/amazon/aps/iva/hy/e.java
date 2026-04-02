package com.amazon.aps.iva.hy;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.hy.a;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.vx.r;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yx.g;
import java.util.List;
/* compiled from: ContinueWatchingOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.n70.d<g> {
    public final l<com.amazon.aps.iva.oh.a, q> a;
    public final com.amazon.aps.iva.gn.b b;

    public e(r rVar, com.amazon.aps.iva.gn.c cVar) {
        j.f(cVar, "shareComponent");
        this.a = rVar;
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.n70.d
    public final List a(g gVar) {
        com.amazon.aps.iva.n70.b bVar;
        g gVar2 = gVar;
        j.f(gVar2, "data");
        com.amazon.aps.iva.n70.b[] bVarArr = new com.amazon.aps.iva.n70.b[2];
        if (gVar2.c) {
            bVar = new com.amazon.aps.iva.n70.b(a.c.e, b.h);
        } else {
            bVar = new com.amazon.aps.iva.n70.b(a.C0347a.e, new c(this, gVar2));
        }
        bVarArr[0] = bVar;
        bVarArr[1] = new com.amazon.aps.iva.n70.b(a.b.e, new d(this, gVar2));
        return f1.K(bVarArr);
    }
}
