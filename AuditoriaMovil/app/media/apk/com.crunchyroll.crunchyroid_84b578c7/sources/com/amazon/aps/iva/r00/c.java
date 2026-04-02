package com.amazon.aps.iva.r00;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DownloadAccessPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ com.amazon.aps.iva.pg.b i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, com.amazon.aps.iva.pg.b bVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        super(1);
        this.h = eVar;
        this.i = bVar;
        this.j = aVar;
        this.k = aVar2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(PlayableAsset playableAsset) {
        PlayableAsset playableAsset2 = playableAsset;
        com.amazon.aps.iva.yb0.j.f(playableAsset2, "matureRefreshedAsset");
        this.h.q6(playableAsset2, this.i, this.j, this.k);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
