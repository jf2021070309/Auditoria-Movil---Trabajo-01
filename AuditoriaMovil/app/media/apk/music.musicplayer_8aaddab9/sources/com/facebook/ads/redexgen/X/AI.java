package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class AI extends ME {
    public static byte[] A01;
    public final /* synthetic */ TC A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{72, 87, 90, 91, 81, 119, 80, 74, 91, 76, 77, 74, 87, 74, 95, 82, 123, 72, 91, 80, 74};
    }

    public AI(TC tc) {
        this.A00 = tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC04429c
    /* renamed from: A02 */
    public final void A03(AnonymousClass85 anonymousClass85) {
        InterfaceC0761Mk interfaceC0761Mk;
        interfaceC0761Mk = this.A00.A04;
        interfaceC0761Mk.A3s(A00(0, 21, 1), anonymousClass85);
    }
}
