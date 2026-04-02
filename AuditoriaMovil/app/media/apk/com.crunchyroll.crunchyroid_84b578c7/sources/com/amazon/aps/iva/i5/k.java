package com.amazon.aps.iva.i5;

import androidx.lifecycle.LiveData;
/* compiled from: FlowLiveData.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public final /* synthetic */ LiveData<Object> h;
    public final /* synthetic */ w<Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LiveData<Object> liveData, w<Object> wVar, com.amazon.aps.iva.ob0.d<? super k> dVar) {
        super(2, dVar);
        this.h = liveData;
        this.i = wVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new k(this.h, this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((k) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        this.h.j(this.i);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
