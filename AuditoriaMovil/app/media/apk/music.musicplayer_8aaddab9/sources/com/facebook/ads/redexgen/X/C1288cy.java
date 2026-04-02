package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.cy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1288cy implements InterfaceC03545f {
    public final /* synthetic */ C02511d A00;

    public C1288cy(C02511d c02511d) {
        this.A00 = c02511d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03545f
    public final void A9z() {
        InterfaceC02501c interfaceC02501c;
        interfaceC02501c = this.A00.A04;
        interfaceC02501c.A9t();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03545f
    public final void AA0() {
        InterfaceC02501c interfaceC02501c;
        interfaceC02501c = this.A00.A04;
        interfaceC02501c.A9s(AdError.CACHE_ERROR);
    }
}
