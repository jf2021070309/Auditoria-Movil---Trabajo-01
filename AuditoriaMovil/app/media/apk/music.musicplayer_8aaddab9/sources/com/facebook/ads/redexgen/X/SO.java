package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class SO extends L7 {
    public static byte[] A02;
    public final /* synthetic */ C0825Ow A00;
    public final /* synthetic */ AnonymousClass84 A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{93, 106, 121, 121, 122, 109, 118, 113, 120, 63, 118, 113, 123, 122, 121, 118, 113, 118, 107, 122, 115, 102};
    }

    public SO(C0825Ow c0825Ow, AnonymousClass84 anonymousClass84) {
        this.A00 = c0825Ow;
        this.A01 = anonymousClass84;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        Q8 q8;
        Q8 q82;
        q8 = this.A00.A0C;
        if (q8.getState() == EnumC0866Qm.A02) {
            q82 = this.A00.A0C;
            if (q82.getCurrentPositionInMillis() == A00()) {
                this.A00.A0I(A00(0, 22, 49));
            }
        }
    }
}
