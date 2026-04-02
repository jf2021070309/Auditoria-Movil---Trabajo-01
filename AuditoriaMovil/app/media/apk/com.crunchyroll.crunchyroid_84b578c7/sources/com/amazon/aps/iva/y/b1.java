package com.amazon.aps.iva.y;
/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class b1 {
    public final float a;
    public final long b;
    public final com.amazon.aps.iva.z.z<Float> c;

    public b1() {
        throw null;
    }

    public b1(float f, long j, com.amazon.aps.iva.z.z zVar) {
        this.a = f;
        this.b = j;
        this.c = zVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (Float.compare(this.a, b1Var.a) != 0) {
            return false;
        }
        int i = com.amazon.aps.iva.f1.b1.c;
        if (this.b == b1Var.b) {
            z = true;
        } else {
            z = false;
        }
        if (z && com.amazon.aps.iva.yb0.j.a(this.c, b1Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = com.amazon.aps.iva.f1.b1.c;
        return this.c.hashCode() + com.amazon.aps.iva.b8.i.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) com.amazon.aps.iva.f1.b1.b(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
