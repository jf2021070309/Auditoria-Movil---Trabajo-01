package com.amazon.aps.iva.jk;

import com.amazon.aps.iva.nk.g;
import com.amazon.aps.iva.se0.g0;
/* compiled from: PlayerSessionHeartbeatListener.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.listeners.PlayerSessionHeartbeatListener$deleteSessionToken$1", f = "PlayerSessionHeartbeatListener.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ j i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, String str, String str2, com.amazon.aps.iva.ob0.d<? super k> dVar) {
        super(2, dVar);
        this.i = jVar;
        this.j = str;
        this.k = str2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new k(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((k) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        j jVar = this.i;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.p0.e eVar = jVar.f;
            this.h = 1;
            obj = ((com.amazon.aps.iva.zj.e) ((com.amazon.aps.iva.yj.a) eVar.b).d.b).b(this.j, this.k, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.amazon.aps.iva.nk.g gVar = (com.amazon.aps.iva.nk.g) obj;
        if (gVar instanceof g.b) {
            g.b bVar = (g.b) gVar;
            jVar.g.invoke(bVar.a, bVar.b);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
