package com.amazon.aps.iva.tz;

import com.amazon.aps.iva.j8.f;
/* compiled from: BrowseAllNewestDataSource.kt */
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ r h;
    public final /* synthetic */ f.c<Integer, com.amazon.aps.iva.uz.h> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r rVar, f.d dVar) {
        super(1);
        this.h = rVar;
        this.i = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "it");
        this.h.m.invoke(0, th2);
        this.i.b(com.amazon.aps.iva.lb0.z.b, null, null);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
