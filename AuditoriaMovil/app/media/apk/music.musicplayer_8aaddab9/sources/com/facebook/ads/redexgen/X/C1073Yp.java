package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;
import android.os.Build;
/* renamed from: com.facebook.ads.redexgen.X.Yp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1073Yp implements InterfaceC03956v {
    public static String[] A01 = {"zJajY9dZZxYFsLRzsvnBiwQWt0HnizLC", "gzFaheVOcPUMbI38nwUIVYmc91b5uR", "ce0KJPPQByTAaQ9ATxZk2kwW24DeaJ9j", "R6Wiv8wmYaZdmPdgU3hXsutSf", "job2ys34errF3to", "kwK9VFGEGX8wPEd", "j3AidPNHk3dBWfN6HPyZ7", "rfM1O6R1RyyEf1DP"};
    public final /* synthetic */ C1069Yl A00;

    public C1073Yp(C1069Yl c1069Yl) {
        this.A00 = c1069Yl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        packageInfo = this.A00.A01;
        if (packageInfo != null && Build.VERSION.SDK_INT >= 22) {
            C1069Yl c1069Yl = this.A00;
            if (A01[1].length() != 30) {
                throw new RuntimeException();
            }
            A01[6] = "SsABSdrOWb5CHUfmSefeH";
            packageInfo2 = c1069Yl.A01;
            return c1069Yl.A04(packageInfo2.baseRevisionCode);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
