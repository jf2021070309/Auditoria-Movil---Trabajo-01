package com.amazon.aps.iva.ij;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.pj.d;
import com.amazon.aps.iva.xb0.p;
/* compiled from: PlayerDataComponent.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.data.PlayerDataComponent$collectUpNextAssetData$1", f = "PlayerDataComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.kj.e, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, com.amazon.aps.iva.ob0.d<? super l> dVar) {
        super(2, dVar);
        this.i = nVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        l lVar = new l(this.i, dVar);
        lVar.h = obj;
        return lVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.kj.e eVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((l) create(eVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.kj.e eVar = (com.amazon.aps.iva.kj.e) this.h;
        String str = eVar.a;
        n nVar = this.i;
        if (n.j(nVar, str)) {
            w.N(nVar, new d.g(defpackage.i.J(eVar), com.amazon.aps.iva.qj.i.NEXT, 4));
        }
        return q.a;
    }
}
