package com.facebook.ads.redexgen.X;

import android.telephony.TelephonyManager;
/* loaded from: assets/audience_network.dex */
public class YU implements InterfaceC03956v {
    public static String[] A01 = {"1jYE18OinQfv5WLTq2cVBe585KmN", "X325BmovX2W2cAXv5JjOdne9uqamI6Ku", "itArcmOQ038W2qOxTmWDysJ", "YLO301mgb0CV", "8Iuh4U1kakUbsQ2Nn", "O3ZH7jI89PddtJoXg7iV4O6wtsqjtnrU", "1x9H6MAyleaM4oP8QSazbLvKby53Pv0n", "YmZygv2VfDGVkOFuuIE9CAITaRVNY9b1"};
    public final /* synthetic */ YH A00;

    public YU(YH yh) {
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
            String simCountryIso = telephonyManager2.getSimCountryIso();
            String[] strArr = A01;
            if (strArr[6].charAt(3) != strArr[5].charAt(3)) {
                throw new RuntimeException();
            }
            A01[2] = "tduom2IhCerqtA7iCB";
            return yh.A08(simCountryIso);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
