package com.amazon.aps.iva.b0;
/* compiled from: TapGestureDetector.kt */
/* loaded from: classes.dex */
public final class i0 implements h0, com.amazon.aps.iva.o2.c {
    public final /* synthetic */ com.amazon.aps.iva.o2.c b;
    public boolean c;
    public boolean d;
    public final com.amazon.aps.iva.ze0.d e;

    /* compiled from: TapGestureDetector.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {357}, m = "reset")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public i0 h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return i0.this.b(this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {370}, m = "tryAwaitRelease")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public i0 h;
        public /* synthetic */ Object i;
        public int k;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return i0.this.S0(this);
        }
    }

    public i0(com.amazon.aps.iva.o2.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        this.b = cVar;
        this.e = new com.amazon.aps.iva.ze0.d(false);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float I0(int i) {
        return this.b.I0(i);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float O0() {
        return this.b.O0();
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float P0(float f) {
        return this.b.P0(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // com.amazon.aps.iva.b0.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S0(com.amazon.aps.iva.ob0.d<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.b0.i0.b
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.b0.i0$b r0 = (com.amazon.aps.iva.b0.i0.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.b0.i0$b r0 = new com.amazon.aps.iva.b0.i0$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            com.amazon.aps.iva.b0.i0 r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L4b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            com.amazon.aps.iva.ab.x.i0(r6)
            boolean r6 = r5.c
            if (r6 != 0) goto L51
            boolean r6 = r5.d
            if (r6 != 0) goto L51
            r0.h = r5
            r0.k = r4
            com.amazon.aps.iva.ze0.d r6 = r5.e
            java.lang.Object r6 = r6.a(r3, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r0 = r5
        L4b:
            com.amazon.aps.iva.ze0.d r6 = r0.e
            r6.d(r3)
            goto L52
        L51:
            r0 = r5
        L52:
            boolean r6 = r0.c
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.i0.S0(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.b0.i0.a
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.b0.i0$a r0 = (com.amazon.aps.iva.b0.i0.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.b0.i0$a r0 = new com.amazon.aps.iva.b0.i0$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.b0.i0 r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.h = r4
            r0.k = r3
            r5 = 0
            com.amazon.aps.iva.ze0.d r2 = r4.e
            java.lang.Object r5 = r2.a(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            r0 = r4
        L43:
            r5 = 0
            r0.c = r5
            r0.d = r5
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.i0.b(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.o2.c
    public final long b1(long j) {
        return this.b.b1(j);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final int f0(float f) {
        return this.b.f0(f);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // com.amazon.aps.iva.o2.c
    public final long j(long j) {
        return this.b.j(j);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float l0(long j) {
        return this.b.l0(j);
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float x(float f) {
        return this.b.x(f);
    }
}
