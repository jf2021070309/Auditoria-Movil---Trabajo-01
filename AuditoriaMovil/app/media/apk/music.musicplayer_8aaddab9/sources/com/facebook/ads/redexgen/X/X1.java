package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class X1 implements InterfaceC0497Bh {
    public final C1027Wv A00 = new C1027Wv();
    public final C1026Wu A01 = new C1026Wu();
    public final BL[] A02;

    public X1(BL... blArr) {
        this.A02 = (BL[]) Arrays.copyOf(blArr, blArr.length + 2);
        BL[] blArr2 = this.A02;
        blArr2[blArr.length] = this.A00;
        blArr2[blArr.length + 1] = this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0497Bh
    public final C0472Ah A3P(C0472Ah c0472Ah) {
        this.A00.A0B(c0472Ah.A02);
        return new C0472Ah(this.A01.A01(c0472Ah.A01), this.A01.A00(c0472Ah.A00), c0472Ah.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0497Bh
    public final BL[] A5k() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0497Bh
    public final long A6x(long j2) {
        return this.A01.A02(j2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0497Bh
    public final long A7U() {
        return this.A00.A0A();
    }
}
