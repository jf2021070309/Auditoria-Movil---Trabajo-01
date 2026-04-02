package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class TN implements InterfaceC0732Lf {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TM A01;

    public TN(TM tm, int i2) {
        this.A01 = tm;
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0732Lf
    public final void AAL() {
        this.A01.A03 = false;
        this.A01.A0S();
        this.A01.A0C.setToolbarActionMode(this.A01.getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0732Lf
    public final void ABv(float f2) {
        this.A01.A0C.setProgress(100.0f * (1.0f - (f2 / this.A00)));
    }
}
