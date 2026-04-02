package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;
/* renamed from: com.facebook.ads.redexgen.X.Sq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0922Sq extends L7 {
    public final /* synthetic */ OK A00;

    public C0922Sq(OK ok) {
        this.A00 = ok;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    @RequiresApi(api = 16)
    public final void A06() {
        Runnable runnable;
        int i2;
        if (this.A00.isPressed()) {
            OK ok = this.A00;
            i2 = ok.A07;
            ok.postDelayed(this, i2);
            return;
        }
        this.A00.setPressed(true);
        OK ok2 = this.A00;
        runnable = ok2.A09;
        ok2.postOnAnimationDelayed(runnable, 250L);
    }
}
