package com.amazon.aps.iva.ru;

import com.amazon.aps.iva.ez.g;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentPreview;
/* compiled from: CommentRepliesViewModel.kt */
/* loaded from: classes2.dex */
public final class h0 extends com.amazon.aps.iva.ez.b implements c0, com.amazon.aps.iva.bu.n {
    public com.amazon.aps.iva.du.x b;
    public final com.amazon.aps.iva.vt.s c;
    public final com.amazon.aps.iva.nu.f d;
    public final com.amazon.aps.iva.ru.d e;
    public final com.amazon.aps.iva.vt.d f;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<Integer>> g;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.vt.g> h;
    public final com.amazon.aps.iva.bu.c i;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.du.x> j;

    /* compiled from: CommentRepliesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x>>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x>> gVar) {
            gVar.e(new g0(h0.this));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentRepliesViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.replies.CommentRepliesViewModelImpl$refreshComments$1", f = "CommentRepliesViewModel.kt", l = {93}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                if (h0.N8(h0.this, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentRepliesViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.replies.CommentRepliesViewModelImpl$refreshComments$2", f = "CommentRepliesViewModel.kt", l = {94}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                com.amazon.aps.iva.bu.c cVar = h0.this.i;
                this.h = 1;
                if (cVar.v0(this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentRepliesViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.replies.CommentRepliesViewModelImpl$retryComments$1", f = "CommentRepliesViewModel.kt", l = {98}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                com.amazon.aps.iva.bu.c cVar = h0.this.i;
                this.h = 1;
                if (cVar.w0(this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CommentRepliesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class e implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public e(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.amazon.aps.iva.bu.d dVar, com.amazon.aps.iva.du.x xVar, com.amazon.aps.iva.vt.x xVar2, com.amazon.aps.iva.nu.i iVar, com.amazon.aps.iva.ru.e eVar, com.amazon.aps.iva.vt.e eVar2) {
        super(eVar, eVar2);
        com.amazon.aps.iva.yb0.j.f(xVar, "initialParentCommentModel");
        this.b = xVar;
        this.c = xVar2;
        this.d = iVar;
        this.e = eVar;
        this.f = eVar2;
        this.g = new com.amazon.aps.iva.i5.v<>(new g.c(Integer.valueOf(this.b.k), null));
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.vt.g> vVar = new com.amazon.aps.iva.i5.v<>();
        this.h = vVar;
        this.i = com.amazon.aps.iva.bu.e.a(dVar, new com.amazon.aps.iva.vt.f(vVar), new e0(this), new f0(this), this, 16);
        this.j = new com.amazon.aps.iva.i5.v<>(O8(this.b));
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new d0(this, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(2:22|23))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N8(com.amazon.aps.iva.ru.h0 r4, com.amazon.aps.iva.ob0.d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.amazon.aps.iva.ru.k0
            if (r0 == 0) goto L16
            r0 = r5
            com.amazon.aps.iva.ru.k0 r0 = (com.amazon.aps.iva.ru.k0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.k = r1
            goto L1b
        L16:
            com.amazon.aps.iva.ru.k0 r0 = new com.amazon.aps.iva.ru.k0
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.amazon.aps.iva.ru.h0 r4 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)     // Catch: java.io.IOException -> L66
            goto L51
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            com.amazon.aps.iva.ab.x.i0(r5)
            com.amazon.aps.iva.vt.d r5 = r4.f     // Catch: java.io.IOException -> L66
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.du.x> r2 = r4.j     // Catch: java.io.IOException -> L66
            java.lang.Object r2 = r2.d()     // Catch: java.io.IOException -> L66
            com.amazon.aps.iva.yb0.j.c(r2)     // Catch: java.io.IOException -> L66
            com.amazon.aps.iva.du.x r2 = (com.amazon.aps.iva.du.x) r2     // Catch: java.io.IOException -> L66
            java.lang.String r2 = r2.b     // Catch: java.io.IOException -> L66
            r0.h = r4     // Catch: java.io.IOException -> L66
            r0.k = r3     // Catch: java.io.IOException -> L66
            java.lang.Object r5 = r5.o0(r2, r0)     // Catch: java.io.IOException -> L66
            if (r5 != r1) goto L51
            goto L68
        L51:
            com.ellation.crunchyroll.api.etp.commenting.model.Comment r5 = (com.ellation.crunchyroll.api.etp.commenting.model.Comment) r5     // Catch: java.io.IOException -> L66
            r0 = 0
            com.amazon.aps.iva.du.x r5 = com.amazon.aps.iva.e4.l1.K(r5, r0)     // Catch: java.io.IOException -> L66
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.du.x> r0 = r4.j     // Catch: java.io.IOException -> L66
            com.amazon.aps.iva.du.x r1 = O8(r5)     // Catch: java.io.IOException -> L66
            r0.k(r1)     // Catch: java.io.IOException -> L66
            com.amazon.aps.iva.vt.s r4 = r4.c     // Catch: java.io.IOException -> L66
            r4.o(r5)     // Catch: java.io.IOException -> L66
        L66:
            com.amazon.aps.iva.kb0.q r1 = com.amazon.aps.iva.kb0.q.a
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ru.h0.N8(com.amazon.aps.iva.ru.h0, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static com.amazon.aps.iva.du.x O8(com.amazon.aps.iva.du.x xVar) {
        return com.amazon.aps.iva.du.x.a(xVar, 0, false, 0, false, false, false, false, false, false, false, 130559);
    }

    @Override // com.amazon.aps.iva.nu.f
    public final void D6() {
        Integer num;
        g.c<Integer> a2;
        this.d.D6();
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<Integer>> vVar = this.g;
        com.amazon.aps.iva.ez.g<Integer> d2 = vVar.d();
        if (d2 != null && (a2 = d2.a()) != null) {
            num = a2.a;
        } else {
            num = null;
        }
        com.amazon.aps.iva.yb0.j.c(num);
        vVar.k(new g.c(Integer.valueOf(num.intValue() + 1), null));
        P8();
    }

    @Override // com.amazon.aps.iva.bu.n
    public final Object H1(int i, int i2, com.amazon.aps.iva.ob0.d<? super CommentPreview> dVar) {
        com.amazon.aps.iva.du.x d2 = this.j.d();
        com.amazon.aps.iva.yb0.j.c(d2);
        return this.e.G0(d2.b, i, i2, dVar);
    }

    @Override // com.amazon.aps.iva.ru.c0
    public final com.amazon.aps.iva.i5.v M() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.ru.c0
    public final com.amazon.aps.iva.i5.v P2() {
        return this.g;
    }

    public final void P8() {
        g.c<Integer> a2;
        com.amazon.aps.iva.ez.g<Integer> d2 = this.g.d();
        if (d2 != null && (a2 = d2.a()) != null) {
            this.c.o(com.amazon.aps.iva.du.x.a(this.b, 0, false, a2.a.intValue(), false, false, false, false, false, false, false, 261631));
        }
    }

    @Override // com.amazon.aps.iva.ru.c0
    public final com.amazon.aps.iva.i5.v R2() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.ru.c0
    public final void U5(com.amazon.aps.iva.i5.o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "lifecycleOwner");
        this.c.u0().e(oVar, new e(new a()));
    }

    @Override // com.amazon.aps.iva.nu.f
    public final void Z5() {
        g.c<Integer> a2;
        this.d.Z5();
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<Integer>> vVar = this.g;
        com.amazon.aps.iva.ez.g<Integer> d2 = vVar.d();
        if (d2 != null && (a2 = d2.a()) != null) {
            vVar.k(new g.c(Integer.valueOf(a2.a.intValue() - 1), null));
        }
        P8();
    }

    @Override // com.amazon.aps.iva.ru.c0
    public final void a0() {
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new d(null), 3);
    }

    @Override // com.amazon.aps.iva.ru.c0
    public final com.amazon.aps.iva.i5.v g6() {
        return this.i.u0();
    }

    @Override // com.amazon.aps.iva.ru.c0
    public final void k0() {
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new b(null), 3);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new c(null), 3);
    }

    @Override // com.amazon.aps.iva.vt.h
    public final void o(com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "updatedModel");
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.du.x> vVar = this.j;
        com.amazon.aps.iva.du.x d2 = vVar.d();
        com.amazon.aps.iva.yb0.j.c(d2);
        if (com.amazon.aps.iva.yb0.j.a(xVar.b, d2.b)) {
            vVar.k(xVar);
            com.amazon.aps.iva.du.x xVar2 = this.b;
            boolean z = xVar2.s;
            this.c.o(com.amazon.aps.iva.du.x.a(xVar, 0, false, xVar2.k, false, false, false, false, false, xVar2.r, z, 65023));
            return;
        }
        this.i.o(xVar);
    }
}
