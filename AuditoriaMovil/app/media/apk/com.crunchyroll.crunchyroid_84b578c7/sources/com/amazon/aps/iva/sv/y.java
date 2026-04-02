package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DownloadsInteractorImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$startDownload$1", f = "DownloadsInteractorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public final /* synthetic */ n h;
    public final /* synthetic */ com.amazon.aps.iva.xg.a i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> j;
    public final /* synthetic */ PlayableAsset k;

    /* compiled from: DownloadsInteractorImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ n h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ PlayableAsset j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(n nVar, com.amazon.aps.iva.xb0.l<? super PlayableAsset, com.amazon.aps.iva.kb0.q> lVar, PlayableAsset playableAsset) {
            super(0);
            this.h = nVar;
            this.i = lVar;
            this.j = playableAsset;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            n nVar = this.h;
            com.amazon.aps.iva.se0.i.d(nVar.a, nVar.e.c(), null, new x(this.i, this.j, null), 2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y(n nVar, com.amazon.aps.iva.xg.a aVar, com.amazon.aps.iva.xb0.l<? super PlayableAsset, com.amazon.aps.iva.kb0.q> lVar, PlayableAsset playableAsset, com.amazon.aps.iva.ob0.d<? super y> dVar) {
        super(2, dVar);
        this.h = nVar;
        this.i = aVar;
        this.j = lVar;
        this.k = playableAsset;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new y(this.h, this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((y) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        n nVar = this.h;
        nVar.c.S5(com.amazon.aps.iva.ee0.f1.J(this.i), new a(nVar, this.j, this.k));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
