package com.amazon.aps.iva.y;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class f1 {
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.j, com.amazon.aps.iva.o2.h> a;
    public final com.amazon.aps.iva.z.z<com.amazon.aps.iva.o2.h> b;

    public f1(com.amazon.aps.iva.z.k1 k1Var, p0 p0Var) {
        this.a = p0Var;
        this.b = k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, f1Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, f1Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
