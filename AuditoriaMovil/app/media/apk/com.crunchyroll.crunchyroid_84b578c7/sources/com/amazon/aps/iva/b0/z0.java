package com.amazon.aps.iva.b0;
/* compiled from: TapGestureDetector.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.p1.f0 j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> l;
    public final /* synthetic */ i0 m;

    /* compiled from: TapGestureDetector.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {237, 245}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int i;
        public /* synthetic */ Object j;
        public final /* synthetic */ com.amazon.aps.iva.se0.g0 k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> m;
        public final /* synthetic */ i0 n;

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {234}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.b0.z0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0127a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public final /* synthetic */ i0 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0127a(i0 i0Var, com.amazon.aps.iva.ob0.d<? super C0127a> dVar) {
                super(2, dVar);
                this.i = i0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0127a(this.i, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((C0127a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                    if (this.i.b(this) == aVar) {
                        return aVar;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {241}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public final /* synthetic */ com.amazon.aps.iva.xb0.q<h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> i;
            public final /* synthetic */ i0 j;
            public final /* synthetic */ com.amazon.aps.iva.p1.y k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(com.amazon.aps.iva.xb0.q<? super h0, ? super com.amazon.aps.iva.e1.c, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, i0 i0Var, com.amazon.aps.iva.p1.y yVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
                super(2, dVar);
                this.i = qVar;
                this.j = i0Var;
                this.k = yVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new b(this.i, this.j, this.k, dVar);
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
                    com.amazon.aps.iva.e1.c cVar = new com.amazon.aps.iva.e1.c(this.k.c);
                    this.h = 1;
                    if (this.i.invoke(this.j, cVar, this) == aVar) {
                        return aVar;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public final /* synthetic */ i0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(i0 i0Var, com.amazon.aps.iva.ob0.d<? super c> dVar) {
                super(2, dVar);
                this.h = i0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new c(this.h, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                com.amazon.aps.iva.ab.x.i0(obj);
                i0 i0Var = this.h;
                i0Var.d = true;
                i0Var.e.d(null);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public final /* synthetic */ i0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(i0 i0Var, com.amazon.aps.iva.ob0.d<? super d> dVar) {
                super(2, dVar);
                this.h = i0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new d(this.h, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                com.amazon.aps.iva.ab.x.i0(obj);
                i0 i0Var = this.h;
                i0Var.c = true;
                i0Var.e.d(null);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.xb0.q<? super h0, ? super com.amazon.aps.iva.e1.c, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> lVar, i0 i0Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
            this.k = g0Var;
            this.l = qVar;
            this.m = lVar;
            this.n = i0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.k, this.l, this.m, this.n, dVar);
            aVar.j = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r9.i
                r2 = 3
                com.amazon.aps.iva.se0.g0 r3 = r9.k
                r4 = 2
                r5 = 1
                com.amazon.aps.iva.b0.i0 r6 = r9.n
                r7 = 0
                if (r1 == 0) goto L26
                if (r1 == r5) goto L1e
                if (r1 != r4) goto L16
                com.amazon.aps.iva.ab.x.i0(r10)
                goto L61
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                java.lang.Object r1 = r9.j
                com.amazon.aps.iva.p1.c r1 = (com.amazon.aps.iva.p1.c) r1
                com.amazon.aps.iva.ab.x.i0(r10)
                goto L41
            L26:
                com.amazon.aps.iva.ab.x.i0(r10)
                java.lang.Object r10 = r9.j
                r1 = r10
                com.amazon.aps.iva.p1.c r1 = (com.amazon.aps.iva.p1.c) r1
                com.amazon.aps.iva.b0.z0$a$a r10 = new com.amazon.aps.iva.b0.z0$a$a
                r10.<init>(r6, r7)
                com.amazon.aps.iva.se0.i.d(r3, r7, r7, r10, r2)
                r9.j = r1
                r9.i = r5
                java.lang.Object r10 = com.amazon.aps.iva.b0.w0.c(r1, r9, r2)
                if (r10 != r0) goto L41
                return r0
            L41:
                com.amazon.aps.iva.p1.y r10 = (com.amazon.aps.iva.p1.y) r10
                r10.a()
                com.amazon.aps.iva.b0.w0$a r5 = com.amazon.aps.iva.b0.w0.a
                com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.b0.h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, java.lang.Object> r8 = r9.l
                if (r8 == r5) goto L54
                com.amazon.aps.iva.b0.z0$a$b r5 = new com.amazon.aps.iva.b0.z0$a$b
                r5.<init>(r8, r6, r10, r7)
                com.amazon.aps.iva.se0.i.d(r3, r7, r7, r5, r2)
            L54:
                r9.j = r7
                r9.i = r4
                com.amazon.aps.iva.p1.n r10 = com.amazon.aps.iva.p1.n.Main
                java.lang.Object r10 = com.amazon.aps.iva.b0.w0.e(r1, r10, r9)
                if (r10 != r0) goto L61
                return r0
            L61:
                com.amazon.aps.iva.p1.y r10 = (com.amazon.aps.iva.p1.y) r10
                if (r10 != 0) goto L6e
                com.amazon.aps.iva.b0.z0$a$c r10 = new com.amazon.aps.iva.b0.z0$a$c
                r10.<init>(r6, r7)
                com.amazon.aps.iva.se0.i.d(r3, r7, r7, r10, r2)
                goto L87
            L6e:
                r10.a()
                com.amazon.aps.iva.b0.z0$a$d r0 = new com.amazon.aps.iva.b0.z0$a$d
                r0.<init>(r6, r7)
                com.amazon.aps.iva.se0.i.d(r3, r7, r7, r0, r2)
                com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> r0 = r9.m
                if (r0 == 0) goto L87
                com.amazon.aps.iva.e1.c r1 = new com.amazon.aps.iva.e1.c
                long r2 = r10.c
                r1.<init>(r2)
                r0.invoke(r1)
            L87:
                com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.z0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(com.amazon.aps.iva.p1.f0 f0Var, com.amazon.aps.iva.xb0.q<? super h0, ? super com.amazon.aps.iva.e1.c, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> lVar, i0 i0Var, com.amazon.aps.iva.ob0.d<? super z0> dVar) {
        super(2, dVar);
        this.j = f0Var;
        this.k = qVar;
        this.l = lVar;
        this.m = i0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        z0 z0Var = new z0(this.j, this.k, this.l, this.m, dVar);
        z0Var.i = obj;
        return z0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((z0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            a aVar2 = new a((com.amazon.aps.iva.se0.g0) this.i, this.k, this.l, this.m, null);
            this.h = 1;
            if (c0.b(this.j, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
