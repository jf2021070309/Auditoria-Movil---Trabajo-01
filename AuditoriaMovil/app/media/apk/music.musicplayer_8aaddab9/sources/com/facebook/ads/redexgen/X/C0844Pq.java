package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;
/* renamed from: com.facebook.ads.redexgen.X.Pq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0844Pq extends LinearLayout {
    public static final int A00 = (int) (C0739Lm.A00 * 32.0f);
    public static final int A01 = (int) (C0739Lm.A00 * 8.0f);

    public C0844Pq(C1046Xo c1046Xo, NativeAd nativeAd, K6 k6, OQ oq, AdOptionsView adOptionsView) {
        super(c1046Xo);
        setOrientation(0);
        oq.setFullCircleCorners(true);
        int i2 = A00;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        layoutParams.setMargins(0, 0, A01, 0);
        addView(oq, layoutParams);
        TextView textView = new TextView(c1046Xo);
        k6.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        TextView textView2 = new TextView(c1046Xo);
        k6.A06(textView2);
        textView2.setMaxLines(1);
        textView2.setText(nativeAd.getSponsoredTranslation());
        LinearLayout linearLayout = new LinearLayout(c1046Xo);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 16;
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
        addView(linearLayout, layoutParams2);
        addView(adOptionsView, new LinearLayout.LayoutParams(-2, -2));
    }
}
