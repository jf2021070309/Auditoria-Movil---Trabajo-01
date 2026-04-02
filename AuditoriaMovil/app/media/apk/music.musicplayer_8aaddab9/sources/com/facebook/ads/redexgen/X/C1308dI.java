package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.dI  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1308dI extends L7 {
    public static byte[] A01;
    public final /* synthetic */ C1307dH A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C1308dI(C1307dH c1307dH) {
        this.A00 = c1307dH;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        C1046Xo c1046Xo;
        O0 o0;
        C1309dJ c1309dJ;
        c1046Xo = this.A00.A02;
        c1046Xo.A0D().AFc();
        o0 = this.A00.A04;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(0, 11, 35));
        c1309dJ = this.A00.A00;
        sb.append(c1309dJ.A03());
        o0.loadUrl(sb.toString());
    }
}
