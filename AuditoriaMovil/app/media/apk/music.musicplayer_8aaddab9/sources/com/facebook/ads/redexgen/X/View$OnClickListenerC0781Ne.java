package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Ne  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0781Ne implements View.OnClickListener {
    public final /* synthetic */ T6 A00;

    public View$OnClickListenerC0781Ne(T6 t6) {
        this.A00 = t6;
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
