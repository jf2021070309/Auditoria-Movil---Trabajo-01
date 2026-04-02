package com.amazon.aps.iva.a0;
/* compiled from: MutatorMutex.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {186, 132}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<Object>, Object> {
    public com.amazon.aps.iva.ze0.c h;
    public Object i;
    public i1 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g1 m;
    public final /* synthetic */ i1 n;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<Object>, Object> o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j1(g1 g1Var, i1 i1Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<Object>, ? extends Object> lVar, com.amazon.aps.iva.ob0.d<? super j1> dVar) {
        super(2, dVar);
        this.m = g1Var;
        this.n = i1Var;
        this.o = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        j1 j1Var = new j1(this.m, this.n, this.o, dVar);
        j1Var.l = obj;
        return j1Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<Object> dVar) {
        return ((j1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #0 {all -> 0x0099, blocks: (B:23:0x0086, B:24:0x0088, B:27:0x008f, B:35:0x00a0, B:36:0x00a2, B:38:0x00a8, B:41:0x00af), top: B:44:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.amazon.aps.iva.ze0.c, int] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r8.k
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L38
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r0 = r8.i
            com.amazon.aps.iva.a0.i1 r0 = (com.amazon.aps.iva.a0.i1) r0
            com.amazon.aps.iva.ze0.c r1 = r8.h
            java.lang.Object r2 = r8.l
            com.amazon.aps.iva.a0.i1$a r2 = (com.amazon.aps.iva.a0.i1.a) r2
            com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.lang.Throwable -> L1c
            goto L86
        L1c:
            r9 = move-exception
            goto La0
        L1f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L27:
            com.amazon.aps.iva.a0.i1 r1 = r8.j
            java.lang.Object r3 = r8.i
            com.amazon.aps.iva.xb0.l r3 = (com.amazon.aps.iva.xb0.l) r3
            com.amazon.aps.iva.ze0.c r5 = r8.h
            java.lang.Object r6 = r8.l
            com.amazon.aps.iva.a0.i1$a r6 = (com.amazon.aps.iva.a0.i1.a) r6
            com.amazon.aps.iva.ab.x.i0(r9)
            r9 = r1
            goto L71
        L38:
            com.amazon.aps.iva.ab.x.i0(r9)
            java.lang.Object r9 = r8.l
            com.amazon.aps.iva.se0.g0 r9 = (com.amazon.aps.iva.se0.g0) r9
            com.amazon.aps.iva.a0.i1$a r1 = new com.amazon.aps.iva.a0.i1$a
            com.amazon.aps.iva.ob0.g r9 = r9.getCoroutineContext()
            com.amazon.aps.iva.se0.j1$b r5 = com.amazon.aps.iva.se0.j1.b.b
            com.amazon.aps.iva.ob0.g$b r9 = r9.get(r5)
            com.amazon.aps.iva.yb0.j.c(r9)
            com.amazon.aps.iva.se0.j1 r9 = (com.amazon.aps.iva.se0.j1) r9
            com.amazon.aps.iva.a0.g1 r5 = r8.m
            r1.<init>(r5, r9)
            com.amazon.aps.iva.a0.i1 r9 = r8.n
            com.amazon.aps.iva.a0.i1.a(r9, r1)
            r8.l = r1
            com.amazon.aps.iva.ze0.d r5 = r9.b
            r8.h = r5
            com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<java.lang.Object>, java.lang.Object> r6 = r8.o
            r8.i = r6
            r8.j = r9
            r8.k = r3
            java.lang.Object r3 = r5.a(r4, r8)
            if (r3 != r0) goto L6f
            return r0
        L6f:
            r3 = r6
            r6 = r1
        L71:
            r1 = r5
            r8.l = r6     // Catch: java.lang.Throwable -> L9b
            r8.h = r1     // Catch: java.lang.Throwable -> L9b
            r8.i = r9     // Catch: java.lang.Throwable -> L9b
            r8.j = r4     // Catch: java.lang.Throwable -> L9b
            r8.k = r2     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r3.invoke(r8)     // Catch: java.lang.Throwable -> L9b
            if (r2 != r0) goto L83
            return r0
        L83:
            r0 = r9
            r9 = r2
            r2 = r6
        L86:
            java.util.concurrent.atomic.AtomicReference<com.amazon.aps.iva.a0.i1$a> r0 = r0.a     // Catch: java.lang.Throwable -> L99
        L88:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch: java.lang.Throwable -> L99
            if (r3 == 0) goto L8f
            goto L95
        L8f:
            java.lang.Object r3 = r0.get()     // Catch: java.lang.Throwable -> L99
            if (r3 == r2) goto L88
        L95:
            r1.d(r4)
            return r9
        L99:
            r9 = move-exception
            goto Lb0
        L9b:
            r0 = move-exception
            r2 = r6
            r7 = r0
            r0 = r9
            r9 = r7
        La0:
            java.util.concurrent.atomic.AtomicReference<com.amazon.aps.iva.a0.i1$a> r0 = r0.a     // Catch: java.lang.Throwable -> L99
        La2:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch: java.lang.Throwable -> L99
            if (r3 != 0) goto Laf
            java.lang.Object r3 = r0.get()     // Catch: java.lang.Throwable -> L99
            if (r3 != r2) goto Laf
            goto La2
        Laf:
            throw r9     // Catch: java.lang.Throwable -> L99
        Lb0:
            r1.d(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a0.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
