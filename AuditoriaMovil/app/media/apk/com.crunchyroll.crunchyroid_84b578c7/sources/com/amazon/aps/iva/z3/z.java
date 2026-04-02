package com.amazon.aps.iva.z3;

import java.util.LinkedHashSet;
/* compiled from: SingleProcessDataStore.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
/* loaded from: classes.dex */
public final class z extends com.amazon.aps.iva.qb0.c {
    public q h;
    public Object i;
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ q<Object> l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(q<Object> qVar, com.amazon.aps.iva.ob0.d<? super z> dVar) {
        super(dVar);
        this.l = qVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = q.k;
        return this.l.i(this, null, null);
    }
}
