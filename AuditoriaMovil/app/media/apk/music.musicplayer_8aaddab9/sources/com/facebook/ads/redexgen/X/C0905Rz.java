package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Rz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0905Rz extends AbstractC0868Qo {
    public final /* synthetic */ C8G A00;

    public C0905Rz(C8G c8g) {
        this.A00 = c8g;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0868Qo
    public final void A02() {
        MD md;
        MD md2;
        String str;
        C0869Qp c0869Qp;
        MD md3;
        C1298d8 c1298d8;
        InterfaceC0684Jg interfaceC0684Jg;
        String str2;
        C1046Xo c1046Xo;
        C1298d8 c1298d82;
        md = this.A00.A0H;
        if (!md.A07()) {
            C8G c8g = this.A00;
            md2 = c8g.A0H;
            c8g.setImpressionRecordingFlag(md2);
            str = this.A00.A0C;
            if (!TextUtils.isEmpty(str)) {
                OA oa = new OA();
                c0869Qp = this.A00.A0B;
                OA A03 = oa.A03(c0869Qp);
                md3 = this.A00.A0H;
                OA A02 = A03.A02(md3);
                c1298d8 = ((TM) this.A00).A08;
                Map<String, String> A05 = A02.A04(c1298d8.A0W()).A05();
                interfaceC0684Jg = ((TM) this.A00).A0A;
                str2 = this.A00.A0C;
                interfaceC0684Jg.A93(str2, A05);
                c1046Xo = this.A00.A0G;
                c1046Xo.A0D().A2Y();
                c1298d82 = this.A00.A04;
                AnonymousClass29.A00(c1298d82.A0V());
            }
        }
    }
}
