package com.amazon.aps.iva.xu;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.es.w;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CrunchylistsAnalytics.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.us.b implements d {
    public final com.amazon.aps.iva.ds.a e;
    public final com.amazon.aps.iva.ls.a f;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ks.e> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.xb0.a aVar2, com.amazon.aps.iva.xb0.a aVar3) {
        super(aVar3);
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        j.f(aVar, "screen");
        this.e = cVar;
        this.f = aVar;
        this.g = aVar2;
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.e.c(i.s(this.f, f, this.g.invoke(), null, null, new com.amazon.aps.iva.is.a[0], 24));
    }

    @Override // com.amazon.aps.iva.xu.d
    public final void a(Throwable th) {
        j.f(th, "e");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        l1.L(this.e, th, new w(message, this.f, null, null, null, 60));
    }
}
