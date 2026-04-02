package com.amazon.aps.iva.c2;
/* compiled from: TextRange.kt */
/* loaded from: classes.dex */
public final class z {
    public static final long b = com.amazon.aps.iva.ab.x.f(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ z(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final boolean b(long j) {
        if (((int) (j >> 32)) == c(j)) {
            return true;
        }
        return false;
    }

    public static final int c(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int d(long j) {
        int i = (int) (j >> 32);
        if (i <= c(j)) {
            return c(j);
        }
        return i;
    }

    public static final int e(long j) {
        int i = (int) (j >> 32);
        if (i > c(j)) {
            return c(j);
        }
        return i;
    }

    public static final boolean f(long j) {
        if (((int) (j >> 32)) > c(j)) {
            return true;
        }
        return false;
    }

    public static String g(long j) {
        return "TextRange(" + ((int) (j >> 32)) + ", " + c(j) + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        if (this.a != ((z) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return g(this.a);
    }
}
