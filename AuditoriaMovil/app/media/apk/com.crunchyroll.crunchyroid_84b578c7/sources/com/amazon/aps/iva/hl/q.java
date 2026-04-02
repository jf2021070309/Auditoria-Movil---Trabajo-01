package com.amazon.aps.iva.hl;
/* compiled from: PlayerRestrictionOverlay.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.restrictionoverlay.PlayerRestrictionOverlayKt$PlayerRestrictionOverlay$3$1$9", f = "PlayerRestrictionOverlay.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public final /* synthetic */ com.amazon.aps.iva.dj.f h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.amazon.aps.iva.dj.f fVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        super(2, dVar);
        this.h = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new q(this.h, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((q) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        this.h.b().b();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
