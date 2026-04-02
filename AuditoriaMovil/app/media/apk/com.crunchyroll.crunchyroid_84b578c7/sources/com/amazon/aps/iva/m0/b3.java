package com.amazon.aps.iva.m0;
/* compiled from: Surface.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b3 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.f0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public b3(com.amazon.aps.iva.ob0.d<? super b3> dVar) {
        super(2, dVar);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new b3(dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.p1.f0 f0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return new b3(dVar).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
