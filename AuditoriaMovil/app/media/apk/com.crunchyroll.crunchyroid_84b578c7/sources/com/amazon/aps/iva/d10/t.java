package com.amazon.aps.iva.d10;
/* compiled from: DownloadsAnalytics.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.us.f implements r {
    public final com.amazon.aps.iva.ds.a g;
    public final com.amazon.aps.iva.vw.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.amazon.aps.iva.vw.a aVar, x xVar) {
        super(null, xVar, s.h, 1);
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        this.g = cVar;
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.DOWNLOADS;
        com.amazon.aps.iva.vw.a aVar2 = this.h;
        if (aVar2 != null) {
            gVar = aVar2.y();
        } else {
            gVar = null;
        }
        this.g.c(defpackage.i.s(aVar, f, null, gVar, null, new com.amazon.aps.iva.is.a[0], 20));
    }
}
