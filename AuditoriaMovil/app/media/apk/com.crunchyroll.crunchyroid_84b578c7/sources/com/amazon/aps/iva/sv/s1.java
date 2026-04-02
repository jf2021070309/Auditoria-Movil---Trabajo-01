package com.amazon.aps.iva.sv;
/* compiled from: DownloadsProvider.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsProviderImpl$verifyExpiration$1", f = "DownloadsProvider.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.downloading.e0>, Object> {
    public int h;
    public final /* synthetic */ r1 i;
    public final /* synthetic */ com.ellation.crunchyroll.downloading.e0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(r1 r1Var, com.ellation.crunchyroll.downloading.e0 e0Var, com.amazon.aps.iva.ob0.d<? super s1> dVar) {
        super(2, dVar);
        this.i = r1Var;
        this.j = e0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new s1(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.downloading.e0> dVar) {
        return ((s1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            com.amazon.aps.iva.ew.i iVar = this.i.c;
            this.h = 1;
            obj = iVar.p(this.j, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
