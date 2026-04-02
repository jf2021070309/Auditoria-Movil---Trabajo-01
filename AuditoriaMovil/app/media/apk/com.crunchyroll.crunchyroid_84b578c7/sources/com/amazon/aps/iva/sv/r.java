package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DownloadsInteractorImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$restartDownload$1", f = "DownloadsInteractorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public final /* synthetic */ n h;
    public final /* synthetic */ PlayableAsset i;
    public final /* synthetic */ String j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> k;

    /* compiled from: DownloadsInteractorImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ n h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
            super(0);
            this.h = nVar;
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            n nVar = this.h;
            com.amazon.aps.iva.se0.i.d(nVar.a, nVar.e.c(), null, new q(this.i, null), 2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(n nVar, PlayableAsset playableAsset, String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.ob0.d<? super r> dVar) {
        super(2, dVar);
        this.h = nVar;
        this.i = playableAsset;
        this.j = str;
        this.k = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new r(this.h, this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((r) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        n nVar = this.h;
        nVar.c.s4(this.i, this.j, new a(nVar, this.k));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
