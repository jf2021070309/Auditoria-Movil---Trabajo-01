package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.2E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2E {
    public static C2D A00;
    public static byte[] A01;
    public static String[] A02 = {"5C", "XCQlkpY5piUcLjJCIOiIDRA1Xf3BQw5G", "0a69WOFvTBLsy8lAVGRNlMHFWRuDZRjl", "OFhzeqrZv0XnB9gP602YU4ezSnWC1Bbp", "bxwh6yqKC2T98LgE6ANHgNf1WHiuWTR4", "gOVlWDOjJnKUH6pnKA9AEDDx2Fo9I7QY", "TsWSfhPzYctfX3EjzAYfIIFbv7dxEAvN", "5GOKDpoDtcl9XDDYwJgdPTOVbWUoiTd7"};

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, 61, 42, 119, 24, 29, 6, 11, 28, 9, 22, 11, 13, 16, 23, 30, 6, 26, 22, 23, 31, 16, 30};
    }

    static {
        A02();
    }

    public static C2D A00(C1045Xn c1045Xn) {
        if (A00 == null) {
            if (A02[1].charAt(8) == '1') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "Wq1znOwYnC3h4pmP3iH4FQ9HuimyotJR";
            strArr[3] = "BIxBDSyOaSTDqGmEqhPRQQjgvL5NbLNP";
            synchronized (C2D.class) {
                if (A00 == null) {
                    A00 = new C2D(new C1251cL(c1045Xn.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 116), c1045Xn), 0)));
                }
            }
        }
        return A00;
    }
}
