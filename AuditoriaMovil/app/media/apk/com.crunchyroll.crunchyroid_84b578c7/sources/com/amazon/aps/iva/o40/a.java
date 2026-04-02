package com.amazon.aps.iva.o40;

import com.amazon.aps.iva.wv.b0;
import com.amazon.aps.iva.wv.e0;
import com.amazon.aps.iva.wv.i0;
import com.amazon.aps.iva.wv.q;
import com.amazon.aps.iva.wv.s;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.api.cms.model.Season;
import java.util.HashMap;
/* compiled from: ShowContentInteractor.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.i implements com.amazon.aps.iva.o40.c {
    public final j b;
    public final com.amazon.aps.iva.ug.a c;
    public final i0 d;
    public final s e;
    public final q f;
    public final e0 g;
    public final b0 h;
    public final com.amazon.aps.iva.wv.j i;

    /* compiled from: ShowContentInteractor.kt */
    /* renamed from: com.amazon.aps.iva.o40.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0555a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.SERIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.MOVIE_LISTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.OfflineShowContentInteractorImpl", f = "ShowContentInteractor.kt", l = {276, 277}, m = "getAsset")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public String h;
        public /* synthetic */ Object i;
        public int k;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return a.this.n(null, this);
        }
    }

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.OfflineShowContentInteractorImpl", f = "ShowContentInteractor.kt", l = {219, 225}, m = "getEpisodes")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public Season i;
        public /* synthetic */ Object j;
        public int l;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return a.this.b1(null, this);
        }
    }

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.OfflineShowContentInteractorImpl", f = "ShowContentInteractor.kt", l = {230, 233}, m = "getMovies")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public /* synthetic */ Object i;
        public int k;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return a.this.g(null, this);
        }
    }

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.OfflineShowContentInteractorImpl", f = "ShowContentInteractor.kt", l = {287, 287}, m = "getPlayheads")
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.qb0.c {
        public a h;
        public HashMap i;
        public HashMap j;
        public String[] k;
        public String l;
        public com.amazon.aps.iva.ig.a m;
        public int n;
        public int o;
        public /* synthetic */ Object p;
        public int r;

        public e(com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.p = obj;
            this.r |= Integer.MIN_VALUE;
            return a.this.o(null, this);
        }
    }

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.OfflineShowContentInteractorImpl", f = "ShowContentInteractor.kt", l = {215}, m = "getSeasons")
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public f(com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return a.this.g1(null, this);
        }
    }

    /* compiled from: ShowContentInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.showpage.interactor.OfflineShowContentInteractorImpl", f = "ShowContentInteractor.kt", l = {238, 240, 251}, m = "getUpNext")
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public Object i;
        public /* synthetic */ Object j;
        public int l;

        public g(com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return a.this.t(this);
        }
    }

    public a(j jVar, com.amazon.aps.iva.ug.a aVar, i0 i0Var, s sVar, q qVar, e0 e0Var, b0 b0Var, com.amazon.aps.iva.wv.j jVar2) {
        com.amazon.aps.iva.yb0.j.f(aVar, "downloadedAssetsProvider");
        this.b = jVar;
        this.c = aVar;
        this.d = i0Var;
        this.e = sVar;
        this.f = qVar;
        this.g = e0Var;
        this.h = b0Var;
        this.i = jVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    @Override // com.amazon.aps.iva.o40.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b1(com.ellation.crunchyroll.api.cms.model.Season r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.e00.a> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.o40.a.c
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.o40.a$c r0 = (com.amazon.aps.iva.o40.a.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.o40.a$c r0 = new com.amazon.aps.iva.o40.a$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.h
            java.util.List r7 = (java.util.List) r7
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L7b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            com.ellation.crunchyroll.api.cms.model.Season r7 = r0.i
            java.lang.Object r2 = r0.h
            com.amazon.aps.iva.o40.a r2 = (com.amazon.aps.iva.o40.a) r2
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L57
        L40:
            com.amazon.aps.iva.ab.x.i0(r8)
            java.lang.String r8 = r7.getSeriesId()
            r0.h = r6
            r0.i = r7
            r0.l = r4
            com.amazon.aps.iva.ug.a r2 = r6.c
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            r2 = r6
        L57:
            java.util.List r8 = (java.util.List) r8
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L84
            java.lang.String[] r7 = com.amazon.aps.iva.aq.k.L(r8)
            int r4 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r4)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r0.h = r8
            r4 = 0
            r0.i = r4
            r0.l = r3
            java.lang.Object r7 = r2.o(r7, r0)
            if (r7 != r1) goto L78
            return r1
        L78:
            r5 = r8
            r8 = r7
            r7 = r5
        L7b:
            java.util.Map r8 = (java.util.Map) r8
            com.amazon.aps.iva.e00.a r0 = new com.amazon.aps.iva.e00.a
            r1 = 4
            r0.<init>(r7, r8, r1)
            return r0
        L84:
            com.amazon.aps.iva.cw.a r8 = new com.amazon.aps.iva.cw.a
            java.lang.String r7 = r7.getSeriesId()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o40.a.b1(com.ellation.crunchyroll.api.cms.model.Season, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    @Override // com.amazon.aps.iva.o40.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(com.amazon.aps.iva.ob0.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.o40.b
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.o40.b r0 = (com.amazon.aps.iva.o40.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.o40.b r0 = new com.amazon.aps.iva.o40.b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.amazon.aps.iva.o40.a r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L5d
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            com.amazon.aps.iva.o40.a r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L93
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.o40.j r7 = r6.b
            com.amazon.aps.iva.x50.t r2 = r7.c
            int[] r5 = com.amazon.aps.iva.o40.a.C0555a.a
            int r2 = r2.ordinal()
            r2 = r5[r2]
            java.lang.String r5 = r7.b
            if (r2 == r4) goto L85
            if (r2 != r3) goto L6c
            r0.h = r6
            r0.k = r3
            com.amazon.aps.iva.wv.s r7 = r6.e
            java.lang.Object r7 = r7.readItem(r5, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r0 = r6
        L5d:
            com.ellation.crunchyroll.model.MovieListing r7 = (com.ellation.crunchyroll.model.MovieListing) r7
            if (r7 == 0) goto L62
            goto L97
        L62:
            com.amazon.aps.iva.cw.a r7 = new com.amazon.aps.iva.cw.a
            com.amazon.aps.iva.o40.j r0 = r0.b
            java.lang.String r0 = r0.b
            r7.<init>(r0)
            throw r7
        L6c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported Panel type: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = ".containerResourceType"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L85:
            r0.h = r6
            r0.k = r4
            com.amazon.aps.iva.wv.i0 r7 = r6.d
            java.lang.Object r7 = r7.readItem(r5, r0)
            if (r7 != r1) goto L92
            return r1
        L92:
            r0 = r6
        L93:
            com.ellation.crunchyroll.model.Series r7 = (com.ellation.crunchyroll.model.Series) r7
            if (r7 == 0) goto L98
        L97:
            return r7
        L98:
            com.amazon.aps.iva.cw.a r7 = new com.amazon.aps.iva.cw.a
            com.amazon.aps.iva.o40.j r0 = r0.b
            java.lang.String r0 = r0.b
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o40.a.f(com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    @Override // com.amazon.aps.iva.o40.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.ellation.crunchyroll.model.ContentContainer r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.e00.a> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.o40.a.d
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.o40.a$d r0 = (com.amazon.aps.iva.o40.a.d) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.o40.a$d r0 = new com.amazon.aps.iva.o40.a$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.h
            java.util.List r7 = (java.util.List) r7
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L6e
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r7 = r0.h
            com.amazon.aps.iva.o40.a r7 = (com.amazon.aps.iva.o40.a) r7
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L53
        L3e:
            com.amazon.aps.iva.ab.x.i0(r8)
            java.lang.String r7 = r7.getId()
            r0.h = r6
            r0.k = r4
            com.amazon.aps.iva.wv.q r8 = r6.f
            java.lang.Object r8 = r8.c(r7, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            r7 = r6
        L53:
            java.util.List r8 = (java.util.List) r8
            java.lang.String[] r2 = com.amazon.aps.iva.aq.k.L(r8)
            int r4 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.h = r8
            r0.k = r3
            java.lang.Object r7 = r7.o(r2, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r5 = r8
            r8 = r7
            r7 = r5
        L6e:
            java.util.Map r8 = (java.util.Map) r8
            com.amazon.aps.iva.e00.a r0 = new com.amazon.aps.iva.e00.a
            r1 = 4
            r0.<init>(r7, r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o40.a.g(com.ellation.crunchyroll.model.ContentContainer, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.o40.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g1(com.ellation.crunchyroll.model.Series r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.l40.f> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.o40.a.f
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.o40.a$f r0 = (com.amazon.aps.iva.o40.a.f) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.o40.a$f r0 = new com.amazon.aps.iva.o40.a$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            java.lang.String r5 = r5.getId()
            r0.j = r3
            com.amazon.aps.iva.wv.e0 r6 = r4.g
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.util.List r6 = (java.util.List) r6
            com.amazon.aps.iva.l40.f r5 = new com.amazon.aps.iva.l40.f
            r0 = 0
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o40.a.g1(com.ellation.crunchyroll.model.Series, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.o40.c
    public final j getInput() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    @Override // com.amazon.aps.iva.o40.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r7, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.PlayableAsset> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.o40.a.b
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.o40.a$b r0 = (com.amazon.aps.iva.o40.a.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.o40.a$b r0 = new com.amazon.aps.iva.o40.a$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L5a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.String r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L83
        L3a:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.amazon.aps.iva.o40.j r8 = r6.b
            com.amazon.aps.iva.x50.t r2 = r8.c
            int[] r5 = com.amazon.aps.iva.o40.a.C0555a.a
            int r2 = r2.ordinal()
            r2 = r5[r2]
            if (r2 == r4) goto L76
            if (r2 != r3) goto L5d
            r0.h = r7
            r0.k = r3
            com.amazon.aps.iva.wv.q r8 = r6.f
            java.lang.Object r8 = r8.readItem(r7, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            com.ellation.crunchyroll.model.PlayableAsset r8 = (com.ellation.crunchyroll.model.PlayableAsset) r8
            goto L85
        L5d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported Panel type: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = ".containerResourceType"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L76:
            r0.h = r7
            r0.k = r4
            com.amazon.aps.iva.wv.j r8 = r6.i
            java.lang.Object r8 = r8.readItem(r7, r0)
            if (r8 != r1) goto L83
            return r1
        L83:
            com.ellation.crunchyroll.model.PlayableAsset r8 = (com.ellation.crunchyroll.model.PlayableAsset) r8
        L85:
            if (r8 == 0) goto L88
            return r8
        L88:
            com.amazon.aps.iva.cw.a r8 = new com.amazon.aps.iva.cw.a
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o40.a.n(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00bb -> B:27:0x00be). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c6 -> B:29:0x00c8). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.o40.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String[] r18, com.amazon.aps.iva.ob0.d<? super java.util.Map<java.lang.String, com.ellation.crunchyroll.api.etp.content.model.Playhead>> r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o40.a.o(java.lang.String[], com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f A[Catch: a -> 0x01eb, LOOP:3: B:29:0x0089->B:31:0x008f, LOOP_END, TryCatch #2 {a -> 0x01eb, blocks: (B:28:0x0077, B:29:0x0089, B:31:0x008f, B:32:0x009d), top: B:104:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[Catch: a -> 0x0055, TryCatch #0 {a -> 0x0055, blocks: (B:19:0x0051, B:36:0x00b0, B:49:0x00f9, B:51:0x00fd, B:52:0x0104, B:54:0x010a, B:56:0x011f, B:61:0x013d, B:62:0x0142, B:64:0x0148, B:69:0x0161, B:71:0x016a, B:72:0x0170, B:67:0x015d, B:88:0x01c0, B:92:0x01cb, B:93:0x01d9, B:94:0x01e0, B:95:0x01e1, B:96:0x01ea, B:39:0x00c4, B:42:0x00d0, B:43:0x00db, B:46:0x00f2), top: B:101:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd A[Catch: a -> 0x0055, TryCatch #0 {a -> 0x0055, blocks: (B:19:0x0051, B:36:0x00b0, B:49:0x00f9, B:51:0x00fd, B:52:0x0104, B:54:0x010a, B:56:0x011f, B:61:0x013d, B:62:0x0142, B:64:0x0148, B:69:0x0161, B:71:0x016a, B:72:0x0170, B:67:0x015d, B:88:0x01c0, B:92:0x01cb, B:93:0x01d9, B:94:0x01e0, B:95:0x01e1, B:96:0x01ea, B:39:0x00c4, B:42:0x00d0, B:43:0x00db, B:46:0x00f2), top: B:101:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0191 A[Catch: a -> 0x01ec, TryCatch #1 {a -> 0x01ec, blocks: (B:14:0x003c, B:76:0x0187, B:78:0x0191, B:80:0x019b, B:85:0x01b0, B:86:0x01b4), top: B:102:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b0 A[Catch: a -> 0x01ec, TryCatch #1 {a -> 0x01ec, blocks: (B:14:0x003c, B:76:0x0187, B:78:0x0191, B:80:0x019b, B:85:0x01b0, B:86:0x01b4), top: B:102:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e1 A[Catch: a -> 0x0055, TryCatch #0 {a -> 0x0055, blocks: (B:19:0x0051, B:36:0x00b0, B:49:0x00f9, B:51:0x00fd, B:52:0x0104, B:54:0x010a, B:56:0x011f, B:61:0x013d, B:62:0x0142, B:64:0x0148, B:69:0x0161, B:71:0x016a, B:72:0x0170, B:67:0x015d, B:88:0x01c0, B:92:0x01cb, B:93:0x01d9, B:94:0x01e0, B:95:0x01e1, B:96:0x01ea, B:39:0x00c4, B:42:0x00d0, B:43:0x00db, B:46:0x00f2), top: B:101:0x0051 }] */
    @Override // com.amazon.aps.iva.o40.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o00.e> r25) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o40.a.t(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.o40.c
    public final void u() {
    }
}
