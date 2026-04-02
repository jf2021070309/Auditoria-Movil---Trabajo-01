package com.amazon.aps.iva.o2;
/* compiled from: Dp.kt */
/* loaded from: classes.dex */
public final class e implements Comparable<e> {
    public final float b;

    public static final boolean a(float f, float f2) {
        if (Float.compare(f, f2) == 0) {
            return true;
        }
        return false;
    }

    public static String b(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        return Float.compare(this.b, eVar.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (Float.compare(this.b, ((e) obj).b) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }

    public final String toString() {
        return b(this.b);
    }
}
