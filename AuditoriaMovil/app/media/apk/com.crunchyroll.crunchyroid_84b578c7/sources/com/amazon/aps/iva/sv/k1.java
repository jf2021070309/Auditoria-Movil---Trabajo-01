package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$retryDownload$1$1$1", f = "InternalDownloadsManager.kt", l = {290}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ DownloadsManagerImpl i;
    public final /* synthetic */ PlayableAsset j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(DownloadsManagerImpl downloadsManagerImpl, PlayableAsset playableAsset, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.ob0.d<? super k1> dVar) {
        super(2, dVar);
        this.i = downloadsManagerImpl;
        this.j = playableAsset;
        this.k = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new k1(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((k1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        PlayableAsset playableAsset = this.j;
        DownloadsManagerImpl downloadsManagerImpl = this.i;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            this.h = 1;
            if (downloadsManagerImpl.R3(new String[]{playableAsset.getId()}, this) == aVar) {
                return aVar;
            }
        }
        downloadsManagerImpl.S5(com.amazon.aps.iva.ee0.f1.J(com.amazon.aps.iva.ab.x.k0(playableAsset)), this.k);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
