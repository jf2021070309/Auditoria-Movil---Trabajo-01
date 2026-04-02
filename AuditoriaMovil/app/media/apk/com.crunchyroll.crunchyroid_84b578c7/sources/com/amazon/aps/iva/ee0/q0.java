package com.amazon.aps.iva.ee0;

import com.amazon.aps.iva.ee0.q;
import java.util.ArrayList;
import java.util.LinkedHashSet;
/* compiled from: SpecialTypes.kt */
/* loaded from: classes4.dex */
public final class q0 {
    public static final u1 a(u1 u1Var, boolean z) {
        com.amazon.aps.iva.yb0.j.f(u1Var, "<this>");
        q a = q.a.a(u1Var, z);
        if (a == null) {
            m0 b = b(u1Var);
            if (b == null) {
                return u1Var.M0(false);
            }
            return b;
        }
        return a;
    }

    public static final m0 b(e0 e0Var) {
        c0 c0Var;
        c0 c0Var2;
        c1 I0 = e0Var.I0();
        if (I0 instanceof c0) {
            c0Var = (c0) I0;
        } else {
            c0Var = null;
        }
        if (c0Var == null) {
            return null;
        }
        LinkedHashSet<e0> linkedHashSet = c0Var.b;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(linkedHashSet));
        boolean z = false;
        for (e0 e0Var2 : linkedHashSet) {
            if (s1.g(e0Var2)) {
                e0Var2 = a(e0Var2.L0(), false);
                z = true;
            }
            arrayList.add(e0Var2);
        }
        if (!z) {
            c0Var2 = null;
        } else {
            e0 e0Var3 = c0Var.a;
            if (e0Var3 != null) {
                if (s1.g(e0Var3)) {
                    e0Var3 = a(e0Var3.L0(), false);
                }
            } else {
                e0Var3 = null;
            }
            arrayList.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
            linkedHashSet2.hashCode();
            c0Var2 = new c0(linkedHashSet2, e0Var3);
        }
        if (c0Var2 == null) {
            return null;
        }
        return c0Var2.c();
    }

    public static final m0 c(m0 m0Var, boolean z) {
        com.amazon.aps.iva.yb0.j.f(m0Var, "<this>");
        q a = q.a.a(m0Var, z);
        if (a == null) {
            m0 b = b(m0Var);
            if (b == null) {
                return m0Var.M0(false);
            }
            return b;
        }
        return a;
    }

    public static final m0 d(m0 m0Var, m0 m0Var2) {
        com.amazon.aps.iva.yb0.j.f(m0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(m0Var2, "abbreviatedType");
        if (com.amazon.aps.iva.e4.l1.D(m0Var)) {
            return m0Var;
        }
        return new a(m0Var, m0Var2);
    }
}
