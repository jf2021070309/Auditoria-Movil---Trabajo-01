package com.amazon.aps.iva.ve0;
/* compiled from: Limit.kt */
/* loaded from: classes4.dex */
public final class t implements g<Object> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.p b;
    public final /* synthetic */ com.amazon.aps.iva.yb0.d0 c;

    /* compiled from: Limit.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public t h;
        public /* synthetic */ Object i;
        public int j;
        public Object l;

        public a(com.amazon.aps.iva.ob0.d dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.j |= Integer.MIN_VALUE;
            return t.this.a(null, this);
        }
    }

    public t(com.amazon.aps.iva.xb0.p pVar, com.amazon.aps.iva.yb0.d0 d0Var) {
        this.b = pVar;
        this.c = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // com.amazon.aps.iva.ve0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.ve0.t.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.ve0.t$a r0 = (com.amazon.aps.iva.ve0.t.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.ve0.t$a r0 = new com.amazon.aps.iva.ve0.t$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.l
            com.amazon.aps.iva.ve0.t r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r4
            r0.l = r5
            r0.j = r3
            com.amazon.aps.iva.xb0.p r6 = r4.b
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L53
            com.amazon.aps.iva.yb0.d0 r6 = r0.c
            r6.b = r5
            r3 = 0
        L53:
            if (r3 == 0) goto L58
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        L58:
            com.amazon.aps.iva.we0.a r5 = new com.amazon.aps.iva.we0.a
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.t.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
