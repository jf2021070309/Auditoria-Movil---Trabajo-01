package com.amazon.aps.iva.sw;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.n0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ToDownloadInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prefetchPlayheads$2", f = "ToDownloadInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ List<com.amazon.aps.iva.xg.a> i;
    public final /* synthetic */ e j;

    /* compiled from: ToDownloadInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prefetchPlayheads$2$playheadsJob$1", f = "ToDownloadInteractor.kt", l = {216}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super Map<String, ? extends Playhead>>, Object> {
        public a0 h;
        public int i;
        public final /* synthetic */ List<com.amazon.aps.iva.xg.a> j;
        public final /* synthetic */ e k;

        /* compiled from: ToDownloadInteractor.kt */
        /* renamed from: com.amazon.aps.iva.sw.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0718a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xg.a, CharSequence> {
            public static final C0718a h = new C0718a();

            public C0718a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final CharSequence invoke(com.amazon.aps.iva.xg.a aVar) {
                com.amazon.aps.iva.xg.a aVar2 = aVar;
                com.amazon.aps.iva.yb0.j.f(aVar2, "it");
                return aVar2.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, List list, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.j = list;
            this.k = eVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.k, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super Map<String, ? extends Playhead>> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            a0 a0Var;
            IOException e;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            if (i != 0) {
                if (i == 1) {
                    a0Var = this.h;
                    try {
                        x.i0(obj);
                    } catch (IOException e2) {
                        e = e2;
                        com.amazon.aps.iva.mf0.a.a.d(e);
                        return a0Var;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                a0 a0Var2 = a0.b;
                try {
                    String B0 = com.amazon.aps.iva.lb0.x.B0(this.j, ",", null, null, C0718a.h, 30);
                    EtpContentService etpContentService = this.k.g;
                    this.h = a0Var2;
                    this.i = 1;
                    Object playheads = etpContentService.getPlayheads(B0, this);
                    if (playheads == aVar) {
                        return aVar;
                    }
                    a0Var = a0Var2;
                    obj = playheads;
                } catch (IOException e3) {
                    a0Var = a0Var2;
                    e = e3;
                    com.amazon.aps.iva.mf0.a.a.d(e);
                    return a0Var;
                }
            }
            List data = ((ContentApiResponse) obj).getData();
            int w = com.amazon.aps.iva.aq.k.w(r.Y(data));
            if (w < 16) {
                w = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(w);
            for (Object obj2 : data) {
                linkedHashMap.put(((Playhead) obj2).getContentId(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, List list, com.amazon.aps.iva.ob0.d dVar) {
        super(2, dVar);
        this.i = list;
        this.j = eVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        f fVar = new f(this.j, this.i, dVar);
        fVar.h = obj;
        return fVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((f) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        e eVar = this.j;
        List<com.amazon.aps.iva.xg.a> list = this.i;
        n0 b = com.amazon.aps.iva.se0.i.b((g0) this.h, null, null, new a(eVar, list, null), 3);
        for (com.amazon.aps.iva.xg.a aVar2 : list) {
            eVar.k.e.put(aVar2, b);
        }
        return q.a;
    }
}
