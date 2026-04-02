package com.amazon.aps.iva.r4;
/* compiled from: LayoutSelection.kt */
/* loaded from: classes.dex */
public final class q0 {
    public final int a;

    public q0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q0) && this.a == ((q0) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return com.amazon.aps.iva.d0.b2.b(new StringBuilder("LayoutInfo(layoutId="), this.a, ')');
    }
}
