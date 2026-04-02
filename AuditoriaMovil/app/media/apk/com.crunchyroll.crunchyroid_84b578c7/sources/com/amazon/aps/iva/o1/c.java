package com.amazon.aps.iva.o1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.t1.i;
import com.amazon.aps.iva.t1.j;
/* compiled from: NestedScrollNode.kt */
/* loaded from: classes.dex */
public final class c extends f.c implements com.amazon.aps.iva.t1.f, com.amazon.aps.iva.o1.a {
    public com.amazon.aps.iva.o1.a o;
    public com.amazon.aps.iva.o1.b p;
    public final j q;

    /* compiled from: NestedScrollNode.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {105, 106}, m = "onPostFling-RZ2iAVY")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public c h;
        public long i;
        public long j;
        public /* synthetic */ Object k;
        public int m;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return c.this.A(0L, 0L, this);
        }
    }

    /* compiled from: NestedScrollNode.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {98, 99}, m = "onPreFling-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public c h;
        public long i;
        public /* synthetic */ Object j;
        public int l;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return c.this.W0(0L, this);
        }
    }

    public c(com.amazon.aps.iva.o1.a aVar, com.amazon.aps.iva.o1.b bVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(aVar, "connection");
        this.o = aVar;
        this.p = bVar == null ? new com.amazon.aps.iva.o1.b() : bVar;
        i<c> iVar = e.a;
        j jVar = new j(iVar);
        if (iVar == jVar.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jVar.b.setValue(this);
            this.q = jVar;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    @Override // com.amazon.aps.iva.o1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(long r18, long r20, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o2.o> r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof com.amazon.aps.iva.o1.c.a
            if (r2 == 0) goto L17
            r2 = r1
            com.amazon.aps.iva.o1.c$a r2 = (com.amazon.aps.iva.o1.c.a) r2
            int r3 = r2.m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.m = r3
            goto L1c
        L17:
            com.amazon.aps.iva.o1.c$a r2 = new com.amazon.aps.iva.o1.c$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.k
            com.amazon.aps.iva.pb0.a r9 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r3 = r2.m
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L44
            if (r3 == r4) goto L38
            if (r3 != r10) goto L30
            long r2 = r2.i
            com.amazon.aps.iva.ab.x.i0(r1)
            goto L87
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            long r3 = r2.j
            long r5 = r2.i
            com.amazon.aps.iva.o1.c r7 = r2.h
            com.amazon.aps.iva.ab.x.i0(r1)
            r13 = r3
            r11 = r5
            goto L62
        L44:
            com.amazon.aps.iva.ab.x.i0(r1)
            com.amazon.aps.iva.o1.a r3 = r0.o
            r2.h = r0
            r11 = r18
            r2.i = r11
            r13 = r20
            r2.j = r13
            r2.m = r4
            r4 = r18
            r6 = r20
            r8 = r2
            java.lang.Object r1 = r3.A(r4, r6, r8)
            if (r1 != r9) goto L61
            return r9
        L61:
            r7 = r0
        L62:
            com.amazon.aps.iva.o2.o r1 = (com.amazon.aps.iva.o2.o) r1
            long r4 = r1.a
            com.amazon.aps.iva.o1.a r3 = r7.u1()
            if (r3 == 0) goto L8f
            long r6 = com.amazon.aps.iva.o2.o.e(r11, r4)
            long r11 = com.amazon.aps.iva.o2.o.d(r13, r4)
            r1 = 0
            r2.h = r1
            r2.i = r4
            r2.m = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.A(r4, r6, r8)
            if (r1 != r9) goto L86
            return r9
        L86:
            r2 = r13
        L87:
            com.amazon.aps.iva.o2.o r1 = (com.amazon.aps.iva.o2.o) r1
            long r4 = r1.a
            r15 = r2
            r1 = r4
            r4 = r15
            goto L94
        L8f:
            r13 = r4
            long r4 = com.amazon.aps.iva.o2.o.b
            r1 = r4
            r4 = r13
        L94:
            long r1 = com.amazon.aps.iva.o2.o.e(r4, r1)
            com.amazon.aps.iva.o2.o r3 = new com.amazon.aps.iva.o2.o
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o1.c.A(long, long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.o1.a
    public final long L(int i, long j) {
        long j2;
        com.amazon.aps.iva.o1.a u1 = u1();
        if (u1 != null) {
            j2 = u1.L(i, j);
        } else {
            int i2 = com.amazon.aps.iva.e1.c.e;
            j2 = com.amazon.aps.iva.e1.c.b;
        }
        return com.amazon.aps.iva.e1.c.f(j2, this.o.L(i, com.amazon.aps.iva.e1.c.e(j, j2)));
    }

    @Override // com.amazon.aps.iva.t1.f
    public final com.amazon.aps.iva.ab.a P() {
        return this.q;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    @Override // com.amazon.aps.iva.o1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W0(long r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o2.o> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.o1.c.b
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.o1.c$b r0 = (com.amazon.aps.iva.o1.c.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.o1.c$b r0 = new com.amazon.aps.iva.o1.c$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r7 = r0.i
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L70
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            long r7 = r0.i
            com.amazon.aps.iva.o1.c r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L53
        L3c:
            com.amazon.aps.iva.ab.x.i0(r9)
            com.amazon.aps.iva.o1.a r9 = r6.u1()
            if (r9 == 0) goto L58
            r0.h = r6
            r0.i = r7
            r0.l = r4
            java.lang.Object r9 = r9.W0(r7, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            com.amazon.aps.iva.o2.o r9 = (com.amazon.aps.iva.o2.o) r9
            long r4 = r9.a
            goto L5b
        L58:
            long r4 = com.amazon.aps.iva.o2.o.b
            r2 = r6
        L5b:
            com.amazon.aps.iva.o1.a r9 = r2.o
            long r7 = com.amazon.aps.iva.o2.o.d(r7, r4)
            r2 = 0
            r0.h = r2
            r0.i = r4
            r0.l = r3
            java.lang.Object r9 = r9.W0(r7, r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r7 = r4
        L70:
            com.amazon.aps.iva.o2.o r9 = (com.amazon.aps.iva.o2.o) r9
            long r0 = r9.a
            long r7 = com.amazon.aps.iva.o2.o.e(r7, r0)
            com.amazon.aps.iva.o2.o r9 = new com.amazon.aps.iva.o2.o
            r9.<init>(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o1.c.W0(long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.o1.a
    public final long d0(int i, long j, long j2) {
        long j3;
        long d0 = this.o.d0(i, j, j2);
        com.amazon.aps.iva.o1.a u1 = u1();
        if (u1 != null) {
            j3 = u1.d0(i, com.amazon.aps.iva.e1.c.f(j, d0), com.amazon.aps.iva.e1.c.e(j2, d0));
        } else {
            int i2 = com.amazon.aps.iva.e1.c.e;
            j3 = com.amazon.aps.iva.e1.c.b;
        }
        return com.amazon.aps.iva.e1.c.f(d0, j3);
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void m1() {
        com.amazon.aps.iva.o1.b bVar = this.p;
        bVar.a = this;
        bVar.b = new d(this);
        this.p.c = i1();
    }

    @Override // com.amazon.aps.iva.a1.f.c
    public final void n1() {
        com.amazon.aps.iva.o1.b bVar = this.p;
        if (bVar.a == this) {
            bVar.a = null;
        }
    }

    public final g0 t1() {
        c cVar;
        if (this.n) {
            cVar = (c) l(e.a);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.t1();
        }
        g0 g0Var = this.p.c;
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final com.amazon.aps.iva.o1.a u1() {
        if (this.n) {
            return (com.amazon.aps.iva.o1.a) l(e.a);
        }
        return null;
    }
}
