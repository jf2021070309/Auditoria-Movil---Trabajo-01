package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;
import android.os.Build;
/* renamed from: com.facebook.ads.redexgen.X.aW  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1142aW implements InterfaceC03956v {
    public static String[] A01 = {"pBrDaZa5X5LjOgDS06qrKfvSDyGe8efw", "mQEhYUIy596kL", "EIforD6eBYb22Ex4JOKq", "k4SBaaSc1moa84J0CFgFz3nqLP2HVqmu", "u8nSh4T3SaBZfkGp86pLE93qaiXMklcf", "jMwuEx2OfYupc0", "IfOhRtB8SPti74hSuqBgnsqawc0MdhYN", "25E6wEyieKrSwG"};
    public final /* synthetic */ C1134aO A00;

    public C1142aW(C1134aO c1134aO) {
        this.A00 = c1134aO;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        ApplicationInfo applicationInfo3;
        if (Build.VERSION.SDK_INT >= 4) {
            applicationInfo = this.A00.A01;
            if (applicationInfo != null) {
                C1134aO c1134aO = this.A00;
                String[] strArr = A01;
                if (strArr[3].charAt(9) != strArr[6].charAt(9)) {
                    String[] strArr2 = A01;
                    strArr2[7] = "fRLqK3UXRIvALx";
                    strArr2[5] = "beY33YfNkspfTw";
                    applicationInfo3 = c1134aO.A01;
                    return c1134aO.A04(applicationInfo3.targetSdkVersion);
                }
                A01[4] = "qWUfrjWL8adA9tG6bFG21ciodwCrSrmB";
                applicationInfo2 = c1134aO.A01;
                return c1134aO.A04(applicationInfo2.targetSdkVersion);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        C1134aO c1134aO2 = this.A00;
        String[] strArr3 = A01;
        if (strArr3[7].length() != strArr3[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A01;
        strArr4[7] = "5uTBAcIF1H8x94";
        strArr4[5] = "w8sP31VUPTTap4";
        return c1134aO2.A07(AnonymousClass76.A05);
    }
}
