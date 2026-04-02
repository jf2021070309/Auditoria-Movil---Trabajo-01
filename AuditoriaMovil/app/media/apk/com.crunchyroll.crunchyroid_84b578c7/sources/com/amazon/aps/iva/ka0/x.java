package com.amazon.aps.iva.ka0;

import com.amazon.aps.iva.ka0.y;
import com.amazon.aps.iva.se0.g0;
/* compiled from: MuxStateCollector.kt */
@com.amazon.aps.iva.qb0.e(c = "com.mux.stats.sdk.muxstats.MuxStateCollector$PlayerWatcher$updateOnMain$1", f = "MuxStateCollector.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class x extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ y.a<Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y.a<Object> aVar, com.amazon.aps.iva.ob0.d<? super x> dVar) {
        super(2, dVar);
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        x xVar = new x(this.i, dVar);
        xVar.h = obj;
        return xVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((x) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        g0 g0Var = (g0) this.h;
        y.a<Object> aVar2 = this.i;
        Object value = aVar2.e.getValue(aVar2, y.a.f[0]);
        y yVar = aVar2.b;
        if (value != null) {
            l = aVar2.c.invoke(value, yVar);
        } else {
            l = null;
        }
        if (l != null) {
            yVar.g = l.longValue();
        } else {
            com.amazon.aps.iva.ia0.b.a(g0.class.getSimpleName(), "PlaybackPositionWatcher: Player lost. Stopping");
            aVar2.a("player lost");
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
