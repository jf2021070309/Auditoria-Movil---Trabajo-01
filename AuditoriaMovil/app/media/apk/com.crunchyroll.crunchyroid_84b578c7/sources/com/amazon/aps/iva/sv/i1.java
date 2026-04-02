package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import java.util.Iterator;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$restartDownload$2$1", f = "InternalDownloadsManager.kt", l = {276}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public DownloadsManagerImpl h;
    public Iterator i;
    public int j;
    public final /* synthetic */ PlayableAsset k;
    public final /* synthetic */ DownloadsManagerImpl l;
    public final /* synthetic */ PlayableAssetVersion m;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(PlayableAsset playableAsset, DownloadsManagerImpl downloadsManagerImpl, PlayableAssetVersion playableAssetVersion, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.ob0.d<? super i1> dVar) {
        super(2, dVar);
        this.k = playableAsset;
        this.l = downloadsManagerImpl;
        this.m = playableAssetVersion;
        this.n = aVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new i1(this.k, this.l, this.m, this.n, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((i1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        DownloadsManagerImpl downloadsManagerImpl;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.j;
        DownloadsManagerImpl downloadsManagerImpl2 = this.l;
        PlayableAsset playableAsset = this.k;
        if (i != 0) {
            if (i == 1) {
                it = this.i;
                downloadsManagerImpl = this.h;
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            it = playableAsset.getVersions().iterator();
            downloadsManagerImpl = downloadsManagerImpl2;
        }
        while (it.hasNext()) {
            this.h = downloadsManagerImpl;
            this.i = it;
            this.j = 1;
            if (downloadsManagerImpl.R3(new String[]{((PlayableAssetVersion) it.next()).getAssetId()}, this) == aVar) {
                return aVar;
            }
        }
        downloadsManagerImpl2.S5(com.amazon.aps.iva.ee0.f1.J(com.amazon.aps.iva.ab.x.l0(playableAsset, this.m)), this.n);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
