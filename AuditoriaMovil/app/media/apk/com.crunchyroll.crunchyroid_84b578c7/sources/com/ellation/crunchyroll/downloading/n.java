package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.sv.q0;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$onPrepareStreamsNotFound$1$1", f = "InternalDownloadsManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public final /* synthetic */ DownloadsManagerImpl h;
    public final /* synthetic */ PlayableAsset i;
    public final /* synthetic */ Throwable j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(DownloadsManagerImpl downloadsManagerImpl, PlayableAsset playableAsset, Throwable th, com.amazon.aps.iva.ob0.d<? super n> dVar) {
        super(2, dVar);
        this.h = downloadsManagerImpl;
        this.i = playableAsset;
        this.j = th;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new n(this.h, this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((n) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        com.amazon.aps.iva.xg.a k0 = com.amazon.aps.iva.ab.x.k0(this.i);
        e0.a aVar2 = new e0.a(k0.a, k0.b, k0.d, k0.c, e0.b.FAILED);
        DownloadsManagerImpl downloadsManagerImpl = this.h;
        downloadsManagerImpl.getClass();
        downloadsManagerImpl.notify(new q0(aVar2, this.j));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
