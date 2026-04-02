package com.amazon.aps.iva.z3;

import com.amazon.aps.iva.yb0.d0;
import com.amazon.aps.iva.z3.q;
/* compiled from: SingleProcessDataStore.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
/* loaded from: classes.dex */
public final class y extends com.amazon.aps.iva.qb0.c {
    public Object h;
    public Object i;
    public Object j;
    public d0 k;
    public q l;
    public /* synthetic */ Object m;
    public final /* synthetic */ q.d n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(q.d dVar, com.amazon.aps.iva.ob0.d<? super y> dVar2) {
        super(dVar2);
        this.n = dVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
