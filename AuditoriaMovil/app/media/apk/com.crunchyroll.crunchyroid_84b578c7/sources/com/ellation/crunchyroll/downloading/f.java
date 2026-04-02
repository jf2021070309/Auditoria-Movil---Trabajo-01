package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.sv.r0;
import com.amazon.aps.iva.sv.u1;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$addDownloadToTheQueue$2", f = "InternalDownloadsManager.kt", l = {226}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ DownloadsManagerImpl i;
    public final /* synthetic */ com.amazon.aps.iva.sw.b j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DownloadsManagerImpl downloadsManagerImpl, com.amazon.aps.iva.sw.b bVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(2, dVar);
        this.i = downloadsManagerImpl;
        this.j = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new f(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        com.amazon.aps.iva.sw.b bVar = this.j;
        DownloadsManagerImpl downloadsManagerImpl = this.i;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            u1 u1Var = downloadsManagerImpl.b;
            this.h = 1;
            if (u1Var.w(bVar, this) == aVar) {
                return aVar;
            }
        }
        downloadsManagerImpl.k.O6(bVar.b);
        downloadsManagerImpl.i.d(bVar);
        PlayableAsset playableAsset = bVar.b;
        downloadsManagerImpl.notify(new r0(f0.a(com.amazon.aps.iva.ab.x.k0(playableAsset), e0.b.INFO_LOADED)));
        downloadsManagerImpl.l.Y2(playableAsset.getId());
        return com.amazon.aps.iva.kb0.q.a;
    }
}
