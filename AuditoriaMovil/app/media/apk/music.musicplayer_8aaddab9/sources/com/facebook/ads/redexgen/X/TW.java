package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class TW implements AnonymousClass57 {
    public final /* synthetic */ TT A00;

    public TW(TT tt) {
        this.A00 = tt;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass57
    public final boolean A8M() {
        T4 t4;
        T4 t42;
        t4 = this.A00.A0B;
        if (t4.canGoBack()) {
            t42 = this.A00.A0B;
            t42.goBack();
            return true;
        }
        return false;
    }
}
