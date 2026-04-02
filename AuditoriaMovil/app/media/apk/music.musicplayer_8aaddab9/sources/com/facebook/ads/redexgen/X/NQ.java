package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class NQ implements View.OnClickListener {
    public final /* synthetic */ T7 A00;

    public NQ(T7 t7) {
        this.A00 = t7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A7s();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
