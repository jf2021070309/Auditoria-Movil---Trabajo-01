package com.amazon.aps.iva.o2;

import com.amazon.aps.iva.e.z;
/* compiled from: TextUnit.kt */
/* loaded from: classes.dex */
public final class m {
    public static final n[] b = {new n(0), new n(4294967296L), new n(8589934592L)};
    public static final long c = z.L(0, Float.NaN);
    public final long a;

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long b2 = b(j);
        if (n.a(b2, 0L)) {
            return "Unspecified";
        }
        if (n.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        } else if (n.a(b2, 8589934592L)) {
            return c(j) + ".em";
        } else {
            return "Invalid";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (this.a != ((m) obj).a) {
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
