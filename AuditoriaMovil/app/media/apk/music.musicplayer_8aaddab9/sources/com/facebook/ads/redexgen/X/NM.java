package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class NM implements View.OnClickListener {
    public final /* synthetic */ T8 A00;

    public NM(T8 t8) {
        this.A00 = t8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A42();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
