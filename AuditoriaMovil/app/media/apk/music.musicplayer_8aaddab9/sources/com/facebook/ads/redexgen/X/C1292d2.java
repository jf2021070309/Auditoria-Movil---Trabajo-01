package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.d2  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1292d2 implements InterfaceC03545f {
    public final /* synthetic */ C02511d A00;
    public final /* synthetic */ C1046Xo A01;
    public final /* synthetic */ boolean A02;

    public C1292d2(C02511d c02511d, C1046Xo c1046Xo, boolean z) {
        this.A00 = c02511d;
        this.A01 = c1046Xo;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03545f
    public final void A9z() {
        InterfaceC02501c interfaceC02501c;
        C1298d8 c1298d8;
        if (!JQ.A18(this.A01) || !this.A02) {
            interfaceC02501c = this.A00.A04;
            interfaceC02501c.A9t();
            return;
        }
        C02511d c02511d = this.A00;
        C1046Xo c1046Xo = this.A01;
        c1298d8 = c02511d.A03;
        c02511d.A02 = P5.A01(c1046Xo, c1298d8, 1, new C1293d3(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03545f
    public final void AA0() {
        InterfaceC02501c interfaceC02501c;
        interfaceC02501c = this.A00.A04;
        interfaceC02501c.A9s(AdError.CACHE_ERROR);
    }
}
