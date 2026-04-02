package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
/* renamed from: com.facebook.ads.redexgen.X.Oq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0819Oq {
    public static AbstractC04649z A00(final C0806Od c0806Od, int i2, final String str, final S1 s1) {
        if (i2 == 1) {
            return new AbstractC04649z(c0806Od, str, s1) { // from class: com.facebook.ads.redexgen.X.1i
                public static final int A00 = (int) (C0739Lm.A00 * 20.0f);
                public static final int A01 = (int) (C0739Lm.A00 * 16.0f);

                @Override // com.facebook.ads.redexgen.X.OZ
                public final boolean A01() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.X.AbstractC04649z
                public final void A0j(C1046Xo c1046Xo) {
                    OW titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c1046Xo);
                    ML.A0S(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    int i3 = A01;
                    linearLayout.setPadding(i3, i3, i3, i3);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new AbstractC04649z(c0806Od, str, s1) { // from class: com.facebook.ads.redexgen.X.26
            public static final int A00 = (int) (C0739Lm.A00 * 12.0f);

            @Override // com.facebook.ads.redexgen.X.OZ
            public final boolean A00() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC04649z, com.facebook.ads.redexgen.X.OZ
            public final boolean A0B() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC04649z
            public final void A0j(C1046Xo c1046Xo) {
                OW titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(layoutParams);
                int i3 = A00;
                titleDescContainer.setPadding(i3, i3, i3, i3);
                ML.A0R(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams2);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
