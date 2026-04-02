package com.amazon.aps.iva.n2;
/* compiled from: Hyphens.kt */
/* loaded from: classes.dex */
public final class d {
    public final int a;

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
        boolean z;
        int i = this.a;
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Hyphens.None";
        }
        if (i == 2) {
            z2 = true;
        }
        if (z2) {
            return "Hyphens.Auto";
        }
        return "Invalid";
    }
}
