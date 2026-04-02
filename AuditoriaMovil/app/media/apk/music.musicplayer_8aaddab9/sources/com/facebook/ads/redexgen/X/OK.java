package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.Button;
import java.util.Locale;
/* loaded from: assets/audience_network.dex */
public class OK extends Button {
    public static final int A0A = (int) (C0739Lm.A00 * 16.0f);
    public static final int A0B = (int) (C0739Lm.A00 * 4.0f);
    public int A00;
    public int A01;
    public C1K A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final int A07;
    public final Runnable A08;
    public final Runnable A09;

    public OK(C1046Xo c1046Xo, C1K c1k) {
        super(c1046Xo);
        this.A03 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = true;
        this.A05 = false;
        this.A08 = new C0922Sq(this);
        this.A09 = new C0921Sp(this);
        this.A02 = c1k;
        this.A07 = JQ.A03(c1046Xo);
        this.A06 = JQ.A00(c1046Xo);
        ML.A0X(this, false, 16);
        setGravity(17);
        A03();
    }

    private void A03() {
        C1K c1k = this.A02;
        if (c1k != null) {
            this.A00 = c1k.A08(this.A05);
            this.A01 = this.A02.A09(this.A05);
        }
        ML.A0O(this, this.A00, this.A04 ? A0B : 0);
        setTextColor(this.A01);
    }

    private void A04() {
        if (this.A07 < 0 || this.A03) {
            return;
        }
        this.A03 = true;
        if (JQ.A1l(getContext()) && Build.VERSION.SDK_INT >= 16) {
            postDelayed(this.A08, this.A07);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A04();
    }

    public void setRoundedCornersEnabled(boolean z) {
        this.A04 = z;
        A03();
    }

    public void setText(String str) {
        super.setText((CharSequence) str.toUpperCase(Locale.US));
    }

    public void setUpButtonColors(C1K c1k) {
        this.A02 = c1k;
        A03();
    }

    public void setViewShowsOverMedia(boolean z) {
        this.A05 = z;
        A03();
    }
}
