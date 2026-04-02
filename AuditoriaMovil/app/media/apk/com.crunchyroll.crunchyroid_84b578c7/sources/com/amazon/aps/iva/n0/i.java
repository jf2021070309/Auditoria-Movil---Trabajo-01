package com.amazon.aps.iva.n0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.o0.y1;
/* compiled from: RippleAnimation.kt */
/* loaded from: classes.dex */
public final class i {
    public com.amazon.aps.iva.e1.c a;
    public final float b;
    public final boolean c;
    public Float d;
    public Float e;
    public com.amazon.aps.iva.e1.c f;
    public final com.amazon.aps.iva.z.b<Float, com.amazon.aps.iva.z.m> g = x.d(0.0f);
    public final com.amazon.aps.iva.z.b<Float, com.amazon.aps.iva.z.m> h = x.d(0.0f);
    public final com.amazon.aps.iva.z.b<Float, com.amazon.aps.iva.z.m> i = x.d(0.0f);
    public final com.amazon.aps.iva.se0.u j = new com.amazon.aps.iva.se0.u(null);
    public final y1 k;
    public final y1 l;

    /* compiled from: RippleAnimation.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {80, 82, 83}, m = "animate")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public i h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return i.this.a(this);
        }
    }

    public i(com.amazon.aps.iva.e1.c cVar, float f, boolean z) {
        this.a = cVar;
        this.b = f;
        this.c = z;
        Boolean bool = Boolean.FALSE;
        this.k = com.amazon.aps.iva.cq.b.c0(bool);
        this.l = com.amazon.aps.iva.cq.b.c0(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.n0.i.a
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.n0.i$a r0 = (com.amazon.aps.iva.n0.i.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.n0.i$a r0 = new com.amazon.aps.iva.n0.i$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L87
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            com.amazon.aps.iva.n0.i r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L6f
        L3c:
            com.amazon.aps.iva.n0.i r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L5b
        L42:
            com.amazon.aps.iva.ab.x.i0(r8)
            r0.h = r7
            r0.k = r5
            com.amazon.aps.iva.n0.j r8 = new com.amazon.aps.iva.n0.j
            r8.<init>(r7, r6)
            java.lang.Object r8 = com.amazon.aps.iva.e.z.p(r8, r0)
            if (r8 != r1) goto L55
            goto L57
        L55:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
        L57:
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r2 = r7
        L5b:
            com.amazon.aps.iva.o0.y1 r8 = r2.k
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r8.setValue(r5)
            r0.h = r2
            r0.k = r4
            com.amazon.aps.iva.se0.u r8 = r2.j
            java.lang.Object r8 = r8.K(r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r0.h = r6
            r0.k = r3
            r2.getClass()
            com.amazon.aps.iva.n0.k r8 = new com.amazon.aps.iva.n0.k
            r8.<init>(r2, r6)
            java.lang.Object r8 = com.amazon.aps.iva.e.z.p(r8, r0)
            if (r8 != r1) goto L82
            goto L84
        L82:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
        L84:
            if (r8 != r1) goto L87
            return r1
        L87:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.n0.i.a(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
