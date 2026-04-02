package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class e1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<PlayableAsset, Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(DownloadsManagerImpl downloadsManagerImpl) {
        super(2);
        this.h = downloadsManagerImpl;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(PlayableAsset playableAsset, Throwable th) {
        PlayableAsset playableAsset2 = playableAsset;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(playableAsset2, "asset");
        com.amazon.aps.iva.yb0.j.f(th2, "throwable");
        DownloadsManagerImpl downloadsManagerImpl = this.h;
        com.amazon.aps.iva.se0.i.d(downloadsManagerImpl.n, downloadsManagerImpl.o.a(), null, new com.ellation.crunchyroll.downloading.n(downloadsManagerImpl, playableAsset2, th2, null), 2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
