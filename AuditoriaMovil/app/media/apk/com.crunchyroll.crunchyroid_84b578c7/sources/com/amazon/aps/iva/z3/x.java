package com.amazon.aps.iva.z3;
/* compiled from: SingleProcessDataStore.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
/* loaded from: classes.dex */
public final class x extends com.amazon.aps.iva.qb0.c {
    public Object h;
    public q i;
    public com.amazon.aps.iva.se0.t j;
    public /* synthetic */ Object k;
    public final /* synthetic */ q<Object> l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q<Object> qVar, com.amazon.aps.iva.ob0.d<? super x> dVar) {
        super(dVar);
        this.l = qVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return q.b(this.l, null, this);
    }
}
