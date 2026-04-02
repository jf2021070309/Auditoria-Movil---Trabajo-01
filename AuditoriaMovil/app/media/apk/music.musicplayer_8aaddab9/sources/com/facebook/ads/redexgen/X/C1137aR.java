package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;
import android.os.Build;
/* renamed from: com.facebook.ads.redexgen.X.aR  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1137aR implements InterfaceC03956v {
    public static String[] A01 = {"9CH7FUr60fjSOu0uDtam6QWrW1LAXcO0", "MGZ5NGAJYsXrcQ530Rpa4mq072uYsiXm", "FSEpTqAJrXrPXD8Cb", "YDmM9nsCETgUfJB46tzDOSpydcNxEQ3F", "VGv8Kw1xSq2totQkDwmbaDQvoJVXTwia", "PqLjk4LqC3tC9ytXEM059nB67sHSnsxP", "xjbenFCMrkBs7EfKqhSnYCZ0lRG62qii", "xgMaaa53aLKiV09tKVXK6rj7dvlbsjte"};
    public final /* synthetic */ C1134aO A00;

    public C1137aR(C1134aO c1134aO) {
        this.A00 = c1134aO;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        if (Build.VERSION.SDK_INT >= 24) {
            applicationInfo = this.A00.A01;
            if (applicationInfo != null) {
                C1134aO c1134aO = this.A00;
                applicationInfo2 = c1134aO.A01;
                return c1134aO.A08(applicationInfo2.deviceProtectedDataDir);
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        C1134aO c1134aO2 = this.A00;
        AnonymousClass76 anonymousClass76 = AnonymousClass76.A05;
        String[] strArr = A01;
        if (strArr[4].charAt(20) != strArr[5].charAt(20)) {
            String[] strArr2 = A01;
            strArr2[3] = "fnZh3TS8JAEKtifjP4n7RBztgRvZoar8";
            strArr2[2] = "4XQjD71oxr9tiB6pv";
            return c1134aO2.A07(anonymousClass76);
        }
        throw new RuntimeException();
    }
}
