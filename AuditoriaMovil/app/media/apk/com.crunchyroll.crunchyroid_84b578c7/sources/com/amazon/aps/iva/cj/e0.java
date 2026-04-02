package com.amazon.aps.iva.cj;
/* compiled from: PlayerSettingsAdapter.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.PlayerSettingsAdapterImpl$init$4", f = "PlayerSettingsAdapter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<Boolean, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ boolean h;
    public final /* synthetic */ com.amazon.aps.iva.uj.c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.amazon.aps.iva.uj.c cVar, com.amazon.aps.iva.ob0.d<? super e0> dVar) {
        super(2, dVar);
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        e0 e0Var = new e0(this.i, dVar);
        e0Var.h = ((Boolean) obj).booleanValue();
        return e0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(Boolean bool, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((e0) create(Boolean.valueOf(bool.booleanValue()), dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        this.i.a(this.h);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
