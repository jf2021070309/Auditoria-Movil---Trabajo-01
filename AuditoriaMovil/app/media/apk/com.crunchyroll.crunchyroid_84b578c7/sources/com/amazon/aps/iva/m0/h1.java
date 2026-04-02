package com.amazon.aps.iva.m0;
/* compiled from: ModalBottomSheet.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$1", f = "ModalBottomSheet.kt", l = {819}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ f2 i;
    public final /* synthetic */ g2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(f2 f2Var, g2 g2Var, com.amazon.aps.iva.ob0.d<? super h1> dVar) {
        super(2, dVar);
        this.i = f2Var;
        this.j = g2Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new h1(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((h1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            f2 f2Var = this.i;
            float d = f2Var.c.k.d();
            this.h = 1;
            Object b = j.b(d, f2Var.c, this.j, this);
            if (b != obj2) {
                b = com.amazon.aps.iva.kb0.q.a;
            }
            if (b == obj2) {
                return obj2;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
