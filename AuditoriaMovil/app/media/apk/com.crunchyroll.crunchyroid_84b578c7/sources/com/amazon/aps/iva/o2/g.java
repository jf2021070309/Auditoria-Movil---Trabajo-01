package com.amazon.aps.iva.o2;

import com.amazon.aps.iva.ee0.f1;
/* compiled from: Dp.kt */
/* loaded from: classes.dex */
public final class g {
    public static final long b;
    public static final long c = f1.f(Float.NaN, Float.NaN);
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        float f = 0;
        b = f1.f(f, f);
    }

    public /* synthetic */ g(long j) {
        this.a = j;
    }

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
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float c(long j) {
        boolean z;
        if (j != c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static String d(long j) {
        boolean z;
        if (j != c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return ((Object) e.b(c(j))) + " x " + ((Object) e.b(b(j)));
        }
        return "DpSize.Unspecified";
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
        return d(this.a);
    }
}
