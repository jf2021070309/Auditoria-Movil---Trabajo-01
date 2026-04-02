package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Ah  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0472Ah {
    public static final C0472Ah A04 = new C0472Ah(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C0472Ah(float f2) {
        this(f2, 1.0f, false);
    }

    public C0472Ah(float f2, float f3, boolean z) {
        IJ.A03(f2 > 0.0f);
        IJ.A03(f3 > 0.0f);
        this.A01 = f2;
        this.A00 = f3;
        this.A02 = z;
        this.A03 = Math.round(1000.0f * f2);
    }

    public final long A00(long j2) {
        return this.A03 * j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0472Ah c0472Ah = (C0472Ah) obj;
        return this.A01 == c0472Ah.A01 && this.A00 == c0472Ah.A00 && this.A02 == c0472Ah.A02;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A00);
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + result) * 31) + (this.A02 ? 1 : 0);
    }
}
