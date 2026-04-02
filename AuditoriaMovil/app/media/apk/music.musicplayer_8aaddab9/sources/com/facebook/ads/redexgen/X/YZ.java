package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
/* loaded from: assets/audience_network.dex */
public class YZ implements InterfaceC03956v {
    public final /* synthetic */ YY A00;

    public YZ(YY yy) {
        this.A00 = yy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        return this.A00.A03(((float) SystemClock.uptimeMillis()) / 1000.0f);
    }
}
