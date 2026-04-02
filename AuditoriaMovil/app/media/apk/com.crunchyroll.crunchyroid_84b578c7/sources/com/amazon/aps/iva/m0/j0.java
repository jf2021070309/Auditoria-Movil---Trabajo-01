package com.amazon.aps.iva.m0;
/* compiled from: Button.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.DefaultButtonElevation$elevation$3", f = "Button.kt", l = {564}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ com.amazon.aps.iva.z.b<com.amazon.aps.iva.o2.e, com.amazon.aps.iva.z.m> i;
    public final /* synthetic */ k0 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ com.amazon.aps.iva.c0.j l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.amazon.aps.iva.z.b<com.amazon.aps.iva.o2.e, com.amazon.aps.iva.z.m> bVar, k0 k0Var, float f, com.amazon.aps.iva.c0.j jVar, com.amazon.aps.iva.ob0.d<? super j0> dVar) {
        super(2, dVar);
        this.i = bVar;
        this.j = k0Var;
        this.k = f;
        this.l = jVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new j0(this.i, this.j, this.k, this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((j0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        if ((r2 instanceof com.amazon.aps.iva.c0.d) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
        if ((r1 instanceof com.amazon.aps.iva.c0.d) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae A[RETURN] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r6.h
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            com.amazon.aps.iva.ab.x.i0(r7)
            goto Laf
        Le:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L16:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.z.b<com.amazon.aps.iva.o2.e, com.amazon.aps.iva.z.m> r7 = r6.i
            com.amazon.aps.iva.o0.y1 r1 = r7.e
            java.lang.Object r1 = r1.getValue()
            com.amazon.aps.iva.o2.e r1 = (com.amazon.aps.iva.o2.e) r1
            float r1 = r1.b
            com.amazon.aps.iva.m0.k0 r3 = r6.j
            float r4 = r3.b
            boolean r4 = com.amazon.aps.iva.o2.e.a(r1, r4)
            r5 = 0
            if (r4 == 0) goto L38
            com.amazon.aps.iva.c0.o r1 = new com.amazon.aps.iva.c0.o
            long r3 = com.amazon.aps.iva.e1.c.b
            r1.<init>(r3)
            goto L55
        L38:
            float r4 = r3.d
            boolean r4 = com.amazon.aps.iva.o2.e.a(r1, r4)
            if (r4 == 0) goto L46
            com.amazon.aps.iva.c0.g r1 = new com.amazon.aps.iva.c0.g
            r1.<init>()
            goto L55
        L46:
            float r3 = r3.e
            boolean r1 = com.amazon.aps.iva.o2.e.a(r1, r3)
            if (r1 == 0) goto L54
            com.amazon.aps.iva.c0.d r1 = new com.amazon.aps.iva.c0.d
            r1.<init>()
            goto L55
        L54:
            r1 = r5
        L55:
            r6.h = r2
            com.amazon.aps.iva.z.k1<com.amazon.aps.iva.o2.e> r2 = com.amazon.aps.iva.m0.q0.a
            com.amazon.aps.iva.c0.j r2 = r6.l
            if (r2 == 0) goto L74
            boolean r1 = r2 instanceof com.amazon.aps.iva.c0.o
            com.amazon.aps.iva.z.k1<com.amazon.aps.iva.o2.e> r3 = com.amazon.aps.iva.m0.q0.a
            if (r1 == 0) goto L64
            goto L72
        L64:
            boolean r1 = r2 instanceof com.amazon.aps.iva.c0.b
            if (r1 == 0) goto L69
            goto L72
        L69:
            boolean r1 = r2 instanceof com.amazon.aps.iva.c0.g
            if (r1 == 0) goto L6e
            goto L72
        L6e:
            boolean r1 = r2 instanceof com.amazon.aps.iva.c0.d
            if (r1 == 0) goto L8e
        L72:
            r5 = r3
            goto L8e
        L74:
            if (r1 == 0) goto L8e
            boolean r2 = r1 instanceof com.amazon.aps.iva.c0.o
            com.amazon.aps.iva.z.k1<com.amazon.aps.iva.o2.e> r3 = com.amazon.aps.iva.m0.q0.b
            if (r2 == 0) goto L7d
            goto L8d
        L7d:
            boolean r2 = r1 instanceof com.amazon.aps.iva.c0.b
            if (r2 == 0) goto L82
            goto L8d
        L82:
            boolean r2 = r1 instanceof com.amazon.aps.iva.c0.g
            if (r2 == 0) goto L89
            com.amazon.aps.iva.z.k1<com.amazon.aps.iva.o2.e> r5 = com.amazon.aps.iva.m0.q0.c
            goto L8e
        L89:
            boolean r1 = r1 instanceof com.amazon.aps.iva.c0.d
            if (r1 == 0) goto L8e
        L8d:
            goto L72
        L8e:
            float r1 = r6.k
            if (r5 == 0) goto L9e
            com.amazon.aps.iva.o2.e r2 = new com.amazon.aps.iva.o2.e
            r2.<init>(r1)
            java.lang.Object r7 = com.amazon.aps.iva.z.b.b(r7, r2, r5, r6)
            if (r7 != r0) goto Laa
            goto Lac
        L9e:
            com.amazon.aps.iva.o2.e r2 = new com.amazon.aps.iva.o2.e
            r2.<init>(r1)
            java.lang.Object r7 = r7.d(r2, r6)
            if (r7 != r0) goto Laa
            goto Lac
        Laa:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
        Lac:
            if (r7 != r0) goto Laf
            return r0
        Laf:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
