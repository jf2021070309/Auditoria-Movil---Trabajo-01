package com.amazon.aps.iva.re;

import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.ks.g;
import com.amazon.aps.iva.me.j;
/* compiled from: InGraceFeedButtonAnalytics.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ls.a a;
    public final com.amazon.aps.iva.ds.a b;
    public final com.amazon.aps.iva.vw.a c;

    public b(com.amazon.aps.iva.ls.a aVar, j jVar) {
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.a = aVar;
        this.b = cVar;
        this.c = jVar;
    }

    @Override // com.amazon.aps.iva.re.a
    public final void a(com.amazon.aps.iva.fs.b bVar) {
        g gVar;
        com.amazon.aps.iva.ks.a c = a.C0456a.c(this.a, bVar);
        com.amazon.aps.iva.js.b bVar2 = com.amazon.aps.iva.js.b.PAYMENT_UPDATE;
        com.amazon.aps.iva.vw.a aVar = this.c;
        if (aVar != null) {
            gVar = aVar.y();
        } else {
            gVar = null;
        }
        this.b.e(new com.amazon.aps.iva.es.j(c, bVar2, gVar));
    }
}
