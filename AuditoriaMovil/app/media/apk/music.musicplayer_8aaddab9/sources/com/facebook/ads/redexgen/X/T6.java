package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class T6 extends NH {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2D A03;
    public final C1046Xo A04;

    public static String A0B(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{53, 22, 20, 28, 105, 70, 69, 89, 79, 10, 107, 78, 10, 120, 79, 90, 69, 88, 94, 67, 68, 77};
    }

    static {
        A0C();
        A08 = (int) (C0739Lm.A00 * 8.0f);
        A07 = (int) (C0739Lm.A00 * 10.0f);
        A06 = (int) (C0739Lm.A00 * 44.0f);
    }

    public T6(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, String str) {
        super(c1046Xo, interfaceC0684Jg, str);
        this.A04 = c1046Xo;
        this.A03 = C2E.A00(this.A04.A00());
        this.A00 = new ImageView(getContext());
        ImageView imageView = this.A00;
        int i2 = A07;
        imageView.setPadding(i2, i2, i2, i2);
        this.A00.setColorFilter(-10459280);
        int i3 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        ML.A0M(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        LinearLayout linearLayout = this.A01;
        int i4 = A08;
        linearLayout.setPadding(i4, i4, i4, i4);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void A0L() {
        this.A00.setImageBitmap(MU.A01(MT.CROSS));
        this.A00.setOnClickListener(new View$OnClickListenerC0777Na(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        NL nl = new NL(this.A04);
        nl.setData(this.A03.A0H(), MT.HIDE_AD);
        nl.setOnClickListener(new View$OnClickListenerC0778Nb(this, nl));
        NL nl2 = new NL(this.A04);
        nl2.setData(this.A03.A0L(), MT.REPORT_AD);
        nl2.setOnClickListener(new View$OnClickListenerC0779Nc(this, nl2));
        NL nl3 = new NL(this.A04);
        nl3.setData(this.A03.A0M(), MT.AD_CHOICES_ICON);
        nl3.setOnClickListener(new View$OnClickListenerC0780Nd(this, nl3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i2 = A08;
        layoutParams.setMargins(i2, i2, i2, i2);
        layoutParams.gravity = 17;
        LinearLayout menuLayout = new LinearLayout(getContext());
        menuLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, 0);
        layoutParams2.gravity = 17;
        layoutParams2.weight = 1.0f;
        ML.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(menuLayout, layoutParams2);
        menuLayout.addView(nl, layoutParams);
        menuLayout.addView(nl2, layoutParams);
        menuLayout.addView(nl3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void A0M() {
        ML.A0I(this);
        ML.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void A0N(C2H c2h, C2F c2f) {
        String A0H;
        MT mt;
        int i2;
        this.A00.setOnClickListener(null);
        if (c2f == C2F.A05) {
            A0H = this.A03.A0F();
            mt = MT.REPORT_AD;
            i2 = -552389;
        } else {
            A0H = this.A03.A0H();
            mt = MT.HIDE_AD;
            i2 = -13272859;
        }
        NG A0M = new NF(this.A04, this.A0B).A0I(A0H).A0H(this.A03.A0D()).A0F(c2h.A04()).A0K(false).A0E(mt).A0D(i2).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        ML.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(A0M, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void A0O(C2H c2h, C2F c2f) {
        NZ nz = new NZ(this.A04, c2h, this.A0B, c2f == C2F.A05 ? MT.REPORT_AD : MT.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(MU.A01(MT.BACK_ARROW));
        this.A00.setOnClickListener(new View$OnClickListenerC0781Ne(this));
        this.A00.setContentDescription(A0B(0, 4, 64));
        ML.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(nz, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final boolean A0P() {
        return true;
    }
}
