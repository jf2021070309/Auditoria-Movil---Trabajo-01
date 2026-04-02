package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.1n  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02611n {
    public static byte[] A00;
    public static String[] A01 = {"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            A01[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            byte b2 = (byte) ((copyOfRange[i5] - i4) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr2[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            copyOfRange[i5] = b2;
            i5++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    static {
        A01();
    }

    public static void A02(C1046Xo c1046Xo, AnonymousClass18 anonymousClass18, boolean z, InterfaceC02591l interfaceC02591l) {
        if (!JQ.A1N(c1046Xo)) {
            C7U c7u = new C7U(c1046Xo);
            C1W A06 = anonymousClass18.A0N().A0D().A06();
            c7u.A0b(new C0692Jo(anonymousClass18.A0T(), c1046Xo.A08()));
            if (A06 == null) {
                interfaceC02591l.ABj(AdError.CACHE_ERROR);
                return;
            } else if (A06.A0J()) {
                interfaceC02591l.ABk();
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                A01[0] = "84TqyqDRqUmJCVM8";
                return;
            } else {
                C7T c7t = new C7T(A06.A0E(), anonymousClass18.A0Y(), anonymousClass18.A0X());
                c7t.A04 = true;
                if (JQ.A1H(c1046Xo)) {
                    c7t.A03 = A00(0, 5, 22);
                }
                int i2 = C02581k.A00[A06.A09().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    c7u.A0X(c7t);
                }
                c7u.A0V(new C7R(anonymousClass18.A0Q().A01(), -1, -1, anonymousClass18.A0Y(), anonymousClass18.A0X()));
                c7u.A0V(new C7R(A06.A0D(), -1, -1, anonymousClass18.A0Y(), anonymousClass18.A0X()));
                c7u.A0U(new C1287cx(c1046Xo, interfaceC02591l, c7u, A06, z), new C7N(anonymousClass18.A0Y(), anonymousClass18.A0X()));
                return;
            }
        }
        interfaceC02591l.ABk();
    }
}
