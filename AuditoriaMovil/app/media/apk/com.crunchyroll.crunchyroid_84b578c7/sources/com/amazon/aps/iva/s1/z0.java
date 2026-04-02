package com.amazon.aps.iva.s1;
/* compiled from: ScaleFactor.kt */
/* loaded from: classes.dex */
public final class z0 {
    public static final long a = com.amazon.aps.iva.ab.r.c(Float.NaN, Float.NaN);
    public static final /* synthetic */ int b = 0;

    public static final float a(long j) {
        boolean z;
        if (j != a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static final float b(long j) {
        boolean z;
        if (j != a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
}
