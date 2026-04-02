package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class VA implements GY {
    public final C0623Gv A00;
    public final Map<String, H1> A01;
    public final Map<String, C0624Gw> A02;
    public final long[] A03;

    public VA(C0623Gv c0623Gv, Map<String, H1> map, Map<String, C0624Gw> map2) {
        Map<String, H1> emptyMap;
        this.A00 = c0623Gv;
        this.A02 = map2;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        this.A03 = c0623Gv.A0F();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6A(long j2) {
        return this.A00.A0D(j2, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6a(int i2) {
        return this.A03[i2];
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6b() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6z(long j2) {
        int A0A = C0676Iy.A0A(this.A03, j2, false, false);
        if (A0A < this.A03.length) {
            return A0A;
        }
        return -1;
    }
}
