package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class FN extends AbstractC1281cr {
    @Nullable
    public View A00;
    public E5 A01;

    public FN(E5 e5, C02641q c02641q) {
        super(e5, c02641q);
        this.A01 = e5;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1281cr
    public final void A0J() {
        if (this.A00 != null) {
            this.A01.A0D().A3m();
            this.A06.A0E(this.A00);
            return;
        }
        this.A01.A0D().A3n();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1281cr
    public final void A0L(InterfaceC02350n interfaceC02350n, C9H c9h, C9F c9f, C02651r c02651r) {
        this.A01.A0D().A3g();
        C1318dS c1318dS = (C1318dS) interfaceC02350n;
        C1284cu c1284cu = new C1284cu(this, c02651r, c1318dS);
        A0C().postDelayed(c1284cu, c9h.A05().A05());
        c1318dS.A0J(this.A01, this.A08, this.A07.A06, new C1283ct(this, c1284cu), c02651r);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1281cr
    public final void A0O(String str) {
        this.A01.A0D().A3l(str != null);
        super.A0O(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1281cr
    public final void A0R(boolean z) {
        super.A0R(z);
        this.A00 = null;
    }
}
