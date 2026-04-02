package com.amazon.aps.iva.o2;
/* compiled from: Velocity.kt */
/* loaded from: classes.dex */
public final class o {
    public static final long b = defpackage.i.g(0.0f, 0.0f);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public static long a(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = b(j);
        }
        if ((i & 2) != 0) {
            f2 = c(j);
        }
        return defpackage.i.g(f, f2);
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long d(long j, long j2) {
        return defpackage.i.g(b(j) - b(j2), c(j) - c(j2));
    }

    public static final long e(long j, long j2) {
        return defpackage.i.g(b(j2) + b(j), c(j2) + c(j));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (this.a != ((o) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append(b(j));
        sb.append(", ");
        sb.append(c(j));
        sb.append(") px/sec");
        return sb.toString();
    }
}
