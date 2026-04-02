package com.amazon.aps.iva.n0;

import com.amazon.aps.iva.a0.r0;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.h1.a;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.se0.g0;
/* compiled from: Ripple.kt */
/* loaded from: classes.dex */
public abstract class p implements r0 {
    public final v b;

    public p(q1 q1Var, boolean z) {
        this.b = new v(q1Var, z);
    }

    public abstract void b(com.amazon.aps.iva.c0.o oVar, g0 g0Var);

    public final void c(com.amazon.aps.iva.h1.e eVar, float f, long j) {
        float P0;
        com.amazon.aps.iva.yb0.j.f(eVar, "$this$drawStateLayer");
        v vVar = this.b;
        vVar.getClass();
        boolean isNaN = Float.isNaN(f);
        boolean z = vVar.a;
        if (isNaN) {
            P0 = l.a(eVar, z, eVar.h());
        } else {
            P0 = eVar.P0(f);
        }
        float f2 = P0;
        float floatValue = vVar.c.c().floatValue();
        if (floatValue > 0.0f) {
            long b = x.b(j, floatValue);
            if (z) {
                float d = com.amazon.aps.iva.e1.g.d(eVar.h());
                float b2 = com.amazon.aps.iva.e1.g.b(eVar.h());
                a.b R0 = eVar.R0();
                long h = R0.h();
                R0.a().n();
                R0.a.b(0.0f, 0.0f, d, b2, 1);
                com.amazon.aps.iva.h1.e.D(eVar, b, f2, 0L, null, 124);
                R0.a().g();
                R0.b(h);
                return;
            }
            com.amazon.aps.iva.h1.e.D(eVar, b, f2, 0L, null, 124);
        }
    }

    public abstract void d(com.amazon.aps.iva.c0.o oVar);
}
