package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
/* renamed from: com.facebook.ads.redexgen.X.Rh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0887Rh {
    A03(A01(35, 4, 104)),
    A04(A01(39, 4, 113));
    
    public static byte[] A01;
    public String A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-99, -84, -93, -93, -22, 15, 23, 2, 13, 10, 5, -63, 20, 6, 19, 23, 6, 19, -63, 19, 6, 20, 17, 16, 15, 20, 6, -37, -63, -58, 20, -34, -40, -40, -29, 36, 51, 42, 42, 50, 44, 44, 55};
    }

    static {
        A02();
    }

    EnumC0887Rh(String str) {
        this.A00 = str;
    }

    public static EnumC0887Rh A00(String str) {
        EnumC0887Rh[] values;
        for (EnumC0887Rh enumC0887Rh : values()) {
            if (enumC0887Rh.A00.equals(str)) {
                return enumC0887Rh;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 75), str));
    }
}
