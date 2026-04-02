package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.ee0.f1;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;
    public final /* synthetic */ PlayableAsset i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(DownloadsManagerImpl downloadsManagerImpl, PlayableAsset playableAsset) {
        super(0);
        this.h = downloadsManagerImpl;
        this.i = playableAsset;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.S5(f1.J(com.amazon.aps.iva.ab.x.k0(this.i)), d0.h);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
