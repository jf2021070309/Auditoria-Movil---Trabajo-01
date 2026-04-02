package com.amazon.aps.iva.j0;
/* compiled from: TextFieldDelegate.kt */
/* loaded from: classes.dex */
public final class m1 {
    public static void a(com.amazon.aps.iva.i2.e0 e0Var, e1 e1Var, com.amazon.aps.iva.c2.y yVar, com.amazon.aps.iva.s1.q qVar, com.amazon.aps.iva.i2.n0 n0Var, boolean z, com.amazon.aps.iva.i2.q qVar2) {
        com.amazon.aps.iva.e1.e eVar;
        com.amazon.aps.iva.yb0.j.f(e0Var, "value");
        com.amazon.aps.iva.yb0.j.f(e1Var, "textDelegate");
        com.amazon.aps.iva.yb0.j.f(yVar, "textLayoutResult");
        com.amazon.aps.iva.yb0.j.f(qVar2, "offsetMapping");
        if (!z) {
            return;
        }
        int b = qVar2.b(com.amazon.aps.iva.c2.z.d(e0Var.b));
        if (b < yVar.a.a.length()) {
            eVar = yVar.b(b);
        } else if (b != 0) {
            eVar = yVar.b(b - 1);
        } else {
            eVar = new com.amazon.aps.iva.e1.e(0.0f, 0.0f, 1.0f, com.amazon.aps.iva.o2.j.b(n1.a(e1Var.b, e1Var.g, e1Var.h, n1.a, 1)));
        }
        float f = eVar.a;
        float f2 = eVar.b;
        long d0 = qVar.d0(com.amazon.aps.iva.e1.d.d(f, f2));
        com.amazon.aps.iva.e1.e h = com.amazon.aps.iva.ff0.b.h(com.amazon.aps.iva.e1.d.d(com.amazon.aps.iva.e1.c.c(d0), com.amazon.aps.iva.e1.c.d(d0)), com.amazon.aps.iva.ab.r.d(eVar.c - eVar.a, eVar.d - f2));
        if (n0Var.a()) {
            n0Var.b.c(h);
        }
    }
}
