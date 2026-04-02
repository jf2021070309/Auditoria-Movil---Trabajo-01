package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public final class WO implements D5 {
    public final int A00;
    public final int A01;
    public final C0660Ii A02;

    public WO(WP wp) {
        this.A02 = wp.A00;
        this.A02.A0Y(12);
        this.A00 = this.A02.A0H();
        this.A01 = this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final int A7I() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final boolean A8U() {
        return this.A00 != 0;
    }

    @Override // com.facebook.ads.redexgen.X.D5
    public final int ADa() {
        int i2 = this.A00;
        return i2 == 0 ? this.A02.A0H() : i2;
    }
}
