package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Tu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0951Tu extends L7 {
    public static byte[] A01;
    public static String[] A02 = {"HdBP5Xz", "1x1Spdd4leaR6rMyIqz7jDuVALPBafGP", "axXL5TnL0HBMXsVKsrA9GDOWQxSG9OY6", "1dEgnVHIT0m43fI6JYH9hpNhfyiBWS6N", "iEi5yE", "UjLwzpYsoJIrFySVWBkKISpV5tCrd9dB", "Qbq65yz", "qKKFep347IAmJ8sue1lLg6VgEBnKG6W3"};
    public final /* synthetic */ C0711Kj A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            A02[7] = "vKWhPjbFalI70MxhKihYQQhrE25QXeUX";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 89);
            i5++;
        }
    }

    public static void A02() {
        A01 = new byte[]{25, 28, 16, 14, 25, 12, 33, 21, 31, 28, 33, 33, 25, 18};
    }

    static {
        A02();
    }

    public C0951Tu(C0711Kj c0711Kj) {
        this.A00 = c0711Kj;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        C1046Xo c1046Xo;
        c1046Xo = this.A00.A04;
        c1046Xo.A06().A8F(A00(0, 14, 84));
    }
}
