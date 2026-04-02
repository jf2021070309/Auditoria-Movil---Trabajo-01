package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class FP extends AbstractC1302dC {
    public final C1046Xo A00;
    public final K6 A01;

    public FP(C1046Xo c1046Xo, C1A c1a, List<U1> list, @Nullable K6 k6) {
        super(c1a, list, c1046Xo);
        this.A00 = c1046Xo;
        this.A01 = k6 == null ? new K6() : k6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final TS A06(ViewGroup viewGroup, int i2) {
        return new TS(new C0763Mm(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1302dC, com.facebook.ads.redexgen.X.C4H
    /* renamed from: A0H */
    public final void A0E(TS ts, int i2) {
        super.A0E(ts, i2);
        C0763Mm c0763Mm = (C0763Mm) ts.A0l();
        A0F(c0763Mm.getImageCardView(), i2);
        if (((AbstractC1302dC) this).A01.get(i2) != null) {
            c0763Mm.setTitle(((AbstractC1302dC) this).A01.get(i2).getAdHeadline());
            c0763Mm.setSubtitle(((AbstractC1302dC) this).A01.get(i2).getAdLinkDescription());
            c0763Mm.setButtonText(((AbstractC1302dC) this).A01.get(i2).getAdCallToAction());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0763Mm);
        ((AbstractC1302dC) this).A01.get(i2).A1Q(c0763Mm, c0763Mm, arrayList);
    }
}
