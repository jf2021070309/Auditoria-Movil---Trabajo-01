package com.amazon.aps.iva.a2;
/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class i {
    public final int a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (this.a != ((i) obj).a) {
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
        boolean z6;
        int i = this.a;
        boolean z7 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Button";
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return "Checkbox";
        }
        if (i == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return "Switch";
        }
        if (i == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return "RadioButton";
        }
        if (i == 4) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return "Tab";
        }
        if (i == 5) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            return "Image";
        }
        if (i == 6) {
            z7 = true;
        }
        if (z7) {
            return "DropdownList";
        }
        return "Unknown";
    }
}
