package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.cs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1282cs extends L7 {
    public final /* synthetic */ AbstractC1281cr A00;
    public final /* synthetic */ KG A01;

    public C1282cs(AbstractC1281cr abstractC1281cr, KG kg) {
        this.A00 = abstractC1281cr;
        this.A01 = kg;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        this.A00.A0B.A0D().A4Y(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A06 != null) {
            this.A00.A06.A0G(this.A01);
        }
    }
}
