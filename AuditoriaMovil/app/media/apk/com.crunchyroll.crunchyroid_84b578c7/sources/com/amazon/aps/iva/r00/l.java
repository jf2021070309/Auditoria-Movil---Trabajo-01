package com.amazon.aps.iva.r00;

import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DownloadActionsPresenter.kt */
/* loaded from: classes2.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ i h;
    public final /* synthetic */ PlayableAsset i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, PlayableAsset playableAsset) {
        super(0);
        this.h = iVar;
        this.i = playableAsset;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.b.N0(this.i.getId());
        return com.amazon.aps.iva.kb0.q.a;
    }
}
