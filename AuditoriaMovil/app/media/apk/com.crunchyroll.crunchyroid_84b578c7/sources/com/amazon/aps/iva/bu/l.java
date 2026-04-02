package com.amazon.aps.iva.bu;

import com.amazon.aps.iva.bu.h;
import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.xb0.p;
/* compiled from: CommentsDataSourceFactory.kt */
/* loaded from: classes2.dex */
public final class l implements k {
    public static final l a = new l();
    public static final h.f b = new h.f(50, 50, false, 50);

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Integer, Key] */
    @Override // com.amazon.aps.iva.bu.k
    public final com.amazon.aps.iva.kb0.j a(h.c cVar, com.amazon.aps.iva.xb0.l lVar, p pVar, h.d dVar, a aVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "boundaryCallback");
        com.amazon.aps.iva.yb0.j.f(lVar, "onPageLoadingSuccess");
        com.amazon.aps.iva.yb0.j.f(pVar, "onPageLoadingFailure");
        m mVar = new m(dVar, lVar, pVar, aVar);
        h.d dVar2 = new h.d(mVar, b);
        dVar2.f = 0;
        dVar2.d = com.amazon.aps.iva.vu.a.a;
        dVar2.c = com.amazon.aps.iva.vu.a.b;
        dVar2.e = cVar;
        return new com.amazon.aps.iva.kb0.j(mVar, dVar2.a());
    }
}
