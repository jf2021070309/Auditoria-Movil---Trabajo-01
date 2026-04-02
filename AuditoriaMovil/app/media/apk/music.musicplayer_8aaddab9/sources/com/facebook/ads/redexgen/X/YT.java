package com.facebook.ads.redexgen.X;

import android.telephony.TelephonyManager;
/* loaded from: assets/audience_network.dex */
public class YT implements InterfaceC03956v {
    public static String[] A01 = {"z8dx8jcAs7HM5esb7c49HgQlCMJUD3t9", "Z27XjLV71jIj1KfRNg7i9pb54cjqos2V", "6E0WXe0HHFnnwQetVOp4LyZJXKm0EhYW", "5n0zxjSh5lrA6YdkKKdKdPto", "m3yiGl3d5h8kg9DGPr7qvl1tLoj9C1EY", "6Zd3QoWt03yEzQBhZFxcVO7q01Uelitn", "t47YK6eEHNb1t1eyBeM4t0RbN9Ph57Vj", "OvhOKFZHGYEQ5NA3UMfcxvSqe0D108CD"};
    public final /* synthetic */ YH A00;

    public YT(YH yh) {
        this.A00 = yh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        telephonyManager = this.A00.A00;
        if (telephonyManager != null) {
            YH yh = this.A00;
            if (A01[6].charAt(15) != 'y') {
                throw new RuntimeException();
            }
            A01[6] = "Ct76XBGNMfDXyoQyHbEHQKjczjA9HjKg";
            telephonyManager2 = yh.A00;
            return yh.A04(telephonyManager2.getSimState());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
