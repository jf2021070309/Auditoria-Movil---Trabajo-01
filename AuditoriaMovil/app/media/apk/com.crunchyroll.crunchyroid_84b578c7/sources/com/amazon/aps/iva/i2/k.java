package com.amazon.aps.iva.i2;
/* compiled from: ImeAction.kt */
/* loaded from: classes.dex */
public final class k {
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
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "None";
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "Default";
        }
        if (i == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "Go";
        }
        if (i == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return "Search";
        }
        if (i == 4) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return "Send";
        }
        if (i == 5) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            return "Previous";
        }
        if (i == 6) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            return "Next";
        }
        if (i == 7) {
            z8 = true;
        }
        if (z8) {
            return "Done";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (this.a != ((k) obj).a) {
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
