package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class OM implements View.OnClickListener {
    public final /* synthetic */ OO A00;

    public OM(OO oo) {
        this.A00 = oo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.A04();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
