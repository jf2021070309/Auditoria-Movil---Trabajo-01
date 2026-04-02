package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public final class DJ implements WS {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public DJ(long j2, long j3, Ci ci) {
        this.A04 = j3;
        this.A01 = ci.A02;
        this.A00 = ci.A00;
        if (j2 == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
            return;
        }
        this.A02 = j2 - j3;
        this.A03 = A7d(j2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final long A6R() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final Ck A7N(long positionOffset) {
        long j2 = this.A02;
        if (j2 == -1) {
            return new Ck(new C0523Cm(0L, this.A04));
        }
        int i2 = this.A01;
        long A0E = C0676Iy.A0E((((this.A00 * positionOffset) / 8000000) / i2) * i2, 0L, j2 - i2);
        long j3 = this.A04 + A0E;
        long A7d = A7d(j3);
        C0523Cm seekPoint = new C0523Cm(A7d, j3);
        if (A7d < positionOffset) {
            long j4 = this.A02;
            int i3 = this.A01;
            if (A0E != j4 - i3) {
                long j5 = i3 + j3;
                return new Ck(seekPoint, new C0523Cm(A7d(j5), j5));
            }
        }
        return new Ck(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.X.WS
    public final long A7d(long j2) {
        return ((Math.max(0L, j2 - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final boolean A8g() {
        return this.A02 != -1;
    }
}
