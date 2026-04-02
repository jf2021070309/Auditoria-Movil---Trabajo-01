package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.u1.g1;
/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class e0 extends com.amazon.aps.iva.u1.j implements g1 {
    public p3<v0> q;
    public j0 r;
    public final com.amazon.aps.iva.p1.m0 s;

    /* compiled from: Scrollable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1", f = "Scrollable.kt", l = {336}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.f0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        /* compiled from: Scrollable.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1$1", f = "Scrollable.kt", l = {338}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.b0.e0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0123a extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int i;
            public /* synthetic */ Object j;
            public final /* synthetic */ e0 k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0123a(e0 e0Var, com.amazon.aps.iva.ob0.d<? super C0123a> dVar) {
                super(dVar);
                this.k = e0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                C0123a c0123a = new C0123a(this.k, dVar);
                c0123a.j = obj;
                return c0123a;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((C0123a) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0053 A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:13:0x0035). Please submit an issue!!! */
            @Override // com.amazon.aps.iva.qb0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r1 = r10.i
                    r2 = 1
                    if (r1 == 0) goto L1c
                    if (r1 != r2) goto L14
                    java.lang.Object r1 = r10.j
                    com.amazon.aps.iva.p1.c r1 = (com.amazon.aps.iva.p1.c) r1
                    com.amazon.aps.iva.ab.x.i0(r11)
                    r3 = r1
                    r1 = r0
                    r0 = r10
                    goto L35
                L14:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1c:
                    com.amazon.aps.iva.ab.x.i0(r11)
                    java.lang.Object r11 = r10.j
                    com.amazon.aps.iva.p1.c r11 = (com.amazon.aps.iva.p1.c) r11
                    r1 = r11
                    r11 = r10
                L25:
                    r11.j = r1
                    r11.i = r2
                    java.lang.Object r3 = androidx.compose.foundation.gestures.a.a(r1, r11)
                    if (r3 != r0) goto L30
                    return r0
                L30:
                    r9 = r0
                    r0 = r11
                    r11 = r3
                    r3 = r1
                    r1 = r9
                L35:
                    com.amazon.aps.iva.p1.m r11 = (com.amazon.aps.iva.p1.m) r11
                    java.util.List<com.amazon.aps.iva.p1.y> r4 = r11.a
                    int r5 = r4.size()
                    r6 = 0
                    r7 = r6
                L3f:
                    if (r7 >= r5) goto L53
                    java.lang.Object r8 = r4.get(r7)
                    com.amazon.aps.iva.p1.y r8 = (com.amazon.aps.iva.p1.y) r8
                    boolean r8 = r8.b()
                    r8 = r8 ^ r2
                    if (r8 != 0) goto L50
                    r4 = r6
                    goto L54
                L50:
                    int r7 = r7 + 1
                    goto L3f
                L53:
                    r4 = r2
                L54:
                    if (r4 == 0) goto L98
                    com.amazon.aps.iva.b0.e0 r4 = r0.k
                    com.amazon.aps.iva.b0.j0 r5 = r4.r
                    r3.a()
                    long r7 = r5.a(r3, r11)
                    com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.b0.v0> r4 = r4.q
                    java.lang.Object r4 = r4.getValue()
                    com.amazon.aps.iva.b0.v0 r4 = (com.amazon.aps.iva.b0.v0) r4
                    float r5 = r4.d(r7)
                    boolean r7 = r4.b
                    if (r7 == 0) goto L74
                    r7 = -1
                    float r7 = (float) r7
                    float r5 = r5 * r7
                L74:
                    com.amazon.aps.iva.b0.t0 r4 = r4.d
                    float r4 = r4.g(r5)
                    r5 = 0
                    int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                    if (r4 != 0) goto L81
                    r4 = r2
                    goto L82
                L81:
                    r4 = r6
                L82:
                    if (r4 != 0) goto L98
                    java.util.List<com.amazon.aps.iva.p1.y> r11 = r11.a
                    int r4 = r11.size()
                L8a:
                    if (r6 >= r4) goto L98
                    java.lang.Object r5 = r11.get(r6)
                    com.amazon.aps.iva.p1.y r5 = (com.amazon.aps.iva.p1.y) r5
                    r5.a()
                    int r6 = r6 + 1
                    goto L8a
                L98:
                    r11 = r0
                    r0 = r1
                    r1 = r3
                    goto L25
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.e0.a.C0123a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.p1.f0 f0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(f0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                C0123a c0123a = new C0123a(e0.this, null);
                this.h = 1;
                if (((com.amazon.aps.iva.p1.f0) this.i).X(c0123a, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public e0(p3<v0> p3Var, j0 j0Var) {
        com.amazon.aps.iva.yb0.j.f(p3Var, "scrollingLogicState");
        com.amazon.aps.iva.yb0.j.f(j0Var, "mouseWheelScrollConfig");
        this.q = p3Var;
        this.r = j0Var;
        a aVar = new a(null);
        com.amazon.aps.iva.p1.m mVar = com.amazon.aps.iva.p1.l0.a;
        com.amazon.aps.iva.p1.n0 n0Var = new com.amazon.aps.iva.p1.n0(aVar);
        t1(n0Var);
        this.s = n0Var;
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void C0(com.amazon.aps.iva.p1.m mVar, com.amazon.aps.iva.p1.n nVar, long j) {
        com.amazon.aps.iva.yb0.j.f(nVar, "pass");
        this.s.C0(mVar, nVar, j);
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void G0() {
        this.s.G0();
    }
}
