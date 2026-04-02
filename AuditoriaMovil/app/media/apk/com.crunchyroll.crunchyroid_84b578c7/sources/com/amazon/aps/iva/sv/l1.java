package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class l1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.downloading.e0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;
    public final /* synthetic */ PlayableAsset i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(DownloadsManagerImpl downloadsManagerImpl, PlayableAsset playableAsset, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        super(1);
        this.h = downloadsManagerImpl;
        this.i = playableAsset;
        this.j = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.ellation.crunchyroll.downloading.e0 e0Var) {
        com.ellation.crunchyroll.downloading.e0 e0Var2 = e0Var;
        com.amazon.aps.iva.yb0.j.f(e0Var2, "localVideo");
        boolean z = e0Var2 instanceof e0.a;
        PlayableAsset playableAsset = this.i;
        DownloadsManagerImpl downloadsManagerImpl = this.h;
        if (z) {
            com.amazon.aps.iva.se0.i.d(downloadsManagerImpl.n, downloadsManagerImpl.o.a(), null, new k1(downloadsManagerImpl, playableAsset, this.j, null), 2);
        } else {
            downloadsManagerImpl.S0(playableAsset);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
