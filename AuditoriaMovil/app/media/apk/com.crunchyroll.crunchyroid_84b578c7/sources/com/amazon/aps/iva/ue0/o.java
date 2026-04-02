package com.amazon.aps.iva.ue0;
/* compiled from: Produce.kt */
/* loaded from: classes4.dex */
public final class o {

    /* compiled from: Produce.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public q h;
        public com.amazon.aps.iva.xb0.a i;
        public /* synthetic */ Object j;
        public int k;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.k |= Integer.MIN_VALUE;
            return o.a(null, null, this);
        }
    }

    /* compiled from: Produce.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.se0.m<com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.se0.n nVar) {
            super(1);
            this.h = nVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            this.h.resumeWith(qVar);
            return qVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.amazon.aps.iva.ue0.q<?> r4, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            boolean r0 = r6 instanceof com.amazon.aps.iva.ue0.o.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.ue0.o$a r0 = (com.amazon.aps.iva.ue0.o.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.ue0.o$a r0 = new com.amazon.aps.iva.ue0.o$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.amazon.aps.iva.xb0.a r4 = r0.i
            r5 = r4
            com.amazon.aps.iva.xb0.a r5 = (com.amazon.aps.iva.xb0.a) r5
            com.amazon.aps.iva.ab.x.i0(r6)     // Catch: java.lang.Throwable -> L6f
            goto L69
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.ob0.g r6 = r0.getContext()
            com.amazon.aps.iva.se0.j1$b r2 = com.amazon.aps.iva.se0.j1.b.b
            com.amazon.aps.iva.ob0.g$b r6 = r6.get(r2)
            if (r6 != r4) goto L45
            r6 = r3
            goto L46
        L45:
            r6 = 0
        L46:
            if (r6 == 0) goto L74
            r0.h = r4     // Catch: java.lang.Throwable -> L6f
            r0.i = r5     // Catch: java.lang.Throwable -> L6f
            r0.k = r3     // Catch: java.lang.Throwable -> L6f
            com.amazon.aps.iva.se0.n r6 = new com.amazon.aps.iva.se0.n     // Catch: java.lang.Throwable -> L6f
            com.amazon.aps.iva.ob0.d r0 = com.amazon.aps.iva.a60.b.s(r0)     // Catch: java.lang.Throwable -> L6f
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L6f
            r6.r()     // Catch: java.lang.Throwable -> L6f
            com.amazon.aps.iva.ue0.o$b r0 = new com.amazon.aps.iva.ue0.o$b     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L6f
            r4.b(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r4 = r6.q()     // Catch: java.lang.Throwable -> L6f
            if (r4 != r1) goto L69
            return r1
        L69:
            r5.invoke()
            com.amazon.aps.iva.kb0.q r4 = com.amazon.aps.iva.kb0.q.a
            return r4
        L6f:
            r4 = move-exception
            r5.invoke()
            throw r4
        L74:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ue0.o.a(com.amazon.aps.iva.ue0.q, com.amazon.aps.iva.xb0.a, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
