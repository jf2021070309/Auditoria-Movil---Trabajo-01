package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;
/* renamed from: com.facebook.ads.redexgen.X.Ri  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0888Ri extends LinearLayout implements InterfaceC0843Pp {
    public final NativeBannerAd A00;
    public final C1046Xo A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (C0739Lm.A00 * 42.0f);
    public static final int A03 = (int) (C0739Lm.A00 * 48.0f);
    public static final int A05 = (int) (C0739Lm.A00 * 54.0f);
    public static final int A07 = (int) (C0739Lm.A00 * 4.0f);
    public static final int A06 = (int) (C0739Lm.A00 * 8.0f);

    public C0888Ri(C1046Xo c1046Xo, NativeBannerAd nativeBannerAd, K6 k6, K7 k7, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c1046Xo);
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c1046Xo;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(k7);
        OR or = new OR(this.A01);
        or.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A00, A00);
        layoutParams3.gravity = 16;
        or.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(or, layoutParams3);
        C0840Pm c0840Pm = new C0840Pm(c1046Xo, this.A00, k7, k6, adOptionsView);
        c0840Pm.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.gravity = 16;
        linearLayout.addView(c0840Pm, layoutParams4);
        if (k7 == K7.A0A) {
            int iconSize = A07;
            setPadding(iconSize, iconSize, iconSize, iconSize);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            int iconSize2 = A06;
            setPadding(iconSize2, iconSize2, iconSize2, iconSize2);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        int i2 = A06;
        int iconSize3 = A07;
        textView.setPadding(i2, iconSize3, i2, iconSize3);
        k6.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, layoutParams2);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(K7 k7) {
        int i2 = C0841Pn.A00[k7.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return A05;
            }
            return A03;
        }
        return A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0843Pp
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0843Pp
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0843Pp
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
