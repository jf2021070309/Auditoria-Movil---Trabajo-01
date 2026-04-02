package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class S2 implements InterfaceC0817Oo {
    public final /* synthetic */ S1 A00;

    public S2(S1 s1) {
        this.A00 = s1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0817Oo
    public final void ACj(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0817Oo
    public final void ACl(View view) {
        AbstractC0907Sb abstractC0907Sb = (AbstractC0907Sb) view;
        abstractC0907Sb.A0g();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC0907Sb.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
