package com.amazon.aps.iva.y4;
/* compiled from: ContentScale.kt */
/* loaded from: classes.dex */
public final class f {
    public final int a;

    public static String a(int i) {
        return "ContentScale(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (this.a != ((f) obj).a) {
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
