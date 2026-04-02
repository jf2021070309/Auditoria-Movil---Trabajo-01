package com.amazon.aps.iva.b0;
/* compiled from: TapGestureDetector.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {212}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x0 extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.p1.y>, Object> {
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ com.amazon.aps.iva.p1.y l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.amazon.aps.iva.p1.y yVar, com.amazon.aps.iva.ob0.d<? super x0> dVar) {
        super(dVar);
        this.l = yVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        x0 x0Var = new x0(this.l, dVar);
        x0Var.k = obj;
        return x0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.p1.y> dVar) {
        return ((x0) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0045 -> B:13:0x004b). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r9.j
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            long r3 = r9.i
            java.lang.Object r1 = r9.k
            com.amazon.aps.iva.p1.c r1 = (com.amazon.aps.iva.p1.c) r1
            com.amazon.aps.iva.ab.x.i0(r10)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            goto L4b
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            com.amazon.aps.iva.ab.x.i0(r10)
            java.lang.Object r10 = r9.k
            com.amazon.aps.iva.p1.c r10 = (com.amazon.aps.iva.p1.c) r10
            com.amazon.aps.iva.p1.y r1 = r9.l
            long r3 = r1.b
            com.amazon.aps.iva.v1.v2 r1 = r10.getViewConfiguration()
            r1.b()
            r5 = 40
            long r5 = r5 + r3
            r1 = r10
            r3 = r5
            r10 = r9
        L37:
            r10.k = r1
            r10.i = r3
            r10.j = r2
            r5 = 3
            java.lang.Object r5 = com.amazon.aps.iva.b0.w0.c(r1, r10, r5)
            if (r5 != r0) goto L45
            return r0
        L45:
            r8 = r0
            r0 = r10
            r10 = r5
            r4 = r3
            r3 = r1
            r1 = r8
        L4b:
            com.amazon.aps.iva.p1.y r10 = (com.amazon.aps.iva.p1.y) r10
            long r6 = r10.b
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 < 0) goto L54
            return r10
        L54:
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
