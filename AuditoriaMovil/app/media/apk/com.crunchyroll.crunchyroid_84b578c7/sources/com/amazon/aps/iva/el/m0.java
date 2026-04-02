package com.amazon.aps.iva.el;
/* compiled from: PlayerViewViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.playerview.PlayerViewViewModelImpl$skipToNextModel$1", f = "PlayerViewViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.nk.d, com.amazon.aps.iva.nk.j, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.cl.e>, Object> {
    public /* synthetic */ com.amazon.aps.iva.nk.d h;
    public /* synthetic */ com.amazon.aps.iva.nk.j i;

    public m0(com.amazon.aps.iva.ob0.d<? super m0> dVar) {
        super(3, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(com.amazon.aps.iva.nk.d dVar, com.amazon.aps.iva.nk.j jVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.cl.e> dVar2) {
        m0 m0Var = new m0(dVar2);
        m0Var.h = dVar;
        m0Var.i = jVar;
        return m0Var.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        com.amazon.aps.iva.nk.d dVar = this.h;
        com.amazon.aps.iva.nk.j jVar = this.i;
        String str = dVar.a.a;
        boolean z = true;
        if (!((!(com.amazon.aps.iva.oe0.m.b0(str) ^ true) || jVar.m.b) ? false : false)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return new com.amazon.aps.iva.cl.e(str);
    }
}
