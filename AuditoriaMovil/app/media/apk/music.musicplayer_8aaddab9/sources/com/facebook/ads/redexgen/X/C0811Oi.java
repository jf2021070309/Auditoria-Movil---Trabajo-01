package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Oi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0811Oi extends RelativeLayout {
    public final View A00;
    public final OR A01;

    public C0811Oi(C1046Xo c1046Xo, View view) {
        super(c1046Xo);
        this.A00 = view;
        this.A01 = new OR(c1046Xo);
        ML.A0K(this.A01);
    }

    public final void A00(int i2) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i2));
    }

    public final void A01(@Nullable OW ow, boolean z) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (ow != null) {
            if (z) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                ow.setAlignment(3);
                layoutParams2.setMargins(OZ.A08 / 2, OZ.A08 / 2, OZ.A08 / 2, OZ.A08 / 2);
                linearLayout.addView(ow, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                ML.A0S(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.addRule(3, this.A01.getId());
                layoutParams3.setMargins(0, OZ.A08, 0, 0);
                ow.setAlignment(17);
                addView(ow, layoutParams3);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
