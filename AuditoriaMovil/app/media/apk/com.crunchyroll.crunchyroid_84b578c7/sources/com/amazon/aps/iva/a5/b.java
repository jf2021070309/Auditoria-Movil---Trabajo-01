package com.amazon.aps.iva.a5;
/* compiled from: FontWeight.kt */
/* loaded from: classes.dex */
public final class b {
    public final int a = 700;

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this.a != ((b) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "FontWeight(value=" + this.a + ')';
    }
}
