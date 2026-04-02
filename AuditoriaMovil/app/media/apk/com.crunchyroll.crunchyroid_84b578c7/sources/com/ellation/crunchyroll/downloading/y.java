package com.ellation.crunchyroll.downloading;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class y extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.sw.b, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public y(DownloadsManagerImpl downloadsManagerImpl) {
        super(2, downloadsManagerImpl, DownloadsManagerImpl.class, "addDownloadToTheQueue", "addDownloadToTheQueue(Lcom/ellation/crunchyroll/downloading/todownload/ToDownload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.sw.b bVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        DownloadsManagerImpl downloadsManagerImpl = (DownloadsManagerImpl) this.receiver;
        Object g = com.amazon.aps.iva.se0.i.g(dVar, downloadsManagerImpl.o.a(), new f(downloadsManagerImpl, bVar, null));
        if (g != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        return g;
    }
}
