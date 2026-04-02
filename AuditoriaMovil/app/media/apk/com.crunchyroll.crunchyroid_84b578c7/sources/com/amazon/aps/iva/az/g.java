package com.amazon.aps.iva.az;
/* compiled from: StateSharedFlow.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.mvp.flow.shared.StateSharedFlowImpl", f = "StateSharedFlow.kt", l = {24, 25}, m = "collect$suspendImpl")
/* loaded from: classes2.dex */
public final class g<T> extends com.amazon.aps.iva.qb0.c {
    public h h;
    public com.amazon.aps.iva.ve0.g i;
    public /* synthetic */ Object j;
    public final /* synthetic */ h<T> k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h<T> hVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(dVar);
        this.k = hVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return h.d(this.k, null, this);
    }
}
