package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;
/* loaded from: assets/audience_network.dex */
public class YR implements InterfaceC03956v {
    public static String[] A01 = {"xn6Y4xiAj5nTE1ZX0fcI9", "IuzZJNTC9Fpz", "Zp9uFgGuFlryeSNHyo4T0p", "eRJH2gjtevDtLFu1wMxFEv", "pTKacr9NdWTXHSX", "3c0ViuxMUKEAC", "2WDSEnCYP4spNEJs", "S3q5Kz3J"};
    public final /* synthetic */ YH A00;

    public YR(YH yh) {
        this.A00 = yh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        if (Build.VERSION.SDK_INT >= 26) {
            telephonyManager = this.A00.A00;
            if (telephonyManager != null) {
                YH yh = this.A00;
                telephonyManager2 = yh.A00;
                return yh.A0F(telephonyManager2.isDataEnabled());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        YH yh2 = this.A00;
        String[] strArr = A01;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "x95Rh7kgyGSfBF3YHwpGzi";
        strArr2[3] = "73CHLU13D6YvD39ECjSAyL";
        return yh2.A07(AnonymousClass76.A05);
    }
}
