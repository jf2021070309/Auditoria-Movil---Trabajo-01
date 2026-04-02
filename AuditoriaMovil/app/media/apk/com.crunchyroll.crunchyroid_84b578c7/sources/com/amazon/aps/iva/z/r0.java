package com.amazon.aps.iva.z;
/* compiled from: InternalMutatorMutex.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {184, 132}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<Object>, Object> {
    public com.amazon.aps.iva.ze0.c h;
    public Object i;
    public q0 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ o0 m;
    public final /* synthetic */ q0 n;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<Object>, Object> o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r0(o0 o0Var, q0 q0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<Object>, ? extends Object> lVar, com.amazon.aps.iva.ob0.d<? super r0> dVar) {
        super(2, dVar);
        this.m = o0Var;
        this.n = q0Var;
        this.o = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        r0 r0Var = new r0(this.m, this.n, this.o, dVar);
        r0Var.l = obj;
        return r0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<Object> dVar) {
        return ((r0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #0 {all -> 0x00d8, blocks: (B:43:0x00c5, B:44:0x00c7, B:47:0x00ce, B:55:0x00df, B:56:0x00e1, B:58:0x00e7, B:61:0x00ee), top: B:64:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.amazon.aps.iva.ze0.c, int] */
    @Override // com.amazon.aps.iva.qb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
