package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Tz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0956Tz extends AbstractRunnableC0721Ku {
    public final /* synthetic */ B8 A00;
    public final /* synthetic */ KG A01;

    public C0956Tz(B8 b8, KG kg) {
        this.A00 = b8;
        this.A01 = kg;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0721Ku
    public final void A01() {
        this.A00.A01.onError(this.A00.A00, LY.A00(this.A01));
    }
}
