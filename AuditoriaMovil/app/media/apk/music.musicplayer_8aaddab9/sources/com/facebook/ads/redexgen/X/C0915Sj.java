package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Sj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0915Sj extends OZ {
    public static final int A01 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final C0811Oi A00;

    public C0915Sj(C0806Od c0806Od, boolean z) {
        super(c0806Od, z);
        this.A00 = new C0811Oi(c0806Od.A05(), c0806Od.A02());
        this.A00.A01(getTitleDescContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(OZ.A08, OZ.A08, OZ.A08, OZ.A08);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(c0806Od.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(OZ.A08, 0, OZ.A08, 0);
        frameLayout.addView(this.A00, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final void A0b(C1B c1b, String str, double d2, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d2, bundle);
        if (d2 > 0.0d) {
            this.A00.A00((int) ((A01 - (OZ.A08 * 2)) / d2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final boolean A0c() {
        return false;
    }
}
