package com.amazon.aps.iva.b0;
/* compiled from: Draggable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public o(com.amazon.aps.iva.ob0.d<? super o> dVar) {
        super(3, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.e1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        long j = cVar.a;
        return new o(dVar).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
