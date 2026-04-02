package com.amazon.aps.iva.n2;
/* compiled from: TextMotion.android.kt */
/* loaded from: classes.dex */
public final class n {
    public static final n c = new n(false, 2);
    public static final n d = new n(true, 1);
    public final int a;
    public final boolean b;

    public n(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.a == nVar.a) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.b == nVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        if (com.amazon.aps.iva.yb0.j.a(this, c)) {
            return "TextMotion.Static";
        }
        if (com.amazon.aps.iva.yb0.j.a(this, d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
