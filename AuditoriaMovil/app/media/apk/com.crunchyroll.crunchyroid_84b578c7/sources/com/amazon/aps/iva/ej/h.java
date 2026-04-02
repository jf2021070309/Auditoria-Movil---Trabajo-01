package com.amazon.aps.iva.ej;

import com.amazon.aps.iva.pj.e;
import com.amazon.aps.iva.qj.o;
import com.amazon.aps.iva.qj.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayerAnalyticsComponent.kt */
/* loaded from: classes.dex */
public final class h extends l implements com.amazon.aps.iva.xb0.l<p, p> {
    public final /* synthetic */ com.amazon.aps.iva.pj.e h;
    public final /* synthetic */ a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, com.amazon.aps.iva.pj.e eVar) {
        super(1);
        this.h = eVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final p invoke(p pVar) {
        p pVar2 = pVar;
        com.amazon.aps.iva.yb0.j.f(pVar2, "$this$set");
        return p.a(pVar2, 0L, 0L, ((e.b) this.h).a - ((o) this.i.c.getValue()).t, 0L, 0, 0L, null, null, 0.0f, null, null, 8183);
    }
}
