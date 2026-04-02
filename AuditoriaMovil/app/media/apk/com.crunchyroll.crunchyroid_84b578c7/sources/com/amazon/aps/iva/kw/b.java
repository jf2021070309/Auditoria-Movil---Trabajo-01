package com.amazon.aps.iva.kw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: OfflinePlayheadMonitor.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.sk.b, q> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(1);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.sk.b bVar) {
        com.amazon.aps.iva.sk.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "playheadSave");
        c cVar = this.h;
        com.amazon.aps.iva.se0.i.d(cVar, null, null, new a(cVar, bVar2, null), 3);
        return q.a;
    }
}
