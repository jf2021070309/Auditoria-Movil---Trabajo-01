package com.facebook.ads.redexgen.X;

import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.dU  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1320dU extends AbstractC0868Qo {
    public final /* synthetic */ C1318dS A00;

    public C1320dU(C1318dS c1318dS) {
        this.A00 = c1318dS;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0868Qo
    public final void A02() {
        MD md;
        MD md2;
        E5 e5;
        C1307dH c1307dH;
        E5 e52;
        C1300dA c1300dA;
        C0869Qp c0869Qp;
        MD md3;
        C1300dA c1300dA2;
        InterfaceC0684Jg interfaceC0684Jg;
        C1300dA c1300dA3;
        C0869Qp c0869Qp2;
        md = this.A00.A05;
        if (!md.A07()) {
            md2 = this.A00.A05;
            md2.A05();
            e5 = this.A00.A03;
            InterfaceC1335dj A0D = e5.A0D();
            c1307dH = this.A00.A01;
            A0D.A3Y(c1307dH != null);
            e52 = this.A00.A03;
            e52.A0D().A2Y();
            c1300dA = this.A00.A02;
            AnonymousClass29.A00(c1300dA.A0V());
            OA oa = new OA();
            c0869Qp = this.A00.A0A;
            OA A03 = oa.A03(c0869Qp);
            md3 = this.A00.A05;
            OA A02 = A03.A02(md3);
            c1300dA2 = this.A00.A02;
            Map<String, String> A05 = A02.A04(c1300dA2.A0W()).A05();
            interfaceC0684Jg = this.A00.A04;
            c1300dA3 = this.A00.A02;
            interfaceC0684Jg.A93(c1300dA3.A0T(), A05);
            c0869Qp2 = this.A00.A0A;
            c0869Qp2.A0V();
        }
    }
}
