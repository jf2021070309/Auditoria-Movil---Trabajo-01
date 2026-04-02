package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager;
/* compiled from: DownloadsInteractorImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$startUnwatched$1", f = "DownloadsInteractorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public final /* synthetic */ n h;
    public final /* synthetic */ com.amazon.aps.iva.hg.g i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.hg.g, com.amazon.aps.iva.kb0.q> j;

    /* compiled from: DownloadsInteractorImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ n h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.hg.g, com.amazon.aps.iva.kb0.q> i;
        public final /* synthetic */ com.amazon.aps.iva.hg.g j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(n nVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.hg.g, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.hg.g gVar) {
            super(0);
            this.h = nVar;
            this.i = lVar;
            this.j = gVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            n nVar = this.h;
            com.amazon.aps.iva.se0.i.d(nVar.a, nVar.e.c(), null, new z(this.i, this.j, null), 2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(n nVar, com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.hg.g, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.ob0.d<? super a0> dVar) {
        super(2, dVar);
        this.h = nVar;
        this.i = gVar;
        this.j = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new a0(this.h, this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((a0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        n nVar = this.h;
        BulkDownloadsManager bulkDownloadsManager = nVar.d;
        com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.hg.g, com.amazon.aps.iva.kb0.q> lVar = this.j;
        com.amazon.aps.iva.hg.g gVar = this.i;
        bulkDownloadsManager.g2(gVar, new a(nVar, lVar, gVar));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
