package com.amazon.aps.iva.m0;
/* compiled from: ModalBottomSheet.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$2", f = "ModalBottomSheet.kt", l = {823}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ f2 i;
    public final /* synthetic */ g2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(f2 f2Var, g2 g2Var, com.amazon.aps.iva.ob0.d<? super i1> dVar) {
        super(2, dVar);
        this.i = f2Var;
        this.j = g2Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new i1(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((i1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            g2 g2Var = this.j;
            this.h = 1;
            k<g2> kVar = this.i.c;
            i iVar = new i(g2Var, null);
            com.amazon.aps.iva.a0.g1 g1Var = com.amazon.aps.iva.a0.g1.Default;
            kVar.getClass();
            Object p = com.amazon.aps.iva.e.z.p(new n(g2Var, kVar, g1Var, iVar, null), this);
            if (p != obj2) {
                p = com.amazon.aps.iva.kb0.q.a;
            }
            if (p != obj2) {
                p = com.amazon.aps.iva.kb0.q.a;
            }
            if (p != obj2) {
                p = com.amazon.aps.iva.kb0.q.a;
            }
            if (p != obj2) {
                p = com.amazon.aps.iva.kb0.q.a;
            }
            if (p == obj2) {
                return obj2;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
