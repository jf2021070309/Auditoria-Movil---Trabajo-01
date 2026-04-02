package com.amazon.aps.iva.cj;
/* compiled from: PlayerSettingsAdapter.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.PlayerSettingsAdapterImpl$init$2", f = "PlayerSettingsAdapter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.rl.a, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ com.amazon.aps.iva.uj.c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.amazon.aps.iva.uj.c cVar, com.amazon.aps.iva.ob0.d<? super c0> dVar) {
        super(2, dVar);
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        c0 c0Var = new c0(this.i, dVar);
        c0Var.h = obj;
        return c0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.rl.a aVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((c0) create(aVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        this.i.e(com.amazon.aps.iva.dg.b.I((com.amazon.aps.iva.rl.a) this.h));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
