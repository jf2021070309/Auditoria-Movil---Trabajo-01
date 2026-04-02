package com.amazon.aps.iva.o0;
/* compiled from: DerivedState.kt */
/* loaded from: classes.dex */
public final class q0<T> implements com.amazon.aps.iva.y0.h0, r0<T> {
    public final com.amazon.aps.iva.xb0.a<T> b;
    public final h3<T> c;
    public a<T> d;

    /* compiled from: DerivedState.kt */
    /* loaded from: classes.dex */
    public static final class a<T> extends com.amazon.aps.iva.y0.i0 {
        public static final Object h = new Object();
        public int c;
        public int d;
        public com.amazon.aps.iva.p0.b<com.amazon.aps.iva.y0.h0, Integer> e;
        public Object f = h;
        public int g;

        @Override // com.amazon.aps.iva.y0.i0
        public final void a(com.amazon.aps.iva.y0.i0 i0Var) {
            com.amazon.aps.iva.yb0.j.f(i0Var, "value");
            a aVar = (a) i0Var;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }

        @Override // com.amazon.aps.iva.y0.i0
        public final com.amazon.aps.iva.y0.i0 b() {
            return new a();
        }

        public final Object[] c() {
            Object[] objArr;
            com.amazon.aps.iva.p0.b<com.amazon.aps.iva.y0.h0, Integer> bVar = this.e;
            if (bVar == null || (objArr = bVar.a) == null) {
                return new Object[0];
            }
            return objArr;
        }

