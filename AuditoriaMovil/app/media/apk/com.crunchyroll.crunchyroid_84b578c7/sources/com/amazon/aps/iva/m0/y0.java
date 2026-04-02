package com.amazon.aps.iva.m0;
/* compiled from: InternalMutatorMutex.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {177, 99}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<Object>, Object> {
    public com.amazon.aps.iva.ze0.c h;
    public Object i;
    public x0 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ com.amazon.aps.iva.a0.g1 m;
    public final /* synthetic */ x0 n;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<Object>, Object> o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0(com.amazon.aps.iva.a0.g1 g1Var, x0 x0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<Object>, ? extends Object> lVar, com.amazon.aps.iva.ob0.d<? super y0> dVar) {
        super(2, dVar);
        this.m = g1Var;
        this.n = x0Var;
        this.o = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        y0 y0Var = new y0(this.m, this.n, this.o, dVar);
        y0Var.l = obj;
        return y0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<Object> dVar) {
        return ((y0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x008a, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:42:0x00bf, B:43:0x00c1, B:46:0x00c8, B:54:0x00d9, B:55:0x00db, B:57:0x00e1, B:60:0x00e8), top: B:63:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.amazon.aps.iva.ze0.c, int] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.m0.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
