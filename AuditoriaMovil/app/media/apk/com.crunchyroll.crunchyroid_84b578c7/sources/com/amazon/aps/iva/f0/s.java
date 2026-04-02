package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.s1.f1;
/* compiled from: LazyLayout.kt */
/* loaded from: classes.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<f1, com.amazon.aps.iva.o2.a, com.amazon.aps.iva.s1.e0> {
    public final /* synthetic */ m h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p<v, com.amazon.aps.iva.o2.a, com.amazon.aps.iva.s1.e0> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(m mVar, com.amazon.aps.iva.xb0.p<? super v, ? super com.amazon.aps.iva.o2.a, ? extends com.amazon.aps.iva.s1.e0> pVar) {
        super(2);
        this.h = mVar;
        this.i = pVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.s1.e0 invoke(f1 f1Var, com.amazon.aps.iva.o2.a aVar) {
        f1 f1Var2 = f1Var;
        long j = aVar.a;
        com.amazon.aps.iva.yb0.j.f(f1Var2, "$this$null");
        return this.i.invoke(new w(this.h, f1Var2), new com.amazon.aps.iva.o2.a(j));
    }
}
