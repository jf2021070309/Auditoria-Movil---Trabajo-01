package com.amazon.aps.iva.nh;

import com.amazon.aps.iva.es.g0;
import com.amazon.aps.iva.es.h0;
import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.yb0.j;
import java.io.IOException;
/* compiled from: MarkAsWatchedAnalytics.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.ls.a b;

    public b(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.ls.a aVar2) {
        j.f(aVar2, "screen");
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.amazon.aps.iva.nh.a
    public final void a(com.amazon.aps.iva.ks.e eVar) {
        j.f(eVar, "contentMediaProperty");
        this.a.e(new h0(a.C0456a.b(this.b), eVar));
    }

    @Override // com.amazon.aps.iva.nh.a
    public final void b(IOException iOException) {
        Throwable cause = iOException.getCause();
        this.a.e(new g0((cause == null || (r2 = cause.getMessage()) == null) ? "" : ""));
    }

    @Override // com.amazon.aps.iva.nh.a
    public final void c() {
        this.a.e(new com.amazon.aps.iva.es.b());
    }
}
