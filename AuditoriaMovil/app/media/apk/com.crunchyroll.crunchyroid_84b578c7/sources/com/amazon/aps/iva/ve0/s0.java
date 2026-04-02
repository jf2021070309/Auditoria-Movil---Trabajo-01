package com.amazon.aps.iva.ve0;
/* compiled from: SharingStarted.kt */
/* loaded from: classes4.dex */
public final class s0 implements q0 {

    /* compiled from: SharingStarted.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g<? super o0>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ u0<Integer> j;

        /* compiled from: SharingStarted.kt */
        /* renamed from: com.amazon.aps.iva.ve0.s0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0800a<T> implements g {
            public final /* synthetic */ com.amazon.aps.iva.yb0.z b;
            public final /* synthetic */ g<o0> c;

            /* compiled from: SharingStarted.kt */
            @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
            /* renamed from: com.amazon.aps.iva.ve0.s0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0801a extends com.amazon.aps.iva.qb0.c {
                public /* synthetic */ Object h;
                public final /* synthetic */ C0800a<T> i;
                public int j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0801a(C0800a<? super T> c0800a, com.amazon.aps.iva.ob0.d<? super C0801a> dVar) {
                    super(dVar);
                    this.i = c0800a;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    this.h = obj;
                    this.j |= Integer.MIN_VALUE;
                    return this.i.c(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0800a(com.amazon.aps.iva.yb0.z zVar, g<? super o0> gVar) {
                this.b = zVar;
                this.c = gVar;
            }

            @Override // com.amazon.aps.iva.ve0.g
            public final /* bridge */ /* synthetic */ Object a(Object obj, com.amazon.aps.iva.ob0.d dVar) {
                return c(((Number) obj).intValue(), dVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object c(int r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.amazon.aps.iva.ve0.s0.a.C0800a.C0801a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.amazon.aps.iva.ve0.s0$a$a$a r0 = (com.amazon.aps.iva.ve0.s0.a.C0800a.C0801a) r0
                    int r1 = r0.j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.j = r1
                    goto L18
                L13:
                    com.amazon.aps.iva.ve0.s0$a$a$a r0 = new com.amazon.aps.iva.ve0.s0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.h
                    com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r2 = r0.j
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    com.amazon.aps.iva.ab.x.i0(r6)
                    goto L49
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    com.amazon.aps.iva.ab.x.i0(r6)
                    if (r5 <= 0) goto L4c
                    com.amazon.aps.iva.yb0.z r5 = r4.b
                    boolean r6 = r5.b
                    if (r6 != 0) goto L4c
                    r5.b = r3
                    com.amazon.aps.iva.ve0.o0 r5 = com.amazon.aps.iva.ve0.o0.START
                    r0.j = r3
                    com.amazon.aps.iva.ve0.g<com.amazon.aps.iva.ve0.o0> r6 = r4.c
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                    return r5
                L4c:
                    com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.s0.a.C0800a.c(int, com.amazon.aps.iva.ob0.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u0<Integer> u0Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = u0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g<? super o0> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(gVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                C0800a c0800a = new C0800a(new com.amazon.aps.iva.yb0.z(), (g) this.i);
                this.h = 1;
                if (this.j.c(c0800a, this) == aVar) {
                    return aVar;
                }
            }
            throw new com.amazon.aps.iva.la.a();
        }
    }

    @Override // com.amazon.aps.iva.ve0.q0
    public final f<o0> a(u0<Integer> u0Var) {
        return new j0(new a(u0Var, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
