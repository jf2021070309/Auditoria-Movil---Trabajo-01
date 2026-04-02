package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class SI implements InterfaceC0732Lf {
    public final /* synthetic */ int A00;
    public final /* synthetic */ L7 A01;
    public final /* synthetic */ SF A02;

    public SI(SF sf, int i2, L7 l7) {
        this.A02 = sf;
        this.A00 = i2;
        this.A01 = l7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0732Lf
    public final void AAL() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0732Lf
    public final void ABv(float f2) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f2 / this.A00)));
    }
}
