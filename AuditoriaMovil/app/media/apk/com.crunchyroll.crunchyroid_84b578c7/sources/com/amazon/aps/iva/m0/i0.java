package com.amazon.aps.iva.m0;
/* compiled from: Button.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.DefaultButtonElevation$elevation$2", f = "Button.kt", l = {554}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ com.amazon.aps.iva.z.b<com.amazon.aps.iva.o2.e, com.amazon.aps.iva.z.m> i;
    public final /* synthetic */ float j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.amazon.aps.iva.z.b<com.amazon.aps.iva.o2.e, com.amazon.aps.iva.z.m> bVar, float f, com.amazon.aps.iva.ob0.d<? super i0> dVar) {
        super(2, dVar);
        this.i = bVar;
        this.j = f;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new i0(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((i0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            com.amazon.aps.iva.o2.e eVar = new com.amazon.aps.iva.o2.e(this.j);
            this.h = 1;
            if (this.i.d(eVar, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
