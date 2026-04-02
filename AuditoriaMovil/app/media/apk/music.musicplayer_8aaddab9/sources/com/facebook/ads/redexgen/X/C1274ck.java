package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
/* renamed from: com.facebook.ads.redexgen.X.ck  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1274ck extends L7 {
    public final /* synthetic */ FQ A00;
    public final /* synthetic */ C02651r A01;
    public final /* synthetic */ FI A02;

    public C1274ck(FI fi, C02651r c02651r, FQ fq) {
        this.A02 = fi;
        this.A01 = c02651r;
        this.A00 = fq;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0D().A4Y(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A06.A0G(new KG(adErrorType, ""));
    }
}
