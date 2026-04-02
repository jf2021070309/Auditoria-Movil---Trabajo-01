package com.amazon.aps.iva.p50;

import com.amazon.aps.iva.e.w;
/* compiled from: ShowRatingDialogAnalytics.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.us.b implements f {
    public final com.amazon.aps.iva.ds.a e;
    public final com.amazon.aps.iva.ls.a f;
    public final com.amazon.aps.iva.m50.b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.m50.b bVar, d dVar) {
        super(dVar);
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.e = cVar;
        this.f = aVar;
        this.g = bVar;
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        com.amazon.aps.iva.ls.a aVar = this.f;
        float a = this.d.a();
        com.amazon.aps.iva.m50.b bVar = this.g;
        this.e.c(defpackage.i.s(aVar, a, w.v(bVar.e, bVar.b, bVar.d, bVar.c), null, null, new com.amazon.aps.iva.is.a[0], 24));
    }
}
