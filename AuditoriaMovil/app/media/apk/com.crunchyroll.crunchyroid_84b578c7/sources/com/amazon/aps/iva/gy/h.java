package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EmptyMeta;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.HomeFeedItemResourceType;
import com.ellation.crunchyroll.api.model.HomeFeedItemResponseType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: HomeFeedInteractor.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.wy.a implements g {
    public final Map<m, l> b;
    public final com.amazon.aps.iva.xb0.a<Boolean> c;
    public final com.amazon.aps.iva.xb0.q<Integer, Integer, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>>, Object> d;
    public final boolean e;
    public final com.amazon.aps.iva.vx.a f;
    public int h;
    public int i;
    public final ArrayList g = new ArrayList();
    public boolean j = true;

    /* compiled from: HomeFeedInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.HomeFeedInteractorImpl", f = "HomeFeedInteractor.kt", l = {77, 95}, m = "loadNextPage")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public h h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return h.this.e1(this);
        }
    }

    /* compiled from: HomeFeedInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.HomeFeedInteractorImpl$loadNextPage$2", f = "HomeFeedInteractor.kt", l = {116, 117}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super List<com.amazon.aps.iva.xx.l>>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ n j;
        public final /* synthetic */ h k;

        /* compiled from: HomeFeedInteractor.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.HomeFeedInteractorImpl$loadNextPage$2$feedContentJobs$1$1", f = "HomeFeedInteractor.kt", l = {106}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l>, Object> {
            public int h;
            public final /* synthetic */ h i;
            public final /* synthetic */ HomeFeedItemRaw j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, HomeFeedItemRaw homeFeedItemRaw, com.amazon.aps.iva.ob0.d<? super a> dVar) {
                super(2, dVar);
                this.i = hVar;
                this.j = homeFeedItemRaw;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new a(this.i, this.j, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> dVar) {
                return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                HomeFeedItemRaw homeFeedItemRaw = this.j;
                h hVar = this.i;
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    Map<m, l> map = hVar.b;
                    com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "<this>");
                    l lVar = map.get(new m(homeFeedItemRaw.getResourceType(), homeFeedItemRaw.getResponseType()));
                    if (lVar != null) {
                        int indexOf = hVar.g.indexOf(homeFeedItemRaw);
                        this.h = 1;
                        obj = lVar.D1(homeFeedItemRaw, indexOf, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return null;
                }
                return (com.amazon.aps.iva.xx.l) obj;
            }
        }

        /* compiled from: HomeFeedInteractor.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.HomeFeedInteractorImpl$loadNextPage$2$panelsContentJob$1", f = "HomeFeedInteractor.kt", l = {98}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.gy.h$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0313b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.xx.l>>, Object> {
            public int h;
            public final /* synthetic */ h i;
            public final /* synthetic */ n j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0313b(h hVar, n nVar, com.amazon.aps.iva.ob0.d<? super C0313b> dVar) {
                super(2, dVar);
                this.i = hVar;
                this.j = nVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0313b(this.i, this.j, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.xx.l>> dVar) {
                return ((C0313b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            com.amazon.aps.iva.ab.x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        h hVar = this.i;
                        n nVar = this.j;
                        this.h = 1;
                        obj = h.C(hVar, nVar, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return (List) obj;
                } catch (IOException unused) {
                    return z.b;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, n nVar, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.j = nVar;
            this.k = hVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(this.k, this.j, dVar);
            bVar.i = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super List<com.amazon.aps.iva.xx.l>> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 500
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: HomeFeedInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.HomeFeedInteractorImpl", f = "HomeFeedInteractor.kt", l = {146}, m = "loadPage")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return h.this.y0(this);
        }
    }

    public h(LinkedHashMap linkedHashMap, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.q qVar, boolean z, com.amazon.aps.iva.vx.a aVar2) {
        this.b = linkedHashMap;
        this.c = aVar;
        this.d = qVar;
        this.e = z;
        this.f = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(com.amazon.aps.iva.gy.h r8, com.amazon.aps.iva.gy.n r9, com.amazon.aps.iva.ob0.d r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof com.amazon.aps.iva.gy.i
            if (r0 == 0) goto L16
            r0 = r10
            com.amazon.aps.iva.gy.i r0 = (com.amazon.aps.iva.gy.i) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.j = r1
            goto L1b
        L16:
            com.amazon.aps.iva.gy.i r0 = new com.amazon.aps.iva.gy.i
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L8f
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            com.amazon.aps.iva.ab.x.i0(r10)
            com.amazon.aps.iva.gy.m r10 = new com.amazon.aps.iva.gy.m
            com.ellation.crunchyroll.api.model.HomeFeedItemResourceType r2 = com.ellation.crunchyroll.api.model.HomeFeedItemResourceType.PANEL
            com.ellation.crunchyroll.api.model.HomeFeedItemResponseType r4 = com.ellation.crunchyroll.api.model.HomeFeedItemResponseType.UNDEFINED
            r10.<init>(r2, r4)
            java.util.Map<com.amazon.aps.iva.gy.m, com.amazon.aps.iva.gy.l> r2 = r8.b
            java.lang.Object r10 = r2.get(r10)
            boolean r2 = r10 instanceof com.amazon.aps.iva.gy.v
            r4 = 0
            if (r2 == 0) goto L4c
            com.amazon.aps.iva.gy.v r10 = (com.amazon.aps.iva.gy.v) r10
            goto L4d
        L4c:
            r10 = r4
        L4d:
            if (r10 == 0) goto L96
            java.util.List r9 = r9.a()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L5e:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L7c
            java.lang.Object r5 = r9.next()
            r6 = r5
            com.ellation.crunchyroll.api.model.HomeFeedItemRaw r6 = (com.ellation.crunchyroll.api.model.HomeFeedItemRaw) r6
            com.ellation.crunchyroll.api.model.HomeFeedItemResourceType r6 = r6.getResourceType()
            com.ellation.crunchyroll.api.model.HomeFeedItemResourceType r7 = com.ellation.crunchyroll.api.model.HomeFeedItemResourceType.PANEL
            if (r6 != r7) goto L75
            r6 = r3
            goto L76
        L75:
            r6 = 0
        L76:
            if (r6 == 0) goto L5e
            r2.add(r5)
            goto L5e
        L7c:
            com.amazon.aps.iva.gy.j r9 = new com.amazon.aps.iva.gy.j
            r9.<init>(r8)
            r0.j = r3
            com.amazon.aps.iva.gy.w r8 = new com.amazon.aps.iva.gy.w
            r8.<init>(r2, r10, r9, r4)
            java.lang.Object r10 = com.amazon.aps.iva.e.z.p(r8, r0)
            if (r10 != r1) goto L8f
            goto L99
        L8f:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L94
            goto L96
        L94:
            r1 = r10
            goto L99
        L96:
            com.amazon.aps.iva.lb0.z r8 = com.amazon.aps.iva.lb0.z.b
            r1 = r8
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.h.C(com.amazon.aps.iva.gy.h, com.amazon.aps.iva.gy.n, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.gy.g
    public final Object K(String str, com.amazon.aps.iva.x50.t tVar, com.amazon.aps.iva.ob0.d dVar) {
        v vVar;
        l lVar = this.b.get(new m(HomeFeedItemResourceType.PANEL, HomeFeedItemResponseType.UNDEFINED));
        if (lVar instanceof v) {
            vVar = (v) lVar;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            return null;
        }
        return vVar.C(str, tVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    @Override // com.amazon.aps.iva.gy.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e1(com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.amazon.aps.iva.xx.l>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.gy.h.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.gy.h$a r0 = (com.amazon.aps.iva.gy.h.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.gy.h$a r0 = new com.amazon.aps.iva.gy.h$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            com.amazon.aps.iva.lb0.z r3 = com.amazon.aps.iva.lb0.z.b
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L76
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            com.amazon.aps.iva.gy.h r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L3a
            goto L4b
        L3a:
            r7 = move-exception
            goto L79
        L3c:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r6     // Catch: java.lang.Throwable -> L77
            r0.k = r5     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r6.y0(r0)     // Catch: java.lang.Throwable -> L77
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r2 = r6
        L4b:
            com.amazon.aps.iva.gy.n r7 = (com.amazon.aps.iva.gy.n) r7     // Catch: java.lang.Throwable -> L3a
            if (r7 != 0) goto L50
            return r3
        L50:
            int r3 = r2.h
            int r3 = r3 + 20
            r2.h = r3
            int r3 = r7.b
            r2.i = r3
            java.util.ArrayList r3 = r2.g
            java.util.List r5 = r7.a()
            java.util.Collection r5 = (java.util.Collection) r5
            r3.addAll(r5)
            com.amazon.aps.iva.gy.h$b r3 = new com.amazon.aps.iva.gy.h$b
            r5 = 0
            r3.<init>(r2, r7, r5)
            r0.h = r5
            r0.k = r4
            java.lang.Object r7 = com.amazon.aps.iva.e.z.p(r3, r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            return r7
        L77:
            r7 = move-exception
            r2 = r6
        L79:
            int r0 = r2.i
            r2.h = r0
            boolean r0 = r2.j
            if (r0 != 0) goto L8c
            boolean r7 = r2.e
            if (r7 == 0) goto L8b
            com.amazon.aps.iva.xx.l$b r7 = com.amazon.aps.iva.xx.l.b.b
            java.util.List r3 = com.amazon.aps.iva.ee0.f1.J(r7)
        L8b:
            return r3
        L8c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.h.e1(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.gy.g
    public final Object i1(com.amazon.aps.iva.xx.g gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> dVar) {
        HomeFeedItemRaw d = gVar.d();
        com.amazon.aps.iva.yb0.j.f(d, "<this>");
        l lVar = this.b.get(new m(d.getResourceType(), d.getResponseType()));
        if (lVar != null) {
            Object D1 = lVar.D1(gVar.d(), gVar.c(), dVar);
            if (D1 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return D1;
            }
            return (com.amazon.aps.iva.xx.l) D1;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.gy.g
    public final void q1() {
        v vVar;
        l lVar = this.b.get(new m(HomeFeedItemResourceType.PANEL, HomeFeedItemResponseType.UNDEFINED));
        if (lVar instanceof v) {
            vVar = (v) lVar;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            vVar.c = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.gy.n> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.gy.h.c
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.gy.h$c r0 = (com.amazon.aps.iva.gy.h.c) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.gy.h$c r0 = new com.amazon.aps.iva.gy.h$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L5c
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            com.amazon.aps.iva.ab.x.i0(r7)
            boolean r7 = r6.j
            if (r7 != 0) goto L3f
            int r7 = r6.h
            int r2 = r6.i
            if (r7 < r2) goto L3f
            r7 = r3
            goto L40
        L3f:
            r7 = 0
        L40:
            if (r7 == 0) goto L43
            return r4
        L43:
            int r7 = r6.h
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r5 = 20
            r7.<init>(r5)
            r0.j = r3
            com.amazon.aps.iva.xb0.q<java.lang.Integer, java.lang.Integer, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.etp.content.ContentApiResponse<com.ellation.crunchyroll.api.model.HomeFeedItemRaw, com.ellation.crunchyroll.api.etp.content.EmptyMeta>>, java.lang.Object> r5 = r6.d
            java.lang.Object r7 = r5.invoke(r2, r7, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r7 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r7
            java.util.List r0 = r7.getData()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L78
            com.amazon.aps.iva.gy.n r4 = new com.amazon.aps.iva.gy.n
            java.util.List r0 = r7.getData()
            int r7 = r7.getTotal()
            r4.<init>(r0, r7)
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.h.y0(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
