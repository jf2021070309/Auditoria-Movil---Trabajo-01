package com.amazon.aps.iva.ij;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: PlayerDataComponent.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.data.PlayerDataComponent$collectUpNextAssetData$2", f = "PlayerDataComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.kj.c, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, com.amazon.aps.iva.ob0.d<? super m> dVar) {
        super(2, dVar);
        this.i = nVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        m mVar = new m(this.i, dVar);
        mVar.h = obj;
        return mVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.kj.c cVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((m) create(cVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.kj.c cVar = (com.amazon.aps.iva.kj.c) this.h;
        String a = cVar.a();
        n nVar = this.i;
        if (n.j(nVar, a)) {
            w.N(nVar, com.amazon.aps.iva.jj.a.a(cVar, com.amazon.aps.iva.qj.i.NEXT));
        }
        return q.a;
    }
}
