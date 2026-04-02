package com.amazon.aps.iva.o2;
/* compiled from: IntSize.kt */
/* loaded from: classes.dex */
public final class j {
    public final long a;

    /* compiled from: IntSize.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    static {
        new a();
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final int b(long j) {
        return (int) (j & 4294967295L);
    }

    public static String c(long j) {
        return ((int) (j >> 32)) + " x " + b(j);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (this.a != ((j) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
