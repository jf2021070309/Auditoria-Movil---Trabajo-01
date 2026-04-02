package com.amazon.aps.iva.r00;

import android.view.View;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.presentation.download.button.DownloadButton;
/* compiled from: DownloadActionsPresenter.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<PlayableAsset, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ i h;
    public final /* synthetic */ DownloadButtonState i;
    public final /* synthetic */ View j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar, DownloadButtonState downloadButtonState, DownloadButton downloadButton) {
        super(1);
        this.h = iVar;
        this.i = downloadButtonState;
        this.j = downloadButton;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(PlayableAsset playableAsset) {
        PlayableAsset playableAsset2 = playableAsset;
        com.amazon.aps.iva.yb0.j.f(playableAsset2, "it");
        this.h.r6(playableAsset2, this.i, this.j);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
