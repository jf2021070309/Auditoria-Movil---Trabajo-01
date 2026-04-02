package com.amazon.aps.iva.ve0;
/* compiled from: Limit.kt */
/* loaded from: classes4.dex */
public final class p<T> implements g {
    public final /* synthetic */ com.amazon.aps.iva.yb0.z b;
    public final /* synthetic */ g<T> c;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<T, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> d;

    /* compiled from: Limit.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public p h;
        public Object i;
        public /* synthetic */ Object j;
        public final /* synthetic */ p<T> k;
        public int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super T> pVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
            this.k = pVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return this.k.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(com.amazon.aps.iva.yb0.z zVar, g<? super T> gVar, com.amazon.aps.iva.xb0.p<? super T, ? super com.amazon.aps.iva.ob0.d<? super Boolean>, ? extends Object> pVar) {
        this.b = zVar;
        this.c = gVar;
        this.d = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    @Override // com.amazon.aps.iva.ve0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(T r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.ve0.p.a
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.ve0.p$a r0 = (com.amazon.aps.iva.ve0.p.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.ve0.p$a r0 = new com.amazon.aps.iva.ve0.p$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L84
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.ve0.p r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L68
        L3d:
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L55
        L41:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.amazon.aps.iva.yb0.z r8 = r6.b
            boolean r8 = r8.b
            if (r8 == 0) goto L58
            r0.l = r5
            com.amazon.aps.iva.ve0.g<T> r8 = r6.c
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        L58:
            r0.h = r6
            r0.i = r7
            r0.l = r4
            com.amazon.aps.iva.xb0.p<T, com.amazon.aps.iva.ob0.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.d
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r2 = r6
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L87
            com.amazon.aps.iva.yb0.z r8 = r2.b
            r8.b = r5
            r8 = 0
            r0.h = r8
            r0.i = r8
            r0.l = r3
            com.amazon.aps.iva.ve0.g<T> r8 = r2.c
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L84
            return r1
        L84:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        L87:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.p.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
