package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class XZ extends L7 {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ AudienceNetworkAds.InitResult A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{113, 102, 105, 2, 75, 76, 75, 86, 75, 67, 78, 75, 88, 67, 86, 75, 77, 76, 2, 65, 77, 79, 82, 78, 71, 86, 71, 104, 58, 52, 108, 59, 58, 56, 69, 66, 89, 100, 86, 81, 82};
    }

    public XZ(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        this.A00 = initListener;
        this.A01 = initResult;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        KU.A05(A00(34, 7, 113), A00(0, 27, 100), A00(27, 7, 75));
        this.A00.onInitialized(this.A01);
    }
}
