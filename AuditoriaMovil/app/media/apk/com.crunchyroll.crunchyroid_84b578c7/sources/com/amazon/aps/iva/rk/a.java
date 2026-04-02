package com.amazon.aps.iva.rk;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: PlayerEngine.kt */
@e(c = "com.crunchyroll.player.playerengine.PlayerEngine$processEvent$1", f = "PlayerEngine.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public final /* synthetic */ b h;
    public final /* synthetic */ com.amazon.aps.iva.pj.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, com.amazon.aps.iva.pj.a aVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
        super(2, dVar);
        this.h = bVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new a(this.h, this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        this.h.b.b("PlayerEngine", this.i);
        return q.a;
    }
}
