package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;
/* renamed from: com.facebook.ads.redexgen.X.Se  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0910Se implements InterfaceC0797Nu {
    public final /* synthetic */ C0908Sc A00;

    public C0910Se(C0908Sc c0908Sc) {
        this.A00 = c0908Sc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0797Nu
    public final void ABd(String str) {
        C0790Nn c0790Nn;
        C0790Nn c0790Nn2;
        this.A00.A0I = false;
        c0790Nn = this.A00.A0C;
        c0790Nn.setProgress(100);
        c0790Nn2 = this.A00.A0C;
        ML.A0N(c0790Nn2, 8);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0797Nu
    public final void ABf(String str) {
        C0790Nn c0790Nn;
        C0789Nm c0789Nm;
        this.A00.A0I = true;
        c0790Nn = this.A00.A0C;
        ML.A0N(c0790Nn, 0);
        c0789Nm = this.A00.A0B;
        c0789Nm.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0797Nu
    public final void ABw(int i2) {
        boolean z;
        C0790Nn c0790Nn;
        z = this.A00.A0I;
        if (z) {
            c0790Nn = this.A00.A0C;
            c0790Nn.setProgress(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0797Nu
    public final void AC1(String str) {
        C0789Nm c0789Nm;
        c0789Nm = this.A00.A0B;
        c0789Nm.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0797Nu
    @RequiresApi(api = 26)
    public final void AC3() {
        C0806Od c0806Od;
        c0806Od = this.A00.A0E;
        c0806Od.A09().AAD(14);
    }
}
