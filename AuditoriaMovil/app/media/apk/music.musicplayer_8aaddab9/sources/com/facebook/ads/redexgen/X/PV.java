package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class PV implements View.OnClickListener {
    public final /* synthetic */ PW A00;

    public PV(PW pw) {
        this.A00 = pw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C03896p c03896p;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            c03896p = this.A00.A04;
            c03896p.performClick();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
