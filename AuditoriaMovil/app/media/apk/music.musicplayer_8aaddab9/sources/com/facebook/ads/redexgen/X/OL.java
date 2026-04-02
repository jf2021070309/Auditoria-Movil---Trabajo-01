package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class OL implements View.OnClickListener {
    public final /* synthetic */ OO A00;

    public OL(OO oo) {
        this.A00 = oo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ON on;
        View v;
        View[] viewArr;
        Q8 q8;
        Q8 q82;
        Q8 q83;
        View v2;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            on = this.A00.A04;
            on.ABM();
            v = this.A00.A00;
            if (v != null) {
                v2 = this.A00.A00;
                ML.A0L(v2);
            }
            viewArr = this.A00.A06;
            for (View v3 : viewArr) {
                ML.A0N(v3, 0);
            }
            ML.A0J(this.A00);
            q8 = this.A00.A05;
            if (q8 == null) {
                return;
            }
            q82 = this.A00.A05;
            ML.A0N(q82, 0);
            q83 = this.A00.A05;
            q83.A0b(EnumC0853Pz.A02, 14);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
