package com.amazon.aps.iva.jk;

import com.amazon.aps.iva.se0.g0;
/* compiled from: PlayerSessionHeartbeatListener.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.listeners.PlayerSessionHeartbeatListener$onPlayWhenReadyChanged$1", f = "PlayerSessionHeartbeatListener.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ j i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j jVar, com.amazon.aps.iva.ob0.d<? super n> dVar) {
        super(2, dVar);
        this.i = jVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new n(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((n) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            this.h = 1;
            if (j.G(this.i, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
