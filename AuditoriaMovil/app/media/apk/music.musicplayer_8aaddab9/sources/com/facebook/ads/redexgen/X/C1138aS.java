package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;
/* renamed from: com.facebook.ads.redexgen.X.aS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1138aS implements InterfaceC03956v {
    public static String[] A01 = {"b1sQJ", "SIF58uGHe7qyLmHU2z0R0", "OwOBv3ZEKz2Te88ibAl3d47J53q2OGoK", "esWFBpscKVup9jNI8XCXNCETTdpqRq5Z", "zivB8", "FBi4O7QrEsFNvdqkgZ6MOGJI", "H45EAoAIvQ1szMaGMHC8haArjN6", "w12X6M1S0qfh4A3JJ2wkr2WlTLMqdjE1"};
    public final /* synthetic */ C1134aO A00;

    public C1138aS(C1134aO c1134aO) {
        this.A00 = c1134aO;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo != null) {
            C1134aO c1134aO = this.A00;
            applicationInfo2 = c1134aO.A01;
            return c1134aO.A08(applicationInfo2.publicSourceDir);
        }
        C1134aO c1134aO2 = this.A00;
        String[] strArr = A01;
        if (strArr[4].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "DiCvH";
        strArr2[0] = "OWYZT";
        return c1134aO2.A07(AnonymousClass76.A07);
    }
}
