package com.amazon.aps.iva.o40;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ShowContentInteractor.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.wy.i implements com.amazon.aps.iva.o40.c {
    public final j b;
    public final EtpContentService c;
    public final com.amazon.aps.iva.qu.a d;
    public ContentContainer e;
    public com.amazon.aps.iva.l40.f f;
    public final com.amazon.aps.iva.ze0.d g;
    public final com.amazon.aps.iva.wu.e<List<String>, Map<String, Playhead>> h;

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.ShowContentInteractorImpl$getEpisodes$2", f = "ShowContentInteractor.kt", l = {132}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements l<com.amazon.aps.iva.ob0.d<? super List<? extends PlayableAsset>>, Object> {
        public int h;
        public final /* synthetic */ Season j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Season season, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(1, dVar);
            this.j = season;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(com.amazon.aps.iva.ob0.d<? super List<? extends PlayableAsset>> dVar) {
            return ((a) create(dVar)).invokeSuspend(q.a);
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
                EtpContentService etpContentService = h.this.c;
                String id = this.j.getId();
                this.h = 1;
                obj = etpContentService.getEpisodes(id, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return ((ContentApiResponse) obj).getData();
        }
    }

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.ShowContentInteractorImpl$getMovies$2", f = "ShowContentInteractor.kt", l = {136}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements l<com.amazon.aps.iva.ob0.d<? super List<? extends PlayableAsset>>, Object> {
        public int h;
        public final /* synthetic */ ContentContainer j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ContentContainer contentContainer, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(1, dVar);
            this.j = contentContainer;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(com.amazon.aps.iva.ob0.d<? super List<? extends PlayableAsset>> dVar) {
            return ((b) create(dVar)).invokeSuspend(q.a);
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
                EtpContentService etpContentService = h.this.c;
                String id = this.j.getId();
                this.h = 1;
                obj = etpContentService.getMovies(id, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return ((ContentApiResponse) obj).getData();
        }
    }

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.ShowContentInteractorImpl$getPlayheads$2", f = "ShowContentInteractor.kt", l = {179}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements l<com.amazon.aps.iva.ob0.d<? super Map<String, ? extends Playhead>>, Object> {
        public int h;
        public final /* synthetic */ String[] j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String[] strArr, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(1, dVar);
            this.j = strArr;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(com.amazon.aps.iva.ob0.d<? super Map<String, ? extends Playhead>> dVar) {
            return ((c) create(dVar)).invokeSuspend(q.a);
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
                EtpContentService etpContentService = h.this.c;
                String V = o.V(this.j, ",", null, null, null, 62);
                this.h = 1;
                obj = etpContentService.getPlayheads(V, this);
                if (obj == aVar) {
                    return aVar;
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

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.ShowContentInteractorImpl", f = "ShowContentInteractor.kt", l = {125}, m = "getSeasons")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public h h;
        public /* synthetic */ Object i;
        public int k;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return h.this.g1(null, this);
        }
    }

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.ShowContentInteractorImpl", f = "ShowContentInteractor.kt", l = {140, 145}, m = "getUpNext")
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public /* synthetic */ Object i;
        public int k;

        public e(com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return h.this.t(this);
        }
    }

    public h(j jVar, EtpContentService etpContentService, com.amazon.aps.iva.qu.b bVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "input");
        this.b = jVar;
        this.c = etpContentService;
        this.d = bVar;
        this.g = t.d();
        this.h = new com.amazon.aps.iva.wu.e<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r6 == r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[LOOP:0: B:21:0x005f->B:23:0x0065, LOOP_END] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.amazon.aps.iva.pb0.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.LinkedHashMap, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m(com.amazon.aps.iva.o40.h r4, java.lang.String[] r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.amazon.aps.iva.o40.i
            if (r0 == 0) goto L16
            r0 = r6
            com.amazon.aps.iva.o40.i r0 = (com.amazon.aps.iva.o40.i) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.j = r1
            goto L1b
        L16:
            com.amazon.aps.iva.o40.i r0 = new com.amazon.aps.iva.o40.i
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L47
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            com.amazon.aps.iva.ab.x.i0(r6)
            int r6 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r0.j = r3
            com.amazon.aps.iva.qu.a r4 = r4.d
            java.lang.Object r6 = r4.Z(r5, r0)
            if (r6 != r1) goto L47
            goto L74
        L47:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            int r4 = com.amazon.aps.iva.lb0.r.Y(r6)
            int r4 = com.amazon.aps.iva.aq.k.w(r4)
            r5 = 16
            if (r4 >= r5) goto L56
            r4 = r5
        L56:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r4)
            java.util.Iterator r4 = r6.iterator()
        L5f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L74
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.ellation.crunchyroll.api.etp.commenting.model.Guestbook r6 = (com.ellation.crunchyroll.api.etp.commenting.model.Guestbook) r6
            java.lang.String r6 = r6.getGuestbookKey()
            r1.put(r6, r5)
            goto L5f
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o40.h.m(com.amazon.aps.iva.o40.h, java.lang.String[], com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    @Override // com.amazon.aps.iva.o40.c
    public final Object b1(Season season, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.e00.a> dVar) {
        return z.p(new f(new a(season, null), this, null), (com.amazon.aps.iva.qb0.c) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:24:0x0054, B:26:0x0058), top: B:39:0x0054 }] */
    @Override // com.amazon.aps.iva.o40.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(com.amazon.aps.iva.ob0.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.o40.g
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.o40.g r0 = (com.amazon.aps.iva.o40.g) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.o40.g r0 = new com.amazon.aps.iva.o40.g
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            com.amazon.aps.iva.ze0.c r1 = r0.i
            com.amazon.aps.iva.o40.h r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.lang.Throwable -> L2f
            goto L6f
        L2f:
            r9 = move-exception
            goto L78
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            com.amazon.aps.iva.ze0.c r2 = r0.i
            com.amazon.aps.iva.o40.h r4 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L54
        L41:
            com.amazon.aps.iva.ab.x.i0(r9)
            r0.h = r8
            com.amazon.aps.iva.ze0.d r2 = r8.g
            r0.i = r2
            r0.l = r4
            java.lang.Object r9 = r2.a(r5, r0)
            if (r9 != r1) goto L53
            return r1
        L53:
            r4 = r8
        L54:
            com.ellation.crunchyroll.model.ContentContainer r9 = r4.e     // Catch: java.lang.Throwable -> L7a
            if (r9 != 0) goto L7c
            com.ellation.crunchyroll.api.etp.content.EtpContentService r9 = r4.c     // Catch: java.lang.Throwable -> L7a
            com.amazon.aps.iva.o40.j r6 = r4.b     // Catch: java.lang.Throwable -> L7a
            java.lang.String r7 = r6.b     // Catch: java.lang.Throwable -> L7a
            com.amazon.aps.iva.x50.t r6 = r6.c     // Catch: java.lang.Throwable -> L7a
            r0.h = r4     // Catch: java.lang.Throwable -> L7a
            r0.i = r2     // Catch: java.lang.Throwable -> L7a
            r0.l = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r9 = com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt.loadContentContainer(r9, r7, r6, r0)     // Catch: java.lang.Throwable -> L7a
            if (r9 != r1) goto L6d
            return r1
        L6d:
            r1 = r2
            r0 = r4
        L6f:
            r2 = r9
            com.ellation.crunchyroll.model.ContentContainer r2 = (com.ellation.crunchyroll.model.ContentContainer) r2     // Catch: java.lang.Throwable -> L2f
            r0.e = r2     // Catch: java.lang.Throwable -> L2f
            com.ellation.crunchyroll.model.ContentContainer r9 = (com.ellation.crunchyroll.model.ContentContainer) r9     // Catch: java.lang.Throwable -> L2f
            r2 = r1
            goto L7c
        L78:
            r2 = r1
            goto L80
        L7a:
            r9 = move-exception
            goto L80
        L7c:
            r2.d(r5)
            return r9
        L80:
            r2.d(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o40.h.f(com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    @Override // com.amazon.aps.iva.o40.c
    public final Object g(ContentContainer contentContainer, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.e00.a> dVar) {
        return z.p(new f(new b(contentContainer, null), this, null), (com.amazon.aps.iva.qb0.c) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.amazon.aps.iva.o40.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g1(com.ellation.crunchyroll.model.Series r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.l40.f> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.o40.h.d
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.o40.h$d r0 = (com.amazon.aps.iva.o40.h.d) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.o40.h$d r0 = new com.amazon.aps.iva.o40.h$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.o40.h r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.l40.f r6 = r4.f
            if (r6 == 0) goto L39
            goto L5f
        L39:
            java.lang.String r5 = r5.getId()
            r0.h = r4
            r0.k = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r4.c
            java.lang.Object r6 = r6.getSeasons(r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r5 = r4
        L4b:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r6 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r6
            com.amazon.aps.iva.l40.f r0 = new com.amazon.aps.iva.l40.f
            java.util.List r1 = r6.getData()
            java.lang.Object r6 = r6.getMeta()
            com.ellation.crunchyroll.api.cms.model.SeasonsMetadata r6 = (com.ellation.crunchyroll.api.cms.model.SeasonsMetadata) r6
            r0.<init>(r1, r6)
            r5.f = r0
            r6 = r0
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o40.h.g1(com.ellation.crunchyroll.model.Series, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.o40.c
    public final j getInput() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.o40.c
    public final Object n(String str, com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar) {
        return EtpContentServiceKt.loadAsset(this.c, str, this.b.c, dVar);
    }

    @Override // com.amazon.aps.iva.o40.c
    public final Object o(String[] strArr, com.amazon.aps.iva.ob0.d<? super Map<String, Playhead>> dVar) {
        return this.h.a(m.B(strArr), dVar, new c(strArr, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // com.amazon.aps.iva.o40.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o00.e> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.amazon.aps.iva.o40.h.e
            if (r0 == 0) goto L13
            r0 = r10
            com.amazon.aps.iva.o40.h$e r0 = (com.amazon.aps.iva.o40.h.e) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.o40.h$e r0 = new com.amazon.aps.iva.o40.h$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.h
            com.ellation.crunchyroll.model.UpNext r0 = (com.ellation.crunchyroll.model.UpNext) r0
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L81
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            java.lang.Object r2 = r0.h
            com.amazon.aps.iva.o40.h r2 = (com.amazon.aps.iva.o40.h) r2
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L55
        L3e:
            com.amazon.aps.iva.ab.x.i0(r10)
            com.amazon.aps.iva.o40.j r10 = r9.b
            com.amazon.aps.iva.x50.t r2 = r10.c
            r0.h = r9
            r0.k = r4
            com.ellation.crunchyroll.api.etp.content.EtpContentService r4 = r9.c
            java.lang.String r10 = r10.b
            java.lang.Object r10 = com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt.getContainerUpNext(r4, r2, r10, r0)
            if (r10 != r1) goto L54
            return r1
        L54:
            r2 = r9
        L55:
            com.amazon.aps.iva.jf0.a0 r10 = (com.amazon.aps.iva.jf0.a0) r10
            T r10 = r10.b
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r10 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r10
            if (r10 == 0) goto L99
            java.util.List r10 = r10.getData()
            if (r10 == 0) goto L99
            java.lang.Object r10 = com.amazon.aps.iva.lb0.x.t0(r10)
            com.ellation.crunchyroll.model.UpNext r10 = (com.ellation.crunchyroll.model.UpNext) r10
            if (r10 == 0) goto L99
            com.ellation.crunchyroll.model.Panel r4 = r10.getPanel()
            java.lang.String r4 = r4.getId()
            r0.h = r10
            r0.k = r3
            java.lang.Object r0 = r2.n(r4, r0)
            if (r0 != r1) goto L7e
            return r1
        L7e:
            r8 = r0
            r0 = r10
            r10 = r8
        L81:
            r2 = r10
            com.ellation.crunchyroll.model.PlayableAsset r2 = (com.ellation.crunchyroll.model.PlayableAsset) r2
            com.amazon.aps.iva.o00.e r10 = new com.amazon.aps.iva.o00.e
            boolean r3 = r0.getNeverWatched()
            boolean r4 = r0.getFullyWatched()
            long r5 = r0.getPlayheadSec()
            r7 = 8
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r7)
            return r10
        L99:
            com.amazon.aps.iva.bp.a r10 = new com.amazon.aps.iva.bp.a
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o40.h.t(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.o40.c
    public final void u() {
        this.e = null;
    }
}
