package com.amazon.aps.iva.ew;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ContentExpirationMonitor.kt */
/* loaded from: classes2.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.sk.b, q> {
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(1);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.sk.b bVar) {
        com.amazon.aps.iva.sk.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "it");
        g gVar = this.h;
        gVar.getClass();
        String str = bVar2.a;
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.se0.i.d(gVar, null, null, new h(gVar, str, null), 3);
        return q.a;
    }
}
