package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
/* loaded from: assets/audience_network.dex */
public final class T8 extends NH {
    public static final int A03 = (int) (C0739Lm.A00 * 8.0f);
    public final RelativeLayout A00;
    public final C2D A01;
    public final C1046Xo A02;

    public T8(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, String str, C1U c1u, InterfaceC0762Ml interfaceC0762Ml, InterfaceC0761Mk interfaceC0761Mk) {
        super(c1046Xo, interfaceC0684Jg, str, c1u, interfaceC0762Ml, interfaceC0761Mk);
        this.A02 = c1046Xo;
        this.A01 = C2E.A00(c1046Xo.A00());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        ML.A0M(this.A00, -1728053248);
        this.A00.setOnClickListener(new NM(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            ML.A0V(this, transitionSet);
            return;
        }
        ML.A0T(this);
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void A0L() {
        C2H reportingReason = this.A01.A0A();
        NW adChoicesView = new NW(this.A02);
        adChoicesView.setInfo(MT.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        adChoicesView.setOnClickListener(new NN(this));
        C2H A0B = this.A01.A0B();
        NW nw = new NW(this.A02);
        nw.setInfo(MT.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        nw.setOnClickListener(new NO(this));
        NW nw2 = new NW(this.A02);
        nw2.setInfo(MT.AD_CHOICES_ICON, this.A01.A0M(), "");
        nw2.setOnClickListener(new NP(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i2 = A03;
        linearLayout.setPadding(i2 * 2, i2, i2 * 2, i2);
        ML.A0M(linearLayout, -1);
        if (!reportingReason.A05().isEmpty()) {
            linearLayout.addView(adChoicesView, layoutParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(nw, layoutParams);
        }
        linearLayout.addView(nw2, layoutParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void A0M() {
        ML.A0I(this);
        this.A00.removeAllViews();
        ML.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void A0N(C2H c2h, C2F c2f) {
        String A0E;
        int i2;
        if (c2f == C2F.A04) {
            return;
        }
        boolean z = c2f == C2F.A05;
        NF nf = new NF(this.A02, this.A0B);
        if (z) {
            A0E = this.A01.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        NF A0E2 = nf.A0I(A0E).A0H(this.A01.A0D()).A0F(c2h.A04()).A0E(z ? MT.REPORT_AD : MT.HIDE_AD);
        if (z) {
            i2 = -552389;
        } else {
            i2 = -13272859;
        }
        NG A0M = A0E2.A0D(i2).A0G(this.A0A != null ? this.A0A.A01() : "").A0M();
        ML.A0M(A0M, -1);
        ML.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(A0M, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final void A0O(C2H c2h, C2F c2f) {
        String A0H;
        boolean z = c2f == C2F.A05;
        C1046Xo c1046Xo = this.A02;
        NJ nj = this.A0B;
        if (z) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        NZ nz = new NZ(c1046Xo, c2h, nj, A0H, z ? MT.REPORT_AD : MT.HIDE_AD);
        nz.setClickable(true);
        ML.A0M(nz, -1);
        int i2 = A03;
        nz.setPadding(i2 * 2, i2, i2 * 2, i2);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(nz, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.NH
    public final boolean A0P() {
        return false;
    }
}
