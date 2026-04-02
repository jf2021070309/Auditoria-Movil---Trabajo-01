package com.amazon.aps.iva.jk;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.se0.g0;
/* compiled from: PlayerEventListener.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.listeners.PlayerEventListener$onPlayWhenReadyChanged$1", f = "PlayerEventListener.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ b j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(2, dVar);
        this.j = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        c cVar = new c(this.j, dVar);
        cVar.i = obj;
        return cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        g0 g0Var;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                g0Var = (g0) this.i;
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            g0Var = (g0) this.i;
        }
        while (z.E(g0Var)) {
            this.j.K();
            this.i = g0Var;
            this.h = 1;
            if (com.amazon.aps.iva.ab.t.l(250L, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
