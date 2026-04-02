package com.amazon.aps.iva.b0;
/* compiled from: ScrollExtensions.kt */
/* loaded from: classes.dex */
public final class m0 {

    /* compiled from: ScrollExtensions.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {40}, m = "animateScrollBy")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public com.amazon.aps.iva.yb0.a0 h;
        public /* synthetic */ Object i;
        public int j;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.j |= Integer.MIN_VALUE;
            return m0.a(null, 0.0f, null, this);
        }
    }

    /* compiled from: ScrollExtensions.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<n0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ float j;
        public final /* synthetic */ com.amazon.aps.iva.z.j<Float> k;
        public final /* synthetic */ com.amazon.aps.iva.yb0.a0 l;

        /* compiled from: ScrollExtensions.kt */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Float, Float, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ com.amazon.aps.iva.yb0.a0 h;
            public final /* synthetic */ n0 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.amazon.aps.iva.yb0.a0 a0Var, n0 n0Var) {
                super(2);
                this.h = a0Var;
                this.i = n0Var;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final com.amazon.aps.iva.kb0.q invoke(Float f, Float f2) {
                float floatValue = f.floatValue();
                f2.floatValue();
                com.amazon.aps.iva.yb0.a0 a0Var = this.h;
                float f3 = a0Var.b;
                a0Var.b = this.i.a(floatValue - f3) + f3;
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, com.amazon.aps.iva.z.j<Float> jVar, com.amazon.aps.iva.yb0.a0 a0Var, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = f;
            this.k = jVar;
            this.l = a0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(this.j, this.k, this.l, dVar);
            bVar.i = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(n0 n0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                float f = this.j;
                com.amazon.aps.iva.z.j<Float> jVar = this.k;
                a aVar2 = new a(this.l, (n0) this.i);
                this.h = 1;
                if (com.amazon.aps.iva.z.w0.a(0.0f, f, 0.0f, jVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.amazon.aps.iva.b0.t0 r5, float r6, com.amazon.aps.iva.z.j<java.lang.Float> r7, com.amazon.aps.iva.ob0.d<? super java.lang.Float> r8) {
        /*
            boolean r0 = r8 instanceof com.amazon.aps.iva.b0.m0.a
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.b0.m0$a r0 = (com.amazon.aps.iva.b0.m0.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.b0.m0$a r0 = new com.amazon.aps.iva.b0.m0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.yb0.a0 r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.amazon.aps.iva.yb0.a0 r8 = new com.amazon.aps.iva.yb0.a0
            r8.<init>()
            com.amazon.aps.iva.b0.m0$b r2 = new com.amazon.aps.iva.b0.m0$b
            r4 = 0
            r2.<init>(r6, r7, r8, r4)
            r0.h = r8
            r0.j = r3
            java.lang.Object r5 = com.amazon.aps.iva.b0.t0.e(r5, r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r5 = r8
        L4b:
            float r5 = r5.b
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.m0.a(com.amazon.aps.iva.b0.t0, float, com.amazon.aps.iva.z.j, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
