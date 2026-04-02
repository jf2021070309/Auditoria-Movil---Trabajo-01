package com.amazon.aps.iva.ij;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: PlayerDataComponent.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.data.PlayerDataComponent$collectCurrentAssetData$2", f = "PlayerDataComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.kj.c, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, com.amazon.aps.iva.ob0.d<? super i> dVar) {
        super(2, dVar);
        this.i = nVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        i iVar = new i(this.i, dVar);
        iVar.h = obj;
        return iVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.kj.c cVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((i) create(cVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.kj.c cVar = (com.amazon.aps.iva.kj.c) this.h;
        String a = cVar.a();
        n nVar = this.i;
        if (n.j(nVar, a)) {
            w.N(nVar, com.amazon.aps.iva.jj.a.a(cVar, com.amazon.aps.iva.qj.i.CURRENT));
        }
        return q.a;
    }
}
