package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;
/* renamed from: com.facebook.ads.redexgen.X.aV  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1141aV implements InterfaceC03956v {
    public static String[] A01 = {"CyYconlRA", "Z99FvxWAH", "r", "I6nMbGSwO", "f1HEaIkkO6UN2Wyn2K6t6YhOL5YQHMub", "q7TOnFp8MDH9pVcAi7q7X5O", "kHDnEbJrZHu3VwOwnck16fHaeHzzt8", "W41og5bN"};
    public final /* synthetic */ C1134aO A00;

    public C1141aV(C1134aO c1134aO) {
        this.A00 = c1134aO;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo != null) {
            C1134aO c1134aO = this.A00;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A01[2] = "ZWV";
            applicationInfo2 = c1134aO.A01;
            return c1134aO.A08(applicationInfo2.sourceDir);
        }
        C1134aO c1134aO2 = this.A00;
        if (A01[6].length() != 14) {
            A01[6] = "1VAENbmq7tYIb9ZQI0D0jEbiw3q";
            return c1134aO2.A07(AnonymousClass76.A07);
        }
        return c1134aO2.A07(AnonymousClass76.A07);
    }
}
