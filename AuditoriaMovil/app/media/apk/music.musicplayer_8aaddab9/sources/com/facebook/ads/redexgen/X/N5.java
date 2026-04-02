package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class N5 implements View.OnClickListener {
    public final /* synthetic */ TC A00;

    public N5(TC tc) {
        this.A00 = tc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        N7 n7;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            n7 = this.A00.A05;
            n7.AAm();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
