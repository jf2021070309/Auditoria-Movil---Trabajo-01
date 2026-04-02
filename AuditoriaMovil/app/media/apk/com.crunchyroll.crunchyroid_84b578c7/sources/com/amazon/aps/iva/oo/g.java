package com.amazon.aps.iva.oo;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
/* compiled from: WatchScreenPlayerViewModelImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.player.WatchScreenPlayerViewModelImpl$1", f = "WatchScreenPlayerViewModelImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.no.b, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ m i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(2, dVar);
        this.i = mVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        g gVar = new g(this.i, dVar);
        gVar.h = obj;
        return gVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.no.b bVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((g) create(bVar, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.no.b bVar = (com.amazon.aps.iva.no.b) this.h;
        v0 v0Var = this.i.i;
        com.amazon.aps.iva.yb0.j.f(bVar, "<this>");
        v0Var.setValue(new Playhead(bVar.e, bVar.c, null, bVar.a.getId(), 4, null));
        return q.a;
    }
}
