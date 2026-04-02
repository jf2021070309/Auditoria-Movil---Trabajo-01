package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class S9 extends L7 {
    public static byte[] A02;
    public final /* synthetic */ C8I A00;
    public final /* synthetic */ AnonymousClass84 A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public S9(C8I c8i, AnonymousClass84 anonymousClass84) {
        this.A00 = c8i;
        this.A01 = anonymousClass84;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        Q8 q8;
        Q8 q82;
        q8 = this.A00.A0A;
        if (q8.getState() == EnumC0866Qm.A02) {
            q82 = this.A00.A0A;
            if (q82.getCurrentPositionInMillis() == A00()) {
                this.A00.A0G(A00(0, 22, 11));
            }
        }
    }
}
