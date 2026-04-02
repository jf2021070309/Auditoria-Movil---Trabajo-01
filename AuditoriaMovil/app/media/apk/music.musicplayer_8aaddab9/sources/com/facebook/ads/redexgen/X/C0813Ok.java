package com.facebook.ads.redexgen.X;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;
/* renamed from: com.facebook.ads.redexgen.X.Ok  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0813Ok extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final View$OnClickListenerC0923Sr A02;
    public final C0806Od A03;
    public static final int A06 = (int) (C0739Lm.A00 * 36.0f);
    public static final int A07 = (int) (C0739Lm.A00 * 36.0f);
    public static final int A04 = (int) (C0739Lm.A00 * 23.0f);
    public static final int A05 = (int) (C0739Lm.A00 * 3.0f);
    public static final int A08 = (int) (C0739Lm.A00 * 4.0f);

    public C0813Ok(C0806Od c0806Od, String str, C1K c1k, OG og) {
        super(c0806Od.A05());
        this.A03 = c0806Od;
        this.A00 = c1k.A08(true);
        this.A01 = new RelativeLayout(c0806Od.A05());
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(str);
        this.A02 = new View$OnClickListenerC0923Sr(c0806Od.A05(), c0806Od.A04().A0S(), null, c0806Od.A06(), c0806Od.A09(), c0806Od.A0B(), c0806Od.A07());
        this.A02.setCta(c0806Od.A04().A0N().A0F(), c0806Od.A04().A0T(), new HashMap(), og);
        this.A02.setIsInAppBrowser(true);
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(View view) {
        ImageView imageView = new ImageView(this.A03.A05());
        imageView.setImageBitmap(MU.A01(MT.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i2 = A04;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        int i3 = A05;
        imageView.setPadding(i3, i3, i3, i3);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(String str) {
        Button button = new Button(this.A03.A05());
        ML.A0K(button);
        int i2 = A07;
        button.setPadding(i2, 0, i2, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        ML.A0O(button, this.A00, A08);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, A06);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.A01.addView(button, layoutParams);
        A00(button);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }
}
