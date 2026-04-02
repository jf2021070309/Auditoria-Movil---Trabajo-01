package com.facebook.ads.redexgen.X;

import java.lang.reflect.Constructor;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Wj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1015Wj implements InterfaceC0519Cf {
    public static byte[] A06;
    public static final Constructor<? extends InterfaceC0517Cc> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 75);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{4, 51, 51, 46, 51, 97, 40, 47, 50, 53, 32, 47, 53, 40, 32, 53, 40, 47, 38, 97, 7, 13, 0, 2, 97, 36, 57, 53, 36, 47, 50, 40, 46, 47, 37, 30, 21, 8, 0, 21, 19, 4, 21, 20, 80, 21, 2, 2, 31, 2, 80, 19, 2, 21, 17, 4, 25, 30, 23, 80, 54, 60, 49, 51, 80, 21, 8, 4, 2, 17, 19, 4, 31, 2, 98, 110, 108, 47, 103, 96, 98, 100, 99, 110, 110, 106, 47, 96, 101, 114, 47, 104, 111, 117, 100, 115, 111, 96, 109, 47, 100, 121, 110, 113, 109, 96, 120, 100, 115, 51, 47, 100, 121, 117, 47, 103, 109, 96, 98, 47, 71, 109, 96, 98, 68, 121, 117, 115, 96, 98, 117, 110, 115};
    }

    static {
        A01();
        Constructor<? extends InterfaceC0517Cc> constructor = null;
        try {
            constructor = Class.forName(A00(74, 59, 74)).asSubclass(InterfaceC0517Cc.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e2) {
            throw new RuntimeException(A00(0, 34, 10), e2);
        }
        A07 = constructor;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0519Cf
    public final synchronized InterfaceC0517Cc[] A4H() {
        InterfaceC0517Cc[] interfaceC0517CcArr;
        interfaceC0517CcArr = new InterfaceC0517Cc[A07 == null ? 12 : 13];
        interfaceC0517CcArr[0] = new WU(this.A01);
        interfaceC0517CcArr[1] = new WK(this.A00);
        interfaceC0517CcArr[2] = new WI(this.A03);
        interfaceC0517CcArr[3] = new WR(this.A02);
        interfaceC0517CcArr[4] = new W4();
        interfaceC0517CcArr[5] = new W7();
        interfaceC0517CcArr[6] = new C0993Vl(this.A05, this.A04);
        interfaceC0517CcArr[7] = new C1007Wb();
        interfaceC0517CcArr[8] = new WC();
        interfaceC0517CcArr[9] = new C0999Vr();
        interfaceC0517CcArr[10] = new C0991Vj();
        interfaceC0517CcArr[11] = new C1010We();
        if (A07 != null) {
            try {
                interfaceC0517CcArr[12] = A07.newInstance(new Object[0]);
            } catch (Exception e2) {
                throw new IllegalStateException(A00(34, 40, 59), e2);
            }
        }
        return interfaceC0517CcArr;
    }
}
