package com.facebook.ads.redexgen.X;

import android.view.Surface;
/* loaded from: assets/audience_network.dex */
public class JJ implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ JL A01;

    public JJ(JL jl, Surface surface) {
        this.A01 = jl;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JM jm;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            jm = this.A01.A01;
            jm.AC4(this.A00);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
