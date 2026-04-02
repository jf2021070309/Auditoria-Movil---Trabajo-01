package com.amazon.aps.iva.c1;

import com.amazon.aps.iva.f1.g0;
import com.amazon.aps.iva.f1.u0;
import com.amazon.aps.iva.kb0.q;
/* compiled from: Shadow.kt */
/* loaded from: classes.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, q> {
    public final /* synthetic */ float h;
    public final /* synthetic */ u0 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(float f, u0 u0Var, boolean z, long j, long j2) {
        super(1);
        this.h = f;
        this.i = u0Var;
        this.j = z;
        this.k = j;
        this.l = j2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(g0 g0Var) {
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$graphicsLayer");
        g0Var2.u0(g0Var2.P0(this.h));
        g0Var2.e1(this.i);
        g0Var2.b0(this.j);
        g0Var2.U(this.k);
        g0Var2.h0(this.l);
        return q.a;
    }
}
