package com.facebook.ads.redexgen.X;

import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Bk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0500Bk extends AbstractC1023Wr implements GY {
    public static String[] A02 = {"", "mui60dwzFhaHNm2Uk6c71g13RzPqoL9o", "B0rzWlns", "IaExOe45iIyqIoKsg3ghGHNojNO5y7aX", "6x0KWKc5lmTcd6rSDKCIntspSHI5N7vM", "fpXFGNqhd64a2XzCiJ5Y2uwqVb67lOfi", "JEeTPk6X6cicZdwnLWr3cLjXKJNjxOw", "om0z9vsHwazWN6uDNjDMJ"};
    public long A00;
    public GY A01;

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.X.AbstractC0507Br
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j2, GY gy, long j3) {
        super.A01 = j2;
        this.A01 = gy;
        if (j3 == Long.MAX_VALUE) {
            j3 = super.A01;
        }
        this.A00 = j3;
        if (A02[0].length() != 0) {
            throw new RuntimeException();
        }
        A02[1] = "xukRyz5yFwN1nVXA8Rs2f92E1X9llmA1";
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6A(long j2) {
        return this.A01.A6A(j2 - this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6a(int i2) {
        return this.A01.A6a(i2) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6b() {
        return this.A01.A6b();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6z(long j2) {
        return this.A01.A6z(j2 - this.A00);
    }
}
