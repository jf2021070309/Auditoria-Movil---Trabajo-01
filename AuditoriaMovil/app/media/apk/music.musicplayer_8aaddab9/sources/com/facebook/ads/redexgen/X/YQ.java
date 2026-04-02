package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;
/* loaded from: assets/audience_network.dex */
public class YQ implements InterfaceC03956v {
    public static String[] A01 = {"fhgAKr3d26sPe206xi", "SjffeijJA1Vv6PcXWUgct", "EsQusZwl1jUwipz2lU1dtOeOynoqp4qu", "0VpWGFYwNM1shdn7oayU", "oGsU7X9gn8B3aKKKnK6Um4C", "3PuUzv37NfYax6hYz8jf", "w27NqvUy0J9VzwNZKDXUsnO8qh2oDxhJ", "FZXbTPmbge4RvKyxAzubgHD8Txvy8Otv"};
    public final /* synthetic */ YH A00;

    public YQ(YH yh) {
        this.A00 = yh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        TelephonyManager telephonyManager3;
        TelephonyManager telephonyManager4;
        telephonyManager = this.A00.A00;
        if (telephonyManager == null) {
            C7A A07 = this.A00.A07(AnonymousClass76.A07);
            if (A01[6].charAt(19) != 'U') {
                throw new RuntimeException();
            }
            A01[6] = "mdGsZgeczhjsROxHbS4UhtOI0ggMdB2A";
            return A07;
        } else if (Build.VERSION.SDK_INT >= 24) {
            YH yh = this.A00;
            telephonyManager4 = yh.A00;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "gYbGBXsMnQLVbPxH35aVX";
            strArr2[4] = "c9uQZVFrEkdSbUXAtWNBNx9";
            return yh.A04(telephonyManager4.getDataNetworkType());
        } else {
            YH yh2 = this.A00;
            String[] strArr3 = A01;
            if (strArr3[2].length() != strArr3[0].length()) {
                A01[6] = "dEMR1C0fCLJEsmN6YStUhJGVUagFQ5EF";
                telephonyManager3 = yh2.A00;
                return yh2.A04(telephonyManager3.getNetworkType());
            }
            A01[7] = "IeVVB4pQAR4pX23W54Z95CGRKG6wHZI8";
            telephonyManager2 = yh2.A00;
            return yh2.A04(telephonyManager2.getNetworkType());
        }
    }
}
