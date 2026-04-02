package com.amazon.aps.iva.d10;

import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.t1;
import com.ellation.crunchyroll.downloading.e0;
import java.util.List;
/* compiled from: AsyncDownloadPanelFetcher.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.downloads.AsyncDownloadPanelFetcherImpl$getDownloadPanels$2$1", f = "AsyncDownloadPanelFetcher.kt", l = {55, 56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ f i;
    public final /* synthetic */ List<e0> j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<i>, com.amazon.aps.iva.kb0.q> k;

    /* compiled from: AsyncDownloadPanelFetcher.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.downloads.AsyncDownloadPanelFetcherImpl$getDownloadPanels$2$1$1", f = "AsyncDownloadPanelFetcher.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<List<i>, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ List<i> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.xb0.l lVar) {
            super(2, dVar);
            this.h = lVar;
            this.i = list;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, dVar, this.h);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            this.h.invoke(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(f fVar, List<? extends e0> list, com.amazon.aps.iva.xb0.l<? super List<i>, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(2, dVar);
        this.i = fVar;
        this.j = list;
        this.k = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new c(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        f fVar = this.i;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    return com.amazon.aps.iva.kb0.q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.amazon.aps.iva.ab.x.i0(obj);
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            this.h = 1;
            obj = f.a(fVar, this.j, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        t1 c = fVar.d.c();
        a aVar2 = new a((List) obj, null, this.k);
        this.h = 2;
        if (com.amazon.aps.iva.se0.i.g(this, c, aVar2) == aVar) {
            return aVar;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
