package com.amazon.aps.iva.kw;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: OfflinePlayheadMonitor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.playheads.OfflinePlayheadMonitor$observePlayerPlayheads$1$1", f = "OfflinePlayheadMonitor.kt", l = {19, 24}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public final /* synthetic */ c i;
    public final /* synthetic */ com.amazon.aps.iva.sk.b j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, com.amazon.aps.iva.sk.b bVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
        super(2, dVar);
        this.i = cVar;
        this.j = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new a(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        com.amazon.aps.iva.sk.b bVar = this.j;
        c cVar = this.i;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    x.i0(obj);
                    return q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.i0(obj);
        } else {
            x.i0(obj);
            com.amazon.aps.iva.mg.a aVar2 = cVar.d;
            String str = bVar.a;
            this.h = 1;
            obj = aVar2.b(str, bVar.b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.amazon.aps.iva.ig.a aVar3 = (com.amazon.aps.iva.ig.a) obj;
        if (aVar3 != null && !bVar.c) {
            com.amazon.aps.iva.mg.a aVar4 = cVar.d;
            this.h = 2;
            if (aVar4.f(aVar3, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
