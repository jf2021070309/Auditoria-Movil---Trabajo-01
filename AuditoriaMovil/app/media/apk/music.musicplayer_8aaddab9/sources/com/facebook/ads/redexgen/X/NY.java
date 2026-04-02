package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class NY implements View.OnClickListener {
    public final /* synthetic */ C2H A00;
    public final /* synthetic */ NL A01;
    public final /* synthetic */ NZ A02;

    public NY(NZ nz, NL nl, C2H c2h) {
        this.A02 = nz;
        this.A01 = nl;
        this.A00 = c2h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NJ nj;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            nj = this.A02.A02;
            nj.ABc(this.A00);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
