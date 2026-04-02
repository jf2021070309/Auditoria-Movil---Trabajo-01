package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.9Q  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9Q {
    public static HashMap<String, String> A00;
    public static byte[] A01;
    public static String[] A02 = {"khEJJSEBeZAj3OAxCgzNidlYCZn1WdrQ", "WigI19L", "nVQbXZzkIzZCm6ed4Wwsa9gCOy", "HTplkKsJZ28QwTvwNKGrQ1qXfC2z", "xAVvuzXwzMicNcIETZjP5vM2paYATPUF", "ZQBu7F3mQUfNW6aD", "dGQdYWCLx", "hFrznfqGyDFETBry94BNLT7Zi42G"};

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{63, 46, 46, 60, 43, 55, 50, 58, 118, 103, 103, 121, 118, 122, 114, 27, 10, 10, 12, 31, 8, 9, 14, 25, 2, 8, 0, 9, 47, 45, 38, 39, 46, 15, 19, 53, 41, 44, 63, 40, 41, 101, 114, 125, 114, 101, 106, 126, 119, 100, 115, 114, 104, 110, 111, 126, 104, 126, 126, 100, 98, 99, 114, 100, 105, 51, 60, 54, 32, 61, 59, 54};
    }

    static {
        A03();
    }

    public static synchronized Map<String, String> A01(C8U c8u) {
        synchronized (C9Q.class) {
            if (A00 != null) {
                return new HashMap(A00);
            }
            A00 = new HashMap<>();
            A00.put(A00(22, 6, 41), c8u.getPackageName());
            A02(c8u, A00);
            HashMap hashMap = new HashMap(A00);
            if (A02[6].length() != 9) {
                throw new RuntimeException();
            }
            A02[4] = "csszmLyTseT6qvLdDZ4XLWwozasc9BBN";
            return hashMap;
        }
    }

    public static synchronized Map<String, String> A02(C8U c8u, Map<String, String> map) {
        synchronized (C9Q.class) {
            map.put(A00(41, 3, 83), A00(65, 7, 55));
            map.put(A00(44, 11, 68), c8u.A03().A7m());
            map.put(A00(33, 2, 37), c8u.A03().A7l());
            map.put(A00(35, 6, 31), AnonymousClass99.A03);
            AnonymousClass99 anonymousClass99 = new AnonymousClass99(c8u);
            map.put(A00(15, 7, 63), anonymousClass99.A06());
            map.put(A00(8, 7, 82), anonymousClass99.A05());
            map.put(A00(0, 8, 27), String.valueOf(anonymousClass99.A04()));
            map.put(A00(28, 5, 7), anonymousClass99.A0A());
            map.put(A00(55, 10, 72), c8u.A07().A02());
        }
        return map;
    }
}
