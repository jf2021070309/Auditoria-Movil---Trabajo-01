package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Sl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0917Sl extends OZ {
    public C0917Sl(C0806Od c0806Od, boolean z) {
        super(c0806Od, true);
        RelativeLayout relativeLayout = new RelativeLayout(c0806Od.A05());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        ML.A0R(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c0806Od.A05());
        linearLayout.setOrientation(!z ? 1 : 0);
        linearLayout.setGravity(80);
        ML.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(OZ.A08, 0, OZ.A08, OZ.A08);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams3.setMargins(z ? OZ.A08 : 0, z ? 0 : OZ.A08, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        LinearLayout auxContainer = getTitleDescContainer();
        linearLayout.addView(auxContainer, layoutParams4);
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        addView(c0806Od.A02(), new RelativeLayout.LayoutParams(-1, -1));
        addView(relativeLayout, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final void A0b(C1B c1b, String str, double d2, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d2, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final boolean A0c() {
        return true;
    }
}
