package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.sv.u1;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$removeAllDownloads$1$1", f = "InternalDownloadsManager.kt", l = {462}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ DownloadsManagerImpl i;

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(g0 g0Var) {
            g0 g0Var2 = g0Var;
            com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$notify");
            g0Var2.t3();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(DownloadsManagerImpl downloadsManagerImpl, com.amazon.aps.iva.ob0.d<? super o> dVar) {
        super(2, dVar);
        this.i = downloadsManagerImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new o(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((o) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            if (u1Var.clear(this) == aVar) {
                return aVar;
            }
        }
        downloadsManagerImpl.i.a();
        downloadsManagerImpl.i.b();
        downloadsManagerImpl.f.a();
        downloadsManagerImpl.f.b();
        downloadsManagerImpl.g.a();
        downloadsManagerImpl.g.b();
        downloadsManagerImpl.h.a();
        downloadsManagerImpl.h.b();
        downloadsManagerImpl.notify(a.h);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
