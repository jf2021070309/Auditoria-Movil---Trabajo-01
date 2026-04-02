package com.amazon.aps.iva.qo;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenPresenter.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ l h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "it");
        l lVar = this.h;
        PlayableAsset currentAsset = lVar.b.getCurrentAsset();
        if (currentAsset != null) {
            l.q6(lVar).c4(currentAsset);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
