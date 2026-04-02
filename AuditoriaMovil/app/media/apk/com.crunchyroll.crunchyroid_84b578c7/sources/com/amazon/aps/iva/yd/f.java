package com.amazon.aps.iva.yd;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.js.e;
import com.amazon.aps.iva.ks.a;
import java.io.IOException;
/* compiled from: EmailMandatoryAnalytics.kt */
/* loaded from: classes.dex */
public final class f implements e {
    public final com.amazon.aps.iva.ds.a a = com.amazon.aps.iva.ds.c.b;

    @Override // com.amazon.aps.iva.yd.e
    public final void a() {
        this.a.c(new com.amazon.aps.iva.es.j(com.amazon.aps.iva.ls.a.EMAIL_ADDRESS_NEEDED, new com.amazon.aps.iva.is.a[0]));
    }

    @Override // com.amazon.aps.iva.yd.e
    public final void b(IOException iOException, com.amazon.aps.iva.es.w wVar) {
        l1.L(this.a, iOException, wVar);
    }

    @Override // com.amazon.aps.iva.yd.e
    public final void c(boolean z) {
        this.a.e(new com.amazon.aps.iva.es.h(z));
    }

    @Override // com.amazon.aps.iva.yd.e
    public final void d(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new com.amazon.aps.iva.es.g(a.C0456a.c(com.amazon.aps.iva.ls.a.EMAIL_ADDRESS_NEEDED, bVar)));
    }

    @Override // com.amazon.aps.iva.yd.e
    public final void g(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "reason");
        this.a.e(new com.amazon.aps.iva.es.f(str, e.b.a));
    }
}
