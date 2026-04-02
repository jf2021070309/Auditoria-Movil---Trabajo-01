package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Mh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0758Mh extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C2D A02;
    public final C1046Xo A03;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{118, 83};
    }

    static {
        A03();
        A08 = (int) (C0739Lm.A00 * 50.0f);
        A05 = (int) (C0739Lm.A00 * 10.0f);
        A06 = (int) (C0739Lm.A00 * 20.0f);
        A09 = (int) (C0739Lm.A00 * 4.0f);
        A07 = (int) (C0739Lm.A00 * 12.0f);
    }

    public C0758Mh(C1046Xo c1046Xo, int i2) {
        super(c1046Xo);
        this.A03 = c1046Xo;
        this.A02 = C2E.A00(c1046Xo.A00());
        setOrientation(0);
        this.A00 = new ImageView(c1046Xo);
        this.A01 = new ImageView(c1046Xo);
        A04(i2);
    }

    private void A04(int i2) {
        MT mt;
        A05(this.A00, MT.AD_CHOICES_ICON);
        if (i2 == 2) {
            int i3 = A05;
            setPadding(i3, i3 / 3, i3, i3 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 108));
            textView.setTextColor(-1);
            int i4 = A05;
            textView.setPadding(0, i4 / 2, i4 / 2, i4 / 2);
            ML.A0X(textView, true, 13);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            addView(textView, layoutParams);
            int i5 = A07;
            LinearLayout.LayoutParams adChoicesIconParams = new LinearLayout.LayoutParams(i5, i5);
            adChoicesIconParams.gravity = 16;
            addView(this.A00, adChoicesIconParams);
            return;
        }
        int i6 = A05;
        setPadding(i6, i6, i6, i6);
        if (i2 == 1) {
            mt = MT.AN_INFO_ICON;
        } else {
            mt = MT.DEFAULT_INFO_ICON;
        }
        A05(this.A01, mt);
        int i7 = A06;
        LinearLayout.LayoutParams infoButtonParams = new LinearLayout.LayoutParams(i7, i7);
        infoButtonParams.gravity = 17;
        addView(this.A01, infoButtonParams);
        int i8 = A06;
        LinearLayout.LayoutParams infoButtonParams2 = new LinearLayout.LayoutParams(i8, i8);
        infoButtonParams2.setMargins(A09, 0, 0, 0);
        infoButtonParams2.gravity = 17;
        addView(this.A00, infoButtonParams2);
    }

    public static void A05(ImageView imageView, MT mt) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(MU.A01(mt));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C1U c1u, String str, C0692Jo c0692Jo, InterfaceC0761Mk interfaceC0761Mk) {
        setOnClickListener(new View$OnClickListenerC0757Mg(this, c0692Jo, interfaceC0761Mk, str, c1u));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i2);
        ML.A0S(this, gradientDrawable);
    }

    public void setIconColors(int i2) {
        this.A00.setColorFilter(i2);
        this.A01.setColorFilter(i2);
    }
}
