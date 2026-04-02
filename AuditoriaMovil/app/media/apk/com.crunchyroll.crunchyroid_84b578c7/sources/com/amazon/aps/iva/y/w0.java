package com.amazon.aps.iva.y;

import com.amazon.aps.iva.z.a1;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class w0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a1.b<f0>, com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.j>> {
    public final /* synthetic */ v0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(v0 v0Var) {
        super(1);
        this.h = v0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.j> invoke(a1.b<f0> bVar) {
        com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.j> zVar;
        a1.b<f0> bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "$this$null");
        f0 f0Var = f0.PreEnter;
        f0 f0Var2 = f0.Visible;
        boolean b = bVar2.b(f0Var, f0Var2);
        v0 v0Var = this.h;
        if (b) {
            a0 value = v0Var.e.getValue();
            if (value != null) {
                zVar = value.c;
            }
            zVar = null;
        } else if (bVar2.b(f0Var2, f0.PostExit)) {
            a0 value2 = v0Var.f.getValue();
            if (value2 != null) {
                zVar = value2.c;
            }
            zVar = null;
        } else {
            zVar = g0.e;
        }
        if (zVar == null) {
            return g0.e;
        }
        return zVar;
    }
}
