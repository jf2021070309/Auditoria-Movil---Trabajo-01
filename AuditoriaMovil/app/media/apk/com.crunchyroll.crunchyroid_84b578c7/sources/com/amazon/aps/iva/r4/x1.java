package com.amazon.aps.iva.r4;
/* compiled from: LayoutSelection.kt */
/* loaded from: classes.dex */
public final class x1 {
    public final z0 a;
    public final z0 b;

    public x1(z0 z0Var, z0 z0Var2) {
        com.amazon.aps.iva.yb0.j.f(z0Var, "width");
        com.amazon.aps.iva.yb0.j.f(z0Var2, "height");
        this.a = z0Var;
        this.b = z0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        if (this.a == x1Var.a && this.b == x1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + this.a + ", height=" + this.b + ')';
    }
}
