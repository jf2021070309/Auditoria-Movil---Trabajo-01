package com.amazon.aps.iva.z;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.p3;
/* compiled from: InfiniteTransition.kt */
/* loaded from: classes.dex */
public final class h0 {
    public final com.amazon.aps.iva.p0.f<a<?, ?>> a;
    public final com.amazon.aps.iva.o0.y1 b;
    public long c;
    public final com.amazon.aps.iva.o0.y1 d;

    /* compiled from: InfiniteTransition.kt */
    /* loaded from: classes.dex */
    public final class a<T, V extends p> implements p3<T> {
        public T b;
        public T c;
        public final l1<T, V> d;
        public final com.amazon.aps.iva.o0.y1 e;
        public j<T> f;
        public z0<T, V> g;
        public boolean h;
        public boolean i;
        public long j;
        public final /* synthetic */ h0 k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(h0 h0Var, Number number, Number number2, m1 m1Var, j jVar, String str) {
            com.amazon.aps.iva.yb0.j.f(m1Var, "typeConverter");
            com.amazon.aps.iva.yb0.j.f(str, "label");
            this.k = h0Var;
            this.b = number;
            this.c = number2;
            this.d = m1Var;
            this.e = com.amazon.aps.iva.cq.b.c0(number);
            this.f = jVar;
            this.g = new z0<>(jVar, m1Var, this.b, this.c);
        }

        @Override // com.amazon.aps.iva.o0.p3
        public final T getValue() {
            return this.e.getValue();
        }
    }

    /* compiled from: InfiniteTransition.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", l = {181, 205}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public com.amazon.aps.iva.yb0.a0 h;
        public int i;
        public /* synthetic */ Object j;
        public final /* synthetic */ com.amazon.aps.iva.o0.q1<p3<Long>> k;
        public final /* synthetic */ h0 l;

        /* compiled from: InfiniteTransition.kt */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Long, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ com.amazon.aps.iva.o0.q1<p3<Long>> h;
            public final /* synthetic */ h0 i;
            public final /* synthetic */ com.amazon.aps.iva.yb0.a0 j;
            public final /* synthetic */ com.amazon.aps.iva.se0.g0 k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.amazon.aps.iva.o0.q1<p3<Long>> q1Var, h0 h0Var, com.amazon.aps.iva.yb0.a0 a0Var, com.amazon.aps.iva.se0.g0 g0Var) {
                super(1);
                this.h = q1Var;
                this.i = h0Var;
                this.j = a0Var;
                this.k = g0Var;
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
                if (r4 == false) goto L42;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
            @Override // com.amazon.aps.iva.xb0.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.amazon.aps.iva.kb0.q invoke(java.lang.Long r14) {
                /*
                    Method dump skipped, instructions count: 218
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z.h0.b.a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: InfiniteTransition.kt */
        /* renamed from: com.amazon.aps.iva.z.h0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0905b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Float> {
            public final /* synthetic */ com.amazon.aps.iva.se0.g0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0905b(com.amazon.aps.iva.se0.g0 g0Var) {
                super(0);
                this.h = g0Var;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Float invoke() {
                return Float.valueOf(w0.d(this.h.getCoroutineContext()));
            }
        }

        /* compiled from: InfiniteTransition.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<Float, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
            public /* synthetic */ float h;

            public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
                super(2, dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                c cVar = new c(dVar);
                cVar.h = ((Number) obj).floatValue();
                return cVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(Float f, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
                return ((c) create(Float.valueOf(f.floatValue()), dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                boolean z;
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                com.amazon.aps.iva.ab.x.i0(obj);
                if (this.h > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.o0.q1<p3<Long>> q1Var, h0 h0Var, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.k = q1Var;
            this.l = h0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(this.k, this.l, dVar);
            bVar.j = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:12:0x003b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0076 -> B:12:0x003b). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r8.i
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                com.amazon.aps.iva.yb0.a0 r1 = r8.h
                java.lang.Object r4 = r8.j
                com.amazon.aps.iva.se0.g0 r4 = (com.amazon.aps.iva.se0.g0) r4
                com.amazon.aps.iva.ab.x.i0(r9)
                goto L3a
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                com.amazon.aps.iva.yb0.a0 r1 = r8.h
                java.lang.Object r4 = r8.j
                com.amazon.aps.iva.se0.g0 r4 = (com.amazon.aps.iva.se0.g0) r4
                com.amazon.aps.iva.ab.x.i0(r9)
                r9 = r8
                goto L51
            L29:
                com.amazon.aps.iva.ab.x.i0(r9)
                java.lang.Object r9 = r8.j
                r4 = r9
                com.amazon.aps.iva.se0.g0 r4 = (com.amazon.aps.iva.se0.g0) r4
                com.amazon.aps.iva.yb0.a0 r1 = new com.amazon.aps.iva.yb0.a0
                r1.<init>()
                r9 = 1065353216(0x3f800000, float:1.0)
                r1.b = r9
            L3a:
                r9 = r8
            L3b:
                com.amazon.aps.iva.z.h0$b$a r5 = new com.amazon.aps.iva.z.h0$b$a
                com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.o0.p3<java.lang.Long>> r6 = r9.k
                com.amazon.aps.iva.z.h0 r7 = r9.l
                r5.<init>(r6, r7, r1, r4)
                r9.j = r4
                r9.h = r1
                r9.i = r3
                java.lang.Object r5 = com.amazon.aps.iva.z.f0.a(r5, r9)
                if (r5 != r0) goto L51
                return r0
            L51:
                float r5 = r1.b
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L5a
                r5 = r3
                goto L5b
            L5a:
                r5 = 0
            L5b:
                if (r5 == 0) goto L3b
                com.amazon.aps.iva.z.h0$b$b r5 = new com.amazon.aps.iva.z.h0$b$b
                r5.<init>(r4)
                com.amazon.aps.iva.ve0.j0 r5 = com.amazon.aps.iva.cq.b.m0(r5)
                com.amazon.aps.iva.z.h0$b$c r6 = new com.amazon.aps.iva.z.h0$b$c
                r7 = 0
                r6.<init>(r7)
                r9.j = r4
                r9.h = r1
                r9.i = r2
                java.lang.Object r5 = com.amazon.aps.iva.dg.b.r(r5, r6, r9)
                if (r5 != r0) goto L3b
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z.h0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: InfiniteTransition.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(2);
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            h0.this.a(iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public h0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "label");
        this.a = new com.amazon.aps.iva.p0.f<>(new a[16]);
        this.b = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
        this.c = Long.MIN_VALUE;
        this.d = com.amazon.aps.iva.cq.b.c0(Boolean.TRUE);
    }

    public final void a(com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.o0.j g = iVar.g(-318043801);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        g.s(-492369756);
        Object e0 = g.e0();
        if (e0 == i.a.a) {
            e0 = com.amazon.aps.iva.cq.b.c0(null);
            g.K0(e0);
        }
        g.U(false);
        com.amazon.aps.iva.o0.q1 q1Var = (com.amazon.aps.iva.o0.q1) e0;
        if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
            com.amazon.aps.iva.o0.x0.c(this, new b(q1Var, this, null), g);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new c(i);
        }
    }
}
