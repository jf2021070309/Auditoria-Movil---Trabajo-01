package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.1o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02621o {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{25, 95, 67, 90, 91, 124, 107, 121, 111, 124, 106, 107, 106, 81, 120, 103, 106, 107, 97};
    }

    public static void A02(C1046Xo c1046Xo, C7U c7u, C1294d4 c1294d4) {
        c7u.A0W(new C7R(c1294d4.A0Q().A01(), PT.A04, PT.A04, c1294d4.A0Y(), A00(5, 14, 28)));
        boolean A0r = c1294d4.A0r();
        if (A0r) {
            C7T c7t = new C7T(c1294d4.A0U(), c1294d4.A0Y(), A00(5, 14, 28));
            c7t.A04 = true;
            c7t.A03 = A00(0, 5, 37);
            c7u.A0X(c7t);
        }
        boolean A20 = JQ.A20(c1046Xo, QZ.A03());
        C7T c7t2 = new C7T(c1294d4.A0N().A0D().A08(), c1294d4.A0Y(), A00(5, 14, 28), c1294d4.A0N().A0D().A05());
        if (A0r && !A20) {
            c7u.A0X(c7t2);
        } else {
            c7u.A0a(c7t2);
        }
        c7u.A0W(new C7R(c1294d4.A0N().A0D().A07(), C02571j.A00(c1294d4.A0N().A0D()), C02571j.A01(c1294d4.A0N().A0D()), c1294d4.A0Y(), A00(5, 14, 28)));
        for (String str : c1294d4.A0N().A0G().A00()) {
            c7u.A0W(new C7R(str, -1, -1, c1294d4.A0Y(), A00(5, 14, 28)));
        }
    }
}
