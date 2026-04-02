package com.amazon.aps.iva.zh;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.zh.e;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.music.Artist;
import java.io.IOException;
import java.util.List;
/* compiled from: ArtistViewModel.kt */
/* loaded from: classes.dex */
public final class w extends com.amazon.aps.iva.ez.b implements v {
    public final h b;
    public final com.amazon.aps.iva.at.d c;
    public final f d;
    public final com.amazon.aps.iva.yh.c e;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<t>> f;
    public final com.amazon.aps.iva.i5.v<e> g;
    public final com.amazon.aps.iva.i5.v<List<com.amazon.aps.iva.ci.h>> h;

    /* compiled from: ArtistViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.artist.ArtistViewModelImpl$loadScreen$1", f = "ArtistViewModel.kt", l = {62}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        /* compiled from: ArtistViewModel.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.artist.ArtistViewModelImpl$loadScreen$1$1", f = "ArtistViewModel.kt", l = {82, 83, 84}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.zh.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0919a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public Object h;
            public Object i;
            public Object j;
            public int k;
            public /* synthetic */ Object l;
            public final /* synthetic */ w m;

            /* compiled from: ArtistViewModel.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.artist.ArtistViewModelImpl$loadScreen$1$1$artistAsync$1", f = "ArtistViewModel.kt", l = {63}, m = "invokeSuspend")
            /* renamed from: com.amazon.aps.iva.zh.w$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0920a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super Artist>, Object> {
                public int h;
                public final /* synthetic */ w i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0920a(w wVar, com.amazon.aps.iva.ob0.d<? super C0920a> dVar) {
                    super(2, dVar);
                    this.i = wVar;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    return new C0920a(this.i, dVar);
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super Artist> dVar) {
                    return ((C0920a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
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
                        h hVar = this.i.b;
                        this.h = 1;
                        obj = hVar.b0(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return obj;
                }
            }

            /* compiled from: ArtistViewModel.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.artist.ArtistViewModelImpl$loadScreen$1$1$concerts$1", f = "ArtistViewModel.kt", l = {74}, m = "invokeSuspend")
            /* renamed from: com.amazon.aps.iva.zh.w$a$a$b */
            /* loaded from: classes.dex */
            public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.ci.h>>, Object> {
                public int h;
                public /* synthetic */ Object i;
                public final /* synthetic */ w j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(w wVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
                    super(2, dVar);
                    this.j = wVar;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    b bVar = new b(this.j, dVar);
                    bVar.i = obj;
                    return bVar;
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.ci.h>> dVar) {
                    return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    Object H;
                    w wVar;
                    com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                    int i = this.h;
                    try {
                        if (i != 0) {
                            if (i == 1) {
                                wVar = (w) this.i;
                                com.amazon.aps.iva.ab.x.i0(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            com.amazon.aps.iva.ab.x.i0(obj);
                            g0 g0Var = (g0) this.i;
                            w wVar2 = this.j;
                            h hVar = wVar2.b;
                            this.i = wVar2;
                            this.h = 1;
                            Object a0 = hVar.a0(this);
                            if (a0 == aVar) {
                                return aVar;
                            }
                            wVar = wVar2;
                            obj = a0;
                        }
                        H = x.a((List) obj, wVar.c, wVar.e);
                    } catch (Throwable th) {
                        H = com.amazon.aps.iva.ab.x.H(th);
                    }
                    z zVar = z.b;
                    if (H instanceof k.a) {
                        return zVar;
                    }
                    return H;
                }
            }

            /* compiled from: ArtistViewModel.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.music.artist.ArtistViewModelImpl$loadScreen$1$1$musicVideos$1", f = "ArtistViewModel.kt", l = {66}, m = "invokeSuspend")
            /* renamed from: com.amazon.aps.iva.zh.w$a$a$c */
            /* loaded from: classes.dex */
            public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.ci.h>>, Object> {
                public int h;
                public /* synthetic */ Object i;
                public final /* synthetic */ w j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(w wVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
                    super(2, dVar);
                    this.j = wVar;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    c cVar = new c(this.j, dVar);
                    cVar.i = obj;
                    return cVar;
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.ci.h>> dVar) {
                    return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    Object H;
                    w wVar;
                    com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                    int i = this.h;
                    try {
                        if (i != 0) {
                            if (i == 1) {
                                wVar = (w) this.i;
                                com.amazon.aps.iva.ab.x.i0(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            com.amazon.aps.iva.ab.x.i0(obj);
                            g0 g0Var = (g0) this.i;
                            w wVar2 = this.j;
                            h hVar = wVar2.b;
                            this.i = wVar2;
                            this.h = 1;
                            Object S0 = hVar.S0(this);
                            if (S0 == aVar) {
                                return aVar;
                            }
                            wVar = wVar2;
                            obj = S0;
                        }
                        H = x.a((List) obj, wVar.c, wVar.e);
                    } catch (Throwable th) {
                        H = com.amazon.aps.iva.ab.x.H(th);
                    }
                    z zVar = z.b;
                    if (H instanceof k.a) {
                        return zVar;
                    }
                    return H;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0919a(w wVar, com.amazon.aps.iva.ob0.d<? super C0919a> dVar) {
                super(2, dVar);
                this.m = wVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                C0919a c0919a = new C0919a(this.m, dVar);
                c0919a.l = obj;
                return c0919a;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((C0919a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x00c4 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00e6 A[LOOP:0: B:25:0x00e0->B:27:0x00e6, LOOP_END] */
            @Override // com.amazon.aps.iva.qb0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 296
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zh.w.a.C0919a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            w wVar = w.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    C0919a c0919a = new C0919a(wVar, null);
                    this.h = 1;
                    if (com.amazon.aps.iva.e.z.p(c0919a, this) == aVar) {
                        return aVar;
                    }
                }
            } catch (IOException e) {
                com.amazon.aps.iva.mf0.a.a.d(e);
                com.amazon.aps.iva.e4.e.g(null, e, wVar.f);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i iVar, com.amazon.aps.iva.at.f fVar, g gVar, com.amazon.aps.iva.yh.d dVar) {
        super(iVar);
        com.amazon.aps.iva.yb0.j.f(iVar, "interactor");
        com.amazon.aps.iva.yb0.j.f(fVar, "contentAvailabilityProvider");
        this.b = iVar;
        this.c = fVar;
        this.d = gVar;
        this.e = dVar;
        this.f = new com.amazon.aps.iva.i5.v<>();
        this.g = new com.amazon.aps.iva.i5.v<>();
        this.h = new com.amazon.aps.iva.i5.v<>();
        c5();
    }

    @Override // com.amazon.aps.iva.zh.v
    public final com.amazon.aps.iva.i5.v E1() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.zh.v
    public final com.amazon.aps.iva.i5.v L2() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.zh.v
    public final void N6() {
        List<com.amazon.aps.iva.ci.h> list;
        g.c<t> a2;
        t tVar;
        com.amazon.aps.iva.i5.v<List<com.amazon.aps.iva.ci.h>> vVar = this.h;
        com.amazon.aps.iva.ez.g<t> d = this.f.d();
        if (d == null || (a2 = d.a()) == null || (tVar = a2.a) == null || (list = tVar.g) == null) {
            list = z.b;
        }
        vVar.k(list);
        this.g.k(e.a.b);
    }

    @Override // com.amazon.aps.iva.zh.v
    public final com.amazon.aps.iva.i5.v X4() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.zh.v
    public final void c5() {
        com.amazon.aps.iva.ez.h.c(this.f, null);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(null), 3);
    }

    @Override // com.amazon.aps.iva.zh.v
    public final com.amazon.aps.iva.e20.a d0() {
        com.amazon.aps.iva.ez.g<t> d = this.f.d();
        com.amazon.aps.iva.yb0.j.c(d);
        g.c<t> a2 = d.a();
        com.amazon.aps.iva.yb0.j.c(a2);
        t tVar = a2.a;
        com.amazon.aps.iva.yb0.j.f(tVar, "<this>");
        com.amazon.aps.iva.ai.a aVar = tVar.b;
        return new com.amazon.aps.iva.e20.a(aVar.a, aVar.c, f1.K(new com.amazon.aps.iva.e20.e(R.string.artist_details_duration, tVar.d), new com.amazon.aps.iva.e20.e(R.string.artist_details_genres, com.amazon.aps.iva.lb0.x.B0(tVar.e, null, null, null, null, 63))));
    }

    @Override // com.amazon.aps.iva.zh.v
    public final void k7() {
        List<com.amazon.aps.iva.ci.h> list;
        g.c<t> a2;
        t tVar;
        com.amazon.aps.iva.i5.v<List<com.amazon.aps.iva.ci.h>> vVar = this.h;
        com.amazon.aps.iva.ez.g<t> d = this.f.d();
        if (d == null || (a2 = d.a()) == null || (tVar = a2.a) == null || (list = tVar.f) == null) {
            list = z.b;
        }
        vVar.k(list);
        this.g.k(e.b.b);
    }
}
