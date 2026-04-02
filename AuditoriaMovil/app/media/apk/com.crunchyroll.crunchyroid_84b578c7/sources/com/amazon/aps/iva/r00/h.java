package com.amazon.aps.iva.r00;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DownloadActionsPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(PlayableAsset playableAsset) {
        PlayableAsset playableAsset2 = playableAsset;
        com.amazon.aps.iva.yb0.j.f(playableAsset2, "it");
        i.q6(this.h, playableAsset2, playableAsset2.getAudioLocale());
        return com.amazon.aps.iva.kb0.q.a;
    }
}
