package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.ob0.g;
/* compiled from: PausableMonotonicFrameClock.kt */
/* loaded from: classes.dex */
public final class z1 implements i1 {
    public final i1 b;
    public final f1 c = new f1();

    /* compiled from: PausableMonotonicFrameClock.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {62, 63}, m = "withFrameNanos")
    /* loaded from: classes.dex */
    public static final class a<R> extends com.amazon.aps.iva.qb0.c {
        public z1 h;
        public com.amazon.aps.iva.xb0.l i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return z1.this.m0(null, this);
        }
    }

    public z1(i1 i1Var) {
        this.b = i1Var;
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final <R> R fold(R r, com.amazon.aps.iva.xb0.p<? super R, ? super g.b, ? extends R> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "operation");
        return pVar.invoke(r, this);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final <E extends g.b> E get(g.c<E> cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "key");
        return (E) g.b.a.a(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[PHI: r8 
      PHI: (r8v9 java.lang.Object) = (r8v8 java.lang.Object), (r8v1 java.lang.Object) binds: [B:34:0x0087, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.amazon.aps.iva.o0.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object m0(com.amazon.aps.iva.xb0.l<? super java.lang.Long, ? extends R> r7, com.amazon.aps.iva.ob0.d<? super R> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.o0.z1.a
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.o0.z1$a r0 = (com.amazon.aps.iva.o0.z1.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.o0.z1$a r0 = new com.amazon.aps.iva.o0.z1$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L8a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            com.amazon.aps.iva.xb0.l r7 = r0.i
            com.amazon.aps.iva.o0.z1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L7a
        L3a:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.amazon.aps.iva.o0.f1 r8 = r6.c
            r0.h = r6
            r0.i = r7
            r0.l = r4
            java.lang.Object r2 = r8.a
            monitor-enter(r2)
            boolean r5 = r8.d     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r2)
            if (r5 == 0) goto L50
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            goto L76
        L50:
            com.amazon.aps.iva.se0.n r2 = new com.amazon.aps.iva.se0.n
            com.amazon.aps.iva.ob0.d r5 = com.amazon.aps.iva.a60.b.s(r0)
            r2.<init>(r4, r5)
            r2.r()
            java.lang.Object r4 = r8.a
            monitor-enter(r4)
            java.util.List<com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q>> r5 = r8.b     // Catch: java.lang.Throwable -> L8b
            r5.add(r2)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r4)
            com.amazon.aps.iva.o0.e1 r4 = new com.amazon.aps.iva.o0.e1
            r4.<init>(r8, r2)
            r2.w(r4)
            java.lang.Object r8 = r2.q()
            if (r8 != r1) goto L74
            goto L76
        L74:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
        L76:
            if (r8 != r1) goto L79
            return r1
        L79:
            r2 = r6
        L7a:
            com.amazon.aps.iva.o0.i1 r8 = r2.b
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.l = r3
            java.lang.Object r8 = r8.m0(r7, r0)
            if (r8 != r1) goto L8a
            return r1
        L8a:
            return r8
        L8b:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L8e:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.z1.m0(com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final com.amazon.aps.iva.ob0.g minusKey(g.c<?> cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "key");
        return g.b.a.b(this, cVar);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final com.amazon.aps.iva.ob0.g plus(com.amazon.aps.iva.ob0.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "context");
        return g.a.a(this, gVar);
    }
}
