package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Te  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0936Te implements M1 {
    public int A00;
    public final M1 A01;

    public C0936Te(M1 m1, int i2) {
        this.A01 = m1;
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void ADH(String str) {
        if (this.A00 > 0) {
            this.A01.ADH(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void flush() {
        this.A01.flush();
    }
}
