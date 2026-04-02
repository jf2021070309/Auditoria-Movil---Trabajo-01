package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class V9 implements GY {
    public static final V9 A01 = new V9();
    public final List<GX> A00;

    public V9() {
        this.A00 = Collections.emptyList();
    }

    public V9(GX gx) {
        this.A00 = Collections.singletonList(gx);
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6A(long j2) {
        return j2 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6a(int i2) {
        IJ.A03(i2 == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6b() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6z(long j2) {
        return j2 < 0 ? 0 : -1;
    }
}
