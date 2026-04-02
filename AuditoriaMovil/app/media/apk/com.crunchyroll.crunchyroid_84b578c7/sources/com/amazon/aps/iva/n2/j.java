package com.amazon.aps.iva.n2;
/* compiled from: TextDirection.kt */
/* loaded from: classes.dex */
public final class j {
    public final int a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (this.a != ((j) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.a;
        boolean z5 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Ltr";
        }
        if (i == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "Rtl";
        }
        if (i == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "Content";
        }
        if (i == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            z5 = true;
        }
        if (z5) {
            return "ContentOrRtl";
        }
        return "Invalid";
    }
}
