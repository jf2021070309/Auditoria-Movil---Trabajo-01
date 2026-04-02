package com.amazon.aps.iva.yu;

import com.amazon.aps.iva.e4.l1;
/* compiled from: AddToCrunchylistAnalytics.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.us.b implements c {
    public final com.amazon.aps.iva.bv.d e;
    public final com.amazon.aps.iva.ds.a f;
    public final com.amazon.aps.iva.ls.a g;

    public d(com.amazon.aps.iva.bv.d dVar, com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.ls.a aVar2, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar3) {
        super(aVar3);
        this.e = dVar;
        this.f = aVar;
        this.g = aVar2;
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        com.amazon.aps.iva.ls.a aVar = this.g;
        com.amazon.aps.iva.bv.d dVar = this.e;
        com.amazon.aps.iva.yb0.j.f(dVar, "<this>");
        this.f.c(defpackage.i.s(aVar, f, com.amazon.aps.iva.e.w.v(dVar.e, dVar.b, dVar.d, dVar.c), null, null, new com.amazon.aps.iva.is.a[0], 24));
    }

    @Override // com.amazon.aps.iva.yu.c
    public final void a(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "e");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        l1.L(this.f, th, new com.amazon.aps.iva.es.w(message, this.g, null, null, null, 60));
    }
}
