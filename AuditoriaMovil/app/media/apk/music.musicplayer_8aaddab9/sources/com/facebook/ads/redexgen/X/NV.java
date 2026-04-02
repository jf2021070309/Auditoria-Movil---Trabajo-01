package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class NV implements View.OnClickListener {
    public final /* synthetic */ C2H A00;
    public final /* synthetic */ NL A01;
    public final /* synthetic */ T7 A02;

    public NV(T7 t7, NL nl, C2H c2h) {
        this.A02 = t7;
        this.A01 = nl;
        this.A00 = c2h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.ABc(this.A00);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
