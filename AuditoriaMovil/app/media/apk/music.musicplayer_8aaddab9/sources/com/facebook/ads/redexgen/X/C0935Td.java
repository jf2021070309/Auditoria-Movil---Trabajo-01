package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Td  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0935Td implements M1 {
    public final M0 A00;
    public final M1 A01;

    public C0935Td(M1 m1, int i2, int i3) {
        this.A01 = m1;
        this.A00 = new M0(i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void ADH(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() != null) {
            A08 = M3.A08(this.A00);
            if (A08) {
                this.A01.ADH(this.A00.A02());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = M3.A08(this.A00);
            if (A08) {
                this.A01.ADH(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
