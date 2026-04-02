package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.sv.u1;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: InternalDownloadsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsManagerImpl$resumeFailedDownload$1$2$1", f = "InternalDownloadsManager.kt", l = {539}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ DownloadsManagerImpl i;
    public final /* synthetic */ e0 j;

    /* compiled from: InternalDownloadsManager.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ PlayableAsset h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PlayableAsset playableAsset) {
            super(1);
            this.h = playableAsset;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(g0 g0Var) {
            g0 g0Var2 = g0Var;
            com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$notify");
            g0Var2.A0(f0.a(com.amazon.aps.iva.ab.x.k0(this.h), e0.b.INFO_LOADED));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(DownloadsManagerImpl downloadsManagerImpl, e0 e0Var, com.amazon.aps.iva.ob0.d<? super u> dVar) {
        super(2, dVar);
        this.i = downloadsManagerImpl;
        this.j = e0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new u(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((u) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            String e = this.j.e();
            this.h = 1;
            obj = u1Var.h(e, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        PlayableAsset playableAsset = (PlayableAsset) obj;
        if (playableAsset != null) {
            downloadsManagerImpl.notify(new a(playableAsset));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
