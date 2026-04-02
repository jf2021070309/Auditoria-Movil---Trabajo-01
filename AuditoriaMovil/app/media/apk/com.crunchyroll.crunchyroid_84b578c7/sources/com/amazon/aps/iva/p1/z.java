package com.amazon.aps.iva.p1;

import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: PointerInputEventProcessor.kt */
/* loaded from: classes.dex */
public final class z {
    public final LinkedHashMap a = new LinkedHashMap();

    /* compiled from: PointerInputEventProcessor.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final long b;
        public final boolean c;

        public a(long j, long j2, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }
    }

    public final h a(a0 a0Var, j0 j0Var) {
        boolean z;
        long j;
        long j2;
        int i;
        com.amazon.aps.iva.yb0.j.f(j0Var, "positionCalculator");
        List<b0> list = a0Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            b0 b0Var = list.get(i2);
            LinkedHashMap linkedHashMap2 = this.a;
            a aVar = (a) linkedHashMap2.get(new x(b0Var.a));
            if (aVar == null) {
                j2 = b0Var.b;
                j = b0Var.d;
                z = false;
            } else {
                long i3 = j0Var.i(aVar.b);
                long j3 = aVar.a;
                z = aVar.c;
                j = i3;
                j2 = j3;
            }
            long j4 = b0Var.a;
            linkedHashMap.put(new x(j4), new y(j4, b0Var.b, b0Var.d, b0Var.e, b0Var.f, j2, j, z, b0Var.g, b0Var.i, b0Var.j));
            boolean z2 = b0Var.e;
            long j5 = b0Var.a;
            if (z2) {
                i = i2;
                linkedHashMap2.put(new x(j5), new a(b0Var.b, b0Var.c, z2));
            } else {
                i = i2;
                linkedHashMap2.remove(new x(j5));
            }
            i2 = i + 1;
        }
        return new h(linkedHashMap, a0Var);
    }
}
