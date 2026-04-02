package com.amazon.aps.iva.n2;
/* compiled from: TextAlign.kt */
/* loaded from: classes.dex */
public final class h {
    public final int a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this.a != ((h) obj).a) {
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
        boolean z5;
        int i = this.a;
        boolean z6 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Left";
        }
        if (i == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "Right";
        }
        if (i == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "Center";
        }
        if (i == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return "Justify";
        }
        if (i == 5) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return "Start";
        }
        if (i == 6) {
            z6 = true;
        }
        if (z6) {
            return "End";
        }
        return "Invalid";
    }
}
