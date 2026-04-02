package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class V8 implements GY {
    public final List<GX> A00;

    public V8(List<GX> list) {
        this.A00 = Collections.unmodifiableList(list);
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
