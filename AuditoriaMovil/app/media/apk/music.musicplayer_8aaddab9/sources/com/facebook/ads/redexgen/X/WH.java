package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class WH implements InterfaceC0522Cl {
    public final /* synthetic */ WG A00;

    public WH(WG wg) {
        this.A00 = wg;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final long A6R() {
        DY dy;
        long j2;
        dy = this.A00.A0B;
        j2 = this.A00.A07;
        return dy.A03(j2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final Ck A7N(long granule) {
        DY dy;
        long j2;
        long A00;
        long j3;
        if (granule == 0) {
            j3 = this.A00.A09;
            return new Ck(new C0523Cm(0L, j3));
        }
        dy = this.A00.A0B;
        long A04 = dy.A04(granule);
        WG wg = this.A00;
        j2 = wg.A09;
        A00 = wg.A00(j2, A04, 30000L);
        return new Ck(new C0523Cm(granule, A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final boolean A8g() {
        return true;
    }
}
