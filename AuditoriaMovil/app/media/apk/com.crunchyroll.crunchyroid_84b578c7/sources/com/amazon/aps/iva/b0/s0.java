package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class s0 implements com.amazon.aps.iva.o1.a {
    public final /* synthetic */ p3<v0> b;
    public final /* synthetic */ boolean c;

    /* compiled from: Scrollable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", l = {574}, m = "onPostFling-RZ2iAVY")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public s0 h;
        public long i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return s0.this.A(0L, 0L, this);
        }
    }

    public s0(q1 q1Var, boolean z) {
        this.b = q1Var;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.amazon.aps.iva.o1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(long r3, long r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.o2.o> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof com.amazon.aps.iva.b0.s0.a
            if (r3 == 0) goto L13
            r3 = r7
            com.amazon.aps.iva.b0.s0$a r3 = (com.amazon.aps.iva.b0.s0.a) r3
            int r4 = r3.l
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.l = r4
            goto L18
        L13:
            com.amazon.aps.iva.b0.s0$a r3 = new com.amazon.aps.iva.b0.s0$a
            r3.<init>(r7)
        L18:
            java.lang.Object r4 = r3.j
            com.amazon.aps.iva.pb0.a r7 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r0 = r3.l
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.i
            com.amazon.aps.iva.b0.s0 r3 = r3.h
            com.amazon.aps.iva.ab.x.i0(r4)
            goto L50
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            com.amazon.aps.iva.ab.x.i0(r4)
            boolean r4 = r2.c
            if (r4 == 0) goto L59
            com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.b0.v0> r4 = r2.b
            java.lang.Object r4 = r4.getValue()
            com.amazon.aps.iva.b0.v0 r4 = (com.amazon.aps.iva.b0.v0) r4
            r3.h = r2
            r3.i = r5
            r3.l = r1
            java.lang.Object r4 = r4.b(r5, r3)
            if (r4 != r7) goto L4f
            return r7
        L4f:
            r3 = r2
        L50:
            com.amazon.aps.iva.o2.o r4 = (com.amazon.aps.iva.o2.o) r4
            long r0 = r4.a
            long r4 = com.amazon.aps.iva.o2.o.d(r5, r0)
            goto L5c
        L59:
            long r4 = com.amazon.aps.iva.o2.o.b
            r3 = r2
        L5c:
            com.amazon.aps.iva.o2.o r6 = new com.amazon.aps.iva.o2.o
            r6.<init>(r4)
            com.amazon.aps.iva.o0.p3<com.amazon.aps.iva.b0.v0> r3 = r3.b
            java.lang.Object r3 = r3.getValue()
            com.amazon.aps.iva.b0.v0 r3 = (com.amazon.aps.iva.b0.v0) r3
            com.amazon.aps.iva.o0.y1 r3 = r3.g
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.setValue(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.s0.A(long, long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.o1.a
    public final long L(int i, long j) {
        boolean z;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.b.getValue().g.setValue(Boolean.TRUE);
        }
        return com.amazon.aps.iva.e1.c.b;
    }

    @Override // com.amazon.aps.iva.o1.a
    public final long d0(int i, long j, long j2) {
        if (this.c) {
            v0 value = this.b.getValue();
            t0 t0Var = value.d;
            if (t0Var.c()) {
                return com.amazon.aps.iva.e1.c.b;
            }
            float d = value.d(j2);
            boolean z = value.b;
            if (z) {
                d *= -1;
            }
            float g = t0Var.g(d);
            if (z) {
                g *= -1;
            }
            return value.e(g);
        }
        return com.amazon.aps.iva.e1.c.b;
    }
}
