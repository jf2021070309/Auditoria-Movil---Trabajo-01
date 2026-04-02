package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class FO extends AbstractC1302dC {
    public final C1046Xo A00;

    public FO(C1A c1a, List<U1> list, C1046Xo c1046Xo) {
        super(c1a, list, c1046Xo);
        this.A00 = c1046Xo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final TS A06(ViewGroup viewGroup, int i2) {
        return new TS(new C0767Mq(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1302dC, com.facebook.ads.redexgen.X.C4H
    /* renamed from: A0H */
    public final void A0E(TS ts, int i2) {
        super.A0E(ts, i2);
        C0767Mq c0767Mq = (C0767Mq) ts.A0l();
        N2 n2 = (N2) c0767Mq.getImageCardView();
        n2.setImageDrawable(null);
        A0F(n2, i2);
        U1 u1 = ((AbstractC1302dC) this).A01.get(i2);
        u1.A13().A0F(this.A00);
        u1.A1P(c0767Mq, c0767Mq);
    }
}
