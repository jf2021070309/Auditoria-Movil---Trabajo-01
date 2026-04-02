package com.amazon.aps.iva.jk;

import com.amazon.aps.iva.se0.g0;
/* compiled from: PlayerSessionHeartbeatListener.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.listeners.PlayerSessionHeartbeatListener$setSessionInactive$1$1", f = "PlayerSessionHeartbeatListener.kt", l = {289}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ j i;
    public final /* synthetic */ com.amazon.aps.iva.nk.h j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(j jVar, com.amazon.aps.iva.nk.h hVar, com.amazon.aps.iva.ob0.d<? super u> dVar) {
        super(2, dVar);
        this.i = jVar;
        this.j = hVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new u(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((u) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.p0.e eVar = this.i.f;
            com.amazon.aps.iva.nk.h hVar = this.j;
            String str = hVar.b;
            com.amazon.aps.iva.yb0.j.c(str);
            String str2 = hVar.c;
            com.amazon.aps.iva.yb0.j.c(str2);
            this.h = 1;
            if (((com.amazon.aps.iva.zj.e) ((com.amazon.aps.iva.yj.a) eVar.b).f.b).a(str, str2, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
