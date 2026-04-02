package com.amazon.aps.iva.ka0;

import com.amazon.aps.iva.ka0.y;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.r0;
/* compiled from: MuxStateCollector.kt */
@com.amazon.aps.iva.qb0.e(c = "com.mux.stats.sdk.muxstats.MuxStateCollector$PlayerWatcher$start$1", f = "MuxStateCollector.kt", l = {597}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class w extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ y.a<Object> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y.a<Object> aVar, com.amazon.aps.iva.ob0.d<? super w> dVar) {
        super(2, dVar);
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        w wVar = new w(this.j, dVar);
        wVar.i = obj;
        return wVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((w) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        g0 g0Var;
        y.a<Object> aVar;
        com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                g0Var = (g0) this.i;
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            g0Var = (g0) this.i;
        }
        do {
            com.amazon.aps.iva.fc0.l<Object>[] lVarArr = y.a.f;
            aVar = this.j;
            aVar.getClass();
            com.amazon.aps.iva.ye0.c cVar = r0.a;
            com.amazon.aps.iva.se0.i.d(g0Var, com.amazon.aps.iva.xe0.k.a, null, new x(aVar, null), 2);
            this.i = g0Var;
            this.h = 1;
        } while (com.amazon.aps.iva.ab.t.l(aVar.a, this) != aVar2);
        return aVar2;
    }
}
