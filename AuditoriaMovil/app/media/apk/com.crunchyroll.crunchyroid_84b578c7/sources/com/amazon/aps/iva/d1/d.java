package com.amazon.aps.iva.d1;
/* compiled from: FocusDirection.kt */
/* loaded from: classes.dex */
public final class d {
    public final int a;

    public static String a(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Next";
        }
        if (i == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "Previous";
        }
        if (i == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "Left";
        }
        if (i == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return "Right";
        }
        if (i == 5) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return "Up";
        }
        if (i == 6) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            return "Down";
        }
        if (i == 7) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            return "Enter";
        }
        if (i == 8) {
            z8 = true;
        }
        if (z8) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (this.a != ((d) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
