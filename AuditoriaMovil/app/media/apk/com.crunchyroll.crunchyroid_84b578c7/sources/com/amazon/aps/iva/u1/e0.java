package com.amazon.aps.iva.u1;

import androidx.compose.ui.node.f;
/* compiled from: LookaheadDelegate.kt */
/* loaded from: classes.dex */
public abstract class e0 extends com.amazon.aps.iva.s1.u0 implements com.amazon.aps.iva.s1.f0 {
    public boolean g;
    public boolean h;

    public static void Y0(androidx.compose.ui.node.o oVar) {
        androidx.compose.ui.node.e eVar;
        z zVar;
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        androidx.compose.ui.node.o oVar2 = oVar.j;
        if (oVar2 != null) {
            eVar = oVar2.i;
        } else {
            eVar = null;
        }
        androidx.compose.ui.node.e eVar2 = oVar.i;
        if (!com.amazon.aps.iva.yb0.j.a(eVar, eVar2)) {
            eVar2.A.n.t.g();
            return;
        }
        b i = eVar2.A.n.i();
        if (i != null && (zVar = ((f.b) i).t) != null) {
            zVar.g();
        }
    }

    public abstract e0 C0();

    public abstract com.amazon.aps.iva.s1.q D0();

    public abstract boolean G0();

    public abstract androidx.compose.ui.node.e H0();

    public abstract com.amazon.aps.iva.s1.e0 M0();

    public abstract e0 Q0();

    public abstract long W0();

    public abstract void a1();

    @Override // com.amazon.aps.iva.s1.g0
    public final int e(com.amazon.aps.iva.s1.a aVar) {
        int x0;
        com.amazon.aps.iva.yb0.j.f(aVar, "alignmentLine");
        if (!G0() || (x0 = x0(aVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return com.amazon.aps.iva.o2.h.b(this.f) + x0;
    }

    public abstract int x0(com.amazon.aps.iva.s1.a aVar);
}
