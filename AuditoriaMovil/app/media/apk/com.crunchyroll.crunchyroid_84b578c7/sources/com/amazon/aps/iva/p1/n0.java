package com.amazon.aps.iva.p1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.v1.v2;
import com.amazon.aps.iva.z.p0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes.dex */
public final class n0 extends f.c implements m0, f0, com.amazon.aps.iva.o2.c {
    public com.amazon.aps.iva.xb0.p<? super f0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> o;
    public c2 p;
    public m q;
    public final com.amazon.aps.iva.p0.f<a<?>> r;
    public final com.amazon.aps.iva.p0.f<a<?>> s;
    public m t;
    public long u;

    /* compiled from: SuspendingPointerInputFilter.kt */
    /* loaded from: classes.dex */
    public final class a<R> implements com.amazon.aps.iva.p1.c, com.amazon.aps.iva.o2.c, com.amazon.aps.iva.ob0.d<R> {
        public final com.amazon.aps.iva.ob0.d<R> b;
        public final /* synthetic */ n0 c;
        public com.amazon.aps.iva.se0.m<? super m> d;
        public n e = n.Main;
        public final com.amazon.aps.iva.ob0.h f = com.amazon.aps.iva.ob0.h.b;

        /* compiled from: SuspendingPointerInputFilter.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {728}, m = "withTimeout")
        /* renamed from: com.amazon.aps.iva.p1.n0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0592a<T> extends com.amazon.aps.iva.qb0.c {
            public c2 h;
            public /* synthetic */ Object i;
            public final /* synthetic */ a<R> j;
            public int k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0592a(a<R> aVar, com.amazon.aps.iva.ob0.d<? super C0592a> dVar) {
                super(dVar);
                this.j = aVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                this.i = obj;
                this.k |= Integer.MIN_VALUE;
                return this.j.z0(0L, null, this);
            }
        }

        /* compiled from: SuspendingPointerInputFilter.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {720, 721}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public final /* synthetic */ long i;
            public final /* synthetic */ a<R> j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, a<R> aVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
                super(2, dVar);
                this.i = j;
                this.j = aVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new b(this.i, this.j, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
            @Override // com.amazon.aps.iva.qb0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r1 = r10.h
                    r2 = 1
                    long r4 = r10.i
                    r6 = 2
                    r7 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r7) goto L1c
                    if (r1 != r6) goto L14
                    com.amazon.aps.iva.ab.x.i0(r11)
                    goto L37
                L14:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1c:
                    com.amazon.aps.iva.ab.x.i0(r11)
                    goto L2e
                L20:
                    com.amazon.aps.iva.ab.x.i0(r11)
                    long r8 = r4 - r2
                    r10.h = r7
                    java.lang.Object r11 = com.amazon.aps.iva.ab.t.l(r8, r10)
                    if (r11 != r0) goto L2e
                    return r0
                L2e:
                    r10.h = r6
                    java.lang.Object r11 = com.amazon.aps.iva.ab.t.l(r2, r10)
                    if (r11 != r0) goto L37
                    return r0
                L37:
                    com.amazon.aps.iva.p1.n0$a<R> r11 = r10.j
                    com.amazon.aps.iva.se0.m<? super com.amazon.aps.iva.p1.m> r11 = r11.d
                    if (r11 == 0) goto L49
                    com.amazon.aps.iva.p1.o r0 = new com.amazon.aps.iva.p1.o
                    r0.<init>(r4)
                    com.amazon.aps.iva.kb0.k$a r0 = com.amazon.aps.iva.ab.x.H(r0)
                    r11.resumeWith(r0)
                L49:
                    com.amazon.aps.iva.kb0.q r11 = com.amazon.aps.iva.kb0.q.a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p1.n0.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(com.amazon.aps.iva.se0.n nVar) {
            this.b = nVar;
            this.c = n0.this;
        }

