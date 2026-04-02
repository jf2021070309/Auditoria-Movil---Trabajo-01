package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class NT implements View.OnClickListener {
    public final /* synthetic */ NL A00;
    public final /* synthetic */ T7 A01;

    public NT(T7 t7, NL nl) {
        this.A01 = t7;
        this.A00 = nl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.A8l();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
