package com.amazon.aps.iva.ve0;
/* compiled from: Share.kt */
@com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class y extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ q0 i;
    public final /* synthetic */ f<Object> j;
    public final /* synthetic */ f0<Object> k;
    public final /* synthetic */ Object l;

    /* compiled from: Share.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<Integer, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
        public /* synthetic */ int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.h = ((Number) obj).intValue();
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(Integer num, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
            return ((a) create(Integer.valueOf(num.intValue()), dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            if (this.h > 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: Share.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<o0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ f<Object> j;
        public final /* synthetic */ f0<Object> k;
        public final /* synthetic */ Object l;

        /* compiled from: Share.kt */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[o0.values().length];
                iArr[o0.START.ordinal()] = 1;
                iArr[o0.STOP.ordinal()] = 2;
                iArr[o0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f<Object> fVar, f0<Object> f0Var, Object obj, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = fVar;
            this.k = f0Var;
            this.l = obj;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(this.j, this.k, this.l, dVar);
            bVar.i = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(o0 o0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                int i2 = a.a[((o0) this.i).ordinal()];
                f0<Object> f0Var = this.k;
                if (i2 != 1) {
                    if (i2 == 3) {
                        com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.ab.t.k;
                        Object obj2 = this.l;
                        if (obj2 == sVar) {
                            f0Var.g();
                        } else {
                            f0Var.b(obj2);
                        }
                    }
                } else {
                    this.h = 1;
                    if (this.j.c(f0Var, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(q0 q0Var, f<Object> fVar, f0<Object> f0Var, Object obj, com.amazon.aps.iva.ob0.d<? super y> dVar) {
        super(2, dVar);
        this.i = q0Var;
        this.j = fVar;
        this.k = f0Var;
        this.l = obj;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new y(this.i, this.j, this.k, this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((y) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[RETURN] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r14.h
            r2 = 4
            r3 = 3
            r4 = 1
            com.amazon.aps.iva.ve0.f<java.lang.Object> r5 = r14.j
            r6 = 2
            com.amazon.aps.iva.ve0.f0<java.lang.Object> r7 = r14.k
            if (r1 == 0) goto L28
            if (r1 == r4) goto L23
            if (r1 == r6) goto L1f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1f:
            com.amazon.aps.iva.ab.x.i0(r15)
            goto L51
        L23:
            com.amazon.aps.iva.ab.x.i0(r15)
            goto L99
        L28:
            com.amazon.aps.iva.ab.x.i0(r15)
            com.amazon.aps.iva.ve0.r0 r15 = com.amazon.aps.iva.ve0.q0.a.a
            com.amazon.aps.iva.ve0.q0 r1 = r14.i
            if (r1 != r15) goto L3a
            r14.h = r4
            java.lang.Object r15 = r5.c(r7, r14)
            if (r15 != r0) goto L99
            return r0
        L3a:
            com.amazon.aps.iva.ve0.s0 r15 = com.amazon.aps.iva.ve0.q0.a.b
            r4 = 0
            if (r1 != r15) goto L5a
            com.amazon.aps.iva.ve0.u0 r15 = r7.f()
            com.amazon.aps.iva.ve0.y$a r1 = new com.amazon.aps.iva.ve0.y$a
            r1.<init>(r4)
            r14.h = r6
            java.lang.Object r15 = com.amazon.aps.iva.dg.b.r(r15, r1, r14)
            if (r15 != r0) goto L51
            return r0
        L51:
            r14.h = r3
            java.lang.Object r15 = r5.c(r7, r14)
            if (r15 != r0) goto L99
            return r0
        L5a:
            com.amazon.aps.iva.ve0.u0 r15 = r7.f()
            com.amazon.aps.iva.ve0.f r15 = r1.a(r15)
            com.amazon.aps.iva.ve0.f r10 = com.amazon.aps.iva.dg.b.m(r15)
            com.amazon.aps.iva.ve0.y$b r15 = new com.amazon.aps.iva.ve0.y$b
            java.lang.Object r1 = r14.l
            r15.<init>(r5, r7, r1, r4)
            r14.h = r2
            int r1 = com.amazon.aps.iva.ve0.r.a
            com.amazon.aps.iva.ve0.q r9 = new com.amazon.aps.iva.ve0.q
            r9.<init>(r15, r4)
            com.amazon.aps.iva.we0.i r15 = new com.amazon.aps.iva.we0.i
            com.amazon.aps.iva.ob0.h r11 = com.amazon.aps.iva.ob0.h.b
            r12 = -2
            com.amazon.aps.iva.ue0.e r13 = com.amazon.aps.iva.ue0.e.SUSPEND
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r1 = 0
            com.amazon.aps.iva.ve0.f r15 = com.amazon.aps.iva.dg.b.i(r15, r1)
            com.amazon.aps.iva.we0.n r1 = com.amazon.aps.iva.we0.n.b
            java.lang.Object r15 = r15.c(r1, r14)
            if (r15 != r0) goto L8f
            goto L91
        L8f:
            com.amazon.aps.iva.kb0.q r15 = com.amazon.aps.iva.kb0.q.a
        L91:
            if (r15 != r0) goto L94
            goto L96
        L94:
            com.amazon.aps.iva.kb0.q r15 = com.amazon.aps.iva.kb0.q.a
        L96:
            if (r15 != r0) goto L99
            return r0
        L99:
            com.amazon.aps.iva.kb0.q r15 = com.amazon.aps.iva.kb0.q.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
