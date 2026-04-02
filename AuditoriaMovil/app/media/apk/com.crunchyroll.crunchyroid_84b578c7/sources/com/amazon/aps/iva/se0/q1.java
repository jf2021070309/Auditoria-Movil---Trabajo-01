package com.amazon.aps.iva.se0;
/* compiled from: JobSupport.kt */
@com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {952, 954}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class q1 extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.ne0.j<? super j1>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public com.amazon.aps.iva.xe0.g i;
    public com.amazon.aps.iva.xe0.h j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ o1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.amazon.aps.iva.ob0.d dVar, o1 o1Var) {
        super(dVar);
        this.m = o1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        q1 q1Var = new q1(dVar, this.m);
        q1Var.l = obj;
        return q1Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.ne0.j<? super j1> jVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((q1) create(jVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.amazon.aps.iva.xe0.g] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:27:0x0078). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:27:0x0078). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r7.k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            com.amazon.aps.iva.xe0.h r1 = r7.j
            com.amazon.aps.iva.xe0.g r3 = r7.i
            java.lang.Object r4 = r7.l
            com.amazon.aps.iva.ne0.j r4 = (com.amazon.aps.iva.ne0.j) r4
            com.amazon.aps.iva.ab.x.i0(r8)
            r8 = r7
            goto L78
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L7d
        L25:
            com.amazon.aps.iva.ab.x.i0(r8)
            java.lang.Object r8 = r7.l
            com.amazon.aps.iva.ne0.j r8 = (com.amazon.aps.iva.ne0.j) r8
            com.amazon.aps.iva.se0.o1 r1 = r7.m
            java.lang.Object r1 = r1.b0()
            boolean r4 = r1 instanceof com.amazon.aps.iva.se0.r
            if (r4 == 0) goto L43
            com.amazon.aps.iva.se0.r r1 = (com.amazon.aps.iva.se0.r) r1
            com.amazon.aps.iva.se0.s r1 = r1.f
            r7.k = r3
            com.amazon.aps.iva.pb0.a r8 = r8.b(r1, r7)
            if (r8 != r0) goto L7d
            return r0
        L43:
            boolean r3 = r1 instanceof com.amazon.aps.iva.se0.f1
            if (r3 == 0) goto L7d
            com.amazon.aps.iva.se0.f1 r1 = (com.amazon.aps.iva.se0.f1) r1
            com.amazon.aps.iva.se0.u1 r1 = r1.d()
            if (r1 == 0) goto L7d
            java.lang.Object r3 = r1.i()
            com.amazon.aps.iva.xe0.h r3 = (com.amazon.aps.iva.xe0.h) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L5a:
            boolean r5 = com.amazon.aps.iva.yb0.j.a(r1, r3)
            if (r5 != 0) goto L7d
            boolean r5 = r1 instanceof com.amazon.aps.iva.se0.r
            if (r5 == 0) goto L78
            r5 = r1
            com.amazon.aps.iva.se0.r r5 = (com.amazon.aps.iva.se0.r) r5
            com.amazon.aps.iva.se0.s r5 = r5.f
            r8.l = r4
            r8.i = r3
            r8.j = r1
            r8.k = r2
            com.amazon.aps.iva.pb0.a r5 = r4.b(r5, r8)
            if (r5 != r0) goto L78
            return r0
        L78:
            com.amazon.aps.iva.xe0.h r1 = r1.j()
            goto L5a
        L7d:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.se0.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
