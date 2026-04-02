package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Sd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0909Sd extends L7 {
    public final /* synthetic */ C0908Sc A00;
    public final /* synthetic */ boolean A01;

    public C0909Sd(C0908Sc c0908Sc, boolean z) {
        this.A00 = c0908Sc;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        C0806Od c0806Od;
        c0806Od = this.A00.A0E;
        AbstractC0760Mj A08 = c0806Od.A08();
        if (A08 == null) {
            return;
        }
        A08.setPageDetailsVisible((this.A01 || A08.A05()) ? false : true);
        A08.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
