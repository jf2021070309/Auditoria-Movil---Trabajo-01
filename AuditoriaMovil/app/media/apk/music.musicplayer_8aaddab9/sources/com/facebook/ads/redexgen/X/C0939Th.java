package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Th  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0939Th implements M1 {
    public int A00;
    public final M1 A01;
    public final M1 A02;

    public C0939Th(M1 m1, int i2, M1 m12) {
        this.A01 = m1;
        this.A00 = i2;
        this.A02 = m12;
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void ADH(String str) {
        if (this.A00 > 0) {
            this.A01.ADH(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.ADH(str);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void flush() {
        this.A02.flush();
    }
}
