package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.sv.u1;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$loadVideoStreamUrl$1$1$1$1", f = "InternalDownloadsManager.kt", l = {262}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ DownloadsManagerImpl i;
    public final /* synthetic */ PlayableAsset j;
    public final /* synthetic */ Streams k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Stream, com.amazon.aps.iva.kb0.q> l;
    public final /* synthetic */ Stream m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(DownloadsManagerImpl downloadsManagerImpl, PlayableAsset playableAsset, Streams streams, com.amazon.aps.iva.xb0.l<? super Stream, com.amazon.aps.iva.kb0.q> lVar, Stream stream, com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(2, dVar);
        this.i = downloadsManagerImpl;
        this.j = playableAsset;
        this.k = streams;
        this.l = lVar;
        this.m = stream;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new h(this.i, this.j, this.k, this.l, this.m, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((h) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            u1 u1Var = this.i.b;
            this.h = 1;
            if (u1Var.k(this.j, this.k, this) == aVar) {
                return aVar;
            }
        }
        this.l.invoke(this.m);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
