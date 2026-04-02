package com.facebook.ads.redexgen.X;

import android.telephony.TelephonyManager;
/* loaded from: assets/audience_network.dex */
public class YM implements InterfaceC03956v {
    public static String[] A01 = {"Vo88lINS9S2N5LbTaKf1W2kwN6BIQQdD", "UoAdPktVrqtin724LV50L5", "LFaB2DLRyLVTAupR8IDTAiu1ygiAQNei", "sJjAsr1DYzEdJFVxSj", "YixUmkecZHZtQTXRs3SEpcqVtXLRAsNc", "NCQvJXIWgGsA6V8X34C", "SF2vY0k52k3yZQV1rBM1cg", "e4uMFN1tyFqCHoW3Lf"};
    public final /* synthetic */ YH A00;

    public YM(YH yh) {
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
            return yh.A08(telephonyManager2.getNetworkOperator());
        }
        YH yh2 = this.A00;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A01[5] = "y3WpFIrw6SINDCFjG4EXd7NBg48ZDa";
        return yh2.A07(AnonymousClass76.A07);
    }
}
