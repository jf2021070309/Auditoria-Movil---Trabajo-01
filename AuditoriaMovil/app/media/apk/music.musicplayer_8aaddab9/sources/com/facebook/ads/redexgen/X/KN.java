package com.facebook.ads.redexgen.X;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
/* loaded from: assets/audience_network.dex */
public final class KN {
    public static KL A00(DisplayMetrics displayMetrics) {
        int i2 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int i3 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (C0740Ln.A04(i2, i3)) {
            return KL.A0H;
        }
        if (i3 > i2) {
            return KL.A0J;
        }
        return KL.A0G;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, KJ kj) {
        int ceil;
        if (((int) (displayMetrics.widthPixels / displayMetrics.density)) >= kj.A03()) {
            ceil = displayMetrics.widthPixels;
        } else {
            ceil = (int) Math.ceil(kj.A03() * displayMetrics.density);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ceil, (int) Math.ceil(kj.A02() * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
