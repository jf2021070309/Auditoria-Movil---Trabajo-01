package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DownloadsInteractorImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$getPlayableAsset$1", f = "DownloadsInteractorImpl.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ n i;
    public final /* synthetic */ String j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> k;

    /* compiled from: DownloadsInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$getPlayableAsset$1$1$1", f = "DownloadsInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ PlayableAsset i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.l<? super PlayableAsset, com.amazon.aps.iva.kb0.q> lVar, PlayableAsset playableAsset, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.h = lVar;
            this.i = playableAsset;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.h, this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            this.h.invoke(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(n nVar, String str, com.amazon.aps.iva.xb0.l<? super PlayableAsset, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.ob0.d<? super p> dVar) {
        super(2, dVar);
        this.i = nVar;
        this.j = str;
        this.k = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new p(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((p) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        n nVar = this.i;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            InternalDownloadsManager internalDownloadsManager = nVar.c;
            this.h = 1;
            obj = internalDownloadsManager.h(this.j, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        PlayableAsset playableAsset = (PlayableAsset) obj;
        if (playableAsset != null) {
            com.amazon.aps.iva.se0.i.d(nVar.a, nVar.e.c(), null, new a(this.k, playableAsset, null), 2);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
