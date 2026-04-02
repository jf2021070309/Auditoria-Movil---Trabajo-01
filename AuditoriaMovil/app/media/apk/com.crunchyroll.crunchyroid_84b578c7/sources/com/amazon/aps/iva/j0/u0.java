package com.amazon.aps.iva.j0;
/* compiled from: KeyboardOptions.kt */
/* loaded from: classes.dex */
public final class u0 {
    public static final u0 e = new u0(0, 0, 15);
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;

    public u0(int i, int i2, int i3) {
        boolean z;
        if ((i3 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        i = (i3 & 4) != 0 ? 1 : i;
        i2 = (i3 & 8) != 0 ? 1 : i2;
        this.a = 0;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.a == u0Var.a) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.b != u0Var.b) {
            return false;
        }
        if (this.c == u0Var.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.d == u0Var.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + com.amazon.aps.iva.a0.r.a(this.c, com.amazon.aps.iva.a0.r.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) com.amazon.aps.iva.ab.r.q(this.a)) + ", autoCorrect=" + this.b + ", keyboardType=" + ((Object) com.amazon.aps.iva.ab.t.v(this.c)) + ", imeAction=" + ((Object) com.amazon.aps.iva.i2.k.a(this.d)) + ')';
    }
}
