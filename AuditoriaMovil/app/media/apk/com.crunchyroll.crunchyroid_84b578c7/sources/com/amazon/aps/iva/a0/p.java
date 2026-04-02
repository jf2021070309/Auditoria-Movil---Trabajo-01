package com.amazon.aps.iva.a0;
/* compiled from: BorderStroke.kt */
/* loaded from: classes.dex */
public final class p {
    public final float a;
    public final com.amazon.aps.iva.f1.s b;

    public p(float f, com.amazon.aps.iva.f1.x0 x0Var) {
        this.a = f;
        this.b = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (com.amazon.aps.iva.o2.e.a(this.a, pVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, pVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) com.amazon.aps.iva.o2.e.b(this.a)) + ", brush=" + this.b + ')';
    }
}
