package com.amazon.aps.iva.tx;

import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenStreamsInteractorFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.bp.d, j {
    public final /* synthetic */ com.amazon.aps.iva.c00.b b;

    public d(com.amazon.aps.iva.c00.b bVar) {
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
        this.b.cancelRunningApiCalls();
    }

    @Override // com.amazon.aps.iva.bp.d
    public final Object x1(PlayableAsset playableAsset, boolean z, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.j<Streams, ? extends com.amazon.aps.iva.fg.d>> dVar) {
        return this.b.x1(playableAsset, z, dVar);
    }
}
