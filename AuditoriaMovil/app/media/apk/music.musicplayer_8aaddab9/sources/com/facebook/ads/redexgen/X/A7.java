package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class A7 extends AbstractC0918Sm {
    public static final int A02 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final View A00;
    public final boolean A01;

    public A7(C0806Od c0806Od, boolean z) {
        super(c0806Od, true);
        this.A01 = z;
        this.A00 = c0806Od.A02();
        A0f();
        if (this.A01) {
            addView(c0806Od.A02(), new RelativeLayout.LayoutParams(-1, -1));
        } else {
            FrameLayout frameLayout = new FrameLayout(c0806Od.A05());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            layoutParams2.setMargins(OZ.A08, 0, OZ.A08, 0);
            frameLayout.addView(this.A00, layoutParams2);
            addView(frameLayout);
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final boolean A02() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final boolean A0B() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0918Sm, com.facebook.ads.redexgen.X.OZ
    public final void A0b(C1B c1b, String str, double d2, @Nullable Bundle bundle) {
        super.A0b(c1b, str, d2, bundle);
        if (!this.A01 && d2 > 0.0d) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) ((A02 - (OZ.A08 * 2)) / d2));
            layoutParams.gravity = 17;
            layoutParams.setMargins(OZ.A08, 0, OZ.A08, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.OZ
    public final boolean A0c() {
        return this.A01;
    }
}
