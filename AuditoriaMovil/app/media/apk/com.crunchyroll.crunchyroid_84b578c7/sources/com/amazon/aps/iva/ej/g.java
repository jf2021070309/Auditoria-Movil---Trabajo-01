package com.amazon.aps.iva.ej;

import com.amazon.aps.iva.pj.e;
import com.amazon.aps.iva.qj.o;
import com.amazon.aps.iva.qj.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayerAnalyticsComponent.kt */
/* loaded from: classes.dex */
public final class g extends l implements com.amazon.aps.iva.xb0.l<p, p> {
    public final /* synthetic */ a h;
    public final /* synthetic */ com.amazon.aps.iva.pj.e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, com.amazon.aps.iva.pj.e eVar) {
        super(1);
        this.h = aVar;
        this.i = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final p invoke(p pVar) {
        p pVar2 = pVar;
        com.amazon.aps.iva.yb0.j.f(pVar2, "$this$set");
        a aVar = this.h;
        long j = aVar.d;
        long j2 = ((e.b) this.i).b;
        int intValue = ((Number) aVar.i.getValue()).intValue();
        long longValue = ((Number) aVar.h.getValue()).longValue();
        String str = ((o) aVar.c.getValue()).w;
        if (str == null) {
            str = "";
        }
        return p.a(pVar2, j, 0L, 0L, j2, intValue, longValue, null, null, 0.0f, str, null, 7054);
    }
}
