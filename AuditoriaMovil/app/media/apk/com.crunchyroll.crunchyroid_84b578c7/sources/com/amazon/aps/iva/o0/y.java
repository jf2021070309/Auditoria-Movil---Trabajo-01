package com.amazon.aps.iva.o0;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ Object[] h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Object[] objArr) {
        super(3);
        this.h = objArr;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(d<?> dVar, b3 b3Var, u2 u2Var) {
        d<?> dVar2 = dVar;
        com.amazon.aps.iva.d90.a.c(dVar2, "applier", b3Var, "<anonymous parameter 1>", u2Var, "<anonymous parameter 2>");
        for (Object obj : this.h) {
            dVar2.g(obj);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
