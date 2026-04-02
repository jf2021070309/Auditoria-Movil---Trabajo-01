package com.amazon.aps.iva.b0;
/* compiled from: Draggable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.o2.o, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ com.amazon.aps.iva.se0.g0 i;
    public /* synthetic */ long j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.se0.g0, Float, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> k;
    public final /* synthetic */ f0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.se0.g0, ? super Float, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, f0 f0Var, com.amazon.aps.iva.ob0.d<? super r> dVar) {
        super(3, dVar);
        this.k = qVar;
        this.l = f0Var;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.o2.o oVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        long j = oVar.a;
        r rVar = new r(this.k, this.l, dVar);
        rVar.i = g0Var;
        rVar.j = j;
        return rVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        float b;
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
            com.amazon.aps.iva.se0.g0 g0Var = this.i;
            long j = this.j;
            if (this.l == f0.Vertical) {
                b = com.amazon.aps.iva.o2.o.c(j);
            } else {
                b = com.amazon.aps.iva.o2.o.b(j);
            }
            Float f = new Float(b);
            this.h = 1;
            if (this.k.invoke(g0Var, f, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
