package com.amazon.aps.iva.cj;
/* compiled from: PlayerSettingsAdapter.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.PlayerSettingsAdapterImpl$init$3", f = "PlayerSettingsAdapter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<String, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ com.amazon.aps.iva.uj.c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.amazon.aps.iva.uj.c cVar, com.amazon.aps.iva.ob0.d<? super d0> dVar) {
        super(2, dVar);
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        d0 d0Var = new d0(this.i, dVar);
        d0Var.h = obj;
        return d0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((d0) create(str, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        String str = (String) this.h;
        boolean a = com.amazon.aps.iva.yb0.j.a(str, "off");
        com.amazon.aps.iva.uj.c cVar = this.i;
        if (a) {
            cVar.b("off");
        } else {
            cVar.b(str);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
