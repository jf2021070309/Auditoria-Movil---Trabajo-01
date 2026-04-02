package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class NE implements View.OnClickListener {
    public final /* synthetic */ NG A00;

    public NE(NG ng) {
        this.A00 = ng;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NJ nj;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            nj = this.A00.A04;
            nj.A8k();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
