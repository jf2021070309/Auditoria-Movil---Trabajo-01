package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;
/* loaded from: assets/audience_network.dex */
public class YP implements InterfaceC03956v {
    public static String[] A01 = {"YvgwWocx1FADdeAzbpsmJqKucTKVrLw8", "IN5yo6alVzQxSBDS0LSAMVLc9G2MRZFn", "HAZTu6IPNZsD1qj0M1i9utr9DJx5S0QZ", "N5cGJfQ0ESKW2WKzc5hPaTPWXOaKWBwf", "tNMXMhxZjOCLmtsXwerOChNpJkA4NIz8", "qe3nCZLHllYVPimtyVQbZz0eRg0vYsPF", "hksQgw", "nUQ4NN4k5WyfvhfMBfttwidjpDAXB5K7"};
    public final /* synthetic */ YH A00;

    public YP(YH yh) {
        this.A00 = yh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        TelephonyManager telephonyManager3;
        telephonyManager = this.A00.A00;
        if (telephonyManager == null) {
            return this.A00.A07(AnonymousClass76.A07);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            YH yh = this.A00;
            telephonyManager3 = yh.A00;
            return yh.A04(telephonyManager3.getVoiceNetworkType());
        }
        YH yh2 = this.A00;
        telephonyManager2 = yh2.A00;
        if (A01[2].charAt(0) != 'L') {
            A01[1] = "ynGeEoYIomGmDWEGPoJ89qRpE67tUZnz";
            return yh2.A04(telephonyManager2.getNetworkType());
        }
        throw new RuntimeException();
    }
}
