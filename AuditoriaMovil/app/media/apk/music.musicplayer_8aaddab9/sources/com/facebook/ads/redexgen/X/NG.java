package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
/* loaded from: assets/audience_network.dex */
public final class NG extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C2D A02;
    public final C1046Xo A03;
    public final NJ A04;
    public final boolean A05;
    public static final int A09 = (int) (C0739Lm.A00 * 16.0f);
    public static final int A0A = (int) (C0739Lm.A00 * 8.0f);
    public static final int A0D = (int) (C0739Lm.A00 * 44.0f);
    public static final int A08 = (int) (C0739Lm.A00 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (C0739Lm.A00 * 75.0f);
    public static final int A0B = (int) (C0739Lm.A00 * 25.0f);
    public static final int A0F = (int) (C0739Lm.A00 * 45.0f);
    public static final int A0C = (int) (C0739Lm.A00 * 15.0f);
    public static final int A06 = (int) (C0739Lm.A00 * 16.0f);

    public NG(NF nf) {
        super(NF.A01(nf));
        this.A03 = NF.A01(nf);
        this.A02 = C2E.A00(this.A03.A00());
        this.A04 = NF.A03(nf);
        this.A01 = NF.A09(nf) ? A0E : A0F;
        this.A00 = NF.A09(nf) ? A0B : A0C;
        this.A05 = NF.A0A(nf);
        setFocusable(true);
        View A01 = A01(nf);
        View A00 = A00(nf);
        View footerView = getFooterView();
        ML.A0K(A01);
        ML.A0K(A00);
        ML.A0K(footerView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        layoutParams2.addRule(3, A01.getId());
        layoutParams2.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12);
        int i2 = A09;
        layoutParams3.setMargins(i2, 0, i2, i2);
        addView(A01, layoutParams);
        addView(A00, layoutParams2);
        addView(footerView, layoutParams3);
        footerView.setVisibility(NF.A0B(nf) ? 0 : 8);
    }

    public /* synthetic */ NG(NF nf, ND nd) {
        this(nf);
    }

    private View A00(NF nf) {
        ImageView imageView = new ImageView(getContext());
        int i2 = this.A00;
        imageView.setPadding(i2, i2, i2, i2);
        imageView.setImageBitmap(MU.A01(NF.A02(nf)));
        imageView.setColorFilter(-1);
        int i3 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(NF.A00(nf));
        ML.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i4 = A09;
        layoutParams.setMargins(i4, 0, i4, i4);
        TextView textView = new TextView(getContext());
        ML.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(NF.A04(nf));
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i5 = A09;
        layoutParams2.setMargins(i5, 0, i5, i5);
        TextView textView2 = new TextView(getContext());
        ML.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(NF.A05(nf));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int i6 = A09;
        layoutParams3.setMargins(i6, 0, i6, i6);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        if (NF.A08(nf)) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(NF.A06(nf))) {
                OQ oq = new OQ(this.A03);
                int i7 = A0F;
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i7, i7);
                layoutParams4.setMargins(0, 0, A0A, 0);
                oq.setFullCircleCorners(true);
                AsyncTaskC0925St asyncTaskC0925St = new AsyncTaskC0925St(oq, this.A03);
                int i8 = A0F;
                asyncTaskC0925St.A05(i8, i8).A07(NF.A06(nf));
                linearLayout2.addView(oq, layoutParams4);
            }
            NL nl = new NL(this.A03);
            nl.setData(NF.A07(nf), MT.CHECKMARK);
            nl.setSelected(true);
            LinearLayout.LayoutParams selectedOptionParams = new LinearLayout.LayoutParams(-2, -2);
            linearLayout2.addView(nl, selectedOptionParams);
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(NF nf) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (NF.A0C(nf)) {
            ImageView imageView = new ImageView(getContext());
            int i2 = A08;
            imageView.setPadding(i2, i2, i2, i2);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(MU.A01(MT.CROSS));
            imageView.setOnClickListener(new ND(this));
            int i3 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
            int i4 = A07;
            layoutParams.setMargins(i4, i4, i4, i4);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(MU.A01(MT.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i2 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        ML.A0X(textView, false, 16);
        textView.setTextColor(-13272859);
        int i3 = A0A;
        textView.setPadding(i3, i3, i3, i3);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new NE(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}
