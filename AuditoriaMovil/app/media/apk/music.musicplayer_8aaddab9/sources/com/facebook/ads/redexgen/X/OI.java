package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.HashMap;
/* loaded from: assets/audience_network.dex */
public final class OI {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.2L] */
    public static C2L A00(final C0806Od c0806Od, final U1 u1, final String str, final AE ae) {
        return new A8(c0806Od, u1, true, str, ae) { // from class: com.facebook.ads.redexgen.X.2L
            @Nullable
            public View$OnClickListenerC0923Sr A00;
            @Nullable
            public PU A01;
            public final InterfaceC0684Jg A02 = this.A0I.A05().A00().A08();
            public final U1 A03;
            public final AE A04;
            public final String A05;
            public static final int A07 = (int) (C0739Lm.A00 * (-4.0f));
            public static final int A06 = (int) (C0739Lm.A00 * 6.0f);

            {
                this.A03 = u1;
                this.A05 = str;
                this.A04 = ae;
                this.A03.A1M(this);
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0907Sb
            public void setupNativeCtaExtension(PU pu) {
                this.A01 = pu;
                int A0K = JQ.A0K(this.A0I.A05());
                C1K A01 = this.A03.A11().A0M().A01();
                this.A00 = new View$OnClickListenerC0923Sr(this.A0I.A05(), this.A03.A11().A0S(), A01, this.A02, C0801Ny.getDummyListener(), this.A04.A0c(), this.A03.A1B());
                this.A00.setCta(pu.A03().A0F(), this.A05, new HashMap());
                this.A03.A1M(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (A0K == 1) {
                    layoutParams.addRule(12);
                    ML.A0P(this.A00, A06, 5, A01.A09(false));
                    ((A8) this).A06.addView(this.A00, layoutParams);
                } else if (A0K != 2) {
                } else {
                    layoutParams.addRule(3, ((A8) this).A06.getId());
                    layoutParams.setMargins(0, A07, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((A8) this).A06.bringToFront();
                }
            }
        };
    }

    public static A8 A01(C0806Od c0806Od, String str, S1 s1) {
        return new A8(c0806Od, true, str, s1);
    }
}
