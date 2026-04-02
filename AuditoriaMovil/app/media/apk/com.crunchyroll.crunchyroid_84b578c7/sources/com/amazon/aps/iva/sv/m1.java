package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class m1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;
    public final /* synthetic */ PlayableAsset i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(DownloadsManagerImpl downloadsManagerImpl, PlayableAsset playableAsset, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        super(0);
        this.h = downloadsManagerImpl;
        this.i = playableAsset;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.S5(com.amazon.aps.iva.ee0.f1.J(com.amazon.aps.iva.ab.x.k0(this.i)), this.j);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
