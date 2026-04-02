package com.facebook.ads.redexgen.X;

import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class SY extends AbstractC0868Qo {
    public final /* synthetic */ C04579s A00;

    public SY(C04579s c04579s) {
        this.A00 = c04579s;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0868Qo
    public final void A02() {
        MD md;
        MD md2;
        C0869Qp c0869Qp;
        MD md3;
        InterfaceC0684Jg interfaceC0684Jg;
        AnonymousClass18 anonymousClass18;
        C1046Xo c1046Xo;
        AnonymousClass18 anonymousClass182;
        InterfaceC0761Mk interfaceC0761Mk;
        InterfaceC0761Mk interfaceC0761Mk2;
        NC nc;
        md = this.A00.A0B;
        if (!md.A07()) {
            md2 = this.A00.A0B;
            md2.A05();
            OA oa = new OA();
            c0869Qp = this.A00.A0H;
            OA A03 = oa.A03(c0869Qp);
            md3 = this.A00.A0B;
            Map<String, String> A05 = A03.A02(md3).A05();
            interfaceC0684Jg = this.A00.A08;
            anonymousClass18 = this.A00.A06;
            interfaceC0684Jg.A93(anonymousClass18.A0T(), A05);
            c1046Xo = this.A00.A07;
            c1046Xo.A0D().A2Y();
            anonymousClass182 = this.A00.A06;
            AnonymousClass29.A00(anonymousClass182.A0V());
            interfaceC0761Mk = this.A00.A0C;
            if (interfaceC0761Mk != null) {
                interfaceC0761Mk2 = this.A00.A0C;
                nc = this.A00.A0D;
                interfaceC0761Mk2.A3r(nc.A6l());
            }
        }
    }
}
