package com.facebook.ads.redexgen.X;

import android.view.View;
/* loaded from: assets/audience_network.dex */
public class QE implements View.OnClickListener {
    public final /* synthetic */ C0690Jm A00;

    public QE(C0690Jm c0690Jm) {
        this.A00 = c0690Jm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0692Jo c0692Jo;
        C1046Xo c1046Xo;
        Q8 q8;
        boolean A07;
        Q8 q82;
        Q8 q83;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            c0692Jo = this.A00.A03;
            c0692Jo.A02(EnumC0691Jn.A0b, null);
            c1046Xo = this.A00.A02;
            c1046Xo.A0D().A2y();
            q8 = this.A00.A00;
            if (q8 != null) {
                A07 = this.A00.A07();
                if (A07) {
                    q83 = this.A00.A00;
                    q83.setVolume(1.0f);
                } else {
                    q82 = this.A00.A00;
                    q82.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
