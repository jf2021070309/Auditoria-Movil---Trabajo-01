package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
/* loaded from: assets/audience_network.dex */
public class SJ extends AbstractC0868Qo {
    public final /* synthetic */ SF A00;

    public SJ(SF sf) {
        this.A00 = sf;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0868Qo
    public final void A02() {
        if (!this.A00.A06.A07()) {
            this.A00.A06.A05();
            if (!TextUtils.isEmpty(this.A00.A01.A0T())) {
                this.A00.A04.A93(this.A00.A01.A0T(), new OA().A03(this.A00.A0A).A02(this.A00.A06).A04(this.A00.A01.A0W()).A05());
                this.A00.A03.A0D().A2Y();
                AnonymousClass29.A00(this.A00.A01.A0V());
                this.A00.A08.A3r(this.A00.A09.A6l());
            }
        }
    }
}
