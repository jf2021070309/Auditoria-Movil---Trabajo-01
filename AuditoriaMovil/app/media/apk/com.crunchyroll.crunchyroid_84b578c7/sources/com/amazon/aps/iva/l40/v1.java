package com.amazon.aps.iva.l40;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.ot.a;
import com.amazon.aps.iva.qz.b;
import com.amazon.aps.iva.se0.c2;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Images;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: ShowPageViewModel.kt */
/* loaded from: classes2.dex */
public class v1 extends com.amazon.aps.iva.ez.b implements j1, com.amazon.aps.iva.se0.g0 {
    public final com.amazon.aps.iva.o40.c b;
    public final g1<ContentContainer, com.amazon.aps.iva.r40.a> c;
    public final g1<com.amazon.aps.iva.o00.e, com.amazon.aps.iva.m40.c> d;
    public final g1<ContentContainer, com.amazon.aps.iva.e20.a> e;
    public final com.amazon.aps.iva.qz.b f;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d g;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<ContentContainer>> h;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<Images>> i;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.e20.a>> j;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.r40.a>> k;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.m40.c>> l;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.o00.e>> m;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<f>> n;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<Season>> o;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.n00.a>> p;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.m00.b>> q;
    public c2 r;
    public y1 s;
    public final com.amazon.aps.iva.i5.u t;
    public final com.amazon.aps.iva.i5.u u;

    /* compiled from: ShowPageViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.ShowPageViewModelImpl", f = "ShowPageViewModel.kt", l = {271}, m = "loadSeasons")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return v1.this.R8(null, this);
        }
    }

    /* compiled from: ShowPageViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.ShowPageViewModelImpl$reloadSeasons$1", f = "ShowPageViewModel.kt", l = {177, 177}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public v1 h;
        public int i;
        public /* synthetic */ Object j;

