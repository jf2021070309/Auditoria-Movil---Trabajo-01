package com.amazon.aps.iva.b0;
/* compiled from: Scrollable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {534}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<n0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ l0 j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<k, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(l0 l0Var, com.amazon.aps.iva.xb0.p<? super k, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super k0> dVar) {
        super(2, dVar);
        this.j = l0Var;
        this.k = pVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        k0 k0Var = new k0(this.j, this.k, dVar);
        k0Var.i = obj;
        return k0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(n0 n0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((k0) create(n0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            n0 n0Var = (n0) this.i;
            l0 l0Var = this.j;
            l0Var.getClass();
            com.amazon.aps.iva.yb0.j.f(n0Var, "<set-?>");
            l0Var.b = n0Var;
            this.h = 1;
            if (this.k.invoke(l0Var, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
