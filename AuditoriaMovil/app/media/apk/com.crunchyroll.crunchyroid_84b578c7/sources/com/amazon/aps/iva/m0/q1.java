package com.amazon.aps.iva.m0;
/* compiled from: ModalBottomSheet.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2$5$2$1", f = "ModalBottomSheet.kt", l = {665}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ f2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(f2 f2Var, com.amazon.aps.iva.ob0.d<? super q1> dVar) {
        super(2, dVar);
        this.i = f2Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new q1(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((q1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object b;
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
            this.h = 1;
            f2 f2Var = this.i;
            f2Var.getClass();
            g2 g2Var = g2.Expanded;
            if (!f2Var.c.b().containsKey(g2Var)) {
                b = com.amazon.aps.iva.kb0.q.a;
            } else {
                b = f2.b(f2Var, g2Var, this);
                if (b != obj2) {
                    b = com.amazon.aps.iva.kb0.q.a;
                }
            }
            if (b == obj2) {
                return obj2;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
