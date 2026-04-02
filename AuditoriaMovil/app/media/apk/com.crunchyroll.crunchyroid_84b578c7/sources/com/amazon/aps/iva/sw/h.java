package com.amazon.aps.iva.sw;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EmptyMeta;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ToDownloadInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prepareDataToDownload$4", f = "ToDownloadInteractor.kt", l = {262, 267, 269, 278, 280, 281}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.sw.b>, Object> {
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ com.amazon.aps.iva.xg.a p;
    public final /* synthetic */ com.amazon.aps.iva.sw.e q;

    /* compiled from: ToDownloadInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prepareDataToDownload$4$1$1", f = "ToDownloadInteractor.kt", l = {235}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<Season, EmptyMeta>>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.sw.e i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.sw.e eVar, String str, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = eVar;
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<Season, EmptyMeta>> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                EtpContentService etpContentService = this.i.g;
                this.h = 1;
                obj = etpContentService.getSeason(this.j, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: ToDownloadInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prepareDataToDownload$4$assetsJob$1", f = "ToDownloadInteractor.kt", l = {243}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super List<? extends PlayableAsset>>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.sw.e i;
        public final /* synthetic */ com.amazon.aps.iva.xg.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.xg.a aVar, com.amazon.aps.iva.sw.e eVar, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.i = eVar;
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super List<? extends PlayableAsset>> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                EtpContentService etpContentService = this.i.g;
                com.amazon.aps.iva.xg.a aVar2 = this.j;
                String str = aVar2.b;
                String str2 = aVar2.d;
                t tVar = aVar2.c;
                this.h = 1;
                obj = EtpContentServiceKt.loadAssets(etpContentService, str, str2, tVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: ToDownloadInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prepareDataToDownload$4$contentJob$1", f = "ToDownloadInteractor.kt", l = {253}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super ContentContainer>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.sw.e i;
        public final /* synthetic */ com.amazon.aps.iva.xg.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.xg.a aVar, com.amazon.aps.iva.sw.e eVar, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.i = eVar;
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(this.j, this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super ContentContainer> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                EtpContentService etpContentService = this.i.g;
                com.amazon.aps.iva.xg.a aVar2 = this.j;
                String str = aVar2.b;
                t tVar = aVar2.c;
                this.h = 1;
                obj = EtpContentServiceKt.loadContentContainer(etpContentService, str, tVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: ToDownloadInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prepareDataToDownload$4$panelJob$1", f = "ToDownloadInteractor.kt", l = {257}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super Panel>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.sw.e i;
        public final /* synthetic */ com.amazon.aps.iva.xg.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.xg.a aVar, com.amazon.aps.iva.sw.e eVar, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.i = eVar;
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(this.j, this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super Panel> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                EtpContentService etpContentService = this.i.g;
                String str = this.j.b;
                this.h = 1;
                obj = EtpContentService.DefaultImpls.getPanels$default(etpContentService, str, null, this, 2, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.lb0.x.t0(((ContentApiResponse) obj).getData());
        }
    }

    /* compiled from: ToDownloadInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prepareDataToDownload$4$playheadSource$1", f = "ToDownloadInteractor.kt", l = {272}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super Map<String, ? extends Playhead>>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ com.amazon.aps.iva.sw.e j;
        public final /* synthetic */ com.amazon.aps.iva.xg.a k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.xg.a aVar, com.amazon.aps.iva.sw.e eVar, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.j = eVar;
            this.k = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            e eVar = new e(this.k, this.j, dVar);
            eVar.i = obj;
            return eVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super Map<String, ? extends Playhead>> dVar) {
            return ((e) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.amazon.aps.iva.kb0.k$a] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.util.LinkedHashMap, java.util.Map] */
        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            ?? H;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    g0 g0Var = (g0) this.i;
                    com.amazon.aps.iva.sw.e eVar = this.j;
                    com.amazon.aps.iva.xg.a aVar2 = this.k;
                    EtpContentService etpContentService = eVar.g;
                    String str = aVar2.a;
                    this.h = 1;
                    obj = etpContentService.getPlayheads(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                List data = ((ContentApiResponse) obj).getData();
                int w = com.amazon.aps.iva.aq.k.w(r.Y(data));
                if (w < 16) {
                    w = 16;
                }
                H = new LinkedHashMap(w);
                for (Object obj2 : data) {
                    H.put(((Playhead) obj2).getContentId(), obj2);
                }
            } catch (Throwable th) {
                H = x.H(th);
            }
            if (H instanceof k.a) {
                return null;
            }
            return H;
        }
    }

    /* compiled from: ToDownloadInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.todownload.ToDownloadInteractorImpl$prepareDataToDownload$4$seasonsJob$1", f = "ToDownloadInteractor.kt", l = {248}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<Season, EmptyMeta>>, Object> {
        public ContentApiResponse.Companion h;
        public int i;
        public final /* synthetic */ com.amazon.aps.iva.xg.a j;
        public final /* synthetic */ com.amazon.aps.iva.sw.e k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.xg.a aVar, com.amazon.aps.iva.sw.e eVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(2, dVar);
            this.j = aVar;
            this.k = eVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new f(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<Season, EmptyMeta>> dVar) {
            return ((f) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            ContentApiResponse.Companion companion;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            if (i != 0) {
                if (i == 1) {
                    companion = this.h;
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.xg.a aVar2 = this.j;
                if (aVar2.d != null) {
                    ContentApiResponse.Companion companion2 = ContentApiResponse.Companion;
                    EtpContentService etpContentService = this.k.g;
                    this.h = companion2;
                    this.i = 1;
                    obj = etpContentService.getSeasons(aVar2.b, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    companion = companion2;
                }
                return ContentApiResponse.Companion.create((List) z.b);
            }
            ContentApiResponse create = companion.create(((ContentApiResponse) obj).getData());
            if (create != null) {
                return create;
            }
            return ContentApiResponse.Companion.create((List) z.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.amazon.aps.iva.xg.a aVar, com.amazon.aps.iva.sw.e eVar, com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(2, dVar);
        this.p = aVar;
        this.q = eVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        h hVar = new h(this.p, this.q, dVar);
        hVar.o = obj;
        return hVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.sw.b> dVar) {
        return ((h) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030c A[LOOP:0: B:86:0x0306->B:88:0x030c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032f A[LOOP:1: B:90:0x0329->B:92:0x032f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026c A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sw.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
