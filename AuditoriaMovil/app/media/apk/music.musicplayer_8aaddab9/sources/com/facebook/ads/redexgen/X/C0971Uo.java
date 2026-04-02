package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Uo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0971Uo extends C0639Hn {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{101, 82, 68, 71, 88, 89, 68, 82, 23, 84, 88, 83, 82, 13, 23};
    }

    public C0971Uo(int i2, Map<String, List<String>> map, C0636Hi c0636Hi) {
        super(A00(0, 15, 69) + i2, c0636Hi, 1);
        this.A00 = i2;
        this.A01 = map;
    }
}