        public final boolean d(r0<?> r0Var, com.amazon.aps.iva.y0.h hVar) {
            boolean z;
            boolean z2;
            com.amazon.aps.iva.yb0.j.f(r0Var, "derivedState");
            Object obj = com.amazon.aps.iva.y0.m.c;
            synchronized (obj) {
                z = false;
                if (this.c == hVar.d()) {
                    if (this.d == hVar.h()) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (this.f != h && (!z2 || this.g == e(r0Var, hVar))) {
                z = true;
            }
            if (z && z2) {
                synchronized (obj) {
                    this.c = hVar.d();
                    this.d = hVar.h();
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                }
            }
            return z;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:13:0x0025, B:15:0x002a, B:23:0x006b, B:18:0x0042, B:20:0x0046, B:22:0x005f, B:21:0x0057, B:24:0x006e), top: B:43:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int e(com.amazon.aps.iva.o0.r0<?> r11, com.amazon.aps.iva.y0.h r12) {
            /*
                r10 = this;
                java.lang.String r0 = "derivedState"
                com.amazon.aps.iva.yb0.j.f(r11, r0)
                java.lang.Object r0 = com.amazon.aps.iva.y0.m.c
                monitor-enter(r0)
                com.amazon.aps.iva.p0.b<com.amazon.aps.iva.y0.h0, java.lang.Integer> r1 = r10.e     // Catch: java.lang.Throwable -> L95
                monitor-exit(r0)
                r0 = 7
                if (r1 == 0) goto L94
                com.amazon.aps.iva.p0.f r2 = com.amazon.aps.iva.cq.b.K()
                int r3 = r2.d
                r4 = 1
                r5 = 0
                if (r3 <= 0) goto L25
                T[] r6 = r2.b
                r7 = r5
            L1b:
                r8 = r6[r7]
                com.amazon.aps.iva.o0.s0 r8 = (com.amazon.aps.iva.o0.s0) r8
                r8.b(r11)
                int r7 = r7 + r4
                if (r7 < r3) goto L1b
            L25:
                int r3 = r1.c     // Catch: java.lang.Throwable -> L81
                r6 = r5
            L28:
                if (r6 >= r3) goto L6e
                java.lang.Object[] r7 = r1.a     // Catch: java.lang.Throwable -> L81
                r7 = r7[r6]     // Catch: java.lang.Throwable -> L81
                java.lang.String r8 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
                com.amazon.aps.iva.yb0.j.d(r7, r8)     // Catch: java.lang.Throwable -> L81
                java.lang.Object[] r8 = r1.b     // Catch: java.lang.Throwable -> L81
                r8 = r8[r6]     // Catch: java.lang.Throwable -> L81
                java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L81
                int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L81
                com.amazon.aps.iva.y0.h0 r7 = (com.amazon.aps.iva.y0.h0) r7     // Catch: java.lang.Throwable -> L81
                if (r8 == r4) goto L42
                goto L6b
            L42:
                boolean r8 = r7 instanceof com.amazon.aps.iva.o0.q0     // Catch: java.lang.Throwable -> L81
                if (r8 == 0) goto L57
                com.amazon.aps.iva.o0.q0 r7 = (com.amazon.aps.iva.o0.q0) r7     // Catch: java.lang.Throwable -> L81
                com.amazon.aps.iva.o0.q0$a<T> r8 = r7.d     // Catch: java.lang.Throwable -> L81
                com.amazon.aps.iva.y0.i0 r8 = com.amazon.aps.iva.y0.m.j(r8, r12)     // Catch: java.lang.Throwable -> L81
                com.amazon.aps.iva.o0.q0$a r8 = (com.amazon.aps.iva.o0.q0.a) r8     // Catch: java.lang.Throwable -> L81
                com.amazon.aps.iva.xb0.a<T> r9 = r7.b     // Catch: java.lang.Throwable -> L81
                com.amazon.aps.iva.o0.q0$a r7 = r7.f(r8, r12, r5, r9)     // Catch: java.lang.Throwable -> L81
                goto L5f
            L57:
                com.amazon.aps.iva.y0.i0 r7 = r7.n()     // Catch: java.lang.Throwable -> L81
                com.amazon.aps.iva.y0.i0 r7 = com.amazon.aps.iva.y0.m.j(r7, r12)     // Catch: java.lang.Throwable -> L81
            L5f:
                int r0 = r0 * 31
                int r8 = java.lang.System.identityHashCode(r7)     // Catch: java.lang.Throwable -> L81
                int r0 = r0 + r8
                int r0 = r0 * 31
                int r7 = r7.a     // Catch: java.lang.Throwable -> L81
                int r0 = r0 + r7
            L6b:
                int r6 = r6 + 1
                goto L28
            L6e:
                com.amazon.aps.iva.kb0.q r12 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L81
                int r12 = r2.d
                if (r12 <= 0) goto L94
                T[] r1 = r2.b
            L76:
                r2 = r1[r5]
                com.amazon.aps.iva.o0.s0 r2 = (com.amazon.aps.iva.o0.s0) r2
                r2.a(r11)
                int r5 = r5 + r4
                if (r5 < r12) goto L76
                goto L94
            L81:
                r12 = move-exception
                int r0 = r2.d
                if (r0 <= 0) goto L93
                T[] r1 = r2.b
            L88:
                r2 = r1[r5]
                com.amazon.aps.iva.o0.s0 r2 = (com.amazon.aps.iva.o0.s0) r2
                r2.a(r11)
                int r5 = r5 + r4
                if (r5 >= r0) goto L93
                goto L88
            L93:
                throw r12
            L94:
                return r0
            L95:
                r11 = move-exception
                monitor-exit(r0)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.q0.a.e(com.amazon.aps.iva.o0.r0, com.amazon.aps.iva.y0.h):int");
        }
    }

    /* compiled from: DerivedState.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ q0<T> h;
        public final /* synthetic */ com.amazon.aps.iva.p0.b<com.amazon.aps.iva.y0.h0, Integer> i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0<T> q0Var, com.amazon.aps.iva.p0.b<com.amazon.aps.iva.y0.h0, Integer> bVar, int i) {
            super(1);
            this.h = q0Var;
            this.i = bVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
            int i;
            com.amazon.aps.iva.yb0.j.f(obj, "it");
            if (obj != this.h) {
                if (obj instanceof com.amazon.aps.iva.y0.h0) {
                    Object a = i3.a.a();
                    com.amazon.aps.iva.yb0.j.c(a);
                    int intValue = ((Number) a).intValue() - this.j;
                    com.amazon.aps.iva.p0.b<com.amazon.aps.iva.y0.h0, Integer> bVar = this.i;
                    Integer b = bVar.b(obj);
                    if (b != null) {
                        i = b.intValue();
                    } else {
                        i = Integer.MAX_VALUE;
                    }
                    bVar.c(obj, Integer.valueOf(Math.min(intValue, i)));
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        }
    }

    public q0(h3 h3Var, com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "calculation");
        this.b = aVar;
        this.c = h3Var;
        this.d = new a<>();
    }

    @Override // com.amazon.aps.iva.o0.r0
    public final h3<T> b() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:10:0x001f, B:12:0x002b, B:15:0x0033, B:17:0x0038, B:19:0x005d, B:20:0x0060, B:21:0x0063), top: B:83:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:10:0x001f, B:12:0x002b, B:15:0x0033, B:17:0x0038, B:19:0x005d, B:20:0x0060, B:21:0x0063), top: B:83:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.o0.q0.a<T> f(com.amazon.aps.iva.o0.q0.a<T> r9, com.amazon.aps.iva.y0.h r10, boolean r11, com.amazon.aps.iva.xb0.a<? extends T> r12) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.q0.f(com.amazon.aps.iva.o0.q0$a, com.amazon.aps.iva.y0.h, boolean, com.amazon.aps.iva.xb0.a):com.amazon.aps.iva.o0.q0$a");
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final void g(com.amazon.aps.iva.y0.i0 i0Var) {
        this.d = (a) i0Var;
    }

    @Override // com.amazon.aps.iva.o0.p3
    public final T getValue() {
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> f = com.amazon.aps.iva.y0.m.k().f();
        if (f != null) {
            f.invoke(this);
        }
        return (T) f((a) com.amazon.aps.iva.y0.m.i(this.d), com.amazon.aps.iva.y0.m.k(), true, this.b).f;
    }

    @Override // com.amazon.aps.iva.y0.h0
    public final com.amazon.aps.iva.y0.i0 n() {
        return this.d;
    }

    public final String toString() {
        String str;
        a aVar = (a) com.amazon.aps.iva.y0.m.i(this.d);
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        a aVar2 = (a) com.amazon.aps.iva.y0.m.i(this.d);
        if (aVar2.d(this, com.amazon.aps.iva.y0.m.k())) {
            str = String.valueOf(aVar2.f);
        } else {
            str = "<Not calculated>";
        }
        sb.append(str);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.o0.r0
    public final a z() {
        return f((a) com.amazon.aps.iva.y0.m.i(this.d), com.amazon.aps.iva.y0.m.k(), false, this.b);
    }
}
