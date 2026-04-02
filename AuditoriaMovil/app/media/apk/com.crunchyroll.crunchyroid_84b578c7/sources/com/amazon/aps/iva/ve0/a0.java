package com.amazon.aps.iva.ve0;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class a0 implements f<Object> {
    public final /* synthetic */ f b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p c;

    /* compiled from: Emitters.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements g {
        public final /* synthetic */ g b;
        public final /* synthetic */ com.amazon.aps.iva.xb0.p c;

        /* compiled from: Emitters.kt */
        @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
        /* renamed from: com.amazon.aps.iva.ve0.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0798a extends com.amazon.aps.iva.qb0.c {
            public /* synthetic */ Object h;
            public int i;
            public Object k;
            public g l;

            public C0798a(com.amazon.aps.iva.ob0.d dVar) {
                super(dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                this.h = obj;
                this.i |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(g gVar, com.amazon.aps.iva.xb0.p pVar) {
            this.b = gVar;
            this.c = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
        @Override // com.amazon.aps.iva.ve0.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(T r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.amazon.aps.iva.ve0.a0.a.C0798a
                if (r0 == 0) goto L13
                r0 = r7
                com.amazon.aps.iva.ve0.a0$a$a r0 = (com.amazon.aps.iva.ve0.a0.a.C0798a) r0
                int r1 = r0.i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.i = r1
                goto L18
            L13:
                com.amazon.aps.iva.ve0.a0$a$a r0 = new com.amazon.aps.iva.ve0.a0$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.h
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.i
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                com.amazon.aps.iva.ab.x.i0(r7)
                goto L5e
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                com.amazon.aps.iva.ve0.g r6 = r0.l
                java.lang.Object r2 = r0.k
                com.amazon.aps.iva.ab.x.i0(r7)
                goto L50
            L3a:
                com.amazon.aps.iva.ab.x.i0(r7)
                r0.k = r6
                com.amazon.aps.iva.ve0.g r7 = r5.b
                r0.l = r7
                r0.i = r4
                com.amazon.aps.iva.xb0.p r2 = r5.c
                java.lang.Object r2 = r2.invoke(r6, r0)
                if (r2 != r1) goto L4e
                return r1
            L4e:
                r2 = r6
                r6 = r7
            L50:
                r7 = 0
                r0.k = r7
                r0.l = r7
                r0.i = r3
                java.lang.Object r6 = r6.a(r2, r0)
                if (r6 != r1) goto L5e
                return r1
            L5e:
                com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.a0.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public a0(f fVar, com.amazon.aps.iva.xb0.p pVar) {
        this.b = fVar;
        this.c = pVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(g<? super Object> gVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = this.b.c(new a(gVar, this.c), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
