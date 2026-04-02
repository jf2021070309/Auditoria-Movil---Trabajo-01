package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: assets/audience_network.dex */
public final class PT extends LinearLayout {
    public static final int A04 = (int) (C0739Lm.A00 * 32.0f);
    public static final int A05 = (int) (C0739Lm.A00 * 8.0f);
    public TextView A00;
    public TextView A01;
    public OQ A02;
    public final C1046Xo A03;

    public PT(C1046Xo c1046Xo) {
        super(c1046Xo);
        this.A03 = c1046Xo;
        A00(c1046Xo);
    }

    private final void A00(C1046Xo c1046Xo) {
        setGravity(16);
        this.A02 = new OQ(c1046Xo);
        this.A02.setFullCircleCorners(true);
        int i2 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.setMargins(0, 0, A05, 0);
        addView(this.A02, layoutParams);
        LinearLayout linearLayout = new LinearLayout(c1046Xo);
        linearLayout.setOrientation(1);
        this.A00 = new TextView(c1046Xo);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        ML.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c1046Xo);
        ML.A0X(this.A01, false, 14);
        linearLayout.addView(this.A00);
        linearLayout.addView(this.A01);
        addView(linearLayout, layoutParams2);
    }

    public final void A01(int i2, int i3) {
        this.A00.setTextColor(i2);
        this.A01.setTextColor(i3);
    }

    public void setPageDetails(C1U c1u) {
        AsyncTaskC0925St asyncTaskC0925St = new AsyncTaskC0925St(this.A02, this.A03);
        int i2 = A04;
        asyncTaskC0925St.A05(i2, i2);
        asyncTaskC0925St.A07(c1u.A01());
        this.A00.setText(c1u.A02());
        this.A01.setText(c1u.A03());
    }
}
