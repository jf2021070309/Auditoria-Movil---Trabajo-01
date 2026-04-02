package com.amazon.aps.iva.wd;

import com.amazon.aps.iva.i2.e0;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.wd.u;
/* compiled from: CreatePasswordScreenContent.kt */
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<e0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ q1<e0> h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<u, com.amazon.aps.iva.kb0.q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(q1<e0> q1Var, com.amazon.aps.iva.xb0.l<? super u, com.amazon.aps.iva.kb0.q> lVar) {
        super(1);
        this.h = q1Var;
        this.i = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(e0 e0Var) {
        e0 e0Var2 = e0Var;
        com.amazon.aps.iva.yb0.j.f(e0Var2, "text");
        this.h.setValue(e0Var2);
        this.i.invoke(new u.d(e0Var2.a.b));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
