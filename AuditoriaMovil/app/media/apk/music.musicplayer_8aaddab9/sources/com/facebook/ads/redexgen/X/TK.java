package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class TK implements ON {
    public final /* synthetic */ TE A00;

    public TK(TE te) {
        this.A00 = te;
    }

    @Override // com.facebook.ads.redexgen.X.ON
    public final void A9v() {
        boolean A0Y;
        A0Y = this.A00.A0Y();
        if (A0Y) {
            this.A00.A0M();
            this.A00.A0V.setToolbarActionMessage("");
            this.A00.A0V.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.ON
    public final void ABM() {
        C0733Lg c0733Lg;
        this.A00.A0A = false;
        c0733Lg = this.A00.A0J;
        c0733Lg.A07();
    }

    @Override // com.facebook.ads.redexgen.X.ON
    public final void ABN() {
        C0733Lg c0733Lg;
        this.A00.A0A = true;
        c0733Lg = this.A00.A0J;
        c0733Lg.A06();
    }
}
