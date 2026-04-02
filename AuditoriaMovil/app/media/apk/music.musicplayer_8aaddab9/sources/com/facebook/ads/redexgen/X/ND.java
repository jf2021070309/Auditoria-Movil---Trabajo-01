package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class ND implements View.OnClickListener {
    public final /* synthetic */ NG A00;

    public ND(NG ng) {
        this.A00 = ng;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        NJ nj;
        NJ nj2;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                nj2 = this.A00.A04;
                nj2.A41();
                return;
            }
            nj = this.A00.A04;
            nj.A42();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
