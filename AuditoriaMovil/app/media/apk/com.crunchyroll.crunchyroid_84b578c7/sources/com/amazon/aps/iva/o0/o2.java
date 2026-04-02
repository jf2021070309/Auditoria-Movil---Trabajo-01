package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.m2;
/* compiled from: Recomposer.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o2 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<m2.d, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
    public /* synthetic */ Object h;

    public o2(com.amazon.aps.iva.ob0.d<? super o2> dVar) {
        super(2, dVar);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        o2 o2Var = new o2(dVar);
        o2Var.h = obj;
        return o2Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(m2.d dVar, com.amazon.aps.iva.ob0.d<? super Boolean> dVar2) {
        return ((o2) create(dVar, dVar2)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        if (((m2.d) this.h) == m2.d.ShutDown) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
