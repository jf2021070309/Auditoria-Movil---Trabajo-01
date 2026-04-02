package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.sv.j1;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: InternalDownloadsManager.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ DownloadsManagerImpl h;
    public final /* synthetic */ PlayableAsset i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(DownloadsManagerImpl downloadsManagerImpl, PlayableAsset playableAsset) {
        super(1);
        this.h = downloadsManagerImpl;
        this.i = playableAsset;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(e0 e0Var) {
        e0 e0Var2 = e0Var;
        com.amazon.aps.iva.yb0.j.f(e0Var2, "it");
        boolean z = e0Var2 instanceof e0.c;
        PlayableAsset playableAsset = this.i;
        DownloadsManagerImpl downloadsManagerImpl = this.h;
        if (!z) {
            downloadsManagerImpl.S5(f1.J(com.amazon.aps.iva.ab.x.k0(playableAsset)), d0.h);
        } else {
            downloadsManagerImpl.k.W4(playableAsset.getId());
            downloadsManagerImpl.l.B(playableAsset.getId());
            String id = playableAsset.getId();
            com.amazon.aps.iva.se0.i.d(downloadsManagerImpl.n, downloadsManagerImpl.o.a(), null, new j1(downloadsManagerImpl, id, null), 2);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
