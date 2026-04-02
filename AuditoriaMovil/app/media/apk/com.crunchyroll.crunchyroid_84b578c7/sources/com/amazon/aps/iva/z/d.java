package com.amazon.aps.iva.z;

import com.amazon.aps.iva.o0.p3;
/* compiled from: AnimateAsState.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {419}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public com.amazon.aps.iva.ue0.h h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ com.amazon.aps.iva.ue0.f<Object> k;
    public final /* synthetic */ b<Object, Object> l;
    public final /* synthetic */ p3<j<Object>> m;
    public final /* synthetic */ p3<com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q>> n;

    /* compiled from: AnimateAsState.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {428}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ Object i;
        public final /* synthetic */ b<Object, Object> j;
        public final /* synthetic */ p3<j<Object>> k;
        public final /* synthetic */ p3<com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q>> l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, b<Object, Object> bVar, p3<? extends j<Object>> p3Var, p3<? extends com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q>> p3Var2, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = obj;
            this.j = bVar;
            this.k = p3Var;
            this.l = p3Var2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            b<Object, Object> bVar = this.j;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                T value = bVar.e.getValue();
                Object obj2 = this.i;
                if (!com.amazon.aps.iva.yb0.j.a(obj2, value)) {
                    u0<Float> u0Var = e.a;
                    this.h = 1;
                    if (b.b(bVar, obj2, this.k.getValue(), this) == aVar) {
                        return aVar;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
            u0<Float> u0Var2 = e.a;
            com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> value2 = this.l.getValue();
            if (value2 != null) {
                value2.invoke(bVar.c());
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(com.amazon.aps.iva.ue0.f<Object> fVar, b<Object, Object> bVar, p3<? extends j<Object>> p3Var, p3<? extends com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q>> p3Var2, com.amazon.aps.iva.ob0.d<? super d> dVar) {
        super(2, dVar);
        this.k = fVar;
        this.l = bVar;
        this.m = p3Var;
        this.n = p3Var2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        d dVar2 = new d(this.k, this.l, this.m, this.n, dVar);
        dVar2.j = obj;
        return dVar2;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003b -> B:13:0x0041). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r13.i
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            com.amazon.aps.iva.ue0.h r1 = r13.h
            java.lang.Object r3 = r13.j
            com.amazon.aps.iva.se0.g0 r3 = (com.amazon.aps.iva.se0.g0) r3
            com.amazon.aps.iva.ab.x.i0(r14)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r13
            goto L41
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            com.amazon.aps.iva.ab.x.i0(r14)
            java.lang.Object r14 = r13.j
            com.amazon.aps.iva.se0.g0 r14 = (com.amazon.aps.iva.se0.g0) r14
            com.amazon.aps.iva.ue0.f<java.lang.Object> r1 = r13.k
            com.amazon.aps.iva.ue0.h r1 = r1.iterator()
            r3 = r14
            r14 = r13
        L2e:
            r14.j = r3
            r14.h = r1
            r14.i = r2
            java.lang.Object r4 = r1.a(r14)
            if (r4 != r0) goto L3b
            return r0
        L3b:
            r12 = r0
            r0 = r14
            r14 = r4
            r4 = r3
            r3 = r1
            r1 = r12
        L41:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L73
            java.lang.Object r14 = r3.next()
            com.amazon.aps.iva.ue0.f<java.lang.Object> r5 = r0.k
            java.lang.Object r5 = r5.q()
            java.lang.Object r5 = com.amazon.aps.iva.ue0.i.a(r5)
            if (r5 != 0) goto L5b
            r7 = r14
            goto L5c
        L5b:
            r7 = r5
        L5c:
            com.amazon.aps.iva.z.d$a r14 = new com.amazon.aps.iva.z.d$a
            com.amazon.aps.iva.z.b<java.lang.Object, java.lang.Object> r8 = r0.l
            com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.z.j<java.lang.Object>> r9 = r0.m
            com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.xb0.l<java.lang.Object, com.amazon.aps.iva.kb0.q>> r10 = r0.n
            r11 = 0
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r5 = 3
            r6 = 0
            com.amazon.aps.iva.se0.i.d(r4, r6, r6, r14, r5)
            r14 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L2e
        L73:
            com.amazon.aps.iva.kb0.q r14 = com.amazon.aps.iva.kb0.q.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
