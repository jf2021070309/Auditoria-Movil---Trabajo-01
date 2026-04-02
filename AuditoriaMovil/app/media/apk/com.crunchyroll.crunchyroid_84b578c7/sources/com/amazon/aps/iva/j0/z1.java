package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.j0.r0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TextFieldKeyInput.kt */
/* loaded from: classes.dex */
public final class z1 {
    public final p2 a;
    public final com.amazon.aps.iva.l0.c0 b;
    public final com.amazon.aps.iva.i2.e0 c;
    public final boolean d;
    public final boolean e;
    public final com.amazon.aps.iva.l0.j0 f;
    public final com.amazon.aps.iva.i2.q g;
    public final s2 h;
    public final e0 i;
    public final o0 j;
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> k;
    public final int l;

    public z1() {
        throw null;
    }

    public z1(p2 p2Var, com.amazon.aps.iva.l0.c0 c0Var, com.amazon.aps.iva.i2.e0 e0Var, boolean z, boolean z2, com.amazon.aps.iva.l0.j0 j0Var, com.amazon.aps.iva.i2.q qVar, s2 s2Var, e0 e0Var2, com.amazon.aps.iva.xb0.l lVar, int i) {
        r0.a aVar = r0.a;
        com.amazon.aps.iva.yb0.j.f(p2Var, "state");
        com.amazon.aps.iva.yb0.j.f(c0Var, "selectionManager");
        com.amazon.aps.iva.yb0.j.f(e0Var, "value");
        com.amazon.aps.iva.yb0.j.f(j0Var, "preparedSelectionState");
        com.amazon.aps.iva.yb0.j.f(qVar, "offsetMapping");
        com.amazon.aps.iva.yb0.j.f(e0Var2, "keyCombiner");
        com.amazon.aps.iva.yb0.j.f(lVar, "onValueChange");
        this.a = p2Var;
        this.b = c0Var;
        this.c = e0Var;
        this.d = z;
        this.e = z2;
        this.f = j0Var;
        this.g = qVar;
        this.h = s2Var;
        this.i = e0Var2;
        this.j = aVar;
        this.k = lVar;
        this.l = i;
    }

    public final void a(List<? extends com.amazon.aps.iva.i2.f> list) {
        com.amazon.aps.iva.i2.h hVar = this.a.c;
        ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(list);
        Z0.add(0, new com.amazon.aps.iva.i2.j());
        this.k.invoke(hVar.a(Z0));
    }
}
