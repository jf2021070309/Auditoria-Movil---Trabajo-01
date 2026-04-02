package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public final class FM extends AbstractC1281cr {
    public FM(C1046Xo c1046Xo, C02641q c02641q) {
        super(c1046Xo, c02641q);
    }

    private InterfaceC02450x A00(Runnable runnable) {
        return new C1279cp(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1281cr
    public final void A0J() {
        ((C1317dR) this.A01).A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1281cr
    public final void A0L(InterfaceC02350n interfaceC02350n, C9H c9h, C9F c9f, C02651r c02651r) {
        C1317dR c1317dR = (C1317dR) interfaceC02350n;
        C1280cq c1280cq = new C1280cq(this, c02651r, c1317dR);
        A0C().postDelayed(c1280cq, c9h.A05().A05());
        c1317dR.A0A(this.A0B, A00(c1280cq), c02651r, this.A07.A09, this.A07.A03, this.A07.A04, this.A07.A01);
    }

    public final AnonymousClass18 A0T() {
        return ((C1317dR) this.A01).A09();
    }
}
