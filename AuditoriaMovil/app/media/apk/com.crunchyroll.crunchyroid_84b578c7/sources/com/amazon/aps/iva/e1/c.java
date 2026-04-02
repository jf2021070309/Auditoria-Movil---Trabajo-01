package com.amazon.aps.iva.e1;
/* compiled from: Offset.kt */
/* loaded from: classes.dex */
public final class c {
    public static final long b = d.d(0.0f, 0.0f);
    public static final long c = d.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final long d = d.d(Float.NaN, Float.NaN);
    public static final /* synthetic */ int e = 0;
    public final long a;

    public /* synthetic */ c(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float b(long j) {
        return (float) Math.sqrt((d(j) * d(j)) + (c(j) * c(j)));
    }

    public static final float c(long j) {
        boolean z;
        if (j != d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final float d(long j) {
        boolean z;
        if (j != d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final long e(long j, long j2) {
        return d.d(c(j) - c(j2), d(j) - d(j2));
    }

    public static final long f(long j, long j2) {
        return d.d(c(j2) + c(j), d(j2) + d(j));
    }

    public static final long g(long j, float f) {
        return d.d(c(j) * f, d(j) * f);
    }

    public static String h(long j) {
        if (d.h(j)) {
            return "Offset(" + com.amazon.aps.iva.cq.b.r0(c(j)) + ", " + com.amazon.aps.iva.cq.b.r0(d(j)) + ')';
        }
        return "Offset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this.a != ((c) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
