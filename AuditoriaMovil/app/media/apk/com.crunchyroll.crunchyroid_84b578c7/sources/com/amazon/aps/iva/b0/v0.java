package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.a0.p1;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.y1;
import com.google.android.gms.cast.MediaError;
/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class v0 {
    public final f0 a;
    public final boolean b;
    public final p3<com.amazon.aps.iva.o1.b> c;
    public final t0 d;
    public final b0 e;
    public final p1 f;
    public final y1 g;

    /* compiled from: Scrollable.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.e1.c> {
        public final /* synthetic */ int i;
        public final /* synthetic */ n0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, n0 n0Var) {
            super(1);
            this.i = i;
            this.j = n0Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.e1.c invoke(com.amazon.aps.iva.e1.c cVar) {
            long j;
            long j2;
            long j3 = cVar.a;
            v0 v0Var = v0.this;
            com.amazon.aps.iva.o1.b value = v0Var.c.getValue();
            com.amazon.aps.iva.o1.c e = value.e();
            if (e != null) {
                j = e.L(this.i, j3);
            } else {
                j = com.amazon.aps.iva.e1.c.b;
            }
            long j4 = j;
            long e2 = com.amazon.aps.iva.e1.c.e(j3, j4);
            boolean z = v0Var.b;
            if (z) {
                j2 = com.amazon.aps.iva.e1.c.g(e2, -1.0f);
            } else {
                j2 = e2;
            }
            long e3 = v0Var.e(this.j.a(v0Var.d(j2)));
            if (z) {
                e3 = com.amazon.aps.iva.e1.c.g(e3, -1.0f);
            }
            long j5 = e3;
            return new com.amazon.aps.iva.e1.c(com.amazon.aps.iva.e1.c.f(com.amazon.aps.iva.e1.c.f(j4, j5), value.b(this.i, j5, com.amazon.aps.iva.e1.c.e(e2, j5))));
        }
    }

    /* compiled from: Scrollable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {488}, m = "doFlingAnimation-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.yb0.c0 h;
        public /* synthetic */ Object i;
        public int k;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return v0.this.b(0L, this);
        }
    }

    /* compiled from: Scrollable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {MediaError.DetailedErrorCode.SEGMENT_UNKNOWN}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<n0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public v0 h;
        public com.amazon.aps.iva.yb0.c0 i;
        public long j;
        public int k;
        public /* synthetic */ Object l;
        public final /* synthetic */ com.amazon.aps.iva.yb0.c0 n;
        public final /* synthetic */ long o;

        /* compiled from: Scrollable.kt */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.e1.c> {
            public final /* synthetic */ v0 h;
            public final /* synthetic */ n0 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v0 v0Var, n0 n0Var) {
                super(1);
                this.h = v0Var;
                this.i = n0Var;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.e1.c invoke(com.amazon.aps.iva.e1.c cVar) {
                long j = cVar.a;
                v0 v0Var = this.h;
                if (v0Var.b) {
                    j = com.amazon.aps.iva.e1.c.g(j, -1.0f);
                }
                long a = v0Var.a(this.i, j, 2);
                if (v0Var.b) {
                    a = com.amazon.aps.iva.e1.c.g(a, -1.0f);
                }
                return new com.amazon.aps.iva.e1.c(a);
            }
        }

        /* compiled from: Scrollable.kt */
        /* loaded from: classes.dex */
        public static final class b implements n0 {
            public final /* synthetic */ v0 a;
            public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.e1.c> b;

            public b(v0 v0Var, a aVar) {
                this.a = v0Var;
                this.b = aVar;
            }

            @Override // com.amazon.aps.iva.b0.n0
            public final float a(float f) {
                v0 v0Var = this.a;
                return v0Var.d(this.b.invoke(new com.amazon.aps.iva.e1.c(v0Var.e(f))).a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.yb0.c0 c0Var, long j, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.n = c0Var;
            this.o = j;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            c cVar = new c(this.n, this.o, dVar);
            cVar.l = obj;
            return cVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(n0 n0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(n0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            v0 v0Var;
            com.amazon.aps.iva.yb0.c0 c0Var;
            float c;
            long j;
            v0 v0Var2;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.k;
            int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    j = this.j;
                    c0Var = this.i;
                    v0Var = this.h;
                    v0Var2 = (v0) this.l;
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                v0Var = v0.this;
                b bVar = new b(v0Var, new a(v0Var, (n0) this.l));
                b0 b0Var = v0Var.e;
                c0Var = this.n;
                long j2 = c0Var.b;
                f0 f0Var = f0.Horizontal;
                f0 f0Var2 = v0Var.a;
                long j3 = this.o;
                if (f0Var2 == f0Var) {
                    c = com.amazon.aps.iva.o2.o.b(j3);
                } else {
                    c = com.amazon.aps.iva.o2.o.c(j3);
                }
                if (v0Var.b) {
                    c *= -1;
                }
                this.l = v0Var;
                this.h = v0Var;
                this.i = c0Var;
                this.j = j2;
                this.k = 1;
                obj = b0Var.a(bVar, c, this);
                if (obj == aVar) {
                    return aVar;
                }
                j = j2;
                v0Var2 = v0Var;
            }
            float floatValue = ((Number) obj).floatValue();
            if (v0Var2.b) {
                floatValue *= -1;
            }
            float f = 0.0f;
            if (v0Var.a == f0.Horizontal) {
                i2 = 2;
            } else {
                f = floatValue;
                floatValue = 0.0f;
            }
            c0Var.b = com.amazon.aps.iva.o2.o.a(j, floatValue, f, i2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Scrollable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {477, 479}, m = "onDragStopped-sF-c-tU")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public v0 h;
        public /* synthetic */ Object i;
        public int k;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return v0.this.c(0L, this);
        }
    }

    /* compiled from: Scrollable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", l = {464, 466, 468}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o2.o, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o2.o>, Object> {
        public long h;
        public int i;
        public /* synthetic */ long j;

        public e(com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.j = ((com.amazon.aps.iva.o2.o) obj).a;
            return eVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.o2.o oVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o2.o> dVar) {
            return ((e) create(new com.amazon.aps.iva.o2.o(oVar.a), dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                com.amazon.aps.iva.pb0.a r6 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r0 = r11.i
                r1 = 3
                r2 = 2
                r3 = 1
                com.amazon.aps.iva.b0.v0 r4 = com.amazon.aps.iva.b0.v0.this
                if (r0 == 0) goto L33
                if (r0 == r3) goto L2c
                if (r0 == r2) goto L23
                if (r0 != r1) goto L1b
                long r0 = r11.h
                long r2 = r11.j
                com.amazon.aps.iva.ab.x.i0(r12)
                r9 = r0
                r0 = r12
                goto L82
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L23:
                long r2 = r11.h
                long r7 = r11.j
                com.amazon.aps.iva.ab.x.i0(r12)
                r0 = r12
                goto L61
            L2c:
                long r7 = r11.j
                com.amazon.aps.iva.ab.x.i0(r12)
                r0 = r12
                goto L4b
            L33:
                com.amazon.aps.iva.ab.x.i0(r12)
                long r7 = r11.j
                com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.o1.b> r0 = r4.c
                java.lang.Object r0 = r0.getValue()
                com.amazon.aps.iva.o1.b r0 = (com.amazon.aps.iva.o1.b) r0
                r11.j = r7
                r11.i = r3
                java.lang.Object r0 = r0.c(r7, r11)
                if (r0 != r6) goto L4b
                return r6
            L4b:
                com.amazon.aps.iva.o2.o r0 = (com.amazon.aps.iva.o2.o) r0
                long r9 = r0.a
                long r9 = com.amazon.aps.iva.o2.o.d(r7, r9)
                r11.j = r7
                r11.h = r9
                r11.i = r2
                java.lang.Object r0 = r4.b(r9, r11)
                if (r0 != r6) goto L60
                return r6
            L60:
                r2 = r9
            L61:
                com.amazon.aps.iva.o2.o r0 = (com.amazon.aps.iva.o2.o) r0
                long r9 = r0.a
                com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.o1.b> r0 = r4.c
                java.lang.Object r0 = r0.getValue()
                com.amazon.aps.iva.o1.b r0 = (com.amazon.aps.iva.o1.b) r0
                long r2 = com.amazon.aps.iva.o2.o.d(r2, r9)
                r11.j = r7
                r11.h = r9
                r11.i = r1
                r1 = r2
                r3 = r9
                r5 = r11
                java.lang.Object r0 = r0.a(r1, r3, r5)
                if (r0 != r6) goto L81
                return r6
            L81:
                r2 = r7
            L82:
                com.amazon.aps.iva.o2.o r0 = (com.amazon.aps.iva.o2.o) r0
                long r0 = r0.a
                long r0 = com.amazon.aps.iva.o2.o.d(r9, r0)
                long r0 = com.amazon.aps.iva.o2.o.d(r2, r0)
                com.amazon.aps.iva.o2.o r2 = new com.amazon.aps.iva.o2.o
                r2.<init>(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.v0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public v0(f0 f0Var, boolean z, q1 q1Var, t0 t0Var, b0 b0Var, p1 p1Var) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "orientation");
        com.amazon.aps.iva.yb0.j.f(q1Var, "nestedScrollDispatcher");
        com.amazon.aps.iva.yb0.j.f(t0Var, "scrollableState");
        com.amazon.aps.iva.yb0.j.f(b0Var, "flingBehavior");
        this.a = f0Var;
        this.b = z;
        this.c = q1Var;
        this.d = t0Var;
        this.e = b0Var;
        this.f = p1Var;
        this.g = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
    }

    public final long a(n0 n0Var, long j, int i) {
        long d2;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(n0Var, "$this$dispatchScroll");
        if (this.a == f0.Horizontal) {
            d2 = com.amazon.aps.iva.e1.d.d(com.amazon.aps.iva.e1.c.c(j), 0.0f);
        } else {
            d2 = com.amazon.aps.iva.e1.d.d(0.0f, com.amazon.aps.iva.e1.c.d(j));
        }
        a aVar = new a(i, n0Var);
        p1 p1Var = this.f;
        if (p1Var != null) {
            t0 t0Var = this.d;
            if (!t0Var.b() && !t0Var.d()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return p1Var.b(d2, i, aVar);
            }
        }
        return ((com.amazon.aps.iva.e1.c) aVar.invoke(new com.amazon.aps.iva.e1.c(d2))).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r11, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o2.o> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.amazon.aps.iva.b0.v0.b
            if (r0 == 0) goto L13
            r0 = r13
            com.amazon.aps.iva.b0.v0$b r0 = (com.amazon.aps.iva.b0.v0.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.b0.v0$b r0 = new com.amazon.aps.iva.b0.v0$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.yb0.c0 r11 = r0.h
            com.amazon.aps.iva.ab.x.i0(r13)
            goto L53
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            com.amazon.aps.iva.ab.x.i0(r13)
            com.amazon.aps.iva.yb0.c0 r13 = new com.amazon.aps.iva.yb0.c0
            r13.<init>()
            r13.b = r11
            com.amazon.aps.iva.b0.v0$c r2 = new com.amazon.aps.iva.b0.v0$c
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r13
            r7 = r11
            r4.<init>(r6, r7, r9)
            r0.h = r13
            r0.k = r3
            com.amazon.aps.iva.b0.t0 r11 = r10.d
            java.lang.Object r11 = com.amazon.aps.iva.b0.t0.e(r11, r2, r0)
            if (r11 != r1) goto L52
            return r1
        L52:
            r11 = r13
        L53:
            long r11 = r11.b
            com.amazon.aps.iva.o2.o r13 = new com.amazon.aps.iva.o2.o
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.v0.b(long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.amazon.aps.iva.b0.v0.d
            if (r0 == 0) goto L13
            r0 = r10
            com.amazon.aps.iva.b0.v0$d r0 = (com.amazon.aps.iva.b0.v0.d) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.b0.v0$d r0 = new com.amazon.aps.iva.b0.v0$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            com.amazon.aps.iva.b0.v0 r8 = r0.h
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L87
        L35:
            com.amazon.aps.iva.ab.x.i0(r10)
            com.amazon.aps.iva.o0.y1 r10 = r7.g
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r10.setValue(r2)
            com.amazon.aps.iva.b0.f0 r10 = r7.a
            com.amazon.aps.iva.b0.f0 r2 = com.amazon.aps.iva.b0.f0.Horizontal
            if (r10 != r2) goto L47
            r10 = r4
            goto L48
        L47:
            r10 = r3
        L48:
            r2 = 0
            long r8 = com.amazon.aps.iva.o2.o.a(r8, r2, r2, r10)
            com.amazon.aps.iva.b0.v0$e r10 = new com.amazon.aps.iva.b0.v0$e
            r2 = 0
            r10.<init>(r2)
            com.amazon.aps.iva.a0.p1 r2 = r7.f
            if (r2 == 0) goto L76
            com.amazon.aps.iva.b0.t0 r5 = r7.d
            boolean r6 = r5.b()
            if (r6 != 0) goto L68
            boolean r5 = r5.d()
            if (r5 == 0) goto L66
            goto L68
        L66:
            r5 = 0
            goto L69
        L68:
            r5 = r4
        L69:
            if (r5 == 0) goto L76
            r0.h = r7
            r0.k = r4
            java.lang.Object r8 = r2.a(r8, r10, r0)
            if (r8 != r1) goto L86
            return r1
        L76:
            com.amazon.aps.iva.o2.o r2 = new com.amazon.aps.iva.o2.o
            r2.<init>(r8)
            r0.h = r7
            r0.k = r3
            java.lang.Object r8 = r10.invoke(r2, r0)
            if (r8 != r1) goto L86
            return r1
        L86:
            r8 = r7
        L87:
            com.amazon.aps.iva.o0.y1 r8 = r8.g
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.setValue(r9)
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.v0.c(long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final float d(long j) {
        if (this.a == f0.Horizontal) {
            return com.amazon.aps.iva.e1.c.c(j);
        }
        return com.amazon.aps.iva.e1.c.d(j);
    }

    public final long e(float f) {
        boolean z;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = com.amazon.aps.iva.e1.c.e;
            return com.amazon.aps.iva.e1.c.b;
        } else if (this.a == f0.Horizontal) {
            return com.amazon.aps.iva.e1.d.d(f, 0.0f);
        } else {
            return com.amazon.aps.iva.e1.d.d(0.0f, f);
        }
    }
}
