package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class h1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<PlayableAsset, Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ DownloadsManagerImpl i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(DownloadsManagerImpl downloadsManagerImpl, com.ellation.crunchyroll.downloading.queue.j jVar) {
        super(2);
        this.h = jVar;
        this.i = downloadsManagerImpl;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(PlayableAsset playableAsset, Throwable th) {
        PlayableAsset playableAsset2 = playableAsset;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(playableAsset2, "asset");
        com.amazon.aps.iva.yb0.j.f(th2, "e");
        this.h.invoke(th2);
        this.i.r.invoke(playableAsset2, th2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
