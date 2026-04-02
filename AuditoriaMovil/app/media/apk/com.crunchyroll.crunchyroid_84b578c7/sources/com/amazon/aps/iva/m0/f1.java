package com.amazon.aps.iva.m0;
/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class f1 implements com.amazon.aps.iva.o1.a {
    public final /* synthetic */ k<?> b;
    public final /* synthetic */ com.amazon.aps.iva.b0.f0 c;

    /* compiled from: ModalBottomSheet.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {784}, m = "onPostFling-RZ2iAVY")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public long h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return f1.this.A(0L, 0L, this);
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", l = {775}, m = "onPreFling-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public long h;
        public /* synthetic */ Object i;
        public int k;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return f1.this.W0(0L, this);
        }
    }

    public f1(k<?> kVar, com.amazon.aps.iva.b0.f0 f0Var) {
        this.b = kVar;
        this.c = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.amazon.aps.iva.o1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(long r3, long r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o2.o> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof com.amazon.aps.iva.m0.f1.a
            if (r3 == 0) goto L13
            r3 = r7
            com.amazon.aps.iva.m0.f1$a r3 = (com.amazon.aps.iva.m0.f1.a) r3
            int r4 = r3.k
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.k = r4
            goto L18
        L13:
            com.amazon.aps.iva.m0.f1$a r3 = new com.amazon.aps.iva.m0.f1$a
            r3.<init>(r7)
        L18:
            java.lang.Object r4 = r3.i
            com.amazon.aps.iva.pb0.a r7 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r0 = r3.k
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            long r5 = r3.h
            com.amazon.aps.iva.ab.x.i0(r4)
            goto L50
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L31:
            com.amazon.aps.iva.ab.x.i0(r4)
            com.amazon.aps.iva.b0.f0 r4 = r2.c
            com.amazon.aps.iva.b0.f0 r0 = com.amazon.aps.iva.b0.f0.Horizontal
            if (r4 != r0) goto L3f
            float r4 = com.amazon.aps.iva.o2.o.b(r5)
            goto L43
        L3f:
            float r4 = com.amazon.aps.iva.o2.o.c(r5)
        L43:
            r3.h = r5
            r3.k = r1
            com.amazon.aps.iva.m0.k<?> r0 = r2.b
            java.lang.Object r3 = r0.g(r4, r3)
            if (r3 != r7) goto L50
            return r7
        L50:
            com.amazon.aps.iva.o2.o r3 = new com.amazon.aps.iva.o2.o
            r3.<init>(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.f1.A(long, long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.o1.a
    public final long L(int i, long j) {
        float d;
        float d2;
        float f;
        com.amazon.aps.iva.b0.f0 f0Var = com.amazon.aps.iva.b0.f0.Horizontal;
        com.amazon.aps.iva.b0.f0 f0Var2 = this.c;
        if (f0Var2 == f0Var) {
            d = com.amazon.aps.iva.e1.c.c(j);
        } else {
            d = com.amazon.aps.iva.e1.c.d(j);
        }
        float f2 = 0.0f;
        if (d < 0.0f) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            if (z) {
                k<?> kVar = this.b;
                float e = kVar.e(d);
                if (Float.isNaN(kVar.d())) {
                    d2 = 0.0f;
                } else {
                    d2 = kVar.d();
                }
                kVar.j.setValue(Float.valueOf(e));
                float f3 = e - d2;
                if (f0Var2 == f0Var) {
                    f = f3;
                } else {
                    f = 0.0f;
                }
                if (f0Var2 == com.amazon.aps.iva.b0.f0.Vertical) {
                    f2 = f3;
                }
                return com.amazon.aps.iva.e1.d.d(f, f2);
            }
        }
        return com.amazon.aps.iva.e1.c.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.amazon.aps.iva.o1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W0(long r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o2.o> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.m0.f1.b
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.m0.f1$b r0 = (com.amazon.aps.iva.m0.f1.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.m0.f1$b r0 = new com.amazon.aps.iva.m0.f1$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            long r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L6b
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            com.amazon.aps.iva.ab.x.i0(r9)
            com.amazon.aps.iva.b0.f0 r9 = r6.c
            com.amazon.aps.iva.b0.f0 r2 = com.amazon.aps.iva.b0.f0.Horizontal
            if (r9 != r2) goto L3f
            float r9 = com.amazon.aps.iva.o2.o.b(r7)
            goto L43
        L3f:
            float r9 = com.amazon.aps.iva.o2.o.c(r7)
        L43:
            com.amazon.aps.iva.m0.k<?> r2 = r6.b
            float r4 = r2.f()
            r5 = 0
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L69
            com.amazon.aps.iva.o0.q0 r5 = r2.l
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L69
            r0.h = r7
            r0.k = r3
            java.lang.Object r9 = r2.g(r9, r0)
            if (r9 != r1) goto L6b
            return r1
        L69:
            long r7 = com.amazon.aps.iva.o2.o.b
        L6b:
            com.amazon.aps.iva.o2.o r9 = new com.amazon.aps.iva.o2.o
            r9.<init>(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.f1.W0(long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.o1.a
    public final long d0(int i, long j, long j2) {
        float d;
        float d2;
        float f;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            com.amazon.aps.iva.b0.f0 f0Var = com.amazon.aps.iva.b0.f0.Horizontal;
            com.amazon.aps.iva.b0.f0 f0Var2 = this.c;
            if (f0Var2 == f0Var) {
                d = com.amazon.aps.iva.e1.c.c(j2);
            } else {
                d = com.amazon.aps.iva.e1.c.d(j2);
            }
            k<?> kVar = this.b;
            float e = kVar.e(d);
            float f2 = 0.0f;
            if (Float.isNaN(kVar.d())) {
                d2 = 0.0f;
            } else {
                d2 = kVar.d();
            }
            kVar.j.setValue(Float.valueOf(e));
            float f3 = e - d2;
            if (f0Var2 == f0Var) {
                f = f3;
            } else {
                f = 0.0f;
            }
            if (f0Var2 == com.amazon.aps.iva.b0.f0.Vertical) {
                f2 = f3;
            }
            return com.amazon.aps.iva.e1.d.d(f, f2);
        }
        return com.amazon.aps.iva.e1.c.b;
    }
}
