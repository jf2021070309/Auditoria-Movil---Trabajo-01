package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$resumeImages$1", f = "InternalDownloadsManager.kt", l = {555}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ DownloadsManagerImpl i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(DownloadsManagerImpl downloadsManagerImpl, String str, com.amazon.aps.iva.ob0.d<? super j1> dVar) {
        super(2, dVar);
        this.i = downloadsManagerImpl;
        this.j = str;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new j1(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((j1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
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
            obj = u1Var.s(this.j, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        com.amazon.aps.iva.sw.b bVar = (com.amazon.aps.iva.sw.b) obj;
        if (bVar != null) {
            downloadsManagerImpl.i.d(bVar);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
