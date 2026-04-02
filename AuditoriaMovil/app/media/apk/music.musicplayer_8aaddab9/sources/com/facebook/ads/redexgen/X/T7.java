package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class T7 extends NH {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C2D A04;
    public final C1046Xo A05;

    public static String A0B(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{-57, -26, -24, -16, -92, -51, -48, -44, -58, -127, -94, -59, -127, -77, -58, -47, -48, -45, -43, -54, -49, -56};
    }

    static {
        A0C();
        A09 = (int) (C0739Lm.A00 * 4.0f);
        A08 = (int) (C0739Lm.A00 * 10.0f);
        A07 = (int) (C0739Lm.A00 * 44.0f);
    }

    public T7(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, String str) {
        super(c1046Xo, interfaceC0684Jg, str);
        this.A05 = c1046Xo;
        this.A04 = C2E.A00(c1046Xo.A00());
        this.A01 = new ImageView(getContext());
        ImageView imageView = this.A01;
        int i2 = A08;
        imageView.setPadding(i2, i2, i2, i2);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        int i3 = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        ML.A0M(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void A0L() {
        this.A01.setImageBitmap(MU.A01(MT.CROSS));
        this.A01.setOnClickListener(new NQ(this));
        this.A01.setContentDescription(A0B(4, 18, 89));
        NL nl = new NL(this.A05);
        nl.setData(this.A04.A0H(), MT.HIDE_AD);
        nl.setOnClickListener(new NR(this, nl));
        NL nl2 = new NL(this.A05);
        nl2.setData(this.A04.A0L(), MT.REPORT_AD);
        nl2.setOnClickListener(new NS(this, nl2));
        NL nl3 = new NL(this.A05);
        nl3.setData(this.A04.A0M(), MT.AD_CHOICES_ICON);
        nl3.setOnClickListener(new NT(this, nl3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A09;
        layoutParams.setMargins(0, i2, i2, i2);
        ML.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(nl, layoutParams);
        this.A02.addView(nl2, layoutParams);
        this.A02.addView(nl3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void A0M() {
        ML.A0I(this);
        ML.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void A0N(C2H c2h, C2F c2f) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        ML.A0X(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        ML.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void A0O(C2H c2h, C2F c2f) {
        ML.A0T(this.A03);
        this.A01.setImageBitmap(MU.A01(MT.BACK_ARROW));
        this.A01.setOnClickListener(new NU(this));
        this.A01.setContentDescription(A0B(0, 4, 125));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A09;
        layoutParams.setMargins(0, i2, i2, i2);
        for (C2H c2h2 : c2h.A05()) {
            NL nl = new NL(this.A05);
            nl.setData(c2h2.A04(), null);
            nl.setOnClickListener(new NV(this, nl, c2h2));
            this.A02.addView(nl, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final boolean A0P() {
        return true;
    }
}