        @Override // com.amazon.aps.iva.p1.c
        public final Object G(n nVar, com.amazon.aps.iva.qb0.a aVar) {
            com.amazon.aps.iva.se0.n nVar2 = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(aVar));
            nVar2.r();
            this.e = nVar;
            this.d = nVar2;
            Object q = nVar2.q();
            com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            return q;
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float I0(int i) {
            return this.c.I0(i);
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float O0() {
            return this.c.O0();
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float P0(float f) {
            return this.c.getDensity() * f;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // com.amazon.aps.iva.p1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object R(long r5, com.amazon.aps.iva.b0.x0 r7, com.amazon.aps.iva.ob0.d r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof com.amazon.aps.iva.p1.o0
                if (r0 == 0) goto L13
                r0 = r8
                com.amazon.aps.iva.p1.o0 r0 = (com.amazon.aps.iva.p1.o0) r0
                int r1 = r0.j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.j = r1
                goto L18
            L13:
                com.amazon.aps.iva.p1.o0 r0 = new com.amazon.aps.iva.p1.o0
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.j
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                com.amazon.aps.iva.ab.x.i0(r8)     // Catch: com.amazon.aps.iva.p1.o -> L3b
                goto L3c
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                com.amazon.aps.iva.ab.x.i0(r8)
                r0.j = r3     // Catch: com.amazon.aps.iva.p1.o -> L3b
                java.lang.Object r8 = r4.z0(r5, r7, r0)     // Catch: com.amazon.aps.iva.p1.o -> L3b
                if (r8 != r1) goto L3c
                return r1
            L3b:
                r8 = 0
            L3c:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p1.n0.a.R(long, com.amazon.aps.iva.b0.x0, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }

        @Override // com.amazon.aps.iva.p1.c
        public final long Y() {
            n0 n0Var = n0.this;
            n0Var.getClass();
            long b1 = n0Var.b1(com.amazon.aps.iva.u1.i.e(n0Var).u.d());
            long j = n0Var.u;
            return com.amazon.aps.iva.ab.r.d(Math.max(0.0f, com.amazon.aps.iva.e1.g.d(b1) - ((int) (j >> 32))) / 2.0f, Math.max(0.0f, com.amazon.aps.iva.e1.g.b(b1) - com.amazon.aps.iva.o2.j.b(j)) / 2.0f);
        }

        @Override // com.amazon.aps.iva.p1.c
        public final long a() {
            return n0.this.u;
        }

        @Override // com.amazon.aps.iva.o2.c
        public final long b1(long j) {
            return this.c.b1(j);
        }

        @Override // com.amazon.aps.iva.o2.c
        public final int f0(float f) {
            return this.c.f0(f);
        }

        @Override // com.amazon.aps.iva.ob0.d
        public final com.amazon.aps.iva.ob0.g getContext() {
            return this.f;
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float getDensity() {
            return this.c.getDensity();
        }

        @Override // com.amazon.aps.iva.p1.c
        public final v2 getViewConfiguration() {
            n0 n0Var = n0.this;
            n0Var.getClass();
            return com.amazon.aps.iva.u1.i.e(n0Var).u;
        }

        @Override // com.amazon.aps.iva.o2.c
        public final long j(long j) {
            return this.c.j(j);
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float l0(long j) {
            return this.c.l0(j);
        }

        @Override // com.amazon.aps.iva.ob0.d
        public final void resumeWith(Object obj) {
            n0 n0Var = n0.this;
            synchronized (n0Var.r) {
                n0Var.r.k(this);
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
            this.b.resumeWith(obj);
        }

        @Override // com.amazon.aps.iva.p1.c
        public final m v0() {
            return n0.this.q;
        }

        @Override // com.amazon.aps.iva.o2.c
        public final float x(float f) {
            return f / this.c.getDensity();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Type inference failed for: r7v1, types: [com.amazon.aps.iva.se0.j1] */
        /* JADX WARN: Type inference failed for: r7v4, types: [com.amazon.aps.iva.se0.j1] */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8 */
        @Override // com.amazon.aps.iva.p1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object z0(long r7, com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.p1.c, ? super com.amazon.aps.iva.ob0.d<? super T>, ? extends java.lang.Object> r9, com.amazon.aps.iva.ob0.d<? super T> r10) {
            /*
                r6 = this;
                boolean r0 = r10 instanceof com.amazon.aps.iva.p1.n0.a.C0592a
                if (r0 == 0) goto L13
                r0 = r10
                com.amazon.aps.iva.p1.n0$a$a r0 = (com.amazon.aps.iva.p1.n0.a.C0592a) r0
                int r1 = r0.k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.k = r1
                goto L18
            L13:
                com.amazon.aps.iva.p1.n0$a$a r0 = new com.amazon.aps.iva.p1.n0$a$a
                r0.<init>(r6, r10)
            L18:
                java.lang.Object r10 = r0.i
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.k
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                com.amazon.aps.iva.se0.c2 r7 = r0.h
                com.amazon.aps.iva.ab.x.i0(r10)     // Catch: java.lang.Throwable -> L6c
                goto L66
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                com.amazon.aps.iva.ab.x.i0(r10)
                r4 = 0
                int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r10 > 0) goto L4a
                com.amazon.aps.iva.se0.m<? super com.amazon.aps.iva.p1.m> r10 = r6.d
                if (r10 == 0) goto L4a
                com.amazon.aps.iva.p1.o r2 = new com.amazon.aps.iva.p1.o
                r2.<init>(r7)
                com.amazon.aps.iva.kb0.k$a r2 = com.amazon.aps.iva.ab.x.H(r2)
                r10.resumeWith(r2)
            L4a:
                com.amazon.aps.iva.p1.n0 r10 = com.amazon.aps.iva.p1.n0.this
                com.amazon.aps.iva.se0.g0 r10 = r10.i1()
                com.amazon.aps.iva.p1.n0$a$b r2 = new com.amazon.aps.iva.p1.n0$a$b
                r4 = 0
                r2.<init>(r7, r6, r4)
                r7 = 3
                com.amazon.aps.iva.se0.c2 r7 = com.amazon.aps.iva.se0.i.d(r10, r4, r4, r2, r7)
                r0.h = r7     // Catch: java.lang.Throwable -> L6c
                r0.k = r3     // Catch: java.lang.Throwable -> L6c
                java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L6c
                if (r10 != r1) goto L66
                return r1
            L66:
                com.amazon.aps.iva.p1.d r8 = com.amazon.aps.iva.p1.d.b
                r7.a(r8)
                return r10
            L6c:
                r8 = move-exception
                com.amazon.aps.iva.p1.d r9 = com.amazon.aps.iva.p1.d.b
                r7.a(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p1.n0.a.z0(long, com.amazon.aps.iva.xb0.p, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ a<R> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a<R> aVar) {
            super(1);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            Throwable th2 = th;
            a<R> aVar = this.h;
            com.amazon.aps.iva.se0.m<? super m> mVar = aVar.d;
            if (mVar != null) {
                mVar.J(th2);
            }
            aVar.d = null;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {562}, m = "invokeSuspend")
    /* loaded from: classes.dex */
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
                n0 n0Var = n0.this;
                com.amazon.aps.iva.xb0.p<? super f0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar = n0Var.o;
                this.h = 1;
                if (pVar.invoke(n0Var, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public n0(com.amazon.aps.iva.xb0.p<? super f0, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "pointerInputHandler");
        this.o = pVar;
        this.q = l0.a;
        this.r = new com.amazon.aps.iva.p0.f<>(new a[16]);
        this.s = new com.amazon.aps.iva.p0.f<>(new a[16]);
        this.u = 0L;
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void C0(m mVar, n nVar, long j) {
        com.amazon.aps.iva.yb0.j.f(nVar, "pass");
        this.u = j;
        if (nVar == n.Initial) {
            this.q = mVar;
        }
        if (this.p == null) {
            this.p = com.amazon.aps.iva.se0.i.d(i1(), null, com.amazon.aps.iva.se0.h0.UNDISPATCHED, new d(null), 1);
        }
        t1(mVar, nVar);
        List<y> list = mVar.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                if (!f1.p(list.get(i))) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!(!z)) {
            mVar = null;
        }
        this.t = mVar;
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void G0() {
        boolean z;
        m mVar = this.t;
        if (mVar == null) {
            return;
        }
        List<y> list = mVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            z = true;
            if (i >= size) {
                break;
            } else if (!(true ^ list.get(i).d)) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            y yVar = list.get(i2);
            long j = yVar.a;
            long j2 = yVar.c;
            long j3 = yVar.b;
            float f = yVar.e;
            boolean z2 = yVar.d;
            arrayList.add(new y(j, j3, j2, false, f, j3, j2, z2, z2, 1, com.amazon.aps.iva.e1.c.b));
        }
        m mVar2 = new m(arrayList, null);
        this.q = mVar2;
        t1(mVar2, n.Initial);
        t1(mVar2, n.Main);
        t1(mVar2, n.Final);
        this.t = null;
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void M0() {
        r0();
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float O0() {
        return com.amazon.aps.iva.u1.i.e(this).s.O0();
    }

    @Override // com.amazon.aps.iva.p1.f0
    public final <R> Object X(com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.p1.c, ? super com.amazon.aps.iva.ob0.d<? super R>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super R> dVar) {
        com.amazon.aps.iva.se0.n nVar = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(dVar));
        nVar.r();
        a aVar = new a(nVar);
        synchronized (this.r) {
            this.r.b(aVar);
            new com.amazon.aps.iva.ob0.i(com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED, com.amazon.aps.iva.a60.b.s(com.amazon.aps.iva.a60.b.o(pVar, aVar, aVar))).resumeWith(com.amazon.aps.iva.kb0.q.a);
        }
        nVar.w(new c(aVar));
        return nVar.q();
    }

    @Override // com.amazon.aps.iva.p1.f0
    public final long a() {
        return this.u;
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void c1() {
        r0();
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float getDensity() {
        return com.amazon.aps.iva.u1.i.e(this).s.getDensity();
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void n1() {
        r0();
    }

    @Override // com.amazon.aps.iva.p1.m0
    public final void r0() {
        c2 c2Var = this.p;
        if (c2Var != null) {
            c2Var.a(new p0(1));
            this.p = null;
        }
    }

    public final void t1(m mVar, n nVar) {
        com.amazon.aps.iva.se0.m<? super m> mVar2;
        com.amazon.aps.iva.p0.f<a<?>> fVar;
        int i;
        com.amazon.aps.iva.se0.m<? super m> mVar3;
        synchronized (this.r) {
            com.amazon.aps.iva.p0.f<a<?>> fVar2 = this.s;
            fVar2.c(fVar2.d, this.r);
        }
        try {
            int i2 = b.a[nVar.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3 && (i = (fVar = this.s).d) > 0) {
                    int i3 = i - 1;
                    a<?>[] aVarArr = fVar.b;
                    do {
                        a<?> aVar = aVarArr[i3];
                        aVar.getClass();
                        if (nVar == aVar.e && (mVar3 = aVar.d) != null) {
                            aVar.d = null;
                            mVar3.resumeWith(mVar);
                        }
                        i3--;
                    } while (i3 >= 0);
                }
            } else {
                com.amazon.aps.iva.p0.f<a<?>> fVar3 = this.s;
                int i4 = fVar3.d;
                if (i4 > 0) {
                    a<?>[] aVarArr2 = fVar3.b;
                    int i5 = 0;
                    do {
                        a<?> aVar2 = aVarArr2[i5];
                        aVar2.getClass();
                        if (nVar == aVar2.e && (mVar2 = aVar2.d) != null) {
                            aVar2.d = null;
                            mVar2.resumeWith(mVar);
                        }
                        i5++;
                    } while (i5 < i4);
                }
            }
        } finally {
            this.s.f();
        }
    }
}
