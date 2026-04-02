package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
/* loaded from: assets/audience_network.dex */
public class YC implements InterfaceC03956v {
    public final /* synthetic */ Y8 A00;

    public YC(Y8 y8) {
        this.A00 = y8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        return this.A00.A06(C7J.A02(TrafficStats.getMobileRxBytes()));
    }
}
