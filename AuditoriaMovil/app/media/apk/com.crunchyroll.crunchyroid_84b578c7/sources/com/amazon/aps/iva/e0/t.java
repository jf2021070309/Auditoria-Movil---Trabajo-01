package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.f0.v0;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q0;
/* compiled from: LazyListItemProvider.kt */
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ p3<i> h;
    public final /* synthetic */ g0 i;
    public final /* synthetic */ d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q0 q0Var, g0 g0Var, d dVar) {
        super(0);
        this.h = q0Var;
        this.i = g0Var;
        this.j = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        i value = this.h.getValue();
        g0 g0Var = this.i;
        return new q(g0Var, value, this.j, new v0((com.amazon.aps.iva.ec0.j) g0Var.a.e.getValue(), value));
    }
}
