package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;
/* loaded from: assets/audience_network.dex */
public class YN implements InterfaceC03956v {
    public final /* synthetic */ YH A00;

    public YN(YH yh) {
        this.A00 = yh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        if (Build.VERSION.SDK_INT >= 23) {
            telephonyManager = this.A00.A00;
            if (telephonyManager != null) {
                YH yh = this.A00;
                telephonyManager2 = yh.A00;
                return yh.A04(telephonyManager2.getPhoneCount());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
