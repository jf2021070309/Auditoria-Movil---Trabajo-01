package com.amazon.aps.iva.f1;
/* compiled from: TransformOrigin.kt */
/* loaded from: classes.dex */
public final class b1 {
    public static final long b = (Float.floatToIntBits(0.5f) << 32) | (Float.floatToIntBits(0.5f) & 4294967295L);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String b(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b1)) {
            return false;
        }
        if (this.a != ((b1) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
