package com.facebook.ads.redexgen.X;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: assets/audience_network.dex */
public class ZT implements InterfaceC03956v {
    public final /* synthetic */ ZO A00;

    public ZT(ZO zo) {
        this.A00 = zo;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        return this.A00.A0C(new HashMap<String, Integer>() { // from class: com.facebook.ads.redexgen.X.6o
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i2, int i3, int i4) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                    copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 15);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{123, -13};
            }

            {
                put(A00(1, 1, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD), Integer.valueOf(ZT.this.A00.A01.widthPixels));
                put(A00(0, 1, 4), Integer.valueOf(ZT.this.A00.A01.heightPixels));
            }
        });
    }
}
