package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class TV implements InterfaceC0797Nu {
    public final /* synthetic */ InterfaceC0761Mk A00;
    public final /* synthetic */ TT A01;

    public TV(TT tt, InterfaceC0761Mk interfaceC0761Mk) {
        this.A01 = tt;
        this.A00 = interfaceC0761Mk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0797Nu
    public final void ABd(String str) {
        C0790Nn c0790Nn;
        c0790Nn = this.A01.A0A;
        c0790Nn.setProgress(100);
        this.A01.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0797Nu
    public final void ABf(String str) {
        C0789Nm c0789Nm;
        this.A01.A05 = true;
        c0789Nm = this.A01.A09;
        c0789Nm.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0797Nu
    public final void ABw(int i2) {
        boolean z;
        C0790Nn c0790Nn;
        z = this.A01.A05;
        if (z) {
            c0790Nn = this.A01.A0A;
            c0790Nn.setProgress(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0797Nu
    public final void AC1(String str) {
        C0789Nm c0789Nm;
        c0789Nm = this.A01.A09;
        c0789Nm.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0797Nu
    public final void AC3() {
        this.A00.AAD(14);
    }
}
