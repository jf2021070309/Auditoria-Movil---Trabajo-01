package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.La  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0727La {
    public static byte[] A00;
    public static String[] A01 = {"gFe3mTVqEc", "o3XICwck3thy8t5khkuFfgIyTYcE10rb", "CXZamXhEArpjjLRWzP01hTJHhdHKIPhL", "oFEH5ENhqq8Jzm18l75xaKQx7AXJNwzV", "R1QKRY6v8stJjzPTGoE1sFm3d511QSKK", "fRlItu1oZcW1vgjv2TfsauDW1x1gg146", "rMZj8KW6uJSswCV0wJ61u4oJuHgPLcpr", "VRcOG4k1oxgWu574CIBxVkEWQ"};
    public static final Map<KJ, KL> A02;

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{125, 95, 80, 25, 74, 30, 93, 76, 91, 95, 74, 91, 30, Byte.MAX_VALUE, 90, 109, 87, 68, 91, 30, 75, 77, 87, 80, 89, 30, 74, 86, 87, 77, 30, 73, 87, 90, 74, 86, 30, 95, 80, 90, 30, 86, 91, 87, 89, 86, 74, 16, 115, 72, 77, 72, 73, 81, 72, 6, 103, 66, 117, 79, 92, 67, 6, 82, 95, 86, 67, 8};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(KJ.A08, KL.A0C);
        A02.put(KJ.A06, KL.A0E);
        A02.put(KJ.A05, KL.A0D);
    }

    public static AdSize A00(KJ kj) {
        return AdSize.fromWidthAndHeight(kj.A03(), kj.A02());
    }

    public static AdSize A01(KL kl) {
        for (Map.Entry<KJ, KL> entry : A02.entrySet()) {
            if (entry.getValue() == kl) {
                return A00(entry.getKey());
            }
        }
        AdSize adSize = AdSize.BANNER_320_50;
        if (A01[2].charAt(13) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "8yxIcOBY3dyXYw8tx9RnPYEelWv3PiEU";
        strArr[5] = "RuT7gwLbx9UlwnZGushHq4GsGVsr9kdh";
        return adSize;
    }

    public static KJ A02(int i2) {
        if (i2 != 4) {
            if (i2 != 5) {
                if (i2 != 6) {
                    if (i2 != 7) {
                        if (i2 == 100) {
                            return KJ.A07;
                        }
                        throw new IllegalArgumentException(A06(48, 20, 63));
                    }
                    return KJ.A08;
                }
                return KJ.A06;
            }
            return KJ.A05;
        }
        return KJ.A04;
    }

    public static KJ A03(int i2, int i3) {
        if (KJ.A07.A02() == i3 && KJ.A07.A03() == i2) {
            KJ kj = KJ.A07;
            if (A01[2].charAt(13) != 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "oPyqycdUDaMLkpnFUSD1lOVVut5Ak4ux";
            strArr[6] = "t44MnsVi8idfM7jbHI01veBsrnLqKP4H";
            return kj;
        } else if (KJ.A04.A02() == i3 && KJ.A04.A03() == i2) {
            return KJ.A04;
        } else {
            if (KJ.A05.A02() == i3 && KJ.A05.A03() == i2) {
                KJ kj2 = KJ.A05;
                if (A01[1].charAt(1) != 'd') {
                    String[] strArr2 = A01;
                    strArr2[4] = "zTuOoFSTcjvo6siKnZ91TQqR6FN8Kxgy";
                    strArr2[6] = "bIxUq8CGRMwo1zGvdui1T5X5wsDAfXTH";
                    return kj2;
                }
                throw new RuntimeException();
            } else if (KJ.A06.A02() == i3 && KJ.A06.A03() == i2) {
                return KJ.A06;
            } else {
                if (KJ.A08.A02() == i3 && KJ.A08.A03() == i2) {
                    return KJ.A08;
                }
                throw new IllegalArgumentException(A06(0, 48, 39));
            }
        }
    }

    public static KJ A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static KL A05(KJ kj) {
        KL kl = A02.get(kj);
        if (kl == null) {
            KL adTemplate = KL.A0F;
            if (A01[1].charAt(1) != 'd') {
                String[] strArr = A01;
                strArr[3] = "UG6JCyDXDBzWMb76AfK0hQ3l3bgkgswO";
                strArr[5] = "9YhmwLNWXnVy8pTRO5fFllqJZ4ALiPvn";
                return adTemplate;
            }
            throw new RuntimeException();
        }
        return kl;
    }
}
