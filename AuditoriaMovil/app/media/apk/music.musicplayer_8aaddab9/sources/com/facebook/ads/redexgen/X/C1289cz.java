package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.cz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1289cz implements InterfaceC02591l {
    public final /* synthetic */ C02511d A00;

    public C1289cz(C02511d c02511d) {
        this.A00 = c02511d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02591l
    public final void ABj(AdError adError) {
        InterfaceC02501c interfaceC02501c;
        interfaceC02501c = this.A00.A04;
        interfaceC02501c.A9s(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02591l
    public final void ABk() {
        InterfaceC02501c interfaceC02501c;
        interfaceC02501c = this.A00.A04;
        interfaceC02501c.A9t();
    }
}
