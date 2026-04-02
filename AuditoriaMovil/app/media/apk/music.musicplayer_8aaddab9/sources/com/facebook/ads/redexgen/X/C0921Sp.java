package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;
/* renamed from: com.facebook.ads.redexgen.X.Sp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0921Sp extends L7 {
    public final /* synthetic */ OK A00;

    public C0921Sp(OK ok) {
        this.A00 = ok;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    @RequiresApi(api = 16)
    public final void A06() {
        Runnable runnable;
        int i2;
        this.A00.setPressed(false);
        OK ok = this.A00;
        runnable = ok.A08;
        i2 = this.A00.A07;
        ok.postOnAnimationDelayed(runnable, i2);
    }
}
