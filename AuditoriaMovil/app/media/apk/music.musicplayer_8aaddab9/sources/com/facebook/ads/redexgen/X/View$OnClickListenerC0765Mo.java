package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
/* renamed from: com.facebook.ads.redexgen.X.Mo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0765Mo implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public View$OnClickListenerC0765Mo(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0759Mi interfaceC0759Mi;
        N4 n4;
        InterfaceC0759Mi interfaceC0759Mi2;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            interfaceC0759Mi = this.A00.A00;
            if (interfaceC0759Mi != null) {
                n4 = this.A00.A05;
                if (n4.A03()) {
                    interfaceC0759Mi2 = this.A00.A00;
                    interfaceC0759Mi2.AAI();
                }
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
