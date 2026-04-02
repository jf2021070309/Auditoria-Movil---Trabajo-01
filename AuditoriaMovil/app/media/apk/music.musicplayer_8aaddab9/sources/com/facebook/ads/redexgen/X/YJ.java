package com.facebook.ads.redexgen.X;

import android.telephony.TelephonyManager;
/* loaded from: assets/audience_network.dex */
public class YJ implements InterfaceC03956v {
    public final /* synthetic */ YH A00;

    public YJ(YH yh) {
        this.A00 = yh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        telephonyManager = this.A00.A00;
        if (telephonyManager != null) {
            YH yh = this.A00;
            telephonyManager2 = yh.A00;
            return yh.A08(telephonyManager2.getSimOperatorName());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
