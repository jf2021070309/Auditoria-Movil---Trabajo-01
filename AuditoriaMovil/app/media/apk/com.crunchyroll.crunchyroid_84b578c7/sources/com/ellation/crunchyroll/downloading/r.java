package com.ellation.crunchyroll.downloading;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$resumeAllDownloads$1$1", f = "InternalDownloadsManager.kt", l = {515}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ DownloadsManagerImpl i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(DownloadsManagerImpl downloadsManagerImpl, com.amazon.aps.iva.ob0.d<? super r> dVar) {
        super(2, dVar);
        this.i = downloadsManagerImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new r(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((r) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
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
            downloadsManagerImpl.l.f6(null);
            this.h = 1;
            Object g = com.amazon.aps.iva.se0.i.g(this, downloadsManagerImpl.o.a(), new w(downloadsManagerImpl, null));
            if (g != obj2) {
                g = com.amazon.aps.iva.kb0.q.a;
            }
            if (g == obj2) {
                return obj2;
            }
        }
        downloadsManagerImpl.getClass();
        downloadsManagerImpl.l.Z(new v(downloadsManagerImpl));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
