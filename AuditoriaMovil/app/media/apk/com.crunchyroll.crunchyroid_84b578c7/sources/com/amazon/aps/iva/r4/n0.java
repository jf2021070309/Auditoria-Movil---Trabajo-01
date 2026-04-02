package com.amazon.aps.iva.r4;

import java.util.Map;
/* compiled from: LayoutSelection.kt */
/* loaded from: classes.dex */
public final class n0 {
    public final int a;
    public final int b;
    public final Map<Integer, Map<x1, Integer>> c;

    public n0() {
        this(0, 0, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.a == n0Var.a && this.b == n0Var.b && com.amazon.aps.iva.yb0.j.a(this.c, n0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + com.amazon.aps.iva.a0.r.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.a + ", complexViewId=" + this.b + ", children=" + this.c + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0(int i, int i2, Map<Integer, ? extends Map<x1, Integer>> map) {
        com.amazon.aps.iva.yb0.j.f(map, "children");
        this.a = i;
        this.b = i2;
        this.c = map;
    }

    public /* synthetic */ n0(int i, int i2, Map map, int i3) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? com.amazon.aps.iva.lb0.a0.b : map);
    }
}
