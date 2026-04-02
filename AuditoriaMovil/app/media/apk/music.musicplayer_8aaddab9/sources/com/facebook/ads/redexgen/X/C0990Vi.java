package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Vi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0990Vi implements InterfaceC0522Cl {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C0990Vi(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A06 = i2;
        this.A07 = i3;
        this.A02 = i4;
        this.A04 = i5;
        this.A03 = i6;
        this.A05 = i7;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j2) {
        return (1000000 * Math.max(0L, j2 - this.A01)) / this.A02;
    }

    public final void A06(long j2, long j3) {
        this.A01 = j2;
        this.A00 = j3;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final long A6R() {
        return (1000000 * (this.A00 / this.A04)) / this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final Ck A7N(long j2) {
        int i2 = this.A04;
        long A0E = C0676Iy.A0E((((this.A02 * j2) / 1000000) / i2) * i2, 0L, this.A00 - i2);
        long j3 = this.A01 + A0E;
        long seekTimeUs = A05(j3);
        C0523Cm c0523Cm = new C0523Cm(seekTimeUs, j3);
        if (seekTimeUs < j2) {
            long j4 = this.A00;
            int i3 = this.A04;
            if (A0E != j4 - i3) {
                long j5 = i3 + j3;
                long seekPosition = A05(j5);
                return new Ck(c0523Cm, new C0523Cm(seekPosition, j5));
            }
        }
        return new Ck(c0523Cm);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final boolean A8g() {
        return true;
    }
}
