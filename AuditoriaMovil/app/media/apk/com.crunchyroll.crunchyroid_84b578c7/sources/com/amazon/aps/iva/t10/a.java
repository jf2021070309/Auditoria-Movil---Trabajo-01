package com.amazon.aps.iva.t10;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.j8.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.r10.a0;
import com.amazon.aps.iva.r10.j0;
import com.amazon.aps.iva.r10.m0;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.model.WatchHistoryMetadata;
import com.ellation.crunchyroll.api.etp.content.model.WatchHistoryPanel;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
/* compiled from: HistoryDataSource.kt */
/* loaded from: classes2.dex */
public final class a extends f<String, a0> {
    public final p<String, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<WatchHistoryPanel, WatchHistoryMetadata>>, Object> f;
    public final d g;
    public final g0 h;
    public final com.amazon.aps.iva.xb0.a<q> i;
    public final l<e, q> j;
    public final com.amazon.aps.iva.xb0.a<q> k;
    public final j0 l;

    /* compiled from: HistoryDataSource.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.history.datasource.HistoryDataSource$loadAfter$1", f = "HistoryDataSource.kt", l = {41}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.t10.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0725a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ String j;
        public final /* synthetic */ f.a<String, a0> k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0725a(String str, f.a<String, a0> aVar, com.amazon.aps.iva.ob0.d<? super C0725a> dVar) {
            super(2, dVar);
            this.j = str;
            this.k = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new C0725a(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((C0725a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            a aVar2 = a.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    aVar2.i.invoke();
                    p<String, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<WatchHistoryPanel, WatchHistoryMetadata>>, Object> pVar = aVar2.f;
                    String str = this.j;
                    j.e(str, ImagesContract.URL);
                    this.h = 1;
                    obj = pVar.invoke(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                ContentApiResponse contentApiResponse = (ContentApiResponse) obj;
                this.k.a(((WatchHistoryMetadata) contentApiResponse.getMeta()).getNextPage(), f1.X(contentApiResponse.getData(), z.b, aVar2.l));
                aVar2.j.invoke(new e(((WatchHistoryMetadata) contentApiResponse.getMeta()).getNextPage(), contentApiResponse.getTotal()));
            } catch (IOException unused) {
                aVar2.k.invoke();
            }
            return q.a;
        }
    }

    public a(m0.a aVar, d dVar, g0 g0Var, m0.b bVar, m0.c cVar, m0.d dVar2, j0 j0Var) {
        j.f(j0Var, "selectionMode");
        this.f = aVar;
        this.g = dVar;
        this.h = g0Var;
        this.i = bVar;
        this.j = cVar;
        this.k = dVar2;
        this.l = j0Var;
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void j(f.C0407f<String> c0407f, f.a<String, a0> aVar) {
        String str = c0407f.a;
        if (str != null) {
            com.amazon.aps.iva.se0.i.d(this.h, null, null, new C0725a(str, aVar, null), 3);
            return;
        }
        aVar.a(null, z.b);
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void k(f.C0407f c0407f, f.b bVar) {
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void m(f.e eVar, f.d dVar) {
        d dVar2 = this.g;
        dVar.b(dVar2.a, null, dVar2.b);
    }
}
