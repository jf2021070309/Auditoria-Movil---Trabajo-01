package com.amazon.aps.iva.z;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.z.h0;
/* compiled from: InfiniteTransition.kt */
/* loaded from: classes.dex */
public final class l0 {
    public static final h0.a a(h0 h0Var, float f, g0 g0Var, com.amazon.aps.iva.o0.i iVar) {
        iVar.s(-644770905);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        h0.a b = b(h0Var, Float.valueOf(0.0f), Float.valueOf(f), n1.a, g0Var, "FloatAnimation", iVar, 0);
        iVar.G();
        return b;
    }

    public static final h0.a b(h0 h0Var, Number number, Number number2, m1 m1Var, g0 g0Var, String str, com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.yb0.j.f(m1Var, "typeConverter");
        iVar.s(-1062847727);
        if ((i & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar.s(-492369756);
        Object t = iVar.t();
        if (t == i.a.a) {
            t = new h0.a(h0Var, number, number2, m1Var, g0Var, str2);
            iVar.n(t);
        }
        iVar.G();
        h0.a aVar = (h0.a) t;
        com.amazon.aps.iva.o0.x0.f(new i0(number, aVar, number2, g0Var), iVar);
        com.amazon.aps.iva.o0.x0.a(aVar, new k0(h0Var, aVar), iVar);
        iVar.G();
        return aVar;
    }

    public static final h0 c(com.amazon.aps.iva.o0.i iVar) {
        iVar.s(1013651573);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar.s(-492369756);
        Object t = iVar.t();
        if (t == i.a.a) {
            t = new h0("InfiniteTransition");
            iVar.n(t);
        }
        iVar.G();
        h0 h0Var = (h0) t;
        h0Var.a(iVar, 8);
        iVar.G();
        return h0Var;
    }
}
