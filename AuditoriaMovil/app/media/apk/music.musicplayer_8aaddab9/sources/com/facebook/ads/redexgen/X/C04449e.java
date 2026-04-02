package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.9e  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04449e {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    public static InterfaceC04469g A00(C1045Xn c1045Xn) {
        try {
            return new XE(c1045Xn);
        } catch (IOException e2) {
            c1045Xn.A06().A8y(A02(0, 15, 89), C04398z.A29, new AnonymousClass90(e2));
            return new XH();
        }
    }

    public static E1 A01(C1045Xn c1045Xn) {
        return new E1(c1045Xn);
    }
}
