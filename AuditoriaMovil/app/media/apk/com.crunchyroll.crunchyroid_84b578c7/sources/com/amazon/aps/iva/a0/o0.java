package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.a1.f;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
/* compiled from: Hoverable.kt */
/* loaded from: classes.dex */
public final class o0 extends f.c implements com.amazon.aps.iva.u1.g1 {
    public com.amazon.aps.iva.c0.l o;
    public com.amazon.aps.iva.c0.g p;

    /* compiled from: Hoverable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {108}, m = "emitEnter")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public o0 h;
        public com.amazon.aps.iva.c0.g i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return o0.this.t1(this);
        }
    }

    /* compiled from: Hoverable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {116}, m = "emitExit")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public o0 h;
        public /* synthetic */ Object i;
        public int k;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return o0.this.u1(this);
        }
    }

    /* compiled from: Hoverable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {91}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                if (o0.this.t1(this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Hoverable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                if (o0.this.u1(this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public o0(com.amazon.aps.iva.c0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        this.o = lVar;
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void C0(com.amazon.aps.iva.p1.m mVar, com.amazon.aps.iva.p1.n nVar, long j) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(nVar, "pass");
        if (nVar == com.amazon.aps.iva.p1.n.Main) {
            int i = mVar.c;
            boolean z2 = true;
            if (i == 4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                com.amazon.aps.iva.se0.i.d(i1(), null, null, new c(null), 3);
                return;
            }
            if (i != 5) {
                z2 = false;
            }
            if (z2) {
                com.amazon.aps.iva.se0.i.d(i1(), null, null, new d(null), 3);
            }
        }
    }

    @Override // com.amazon.aps.iva.u1.g1
    public final void G0() {
        v1();
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void n1() {
        v1();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t1(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.a0.o0.a
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.a0.o0$a r0 = (com.amazon.aps.iva.a0.o0.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.a0.o0$a r0 = new com.amazon.aps.iva.a0.o0$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.c0.g r1 = r0.i
            com.amazon.aps.iva.a0.o0 r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r5)
            com.amazon.aps.iva.c0.g r5 = r4.p
            if (r5 != 0) goto L52
            com.amazon.aps.iva.c0.g r5 = new com.amazon.aps.iva.c0.g
            r5.<init>()
            com.amazon.aps.iva.c0.l r2 = r4.o
            r0.h = r4
            r0.i = r5
            r0.l = r3
            java.lang.Object r0 = r2.b(r5, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
            r1 = r5
        L50:
            r0.p = r1
        L52:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a0.o0.t1(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u1(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.a0.o0.b
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.a0.o0$b r0 = (com.amazon.aps.iva.a0.o0.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.a0.o0$b r0 = new com.amazon.aps.iva.a0.o0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.a0.o0 r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r5)
            com.amazon.aps.iva.c0.g r5 = r4.p
            if (r5 == 0) goto L4e
            com.amazon.aps.iva.c0.h r2 = new com.amazon.aps.iva.c0.h
            r2.<init>(r5)
            com.amazon.aps.iva.c0.l r5 = r4.o
            r0.h = r4
            r0.k = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r0 = r4
        L4b:
            r5 = 0
            r0.p = r5
        L4e:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a0.o0.u1(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final void v1() {
        com.amazon.aps.iva.c0.g gVar = this.p;
        if (gVar != null) {
            this.o.a(new com.amazon.aps.iva.c0.h(gVar));
            this.p = null;
        }
    }
}
