package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Xb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1033Xb extends L7 {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ C1045Xn A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{91, 108, 99, 40, 123, 125, 107, 107, 109, 123, 123, 110, 125, 100, 100, 113, 40, 97, 102, 97, 124, 97, 105, 100, 97, 114, 109, 108, 41};
    }

    public C1033Xb(C1045Xn c1045Xn, AudienceNetworkAds.InitListener initListener) {
        this.A01 = c1045Xn;
        this.A00 = initListener;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        try {
            XM.A02().A0C(this.A01);
        } catch (Throwable th) {
            this.A01.A06().A3Q(th);
        }
        C9N.A0C(this.A01);
        AudienceNetworkAds.InitListener initListener = this.A00;
        if (initListener != null) {
            C9N.A04(initListener, new C9M(true, A00(0, 29, 0)));
        }
    }
}
