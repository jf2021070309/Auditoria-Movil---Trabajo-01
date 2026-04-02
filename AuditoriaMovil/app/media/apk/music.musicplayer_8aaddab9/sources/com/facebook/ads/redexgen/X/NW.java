package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: assets/audience_network.dex */
public final class NW extends LinearLayout {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public static final int A05 = (int) (C0739Lm.A00 * 8.0f);
    public static final int A06 = (int) (C0739Lm.A00 * 14.5d);
    public static final int A04 = (int) (C0739Lm.A00 * 20.0f);
    public static final LinearLayout.LayoutParams A03 = new LinearLayout.LayoutParams(-1, -2);

    public NW(C1046Xo c1046Xo) {
        super(c1046Xo);
        this.A00 = new ImageView(c1046Xo);
        this.A00.setColorFilter(-10459280);
        int i2 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        this.A00.setLayoutParams(layoutParams);
        this.A01 = new LinearLayout(c1046Xo);
        this.A01.setOrientation(1);
        this.A01.setPadding(A05 * 2, 0, 0, 0);
        this.A01.setLayoutParams(A03);
        this.A02 = new TextView(c1046Xo);
        ML.A0X(this.A02, true, 16);
        this.A02.setTextColor(-14934495);
        this.A01.addView(this.A02, A03);
        setOrientation(0);
        addView(this.A00);
        addView(this.A01);
    }

    public void setInfo(MT mt, String str, String str2) {
        this.A00.setImageBitmap(MU.A01(mt));
        this.A02.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = new TextView(getContext());
            ML.A0X(textView, false, 14);
            textView.setTextColor(-10459280);
            textView.setText(str2);
            this.A01.addView(textView, A03);
            int i2 = A05;
            setPadding(0, i2, 0, i2);
            return;
        }
        int i3 = A06;
        setPadding(0, i3, 0, i3);
    }
}
