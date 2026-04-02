package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DownloadsInteractorImpl.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$retryDownload$1$1$1", f = "DownloadsInteractorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ PlayableAsset i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(com.amazon.aps.iva.xb0.l<? super PlayableAsset, com.amazon.aps.iva.kb0.q> lVar, PlayableAsset playableAsset, com.amazon.aps.iva.ob0.d<? super u> dVar) {
        super(2, dVar);
        this.h = lVar;
        this.i = playableAsset;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new u(this.h, this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((u) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        this.h.invoke(this.i);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
