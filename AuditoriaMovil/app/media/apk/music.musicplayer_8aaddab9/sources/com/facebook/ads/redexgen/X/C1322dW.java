package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
/* renamed from: com.facebook.ads.redexgen.X.dW  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1322dW implements InterfaceC03545f {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1318dS A01;
    public final /* synthetic */ C1318dS A02;
    public final /* synthetic */ C9I A03;

    public C1322dW(C1318dS c1318dS, int i2, C9I c9i, C1318dS c1318dS2) {
        this.A01 = c1318dS;
        this.A00 = i2;
        this.A03 = c9i;
        this.A02 = c1318dS2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03545f
    public final void A9z() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03545f
    public final void AA0() {
        InterfaceC02430v interfaceC02430v;
        interfaceC02430v = this.A01.A00;
        interfaceC02430v.AB9(this.A02, KG.A00(AdErrorType.NO_FILL));
    }
}
