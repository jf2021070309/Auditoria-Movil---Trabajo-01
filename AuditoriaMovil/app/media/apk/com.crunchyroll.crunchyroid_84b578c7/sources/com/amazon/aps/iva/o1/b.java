package com.amazon.aps.iva.o1;

import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.t1.f;
import com.amazon.aps.iva.yb0.l;
/* compiled from: NestedScrollModifier.kt */
/* loaded from: classes.dex */
public final class b {
    public f a;
    public com.amazon.aps.iva.xb0.a<? extends g0> b = new a();
    public g0 c;

    /* compiled from: NestedScrollModifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<g0> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final g0 invoke() {
            return b.this.c;
        }
    }

    /* compiled from: NestedScrollModifier.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {221}, m = "dispatchPostFling-RZ2iAVY")
    /* renamed from: com.amazon.aps.iva.o1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0552b extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public C0552b(com.amazon.aps.iva.ob0.d<? super C0552b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return b.this.a(0L, 0L, this);
        }
    }

    /* compiled from: NestedScrollModifier.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {206}, m = "dispatchPreFling-QWom1Mo")
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return b.this.c(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o2.o> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.o1.b.C0552b
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.o1.b$b r0 = (com.amazon.aps.iva.o1.b.C0552b) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.o1.b$b r0 = new com.amazon.aps.iva.o1.b$b
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.h
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r6.j
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L44
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            com.amazon.aps.iva.ab.x.i0(r12)
            com.amazon.aps.iva.o1.c r1 = r7.e()
            if (r1 == 0) goto L49
            r6.j = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.A(r2, r4, r6)
            if (r12 != r0) goto L44
            return r0
        L44:
            com.amazon.aps.iva.o2.o r12 = (com.amazon.aps.iva.o2.o) r12
            long r8 = r12.a
            goto L4b
        L49:
            long r8 = com.amazon.aps.iva.o2.o.b
        L4b:
            com.amazon.aps.iva.o2.o r10 = new com.amazon.aps.iva.o2.o
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o1.b.a(long, long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final long b(int i, long j, long j2) {
        com.amazon.aps.iva.o1.c e = e();
        if (e != null) {
            return e.d0(i, j, j2);
        }
        return com.amazon.aps.iva.e1.c.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o2.o> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.o1.b.c
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.o1.b$c r0 = (com.amazon.aps.iva.o1.b.c) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.o1.b$c r0 = new com.amazon.aps.iva.o1.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.o1.c r7 = r4.e()
            if (r7 == 0) goto L46
            r0.j = r3
            java.lang.Object r7 = r7.W0(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            com.amazon.aps.iva.o2.o r7 = (com.amazon.aps.iva.o2.o) r7
            long r5 = r7.a
            goto L48
        L46:
            long r5 = com.amazon.aps.iva.o2.o.b
        L48:
            com.amazon.aps.iva.o2.o r7 = new com.amazon.aps.iva.o2.o
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o1.b.c(long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final g0 d() {
        g0 invoke = this.b.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final com.amazon.aps.iva.o1.c e() {
        f fVar = this.a;
        if (fVar != null) {
            return (com.amazon.aps.iva.o1.c) fVar.l(e.a);
        }
        return null;
    }
}
