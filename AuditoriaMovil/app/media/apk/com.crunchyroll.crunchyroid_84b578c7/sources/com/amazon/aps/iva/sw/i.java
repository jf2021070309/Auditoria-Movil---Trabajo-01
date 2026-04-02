package com.amazon.aps.iva.sw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: ToDownloadInteractor.kt */
/* loaded from: classes2.dex */
public final class i extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<PlayableAsset, Streams, Stream, q> h;
    public final /* synthetic */ PlayableAsset i;
    public final /* synthetic */ Streams j;
    public final /* synthetic */ Stream k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(com.amazon.aps.iva.xb0.q<? super PlayableAsset, ? super Streams, ? super Stream, q> qVar, PlayableAsset playableAsset, Streams streams, Stream stream) {
        super(0);
        this.h = qVar;
        this.i = playableAsset;
        this.j = streams;
        this.k = stream;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.invoke(this.i, this.j, this.k);
        return q.a;
    }
}
