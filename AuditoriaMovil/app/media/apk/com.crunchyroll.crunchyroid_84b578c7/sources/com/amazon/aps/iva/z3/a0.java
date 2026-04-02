package com.amazon.aps.iva.z3;

import com.amazon.aps.iva.se0.g0;
/* compiled from: SingleProcessDataStore.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<Object>, Object> {
    public int h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<Object, com.amazon.aps.iva.ob0.d<Object>, Object> i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(com.amazon.aps.iva.xb0.p<Object, ? super com.amazon.aps.iva.ob0.d<Object>, ? extends Object> pVar, Object obj, com.amazon.aps.iva.ob0.d<? super a0> dVar) {
        super(2, dVar);
        this.i = pVar;
        this.j = obj;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new a0(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<Object> dVar) {
        return ((a0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            this.h = 1;
            obj = this.i.invoke(this.j, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
