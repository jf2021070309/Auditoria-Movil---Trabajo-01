package com.amazon.aps.iva.e1;
/* compiled from: CornerRadius.kt */
/* loaded from: classes.dex */
public final class a {
    public static final long b = i.f(0.0f, 0.0f);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        boolean z;
        if (b(j) == c(j)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "CornerRadius.circular(" + com.amazon.aps.iva.cq.b.r0(b(j)) + ')';
        }
        return "CornerRadius.elliptical(" + com.amazon.aps.iva.cq.b.r0(b(j)) + ", " + com.amazon.aps.iva.cq.b.r0(c(j)) + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.a != ((a) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
