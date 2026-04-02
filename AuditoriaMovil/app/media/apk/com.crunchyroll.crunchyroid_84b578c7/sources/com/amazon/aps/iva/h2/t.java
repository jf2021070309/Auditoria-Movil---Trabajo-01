package com.amazon.aps.iva.h2;
/* compiled from: FontStyle.kt */
/* loaded from: classes.dex */
public final class t {
    public final int a;

    public static String a(int i) {
        boolean z;
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Normal";
        }
        if (i == 1) {
            z2 = true;
        }
        if (z2) {
            return "Italic";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        if (this.a != ((t) obj).a) {
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
