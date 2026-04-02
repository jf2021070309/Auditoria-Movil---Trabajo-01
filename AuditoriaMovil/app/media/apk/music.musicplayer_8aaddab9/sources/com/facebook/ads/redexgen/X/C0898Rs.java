package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Rs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0898Rs extends AbstractC0868Qo {
    public final /* synthetic */ C8F A00;

    public C0898Rs(C8F c8f) {
        this.A00 = c8f;
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
        md = this.A00.A0D;
        if (!md.A07()) {
            C8F c8f = this.A00;
            md2 = c8f.A0D;
            c8f.setImpressionRecordingFlag(md2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                OA oa = new OA();
                c0869Qp = this.A00.A09;
                OA A03 = oa.A03(c0869Qp);
                md3 = this.A00.A0D;
                OA A02 = A03.A02(md3);
                c1298d8 = ((TM) this.A00).A08;
                Map<String, String> A05 = A02.A04(c1298d8.A0W()).A05();
                interfaceC0684Jg = ((TM) this.A00).A0A;
                str2 = this.A00.A0A;
                interfaceC0684Jg.A93(str2, A05);
                c1046Xo = this.A00.A0C;
                c1046Xo.A0D().A2Y();
                c1298d82 = this.A00.A03;
                AnonymousClass29.A00(c1298d82.A0V());
            }
        }
    }
}
