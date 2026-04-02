package com.amazon.aps.iva.e1;

import com.amazon.aps.iva.ab.r;
/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class g {
    public static final long b = r.d(0.0f, 0.0f);
    public static final long c = r.d(Float.NaN, Float.NaN);
    public static final /* synthetic */ int d = 0;
    public final long a;

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float b(long j) {
        boolean z;
        if (j != c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final float c(long j) {
        return Math.min(Math.abs(d(j)), Math.abs(b(j)));
    }

    public static final float d(long j) {
        boolean z;
        if (j != c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final boolean e(long j) {
        if (d(j) > 0.0f && b(j) > 0.0f) {
            return false;
        }
        return true;
    }

    public static String f(long j) {
        boolean z;
        if (j != c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "Size(" + com.amazon.aps.iva.cq.b.r0(d(j)) + ", " + com.amazon.aps.iva.cq.b.r0(b(j)) + ')';
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this.a != ((g) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f(this.a);
    }
}
