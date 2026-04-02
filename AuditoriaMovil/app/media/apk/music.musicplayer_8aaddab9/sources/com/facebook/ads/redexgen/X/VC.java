package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class VC implements GY {
    public final long[] A00;
    public final GX[] A01;

    public VC(GX[] gxArr, long[] jArr) {
        this.A01 = gxArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6A(long j2) {
        int A0B = C0676Iy.A0B(this.A00, j2, true, false);
        if (A0B != -1) {
            GX[] gxArr = this.A01;
            if (gxArr[A0B] != null) {
                return Collections.singletonList(gxArr[A0B]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6a(int i2) {
        boolean z = true;
        IJ.A03(i2 >= 0);
        if (i2 >= this.A00.length) {
            z = false;
        }
        IJ.A03(z);
        return this.A00[i2];
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6b() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6z(long j2) {
        int A0A = C0676Iy.A0A(this.A00, j2, false, false);
        if (A0A < this.A00.length) {
            return A0A;
        }
        return -1;
    }
}
