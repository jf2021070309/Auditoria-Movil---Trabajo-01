package com.amazon.aps.iva.ve0;

import com.amazon.aps.iva.se0.j1;
/* compiled from: SharedFlow.kt */
@com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {373, 380, 383}, m = "collect$suspendImpl")
/* loaded from: classes4.dex */
public final class m0 extends com.amazon.aps.iva.qb0.c {
    public l0 h;
    public g i;
    public n0 j;
    public j1 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ l0<Object> m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(l0<Object> l0Var, com.amazon.aps.iva.ob0.d<? super m0> dVar) {
        super(dVar);
        this.m = l0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return l0.l(this.m, null, this);
    }
}
