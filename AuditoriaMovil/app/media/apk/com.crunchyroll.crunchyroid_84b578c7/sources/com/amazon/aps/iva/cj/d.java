package com.amazon.aps.iva.cj;
/* compiled from: FullyWatchedMonitor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.FullyWatchedMonitor$3", f = "FullyWatchedMonitor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.kb0.j<? extends String, ? extends Boolean>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(2, dVar);
        this.i = gVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        d dVar2 = new d(this.i, dVar);
        dVar2.h = obj;
        return dVar2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.kb0.j<? extends String, ? extends Boolean> jVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((d) create(jVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        if (((Boolean) ((com.amazon.aps.iva.kb0.j) this.h).c).booleanValue()) {
            this.i.a.c();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
