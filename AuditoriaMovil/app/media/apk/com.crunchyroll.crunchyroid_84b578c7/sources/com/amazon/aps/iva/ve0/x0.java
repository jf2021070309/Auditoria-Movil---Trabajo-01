package com.amazon.aps.iva.ve0;

import com.google.android.gms.cast.MediaError;
/* compiled from: Share.kt */
@com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, MediaError.DetailedErrorCode.DASH_INVALID_SEGMENT_INFO}, m = "onSubscription")
/* loaded from: classes4.dex */
public final class x0 extends com.amazon.aps.iva.qb0.c {
    public y0 h;
    public com.amazon.aps.iva.we0.o i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y0<Object> k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0<Object> y0Var, com.amazon.aps.iva.ob0.d<? super x0> dVar) {
        super(dVar);
        this.k = y0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
