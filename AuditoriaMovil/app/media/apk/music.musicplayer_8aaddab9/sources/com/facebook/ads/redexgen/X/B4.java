package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class B4 {
    public final int A00;
    public final FY A01;

    public B4(int i2, FY fy) {
        this.A00 = i2;
        this.A01 = fy;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        B4 b4 = (B4) obj;
        return this.A00 == b4.A00 && this.A01.equals(b4.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
