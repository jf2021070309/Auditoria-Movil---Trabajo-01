package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.pc0.h;
import java.util.Arrays;
import java.util.List;
/* compiled from: TypeSubstitution.kt */
/* loaded from: classes4.dex */
public final class o1 {
    public static final m0 a(e0 e0Var) {
        m0 m0Var;
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        u1 L0 = e0Var.L0();
        if (L0 instanceof m0) {
            m0Var = (m0) L0;
        } else {
            m0Var = null;
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + e0Var).toString());
    }

    public static final m0 b(m0 m0Var, List<? extends j1> list, a1 a1Var) {
        com.amazon.aps.iva.yb0.j.f(m0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(list, "newArguments");
        com.amazon.aps.iva.yb0.j.f(a1Var, "newAttributes");
        if (list.isEmpty() && a1Var == m0Var.H0()) {
            return m0Var;
        }
        if (list.isEmpty()) {
            return m0Var.O0(a1Var);
        }
        if (m0Var instanceof com.amazon.aps.iva.ge0.h) {
            com.amazon.aps.iva.ge0.h hVar = (com.amazon.aps.iva.ge0.h) m0Var;
            c1 c1Var = hVar.c;
            com.amazon.aps.iva.xd0.i iVar = hVar.d;
            com.amazon.aps.iva.ge0.j jVar = hVar.e;
            boolean z = hVar.g;
            String[] strArr = hVar.h;
            return new com.amazon.aps.iva.ge0.h(c1Var, iVar, jVar, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return f0.f(a1Var, m0Var.I0(), list, m0Var.J0(), null);
    }

    public static e0 c(e0 e0Var, List list, com.amazon.aps.iva.pc0.h hVar, int i) {
        List list2;
        if ((i & 1) != 0) {
            list = e0Var.G0();
        }
        if ((i & 2) != 0) {
            hVar = e0Var.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        } else {
            list2 = null;
        }
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(list, "newArguments");
        com.amazon.aps.iva.yb0.j.f(hVar, "newAnnotations");
        com.amazon.aps.iva.yb0.j.f(list2, "newArgumentsForUpperBound");
        if ((!list.isEmpty() && list != e0Var.G0()) || hVar != e0Var.getAnnotations()) {
            a1 H0 = e0Var.H0();
            if ((hVar instanceof com.amazon.aps.iva.pc0.l) && hVar.isEmpty()) {
                hVar = h.a.a;
            }
            a1 j = com.amazon.aps.iva.a9.k0.j(H0, hVar);
            u1 L0 = e0Var.L0();
            if (L0 instanceof y) {
                y yVar = (y) L0;
                return f0.c(b(yVar.c, list, j), b(yVar.d, list2, j));
            } else if (L0 instanceof m0) {
                return b((m0) L0, list, j);
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
        }
        return e0Var;
    }

    public static /* synthetic */ m0 d(m0 m0Var, List list, a1 a1Var, int i) {
        if ((i & 1) != 0) {
            list = m0Var.G0();
        }
        if ((i & 2) != 0) {
            a1Var = m0Var.H0();
        }
        return b(m0Var, list, a1Var);
    }
}
