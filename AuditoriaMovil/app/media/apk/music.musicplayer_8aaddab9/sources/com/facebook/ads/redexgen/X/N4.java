package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: assets/audience_network.dex */
public final class N4 extends LinearLayout {
    public static final int A06 = (int) (C0739Lm.A00 * 10.0f);
    public static final int A07 = (int) (C0739Lm.A00 * 44.0f);
    public int A00;
    public boolean A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final TextView A04;
    public final OJ A05;

    public N4(C1046Xo c1046Xo, int i2) {
        super(c1046Xo);
        this.A01 = false;
        this.A02 = new ImageView(c1046Xo);
        ImageView imageView = this.A02;
        int i3 = A06;
        imageView.setPadding(i3, i3, i3, i3);
        this.A05 = new OJ(c1046Xo);
        this.A05.setProgress(0.0f);
        OJ oj = this.A05;
        int i4 = A06;
        oj.setPadding(i4, i4, i4, i4);
        this.A04 = new TextView(c1046Xo);
        setOrientation(0);
        this.A03 = new LinearLayout(c1046Xo);
        this.A00 = i2;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        LinearLayout.LayoutParams actionIconParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i2 = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        ML.A0X(this.A04, true, 16);
        this.A04.setTextColor(-1);
        this.A04.setVisibility(8);
        this.A03.addView(this.A02, layoutParams);
        this.A03.addView(this.A05, layoutParams);
        addView(this.A03, actionIconParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        addView(this.A04, layoutParams2);
    }

    private void A01() {
        int i2;
        OJ oj = this.A05;
        if (this.A00 == 2) {
            i2 = this.A01 ? 4 : 0;
        } else {
            i2 = 8;
        }
        oj.setVisibility(i2);
        this.A02.setVisibility(this.A00 == 2 ? 8 : 0);
    }

    public final boolean A02() {
        return !this.A04.getText().toString().isEmpty();
    }

    public final boolean A03() {
        int i2 = this.A00;
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setColors(int i2) {
        this.A05.A02(C2U.A01(i2, 77), i2);
        this.A02.setColorFilter(i2);
    }

    public void setInitialUnskippableSeconds(int i2) {
        if (i2 > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f2) {
        this.A05.setProgressWithAnimation(f2);
    }

    public void setProgressSpinnerInvisible(boolean z) {
        this.A01 = z;
        A01();
    }

    public void setToolbarActionMode(int i2) {
        MT mt;
        this.A00 = i2;
        A01();
        setVisibility(0);
        if (i2 == 0) {
            mt = MT.CROSS;
        } else if (i2 == 1) {
            mt = MT.SKIP_ARROW;
        } else if (i2 == 3) {
            mt = MT.MINIMIZE_ARROW;
        } else if (i2 != 4) {
            mt = MT.CROSS;
        } else {
            mt = MT.CROSS;
            this.A02.setVisibility(8);
            setVisibility(8);
        }
        this.A02.setImageBitmap(MU.A01(mt));
        ML.A0G(1002, this.A02);
    }

    public void setToolbarMessage(String str) {
        this.A04.setText(str);
        this.A04.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z) {
        this.A04.setVisibility(z ? 0 : 4);
    }
}
