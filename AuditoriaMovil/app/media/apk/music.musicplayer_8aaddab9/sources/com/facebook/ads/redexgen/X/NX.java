package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class NX implements View.OnClickListener {
    public final /* synthetic */ NZ A00;

    public NX(NZ nz) {
        this.A00 = nz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NJ nj;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            nj = this.A00.A02;
            nj.A7s();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
