package com.amazon.aps.iva.o0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class b2 {
    public final List<d1> a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final HashMap<Integer, y0> e;
    public final com.amazon.aps.iva.kb0.m f;

    public b2(ArrayList arrayList, int i) {
        boolean z;
        this.a = arrayList;
        this.b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.d = new ArrayList();
            HashMap<Integer, y0> hashMap = new HashMap<>();
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                d1 d1Var = this.a.get(i3);
                Integer valueOf = Integer.valueOf(d1Var.c);
                int i4 = d1Var.d;
                hashMap.put(valueOf, new y0(i3, i2, i4));
                i2 += i4;
            }
            this.e = hashMap;
            this.f = com.amazon.aps.iva.kb0.f.b(new a2(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int a(d1 d1Var) {
        com.amazon.aps.iva.yb0.j.f(d1Var, "keyInfo");
        y0 y0Var = this.e.get(Integer.valueOf(d1Var.c));
        if (y0Var != null) {
            return y0Var.b;
        }
        return -1;
    }

    public final boolean b(int i, int i2) {
        int i3;
        HashMap<Integer, y0> hashMap = this.e;
        y0 y0Var = hashMap.get(Integer.valueOf(i));
        if (y0Var != null) {
            int i4 = y0Var.b;
            int i5 = i2 - y0Var.c;
            y0Var.c = i2;
            if (i5 != 0) {
                Collection<y0> values = hashMap.values();
                com.amazon.aps.iva.yb0.j.e(values, "groupInfos.values");
                for (y0 y0Var2 : values) {
                    if (y0Var2.b >= i4 && !com.amazon.aps.iva.yb0.j.a(y0Var2, y0Var) && (i3 = y0Var2.b + i5) >= 0) {
                        y0Var2.b = i3;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