        /* compiled from: ShowPageViewModel.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.ShowPageViewModelImpl$reloadSeasons$1$1", f = "ShowPageViewModel.kt", l = {177}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.o00.e>>, Object> {
            public int h;
            public final /* synthetic */ v1 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v1 v1Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
                super(2, dVar);
                this.i = v1Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new a(this.i, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.o00.e>> dVar) {
                return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                    this.h = 1;
                    obj = v1.O8(this.i, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.j = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.se0.g0 g0Var;
            v1 v1Var;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.i;
            v1 v1Var2 = v1.this;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v1Var = this.h;
                g0Var = (com.amazon.aps.iva.se0.g0) this.j;
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.se0.g0 g0Var2 = (com.amazon.aps.iva.se0.g0) this.j;
                com.amazon.aps.iva.o40.c cVar = v1Var2.b;
                this.j = g0Var2;
                this.h = v1Var2;
                this.i = 1;
                Serializable f = cVar.f(this);
                if (f == aVar) {
                    return aVar;
                }
                g0Var = g0Var2;
                obj = f;
                v1Var = v1Var2;
            }
            com.amazon.aps.iva.se0.n0 b = com.amazon.aps.iva.se0.i.b(g0Var, null, null, new a(v1Var2, null), 3);
            this.j = null;
            this.h = null;
            this.i = 2;
            if (v1.P8(v1Var, (ContentContainer) obj, b, this) == aVar) {
                return aVar;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.ShowPageViewModelImpl$reloadShowPageCta$1", f = "ShowPageViewModel.kt", l = {208}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.i = obj;
            return cVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                    com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.i;
                    v1 v1Var = v1.this;
                    this.h = 1;
                    obj = v1.O8(v1Var, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) obj;
            } catch (Throwable th) {
                com.amazon.aps.iva.ab.x.H(th);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.amazon.aps.iva.o40.c cVar, com.amazon.aps.iva.r40.e eVar, com.amazon.aps.iva.m40.d dVar, g gVar, com.amazon.aps.iva.qz.b bVar) {
        super(cVar);
        com.amazon.aps.iva.yb0.j.f(cVar, "showContentInteractor");
        this.b = cVar;
        this.c = eVar;
        this.d = dVar;
        this.e = gVar;
        this.f = bVar;
        this.g = com.amazon.aps.iva.e.z.j();
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<ContentContainer>> vVar = new com.amazon.aps.iva.i5.v<>();
        this.h = vVar;
        this.i = new com.amazon.aps.iva.i5.v<>();
        this.j = new com.amazon.aps.iva.i5.v<>();
        this.k = new com.amazon.aps.iva.i5.v<>();
        this.l = new com.amazon.aps.iva.i5.v<>();
        this.m = new com.amazon.aps.iva.i5.v<>();
        this.n = new com.amazon.aps.iva.i5.v<>();
        this.o = new com.amazon.aps.iva.i5.v<>();
        this.p = new com.amazon.aps.iva.i5.v<>();
        this.q = new com.amazon.aps.iva.i5.v<>();
        this.t = com.amazon.aps.iva.ez.h.b(vVar, k1.h);
        this.u = com.amazon.aps.iva.ez.h.b(vVar, l1.h);
        this.r = com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new s1(this, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(2:22|23))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        r6 = com.amazon.aps.iva.ab.x.H(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N8(com.amazon.aps.iva.l40.v1 r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.amazon.aps.iva.l40.m1
            if (r0 == 0) goto L16
            r0 = r6
            com.amazon.aps.iva.l40.m1 r0 = (com.amazon.aps.iva.l40.m1) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.k = r1
            goto L1b
        L16:
            com.amazon.aps.iva.l40.m1 r0 = new com.amazon.aps.iva.l40.m1
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.amazon.aps.iva.l40.v1 r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)     // Catch: java.lang.Throwable -> L52
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.ellation.crunchyroll.model.ContentContainer>> r6 = r5.h
            com.amazon.aps.iva.ez.h.c(r6, r3)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.r40.a>> r6 = r5.k
            com.amazon.aps.iva.ez.h.c(r6, r3)
            com.amazon.aps.iva.o40.c r6 = r5.b     // Catch: java.lang.Throwable -> L52
            r0.h = r5     // Catch: java.lang.Throwable -> L52
            r0.k = r4     // Catch: java.lang.Throwable -> L52
            java.io.Serializable r6 = r6.f(r0)     // Catch: java.lang.Throwable -> L52
            if (r6 != r1) goto L4f
            goto L8b
        L4f:
            com.ellation.crunchyroll.model.ContentContainer r6 = (com.ellation.crunchyroll.model.ContentContainer) r6     // Catch: java.lang.Throwable -> L52
            goto L57
        L52:
            r6 = move-exception
            com.amazon.aps.iva.kb0.k$a r6 = com.amazon.aps.iva.ab.x.H(r6)
        L57:
            com.amazon.aps.iva.ez.g r1 = com.amazon.aps.iva.ez.h.e(r6)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.ellation.crunchyroll.model.ContentContainer>> r6 = r5.h
            r6.k(r1)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.r40.a>> r6 = r5.k
            com.amazon.aps.iva.l40.n1 r0 = new com.amazon.aps.iva.l40.n1
            com.amazon.aps.iva.l40.g1<com.ellation.crunchyroll.model.ContentContainer, com.amazon.aps.iva.r40.a> r2 = r5.c
            r0.<init>(r2)
            com.amazon.aps.iva.ez.g r0 = r1.d(r3, r0)
            r6.k(r0)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.e20.a>> r6 = r5.j
            com.amazon.aps.iva.l40.o1 r0 = new com.amazon.aps.iva.l40.o1
            com.amazon.aps.iva.l40.g1<com.ellation.crunchyroll.model.ContentContainer, com.amazon.aps.iva.e20.a> r2 = r5.e
            r0.<init>(r2)
            com.amazon.aps.iva.ez.g r0 = r1.d(r3, r0)
            r6.k(r0)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.ellation.crunchyroll.model.Images>> r5 = r5.i
            com.amazon.aps.iva.l40.p1 r6 = com.amazon.aps.iva.l40.p1.h
            com.amazon.aps.iva.ez.g r6 = r1.d(r3, r6)
            r5.k(r6)
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.l40.v1.N8(com.amazon.aps.iva.l40.v1, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(2:22|23))|12|13|14))|26|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        r6 = com.amazon.aps.iva.ab.x.H(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O8(com.amazon.aps.iva.l40.v1 r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.amazon.aps.iva.l40.q1
            if (r0 == 0) goto L16
            r0 = r6
            com.amazon.aps.iva.l40.q1 r0 = (com.amazon.aps.iva.l40.q1) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.k = r1
            goto L1b
        L16:
            com.amazon.aps.iva.l40.q1 r0 = new com.amazon.aps.iva.l40.q1
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.amazon.aps.iva.l40.v1 r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)     // Catch: java.lang.Throwable -> L52
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.m40.c>> r6 = r5.l
            com.amazon.aps.iva.ez.h.c(r6, r3)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.o00.e>> r6 = r5.m
            com.amazon.aps.iva.ez.h.c(r6, r3)
            com.amazon.aps.iva.o40.c r6 = r5.b     // Catch: java.lang.Throwable -> L52
            r0.h = r5     // Catch: java.lang.Throwable -> L52
            r0.k = r4     // Catch: java.lang.Throwable -> L52
            java.lang.Object r6 = r6.t(r0)     // Catch: java.lang.Throwable -> L52
            if (r6 != r1) goto L4f
            goto L70
        L4f:
            com.amazon.aps.iva.o00.e r6 = (com.amazon.aps.iva.o00.e) r6     // Catch: java.lang.Throwable -> L52
            goto L57
        L52:
            r6 = move-exception
            com.amazon.aps.iva.kb0.k$a r6 = com.amazon.aps.iva.ab.x.H(r6)
        L57:
            com.amazon.aps.iva.ez.g r1 = com.amazon.aps.iva.ez.h.e(r6)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.m40.c>> r6 = r5.l
            com.amazon.aps.iva.l40.r1 r0 = new com.amazon.aps.iva.l40.r1
            com.amazon.aps.iva.l40.g1<com.amazon.aps.iva.o00.e, com.amazon.aps.iva.m40.c> r2 = r5.d
            r0.<init>(r2)
            com.amazon.aps.iva.ez.g r0 = r1.d(r3, r0)
            r6.k(r0)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.o00.e>> r5 = r5.m
            r5.k(r1)
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.l40.v1.O8(com.amazon.aps.iva.l40.v1, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150 A[LOOP:0: B:70:0x014a->B:72:0x0150, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0192  */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.amazon.aps.iva.lb0.z, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P8(com.amazon.aps.iva.l40.v1 r10, com.ellation.crunchyroll.model.ContentContainer r11, com.amazon.aps.iva.se0.m0 r12, com.amazon.aps.iva.ob0.d r13) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.l40.v1.P8(com.amazon.aps.iva.l40.v1, com.ellation.crunchyroll.model.ContentContainer, com.amazon.aps.iva.se0.m0, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final void C1(ArrayList arrayList) {
        this.f.q8(arrayList, new w1(this), new x1(this));
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.i5.v C7() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.se0.g0 E4() {
        return com.amazon.aps.iva.e.w.D(this);
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final void E5(Season season) {
        com.amazon.aps.iva.yb0.j.f(season, "season");
        this.o.k(new g.c(season, null));
        T8();
        S8();
        b.a.a(this.f, season, 6);
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.i00.a I() {
        return this.f.I();
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.i5.v K1() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.hg.g P() {
        return this.f.P();
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.i5.u Q0() {
        return this.u;
    }

    public final Season Q8() {
        g.c<Season> a2;
        com.amazon.aps.iva.ez.g<Season> d = this.o.d();
        if (d != null && (a2 = d.a()) != null) {
            return a2.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R8(com.ellation.crunchyroll.model.Series r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.ez.g<com.amazon.aps.iva.l40.f>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.l40.v1.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.l40.v1$a r0 = (com.amazon.aps.iva.l40.v1.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.l40.v1$a r0 = new com.amazon.aps.iva.l40.v1$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            com.amazon.aps.iva.l40.v1 r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.lang.Throwable -> L2a
            goto L4a
        L2a:
            r7 = move-exception
            goto L50
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.l40.f>> r7 = r5.n
            com.amazon.aps.iva.ez.h.c(r7, r3)
            com.amazon.aps.iva.o40.c r7 = r5.b     // Catch: java.lang.Throwable -> L4d
            r0.h = r5     // Catch: java.lang.Throwable -> L4d
            r0.k = r4     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r7 = r7.g1(r6, r0)     // Catch: java.lang.Throwable -> L4d
            if (r7 != r1) goto L49
            return r1
        L49:
            r6 = r5
        L4a:
            com.amazon.aps.iva.l40.f r7 = (com.amazon.aps.iva.l40.f) r7     // Catch: java.lang.Throwable -> L2a
            goto L54
        L4d:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L50:
            com.amazon.aps.iva.kb0.k$a r7 = com.amazon.aps.iva.ab.x.H(r7)
        L54:
            com.amazon.aps.iva.ez.g r7 = com.amazon.aps.iva.ez.h.e(r7)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.l40.f>> r0 = r6.n
            r0.k(r7)
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.l40.f>> r0 = r6.n
            java.lang.Object r0 = r0.d()
            boolean r0 = r0 instanceof com.amazon.aps.iva.ez.g.a
            if (r0 == 0) goto L78
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.ellation.crunchyroll.api.cms.model.Season>> r6 = r6.o
            com.amazon.aps.iva.ez.g$a r0 = new com.amazon.aps.iva.ez.g$a
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "Seasons loading failed"
            r1.<init>(r2)
            r0.<init>(r3, r1)
            r6.k(r0)
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.l40.v1.R8(com.ellation.crunchyroll.model.Series, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final void S8() {
        g.c<Season> a2;
        Season season;
        com.amazon.aps.iva.ez.g<f> d;
        g.c<f> a3;
        f fVar;
        com.amazon.aps.iva.ez.g<Season> d2 = this.o.d();
        if (d2 != null && (a2 = d2.a()) != null && (season = a2.a) != null && (d = this.n.d()) != null && (a3 = d.a()) != null && (fVar = a3.a) != null) {
            this.p.k(new g.c(new com.amazon.aps.iva.n00.a(season, fVar.b), null));
        }
    }

    public final void T8() {
        g.c<Season> a2;
        Season season;
        com.amazon.aps.iva.ez.g<f> d;
        g.c<f> a3;
        f fVar;
        com.amazon.aps.iva.ez.g<Season> d2 = this.o.d();
        if (d2 != null && (a2 = d2.a()) != null && (season = a2.a) != null && (d = this.n.d()) != null && (a3 = d.a()) != null && (fVar = a3.a) != null) {
            this.q.k(new g.c(new com.amazon.aps.iva.m00.b(season, fVar), null));
        }
    }

    public final void U8() {
        com.amazon.aps.iva.se0.i.d(this, null, null, new c(null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.amazon.aps.iva.f00.q] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.amazon.aps.iva.f00.a] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.amazon.aps.iva.f00.q] */
    @Override // com.amazon.aps.iva.l40.j1
    public final void W1(List<String> list) {
        g.c<com.amazon.aps.iva.qz.a> cVar;
        Playhead playhead;
        com.amazon.aps.iva.yb0.j.f(list, "assetIds");
        Season Q8 = Q8();
        String str = (Q8 == null || (str = Q8.getId()) == null) ? "" : "";
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.qz.a> d = l7().d();
        if (d != null) {
            cVar = d.a();
        } else {
            cVar = null;
        }
        com.amazon.aps.iva.yb0.j.c(cVar);
        y1 y1Var = new y1(str, cVar.a);
        this.s = y1Var;
        com.amazon.aps.iva.qz.a aVar = y1Var.b;
        com.amazon.aps.iva.e00.a aVar2 = aVar.a;
        List<PlayableAsset> list2 = aVar2.a;
        int w = com.amazon.aps.iva.aq.k.w(com.amazon.aps.iva.lb0.r.Y(list2));
        if (w < 16) {
            w = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(w);
        for (PlayableAsset playableAsset : list2) {
            String id = playableAsset.getId();
            boolean contains = list.contains(playableAsset.getId());
            com.amazon.aps.iva.e00.a aVar3 = aVar.a;
            if (contains) {
                Playhead playhead2 = aVar3.b.get(playableAsset.getId());
                if (playhead2 == null || (playhead = Playhead.copy$default(playhead2, 0L, true, null, null, 13, null)) == null) {
                    playhead = new Playhead(0L, true, null, null, 13, null);
                }
            } else {
                playhead = aVar3.b.get(playableAsset.getId());
                if (playhead == null) {
                    playhead = new Playhead(0L, false, null, null, 13, null);
                }
            }
            linkedHashMap.put(id, playhead);
        }
        com.amazon.aps.iva.e00.a a2 = com.amazon.aps.iva.e00.a.a(aVar2, null, linkedHashMap, 5);
        List<com.amazon.aps.iva.f00.a> list3 = aVar.b;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            ?? r6 = (com.amazon.aps.iva.f00.a) it.next();
            if (r6 instanceof com.amazon.aps.iva.f00.q) {
                r6 = (com.amazon.aps.iva.f00.q) r6;
                if (list.contains(r6.b)) {
                    r6 = com.amazon.aps.iva.f00.q.c(r6, 100, a.h.d, null, 1046015);
                }
            }
            arrayList.add(r6);
        }
        this.f.L4(new com.amazon.aps.iva.qz.a(a2, arrayList));
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.i5.v X0() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final void Y(com.amazon.aps.iva.hg.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "status");
        this.f.Y(cVar);
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final void Y1() {
        com.amazon.aps.iva.se0.i.d(this, null, null, new b(null), 3);
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final void a4() {
        String str;
        y1 y1Var = this.s;
        if (y1Var != null) {
            Season Q8 = Q8();
            if (Q8 != null) {
                str = Q8.getId();
            } else {
                str = null;
            }
            if (com.amazon.aps.iva.yb0.j.a(y1Var.a, str)) {
                y1 y1Var2 = this.s;
                com.amazon.aps.iva.yb0.j.c(y1Var2);
                this.f.L4(y1Var2.b);
                this.s = null;
            }
        }
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.i5.v c4() {
        return this.q;
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.i5.v d0() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final void g8() {
        c2 c2Var = this.r;
        if (c2Var != null) {
            c2Var.a(null);
        }
        this.r = com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new s1(this, null), 3);
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.g.b;
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.i5.v h0() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final void i0() {
        b.a.a(this.f, Q8(), 6);
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.i5.v j6() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final PlayableAsset j7(String str) {
        g.c a2;
        com.amazon.aps.iva.qz.a aVar;
        com.amazon.aps.iva.e00.a aVar2;
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.ez.g gVar = (com.amazon.aps.iva.ez.g) this.f.o6().d();
        if (gVar != null && (a2 = gVar.a()) != null && (aVar = (com.amazon.aps.iva.qz.a) a2.a) != null && (aVar2 = aVar.a) != null) {
            return aVar2.b(str);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final LiveData<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.qz.a>> l7() {
        return this.f.o6();
    }

    @Override // com.amazon.aps.iva.ez.b, com.amazon.aps.iva.i5.f0
    public void onCleared() {
        super.onCleared();
        com.amazon.aps.iva.e.z.l(this, null);
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final void q(com.amazon.aps.iva.i00.a aVar) {
        this.f.q(aVar);
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final void q2() {
        g.c<com.amazon.aps.iva.qz.a> cVar;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.qz.a> d = l7().d();
        if (d != null) {
            cVar = d.a();
        } else {
            cVar = null;
        }
        com.amazon.aps.iva.yb0.j.c(cVar);
        List<PlayableAsset> list = cVar.a.a.a;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
        for (PlayableAsset playableAsset : list) {
            arrayList.add(playableAsset.getId());
        }
        W1(arrayList);
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.i5.v q5() {
        return this.o;
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.i5.v r7() {
        return this.l;
    }

    public LiveData<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.m50.b>> x() {
        return this.t;
    }

    @Override // com.amazon.aps.iva.l40.j1
    public final com.amazon.aps.iva.i5.v z2() {
        return this.k;
    }
}
