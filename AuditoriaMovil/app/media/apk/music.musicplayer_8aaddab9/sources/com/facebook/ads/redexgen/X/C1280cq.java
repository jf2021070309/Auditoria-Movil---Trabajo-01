package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
/* renamed from: com.facebook.ads.redexgen.X.cq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1280cq extends L7 {
    public final /* synthetic */ C1317dR A00;
    public final /* synthetic */ C02651r A01;
    public final /* synthetic */ FM A02;

    public C1280cq(FM fm, C02651r c02651r, C1317dR c1317dR) {
        this.A02 = fm;
        this.A01 = c02651r;
        this.A00 = c1317dR;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.A00 = null;
        KG A00 = KG.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0D().A4Y(A00.A03().getErrorCode(), A00.A04());
        this.A02.A06.A0G(A00);
    }
}
