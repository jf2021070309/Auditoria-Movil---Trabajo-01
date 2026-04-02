package com.amazon.aps.iva.sv;

import com.amazon.aps.iva.sv.v;
import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class n1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;
    public final /* synthetic */ PlayableAsset i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(DownloadsManagerImpl downloadsManagerImpl, PlayableAsset playableAsset, v.a aVar) {
        super(0);
        this.h = downloadsManagerImpl;
        this.i = playableAsset;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        DownloadsManagerImpl downloadsManagerImpl = this.h;
        LocalVideosManagerQueue localVideosManagerQueue = downloadsManagerImpl.l;
        PlayableAsset playableAsset = this.i;
        String id = playableAsset.getId();
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = this.j;
        localVideosManagerQueue.P0(id, new m1(downloadsManagerImpl, playableAsset, aVar), new l1(downloadsManagerImpl, playableAsset, aVar));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
