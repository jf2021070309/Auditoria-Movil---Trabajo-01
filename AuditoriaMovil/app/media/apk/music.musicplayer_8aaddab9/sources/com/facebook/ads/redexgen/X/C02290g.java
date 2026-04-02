package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.0g  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02290g {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{111, 84, 91, 88, 86, 95, 26, 78, 85, 26, 74, 91, 72, 73, 95, 26, 80, 73, 85, 84, 26, 94, 91, 78, 91, 26, 83, 84, 26, 123, 94, 123, 89, 78, 83, 85, 84, 124, 91, 89, 78, 85, 72, 67, 20, 19, 22, 3, 22, 82, 83, 78, 84, 73, 88, 65, 94, 75, 64, 113, 66, 71, 64, 69, 98, 115, 96, 97, 123, 124, 117, 27, 10, 24, 24, 31, 3, 25, 4, 30, 12, 3, 39, 32, 59, 38, 49, 47, 41, 46, 62, 51, 44, 33, 32, 42, 26, 48, 55, 41};
    }

    static {
        A03();
        A01 = C02290g.class.getSimpleName();
    }

    @Nullable
    public static AbstractC02280f A00(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, String str, @Nullable Uri uri, Map<String, String> extraData) {
        return A01(c1046Xo, interfaceC0684Jg, str, uri, extraData, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.AbstractC02280f A01(com.facebook.ads.redexgen.X.C1046Xo r15, com.facebook.ads.redexgen.X.InterfaceC0684Jg r16, java.lang.String r17, @androidx.annotation.Nullable android.net.Uri r18, java.util.Map<java.lang.String, java.lang.String> r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02290g.A01(com.facebook.ads.redexgen.X.Xo, com.facebook.ads.redexgen.X.Jg, java.lang.String, android.net.Uri, java.util.Map, boolean, boolean):com.facebook.ads.redexgen.X.0f");
    }

    public static boolean A04(String str) {
        return A02(82, 5, 117).equalsIgnoreCase(str) || A02(55, 9, 15).equalsIgnoreCase(str);
    }
}
