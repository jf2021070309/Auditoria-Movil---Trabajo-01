package com.amazon.aps.iva.v1;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
/* compiled from: ViewCompositionStrategy.android.kt */
/* loaded from: classes.dex */
public final class q2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ a h;
    public final /* synthetic */ r2 i;
    public final /* synthetic */ com.amazon.aps.iva.v3.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(a aVar, r2 r2Var, s2 s2Var) {
        super(0);
        this.h = aVar;
        this.i = r2Var;
        this.j = s2Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        a aVar = this.h;
        aVar.removeOnAttachStateChangeListener(this.i);
        com.amazon.aps.iva.v3.a aVar2 = this.j;
        com.amazon.aps.iva.yb0.j.f(aVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.amazon.aps.iva.dg.b.v(aVar).a.remove(aVar2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
