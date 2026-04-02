package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public final class UW implements InterfaceC1358e8<JW, C0679Jb> {
    public UT A00;

    public UW(UT ut) {
        this.A00 = ut;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eD != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1358e8
    public final void A5H(C1363eD<JW, C0679Jb> c1363eD, InterfaceC1352e2 interfaceC1352e2) {
        int i2 = JU.A00[interfaceC1352e2.A7n(c1363eD).ordinal()];
        if (i2 != 1 && i2 != 2) {
            return;
        }
        this.A00.A02(c1363eD, interfaceC1352e2);
    }
}
