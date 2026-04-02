package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Mv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0772Mv implements View.OnClickListener {
    public final /* synthetic */ TE A00;

    public View$OnClickListenerC0772Mv(TE te) {
        this.A00 = te;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.A0X(false);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
