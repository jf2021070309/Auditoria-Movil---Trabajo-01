package com.amazon.aps.iva.f1;
/* compiled from: PathFillType.kt */
/* loaded from: classes.dex */
public final class n0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        if (this.a != ((n0) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        boolean z;
        int i = this.a;
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "NonZero";
        }
        if (i == 1) {
            z2 = true;
        }
        if (z2) {
            return "EvenOdd";
        }
        return "Unknown";
    }
}
