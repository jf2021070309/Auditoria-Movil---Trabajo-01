package com.amazon.aps.iva.ij;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.pj.d;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
/* compiled from: PlayerDataComponent.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.data.PlayerDataComponent$collectCurrentAssetData$3", f = "PlayerDataComponent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.qb0.i implements p<Playhead, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(2, dVar);
        this.i = nVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        j jVar = new j(this.i, dVar);
        jVar.h = obj;
        return jVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(Playhead playhead, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((j) create(playhead, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        Playhead playhead = (Playhead) this.h;
        w.N(this.i, new d.C0620d(playhead.getPlayheadSec(), playhead.isCompleted()));
        return q.a;
    }
}
