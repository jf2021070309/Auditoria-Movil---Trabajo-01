package com.amazon.aps.iva.y;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.z.a1;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class k0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<a1.b<f0>, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.z.z<Float>> {
    public final /* synthetic */ r0 h;
    public final /* synthetic */ t0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(r0 r0Var, t0 t0Var) {
        super(3);
        this.h = r0Var;
        this.i = t0Var;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.z.z<Float> invoke(a1.b<f0> bVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.z.z<Float> zVar;
        a1.b<f0> bVar2 = bVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        num.intValue();
        com.amazon.aps.iva.yb0.j.f(bVar2, "$this$animateFloat");
        iVar2.s(-57153604);
        e0.b bVar3 = com.amazon.aps.iva.o0.e0.a;
        f0 f0Var = f0.PreEnter;
        f0 f0Var2 = f0.Visible;
        if (bVar2.b(f0Var, f0Var2)) {
            x0 x0Var = this.h.a().a;
            if (x0Var == null || (zVar = x0Var.b) == null) {
                zVar = g0.c;
            }
        } else if (bVar2.b(f0Var2, f0.PostExit)) {
            x0 x0Var2 = this.i.a().a;
            if (x0Var2 == null || (zVar = x0Var2.b) == null) {
                zVar = g0.c;
            }
        } else {
            zVar = g0.c;
        }
        iVar2.G();
        return zVar;
    }
}
