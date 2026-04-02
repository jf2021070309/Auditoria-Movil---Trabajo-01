package com.amazon.aps.iva.a0;
/* compiled from: MutatorMutex.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {186, 173}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<Object>, Object> {
    public com.amazon.aps.iva.ze0.c h;
    public Object i;
    public Object j;
    public i1 k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ g1 n;
    public final /* synthetic */ i1 o;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<Object, com.amazon.aps.iva.ob0.d<Object>, Object> p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k1(g1 g1Var, i1 i1Var, com.amazon.aps.iva.xb0.p<Object, ? super com.amazon.aps.iva.ob0.d<Object>, ? extends Object> pVar, Object obj, com.amazon.aps.iva.ob0.d<? super k1> dVar) {
        super(2, dVar);
        this.n = g1Var;
        this.o = i1Var;
        this.p = pVar;
        this.q = obj;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        k1 k1Var = new k1(this.n, this.o, this.p, this.q, dVar);
        k1Var.m = obj;
        return k1Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<Object> dVar) {
        return ((k1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #1 {all -> 0x00b8, blocks: (B:22:0x0090, B:23:0x0092, B:26:0x0099, B:32:0x00a8, B:33:0x00aa, B:35:0x00b0, B:38:0x00b7), top: B:44:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.amazon.aps.iva.ze0.c, int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.amazon.aps.iva.ze0.c] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.amazon.aps.iva.ze0.c] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r9.l
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r0 = r9.i
            com.amazon.aps.iva.a0.i1 r0 = (com.amazon.aps.iva.a0.i1) r0
            com.amazon.aps.iva.ze0.c r1 = r9.h
            java.lang.Object r2 = r9.m
            com.amazon.aps.iva.a0.i1$a r2 = (com.amazon.aps.iva.a0.i1.a) r2
            com.amazon.aps.iva.ab.x.i0(r10)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r10 = move-exception
            goto La8
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            com.amazon.aps.iva.a0.i1 r1 = r9.k
            java.lang.Object r3 = r9.j
            java.lang.Object r5 = r9.i
            com.amazon.aps.iva.xb0.p r5 = (com.amazon.aps.iva.xb0.p) r5
            com.amazon.aps.iva.ze0.c r6 = r9.h
            java.lang.Object r7 = r9.m
            com.amazon.aps.iva.a0.i1$a r7 = (com.amazon.aps.iva.a0.i1.a) r7
            com.amazon.aps.iva.ab.x.i0(r10)
            r10 = r1
            r1 = r6
            goto L7a
        L3b:
            com.amazon.aps.iva.ab.x.i0(r10)
            java.lang.Object r10 = r9.m
            com.amazon.aps.iva.se0.g0 r10 = (com.amazon.aps.iva.se0.g0) r10
            com.amazon.aps.iva.a0.i1$a r1 = new com.amazon.aps.iva.a0.i1$a
            com.amazon.aps.iva.ob0.g r10 = r10.getCoroutineContext()
            com.amazon.aps.iva.se0.j1$b r5 = com.amazon.aps.iva.se0.j1.b.b
            com.amazon.aps.iva.ob0.g$b r10 = r10.get(r5)
            com.amazon.aps.iva.yb0.j.c(r10)
            com.amazon.aps.iva.se0.j1 r10 = (com.amazon.aps.iva.se0.j1) r10
            com.amazon.aps.iva.a0.g1 r5 = r9.n
            r1.<init>(r5, r10)
            com.amazon.aps.iva.a0.i1 r10 = r9.o
            com.amazon.aps.iva.a0.i1.a(r10, r1)
            r9.m = r1
            com.amazon.aps.iva.ze0.d r5 = r10.b
            r9.h = r5
            com.amazon.aps.iva.xb0.p<java.lang.Object, com.amazon.aps.iva.ob0.d<java.lang.Object>, java.lang.Object> r6 = r9.p
            r9.i = r6
            java.lang.Object r7 = r9.q
            r9.j = r7
            r9.k = r10
            r9.l = r3
            java.lang.Object r3 = r5.a(r4, r9)
            if (r3 != r0) goto L76
            return r0
        L76:
            r3 = r7
            r7 = r1
            r1 = r5
            r5 = r6
        L7a:
            r9.m = r7     // Catch: java.lang.Throwable -> La3
            r9.h = r1     // Catch: java.lang.Throwable -> La3
            r9.i = r10     // Catch: java.lang.Throwable -> La3
            r9.j = r4     // Catch: java.lang.Throwable -> La3
            r9.k = r4     // Catch: java.lang.Throwable -> La3
            r9.l = r2     // Catch: java.lang.Throwable -> La3
            java.lang.Object r2 = r5.invoke(r3, r9)     // Catch: java.lang.Throwable -> La3
            if (r2 != r0) goto L8d
            return r0
        L8d:
            r0 = r10
            r10 = r2
            r2 = r7
        L90:
            java.util.concurrent.atomic.AtomicReference<com.amazon.aps.iva.a0.i1$a> r0 = r0.a     // Catch: java.lang.Throwable -> Lb8
        L92:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch: java.lang.Throwable -> Lb8
            if (r3 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r3 = r0.get()     // Catch: java.lang.Throwable -> Lb8
            if (r3 == r2) goto L92
        L9f:
            r1.d(r4)
            return r10
        La3:
            r0 = move-exception
            r2 = r7
            r8 = r0
            r0 = r10
            r10 = r8
        La8:
            java.util.concurrent.atomic.AtomicReference<com.amazon.aps.iva.a0.i1$a> r0 = r0.a     // Catch: java.lang.Throwable -> Lb8
        Laa:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch: java.lang.Throwable -> Lb8
            if (r3 != 0) goto Lb7
            java.lang.Object r3 = r0.get()     // Catch: java.lang.Throwable -> Lb8
            if (r3 != r2) goto Lb7
            goto Laa
        Lb7:
            throw r10     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r10 = move-exception
            r1.d(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a0.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
