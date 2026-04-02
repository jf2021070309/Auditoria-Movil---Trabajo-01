package com.amazon.aps.iva.n0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
/* compiled from: Ripple.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {290}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ v i;
    public final /* synthetic */ float j;
    public final /* synthetic */ com.amazon.aps.iva.z.j<Float> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, float f, com.amazon.aps.iva.z.j<Float> jVar, com.amazon.aps.iva.ob0.d<? super t> dVar) {
        super(2, dVar);
        this.i = vVar;
        this.j = f;
        this.k = jVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new t(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((t) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            com.amazon.aps.iva.z.b<Float, com.amazon.aps.iva.z.m> bVar = this.i.c;
            Float f = new Float(this.j);
            this.h = 1;
            if (com.amazon.aps.iva.z.b.b(bVar, f, this.k, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
