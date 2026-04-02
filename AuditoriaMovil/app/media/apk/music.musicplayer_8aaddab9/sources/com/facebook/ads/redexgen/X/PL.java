package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class PL extends LinearLayout {
    @Nullable
    public LinearLayout A00;
    public final int A01;
    public final C1046Xo A02;
    public final OQ A03;
    public final OW A04;
    public static final int A07 = (int) (C0739Lm.A00 * 16.0f);
    public static final int A08 = (int) (C0739Lm.A00 * 16.0f);
    public static final int A06 = (int) (C0739Lm.A00 * 8.0f);
    public static final int A05 = (int) (C0739Lm.A00 * 72.0f);

    public PL(PJ pj) {
        super(PJ.A04(pj));
        this.A02 = PJ.A04(pj);
        this.A03 = new OQ(this.A02);
        this.A04 = new OW(this.A02, PJ.A02(pj), true, false, true);
        this.A01 = PJ.A00(pj);
        A03(pj);
    }

    public /* synthetic */ PL(PJ pj, SA sa) {
        this(pj);
    }

    private void A00() {
        A01(this.A03, 150);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, 190);
        }
    }

    private void A01(View view, int i2) {
        view.setTranslationY(i2);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i2).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(PJ pj) {
        if (!TextUtils.isEmpty(PJ.A05(pj))) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            LinearLayout linearLayout = this.A00;
            int i2 = A08;
            linearLayout.setPadding(i2, i2 / 2, i2, i2 / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, A08 / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            ML.A0X(textView, false, 16);
            textView.setText(PJ.A05(pj));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new AsyncTaskC0925St(imageView, this.A02).A04().A07(PJ.A06(pj));
            int i3 = A07;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i3, i3);
            layoutParams3.setMargins(0, 0, A08 / 2, 0);
            this.A00.addView(imageView, layoutParams3);
            this.A00.addView(textView, layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(100.0f);
            gradientDrawable.setColor(469762047);
            ML.A0S(this.A00, gradientDrawable);
            addView(this.A00, layoutParams);
        }
    }

    private void A03(PJ pj) {
        ML.A0M(this.A03, 0);
        this.A03.setRadius(50);
        if (PJ.A01(pj).A00() == C1G.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        new AsyncTaskC0925St(this.A03, this.A02).A04().A07(PJ.A03(pj).A01());
        this.A04.A01(PJ.A01(pj).A06(), PJ.A03(pj).A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A08;
        layoutParams.setMargins(0, i2, 0, i2 / 2);
        View view = this.A03;
        int i3 = A05;
        addView(view, new LinearLayout.LayoutParams(i3, i3));
        addView(this.A04, layoutParams);
        A02(pj);
        ML.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(PK pk) {
        A00();
        postDelayed(new SA(this, pk), this.A01);
    }
}
