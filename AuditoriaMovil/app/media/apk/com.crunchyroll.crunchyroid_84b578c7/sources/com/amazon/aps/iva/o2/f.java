package com.amazon.aps.iva.o2;

import com.amazon.aps.iva.ee0.f1;
/* compiled from: Dp.kt */
/* loaded from: classes.dex */
public final class f {
    public static final long b;
    public static final /* synthetic */ int c = 0;
    public final long a;

    static {
        float f = 0;
        f1.e(f, f);
        b = f1.e(Float.NaN, Float.NaN);
    }

    public /* synthetic */ f(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        boolean z;
        if (j != b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public static final float b(long j) {
        boolean z;
        if (j != b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
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
        return Long.hashCode(this.a);
    }

    public final String toString() {
        boolean z;
        long j = b;
        long j2 = this.a;
        if (j2 != j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "(" + ((Object) e.b(a(j2))) + ", " + ((Object) e.b(b(j2))) + ')';
        }
        return "DpOffset.Unspecified";
    }
}
