package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.d0.q;
import java.util.List;
/* compiled from: FlowLayout.kt */
/* loaded from: classes.dex */
public final class g0 {
    public static final q.e a;

    static {
        int i = q.a;
        a = new q.e(a.C0097a.j);
        new q.c(a.C0097a.m);
    }

    public static final int a(List<? extends com.amazon.aps.iva.s1.l> list, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.s1.l, ? super Integer, ? super Integer, Integer> qVar, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.s1.l, ? super Integer, ? super Integer, Integer> qVar2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (list.isEmpty()) {
            return 0;
        }
        Object w0 = com.amazon.aps.iva.lb0.x.w0(0, list);
        com.amazon.aps.iva.s1.l lVar = (com.amazon.aps.iva.s1.l) w0;
        if (lVar != null) {
            i5 = qVar2.invoke(lVar, 0, Integer.valueOf(i)).intValue();
        } else {
            i5 = 0;
        }
        if (lVar != null) {
            i6 = qVar.invoke(lVar, 0, Integer.valueOf(i5)).intValue();
        } else {
            i6 = 0;
        }
        int size = list.size();
        int i9 = i;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < size) {
            list.get(i10);
            com.amazon.aps.iva.yb0.j.c(w0);
            i9 -= i6;
            int max = Math.max(i12, i5);
            i10++;
            Object w02 = com.amazon.aps.iva.lb0.x.w0(i10, list);
            com.amazon.aps.iva.s1.l lVar2 = (com.amazon.aps.iva.s1.l) w02;
            if (lVar2 != null) {
                i7 = qVar2.invoke(lVar2, Integer.valueOf(i10), Integer.valueOf(i)).intValue();
            } else {
                i7 = 0;
            }
            if (lVar2 != null) {
                i8 = qVar.invoke(lVar2, Integer.valueOf(i10), Integer.valueOf(i7)).intValue() + i2;
            } else {
                i8 = 0;
            }
            if (i9 >= 0 && i10 != list.size()) {
                if (i10 - i13 != i4 && i9 - i8 >= 0) {
                    int i14 = i7;
                    i12 = max;
                    w0 = w02;
                    i6 = i8;
                    i5 = i14;
                }
            }
            i11 += max + i3;
            i8 -= i2;
            i9 = i;
            max = 0;
            i13 = i10;
            int i142 = i7;
            i12 = max;
            w0 = w02;
            i6 = i8;
            i5 = i142;
        }
        return i11 - i3;
    }

    public static final int b(com.amazon.aps.iva.s1.c0 c0Var, long j, d1 d1Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.s1.u0, com.amazon.aps.iva.kb0.q> lVar) {
        boolean z;
        if (com.amazon.aps.iva.b50.w.m(com.amazon.aps.iva.b50.w.l(c0Var)) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.amazon.aps.iva.s1.u0 V = c0Var.V(defpackage.i.H(defpackage.i.q(j, 0, 0, 14), d1Var));
            lVar.invoke(V);
            com.amazon.aps.iva.yb0.j.f(V, "<this>");
            if (d1Var == d1.Horizontal) {
                return V.b;
            }
            return V.c;
        } else if (d1Var == d1.Horizontal) {
            return c0Var.M(Integer.MAX_VALUE);
        } else {
            return c0Var.C(Integer.MAX_VALUE);
        }
    }
}
