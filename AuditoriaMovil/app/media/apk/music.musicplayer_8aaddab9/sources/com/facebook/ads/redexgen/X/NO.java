package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class NO implements View.OnClickListener {
    public final /* synthetic */ T8 A00;

    public NO(T8 t8) {
        this.A00 = t8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.ABT(C2F.A05);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
