package com.amazon.aps.iva.i2;
/* compiled from: ImeOptions.kt */
/* loaded from: classes.dex */
public final class l {
    public static final l f = new l(false, 0, true, 1, 1);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;

    public l(boolean z, int i, boolean z2, int i2, int i3) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a != lVar.a) {
            return false;
        }
        if (this.b == lVar.b) {
            z = true;
        } else {
            z = false;
        }
        if (!z || this.c != lVar.c) {
            return false;
        }
        if (this.d == lVar.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.e == lVar.e) {
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
        return Integer.hashCode(this.e) + com.amazon.aps.iva.a0.r.a(this.d, com.amazon.aps.iva.a0.r.b(this.c, com.amazon.aps.iva.a0.r.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) com.amazon.aps.iva.ab.r.q(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) com.amazon.aps.iva.ab.t.v(this.d)) + ", imeAction=" + ((Object) k.a(this.e)) + ')';
    }
}
