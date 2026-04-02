package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.bu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1227bu implements InterfaceC03113n {
    public final /* synthetic */ F6 A00;

    public C1227bu(F6 f6) {
        this.A00 = f6;
    }

    private final void A00(C03123o c03123o) {
        int i2 = c03123o.A00;
        if (i2 == 1) {
            this.A00.A06.A1Q(this.A00, c03123o.A02, c03123o.A01);
        } else if (i2 == 2) {
            this.A00.A06.A1R(this.A00, c03123o.A02, c03123o.A01);
        } else if (i2 == 4) {
            this.A00.A06.A1T(this.A00, c03123o.A02, c03123o.A01, c03123o.A03);
        } else if (i2 != 8) {
        } else {
            this.A00.A06.A1S(this.A00, c03123o.A02, c03123o.A01, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03113n
    public final AbstractC03344l A5P(int i2) {
        AbstractC03344l A1G = this.A00.A1G(i2, true);
        if (A1G == null || this.A00.A01.A0K(A1G.A0H)) {
            return null;
        }
        return A1G;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03113n
    public final void A9S(int i2, int i3, Object obj) {
        this.A00.A1f(i2, i3, obj);
        this.A00.A0H = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03113n
    public final void A9m(int i2, int i3) {
        this.A00.A1c(i2, i3);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03113n
    public final void A9n(int i2, int i3) {
        this.A00.A1d(i2, i3);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03113n
    public final void A9o(int i2, int i3) {
        this.A00.A1g(i2, i3, true);
        F6 f6 = this.A00;
        f6.A0G = true;
        f6.A0s.A00 += i3;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03113n
    public final void A9p(int i2, int i3) {
        this.A00.A1g(i2, i3, false);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03113n
    public final void AAT(C03123o c03123o) {
        A00(c03123o);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03113n
    public final void AAV(C03123o c03123o) {
        A00(c03123o);
    }
}
