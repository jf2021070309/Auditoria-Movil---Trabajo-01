package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Nh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0784Nh implements View.OnClickListener {
    public final /* synthetic */ C0789Nm A00;

    public View$OnClickListenerC0784Nh(C0789Nm c0789Nm) {
        this.A00 = c0789Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0788Nl interfaceC0788Nl;
        InterfaceC0788Nl interfaceC0788Nl2;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            interfaceC0788Nl = this.A00.A04;
            if (interfaceC0788Nl == null) {
                return;
            }
            interfaceC0788Nl2 = this.A00.A04;
            interfaceC0788Nl2.AAI();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
