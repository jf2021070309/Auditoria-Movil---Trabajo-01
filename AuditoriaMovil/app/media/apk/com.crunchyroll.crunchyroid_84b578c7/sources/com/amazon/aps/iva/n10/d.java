package com.amazon.aps.iva.n10;

import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.n10.b;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.model.categories.Category;
import com.ellation.crunchyroll.model.categories.CategoryLocalization;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: GenreFeedInteractor.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.a implements c {
    public final EtpContentService b;
    public final com.amazon.aps.iva.l10.a c;
    public final ArrayList d;

    /* compiled from: GenreFeedInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.genres.genre.GenreFeedInteractorImpl$buildGenresFeed$2", f = "GenreFeedInteractor.kt", l = {65, 94, 94, 94}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.n10.b>>, Object> {
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public b.c.a[] l;
        public int m;
        public int n;
        public /* synthetic */ Object o;

        /* compiled from: GenreFeedInteractor.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.genres.genre.GenreFeedInteractorImpl$buildGenresFeed$2$newest$1", f = "GenreFeedInteractor.kt", l = {58}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.n10.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0526a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super b.c.a>, Object> {
            public String h;
            public com.amazon.aps.iva.a00.b i;
            public int j;
            public final /* synthetic */ d k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0526a(d dVar, com.amazon.aps.iva.ob0.d<? super C0526a> dVar2) {
                super(2, dVar2);
                this.k = dVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0526a(this.k, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super b.c.a> dVar) {
                return ((C0526a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.a00.b bVar;
                String str;
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.j;
                if (i != 0) {
                    if (i == 1) {
                        bVar = this.i;
                        str = this.h;
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.amazon.aps.iva.a00.b bVar2 = com.amazon.aps.iva.a00.b.NewlyAdded;
                    d dVar = this.k;
                    String C = d.C(dVar, bVar2);
                    this.h = C;
                    this.i = bVar2;
                    this.j = 1;
                    Object y0 = d.y0(dVar, dVar.c, bVar2, 10, this);
                    if (y0 == aVar) {
                        return aVar;
                    }
                    bVar = bVar2;
                    obj = y0;
                    str = C;
                }
                return new b.c.a(str, bVar, (com.amazon.aps.iva.n10.a) obj);
            }
        }

        /* compiled from: GenreFeedInteractor.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.genres.genre.GenreFeedInteractorImpl$buildGenresFeed$2$popular$1", f = "GenreFeedInteractor.kt", l = {47}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super b.c.a>, Object> {
            public String h;
            public com.amazon.aps.iva.a00.b i;
            public int j;
            public final /* synthetic */ d k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, com.amazon.aps.iva.ob0.d<? super b> dVar2) {
                super(2, dVar2);
                this.k = dVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new b(this.k, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super b.c.a> dVar) {
                return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.a00.b bVar;
                String str;
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.j;
                if (i != 0) {
                    if (i == 1) {
                        bVar = this.i;
                        str = this.h;
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.amazon.aps.iva.a00.b bVar2 = com.amazon.aps.iva.a00.b.Popularity;
                    d dVar = this.k;
                    String C = d.C(dVar, bVar2);
                    this.h = C;
                    this.i = bVar2;
                    this.j = 1;
                    Object y0 = d.y0(dVar, dVar.c, bVar2, 10, this);
                    if (y0 == aVar) {
                        return aVar;
                    }
                    bVar = bVar2;
                    obj = y0;
                    str = C;
                }
                return new b.c.a(str, bVar, (com.amazon.aps.iva.n10.a) obj);
            }
        }

        /* compiled from: GenreFeedInteractor.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.genres.genre.GenreFeedInteractorImpl$buildGenresFeed$2$subcategories$1$1", f = "GenreFeedInteractor.kt", l = {73}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super b.c.C0525b>, Object> {
            public String h;
            public String i;
            public int j;
            public final /* synthetic */ d k;
            public final /* synthetic */ Category l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d dVar, Category category, com.amazon.aps.iva.ob0.d<? super c> dVar2) {
                super(2, dVar2);
                this.k = dVar;
                this.l = category;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new c(this.k, this.l, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super b.c.C0525b> dVar) {
                return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                String d;
                String str;
                String tenantCategoryId;
                String str2;
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.j;
                Category category = this.l;
                if (i != 0) {
                    if (i == 1) {
                        str2 = this.i;
                        str = this.h;
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    d dVar = this.k;
                    com.amazon.aps.iva.n10.b bVar = (com.amazon.aps.iva.n10.b) com.amazon.aps.iva.lb0.x.E0(dVar.d);
                    if (bVar == null || (d = bVar.getAdapterId()) == null) {
                        d = j0.d("randomUUID().toString()");
                    }
                    str = d;
                    CategoryLocalization localization = category.getLocalization();
                    if (localization == null || (tenantCategoryId = localization.getTitle()) == null) {
                        tenantCategoryId = category.getTenantCategoryId();
                    }
                    com.amazon.aps.iva.l10.a aVar2 = dVar.c;
                    Category category2 = this.l;
                    com.amazon.aps.iva.a00.b bVar2 = com.amazon.aps.iva.a00.b.Popularity;
                    this.h = str;
                    this.i = tenantCategoryId;
                    this.j = 1;
                    Object z0 = d.z0(dVar, aVar2, category2, bVar2, 10, this);
                    if (z0 == aVar) {
                        return aVar;
                    }
                    str2 = tenantCategoryId;
                    obj = z0;
                }
                return new b.c.C0525b(str, str2, category, (com.amazon.aps.iva.n10.a) obj);
            }
        }

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.o = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.n10.b>> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x013c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0163 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x017f  */
        /* JADX WARN: Type inference failed for: r12v5, types: [com.amazon.aps.iva.se0.m0] */
        /* JADX WARN: Type inference failed for: r1v14, types: [com.amazon.aps.iva.se0.m0] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r5v3 */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 424
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.n10.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(EtpContentService etpContentService, com.amazon.aps.iva.l10.a aVar) {
        b.d dVar;
        this.b = etpContentService;
        this.c = aVar;
        b.a aVar2 = new b.a(com.amazon.aps.iva.a00.b.NewlyAdded);
        b.a aVar3 = new b.a(com.amazon.aps.iva.a00.b.Popularity);
        b.C0524b c0524b = new b.C0524b();
        String str = aVar.f;
        if (!com.amazon.aps.iva.oe0.m.b0(str)) {
            dVar = new b.d(j0.d("randomUUID().toString()"), str);
        } else {
            dVar = null;
        }
        this.d = com.amazon.aps.iva.lb0.o.O(new b[]{dVar, aVar3, aVar2, c0524b});
    }

    public static final String C(d dVar, com.amazon.aps.iva.a00.b bVar) {
        Object obj;
        String adapterId;
        b.a aVar;
        boolean z;
        Iterator it = dVar.d.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            b bVar2 = (b) next;
            if (bVar2 instanceof b.a) {
                aVar = (b.a) bVar2;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                obj = aVar.c;
            }
            if (obj == bVar) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        b bVar3 = (b) obj;
        if (bVar3 == null || (adapterId = bVar3.getAdapterId()) == null) {
            return j0.d("randomUUID().toString()");
        }
        return adapterId;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y0(com.amazon.aps.iva.n10.d r4, com.amazon.aps.iva.l10.a r5, com.amazon.aps.iva.a00.b r6, int r7, com.amazon.aps.iva.ob0.d r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof com.amazon.aps.iva.n10.e
            if (r0 == 0) goto L16
            r0 = r8
            com.amazon.aps.iva.n10.e r0 = (com.amazon.aps.iva.n10.e) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.j = r1
            goto L1b
        L16:
            com.amazon.aps.iva.n10.e r0 = new com.amazon.aps.iva.n10.e
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r8 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L46
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            com.amazon.aps.iva.ab.x.i0(r8)
            java.lang.String r5 = r5.b
            java.util.Map r6 = r6.getUrlParams()
            r0.j = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r4 = r4.b
            java.lang.Object r8 = r4.getBrowseByCategories(r5, r6, r7, r0)
            if (r8 != r1) goto L46
            goto L55
        L46:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r8 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r8
            com.amazon.aps.iva.n10.a r1 = new com.amazon.aps.iva.n10.a
            java.util.List r4 = r8.getData()
            int r5 = r8.getTotal()
            r1.<init>(r4, r5)
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.n10.d.y0(com.amazon.aps.iva.n10.d, com.amazon.aps.iva.l10.a, com.amazon.aps.iva.a00.b, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z0(com.amazon.aps.iva.n10.d r4, com.amazon.aps.iva.l10.a r5, com.ellation.crunchyroll.model.categories.Category r6, com.amazon.aps.iva.a00.b r7, int r8, com.amazon.aps.iva.ob0.d r9) {
        /*
            r4.getClass()
            boolean r0 = r9 instanceof com.amazon.aps.iva.n10.f
            if (r0 == 0) goto L16
            r0 = r9
            com.amazon.aps.iva.n10.f r0 = (com.amazon.aps.iva.n10.f) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.j = r1
            goto L1b
        L16:
            com.amazon.aps.iva.n10.f r0 = new com.amazon.aps.iva.n10.f
            r0.<init>(r4, r9)
        L1b:
            java.lang.Object r9 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L50
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            com.amazon.aps.iva.ab.x.i0(r9)
            java.lang.String r5 = r5.b
            java.lang.String r6 = r6.getTenantCategoryId()
            java.lang.String r9 = ","
            java.lang.String r5 = com.amazon.aps.iva.k.q.b(r5, r9, r6)
            java.util.Map r6 = r7.getUrlParams()
            r0.j = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r4 = r4.b
            java.lang.Object r9 = r4.getBrowseByCategories(r5, r6, r8, r0)
            if (r9 != r1) goto L50
            goto L5f
        L50:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r9 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r9
            com.amazon.aps.iva.n10.a r1 = new com.amazon.aps.iva.n10.a
            java.util.List r4 = r9.getData()
            int r5 = r9.getTotal()
            r1.<init>(r4, r5)
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.n10.d.z0(com.amazon.aps.iva.n10.d, com.amazon.aps.iva.l10.a, com.ellation.crunchyroll.model.categories.Category, com.amazon.aps.iva.a00.b, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.n10.c
    public final Object J1(com.amazon.aps.iva.ob0.d<? super List<? extends b>> dVar) {
        return com.amazon.aps.iva.e.z.p(new a(null), dVar);
    }

    @Override // com.amazon.aps.iva.n10.c
    public final ArrayList t0() {
        return this.d;
    }
}
