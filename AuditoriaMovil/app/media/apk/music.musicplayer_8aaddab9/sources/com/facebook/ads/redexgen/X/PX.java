package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class PX implements View.OnClickListener {
    public final /* synthetic */ C0828Pa A00;

    public PX(C0828Pa c0828Pa) {
        this.A00 = c0828Pa;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PZ pz;
        PY py;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            pz = this.A00.A02;
            py = this.A00.A01;
            pz.ACQ(py);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
