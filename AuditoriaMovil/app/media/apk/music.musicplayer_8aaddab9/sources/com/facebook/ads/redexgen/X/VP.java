package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* loaded from: assets/audience_network.dex */
public final class VP implements InterfaceC0597Fv {
    public final int A00;
    public final /* synthetic */ C0513Bx A01;

    public VP(C0513Bx c0513Bx, int i2) {
        this.A01 = c0513Bx;
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0597Fv
    public final boolean A8c() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0597Fv
    public final void A9V() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0597Fv
    public final int ADX(AZ az, C1024Ws c1024Ws, boolean z) {
        return this.A01.A0P(this.A00, az, c1024Ws, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0597Fv
    public final int AEx(long j2) {
        return this.A01.A0O(this.A00, j2);
    }
}
