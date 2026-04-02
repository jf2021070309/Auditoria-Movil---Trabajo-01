package com.amazon.aps.iva.ve0;
/* compiled from: Errors.kt */
/* loaded from: classes4.dex */
public final class n<T> implements g {
    public final /* synthetic */ g<T> b;
    public final /* synthetic */ com.amazon.aps.iva.yb0.d0<Throwable> c;

    /* compiled from: Errors.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public n h;
        public /* synthetic */ Object i;
        public final /* synthetic */ n<T> j;
        public int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(n<? super T> nVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
            this.j = nVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return this.j.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(g<? super T> gVar, com.amazon.aps.iva.yb0.d0<Throwable> d0Var) {
        this.b = gVar;
        this.c = d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // com.amazon.aps.iva.ve0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(T r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.ve0.n.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.ve0.n$a r0 = (com.amazon.aps.iva.ve0.n.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.ve0.n$a r0 = new com.amazon.aps.iva.ve0.n$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.ve0.n r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)     // Catch: java.lang.Throwable -> L29
            goto L43
        L29:
            r6 = move-exception
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.ve0.g<T> r6 = r4.b     // Catch: java.lang.Throwable -> L46
            r0.h = r4     // Catch: java.lang.Throwable -> L46
            r0.k = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L43
            return r1
        L43:
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        L46:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L49:
            com.amazon.aps.iva.yb0.d0<java.lang.Throwable> r5 = r5.c
            r5.b = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.n.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
