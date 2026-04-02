package com.amazon.aps.iva.ij;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: PlayerDataComponent.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.data.PlayerDataComponent$collectCurrentAssetData$4", f = "PlayerDataComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.qb0.i implements p<Long, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ long h;
    public final /* synthetic */ n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, com.amazon.aps.iva.ob0.d<? super k> dVar) {
        super(2, dVar);
        this.i = nVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        k kVar = new k(this.i, dVar);
        kVar.h = ((Number) obj).longValue();
        return kVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(Long l, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((k) create(Long.valueOf(l.longValue()), dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        w.N(this.i, new com.amazon.aps.iva.pj.g(this.h));
        return q.a;
    }
}
