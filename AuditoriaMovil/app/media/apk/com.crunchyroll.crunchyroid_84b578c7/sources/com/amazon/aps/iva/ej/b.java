package com.amazon.aps.iva.ej;

import com.amazon.aps.iva.pj.d;
import com.amazon.aps.iva.qj.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayerAnalyticsComponent.kt */
/* loaded from: classes.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<p, p> {
    public final /* synthetic */ com.amazon.aps.iva.pj.d h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.pj.d dVar, String str) {
        super(1);
        this.h = dVar;
        this.i = str;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final p invoke(p pVar) {
        long j;
        p pVar2 = pVar;
        com.amazon.aps.iva.yb0.j.f(pVar2, "$this$set");
        Long l = ((d.h) this.h).d;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        return p.a(pVar2, 0L, j, 0L, 0L, 0, 0L, null, this.i, 0.0f, null, pVar2.l, 5883);
    }
}
