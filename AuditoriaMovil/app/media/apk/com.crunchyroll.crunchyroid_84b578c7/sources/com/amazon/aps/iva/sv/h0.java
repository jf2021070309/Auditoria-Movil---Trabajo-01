package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import java.util.List;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$getDownloads$1", f = "InternalDownloadsManager.kt", l = {611}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ DownloadsManagerImpl i;
    public final /* synthetic */ String j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<? extends com.ellation.crunchyroll.downloading.e0>, com.amazon.aps.iva.kb0.q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(DownloadsManagerImpl downloadsManagerImpl, String str, com.amazon.aps.iva.xb0.l<? super List<? extends com.ellation.crunchyroll.downloading.e0>, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.ob0.d<? super h0> dVar) {
        super(2, dVar);
        this.i = downloadsManagerImpl;
        this.j = str;
        this.k = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new h0(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((h0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            this.h = 1;
            obj = DownloadsManagerImpl.f(downloadsManagerImpl, this.j, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        downloadsManagerImpl.p((List) obj, this.k);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
