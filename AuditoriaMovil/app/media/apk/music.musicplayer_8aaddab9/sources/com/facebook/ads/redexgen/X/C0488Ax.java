package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Ax  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0488Ax {
    public final long A00;
    public final long A01;
    public static final C0488Ax A04 = new C0488Ax(0, 0);
    public static final C0488Ax A02 = new C0488Ax(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C0488Ax A06 = new C0488Ax(Long.MAX_VALUE, 0);
    public static final C0488Ax A05 = new C0488Ax(0, Long.MAX_VALUE);
    public static final C0488Ax A03 = A04;

    public C0488Ax(long j2, long j3) {
        IJ.A03(j2 >= 0);
        IJ.A03(j3 >= 0);
        this.A01 = j2;
        this.A00 = j3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0488Ax c0488Ax = (C0488Ax) obj;
        return this.A01 == c0488Ax.A01 && this.A00 == c0488Ax.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
