package com.amazon.aps.iva.ij;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.pj.d;
import com.amazon.aps.iva.pj.j;
import com.amazon.aps.iva.xb0.p;
/* compiled from: PlayerDataComponent.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.data.PlayerDataComponent$collectCurrentAssetData$1", f = "PlayerDataComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.kj.e, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(2, dVar);
        this.i = nVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        h hVar = new h(this.i, dVar);
        hVar.h = obj;
        return hVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.kj.e eVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((h) create(eVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.kj.e eVar = (com.amazon.aps.iva.kj.e) this.h;
        String str = eVar.a;
        n nVar = this.i;
        if (n.j(nVar, str)) {
            w.N(nVar, j.a.a);
            w.N(nVar, new d.g(defpackage.i.J(eVar), null, 6));
        }
        return q.a;
    }
}
