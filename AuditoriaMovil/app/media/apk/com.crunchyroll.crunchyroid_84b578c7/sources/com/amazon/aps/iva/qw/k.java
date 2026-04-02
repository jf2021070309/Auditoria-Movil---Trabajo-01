package com.amazon.aps.iva.qw;

import com.amazon.aps.iva.qw.g;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: SubtitlesDownloader.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g.a, Boolean> {
    public final /* synthetic */ PlayableAsset h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PlayableAsset playableAsset) {
        super(1);
        this.h = playableAsset;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(g.a aVar) {
        g.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "metadata");
        return Boolean.valueOf(com.amazon.aps.iva.yb0.j.a(aVar2.e, this.h.getId()));
    }
}
