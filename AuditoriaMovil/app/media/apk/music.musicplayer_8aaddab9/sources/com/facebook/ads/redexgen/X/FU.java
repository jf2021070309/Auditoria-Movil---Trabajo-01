package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class FU {
    public static byte[] A03;
    public static String[] A04 = {"bxXiKI", "1uDei3qzNnKNtNYr8Y2Djp0HGajvtEV5", "mOXymc7srnaPPj6rkYKERyI3NxuvjHfL", "eLJeQSRGsG8qXjpz5HdRmaYCfpHE06ps", "tIHnpnFG5Gy9TDLwgByCKCMlkPhTptnY", "feqrkYPgdz0GJjq4", "3AbGJoGZCQZs42EqNNbBdZ7jf", "CWkuEW"};
    public InterfaceC0517Cc A00;
    public final Ce A01;
    public final InterfaceC0517Cc[] A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            byte b2 = (byte) ((copyOfRange[i5] ^ i4) ^ 114);
            String[] strArr = A04;
            if (strArr[1].charAt(6) == strArr[3].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "mNEvNMISV2TsjErCZLDNSt4mIeKbSMWU";
            strArr2[2] = "pkwADRIgEHU8NI8rqtSVQew0tEayD06s";
            copyOfRange[i5] = b2;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{94, 87, 20, 24, 2, 27, 19, 87, 5, 18, 22, 19, 87, 3, 31, 18, 87, 4, 3, 5, 18, 22, 26, 89, 65, 96, 97, 106, 47, 96, 105, 47, 123, 103, 106, 47, 110, 121, 110, 102, 99, 110, 109, 99, 106, 47, 106, 119, 123, 125, 110, 108, 123, 96, 125, 124, 47, 39};
    }

    static {
        A01();
    }

    public FU(InterfaceC0517Cc[] interfaceC0517CcArr, Ce ce) {
        this.A02 = interfaceC0517CcArr;
        this.A01 = ce;
    }

    public final InterfaceC0517Cc A02(InterfaceC0518Cd interfaceC0518Cd, Uri uri) throws IOException, InterruptedException {
        InterfaceC0517Cc interfaceC0517Cc = this.A00;
        if (interfaceC0517Cc != null) {
            return interfaceC0517Cc;
        }
        InterfaceC0517Cc[] interfaceC0517CcArr = this.A02;
        int length = interfaceC0517CcArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            InterfaceC0517Cc interfaceC0517Cc2 = interfaceC0517CcArr[i2];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                interfaceC0518Cd.AE8();
                throw th;
            }
            if (interfaceC0517Cc2.AF0(interfaceC0518Cd)) {
                this.A00 = interfaceC0517Cc2;
                interfaceC0518Cd.AE8();
                break;
            }
            continue;
            interfaceC0518Cd.AE8();
            i2++;
        }
        InterfaceC0517Cc interfaceC0517Cc3 = this.A00;
        if (A04[6].length() != 13) {
            String[] strArr = A04;
            strArr[0] = "fQ5Ua6";
            strArr[7] = "HZXGBz";
            if (interfaceC0517Cc3 != null) {
                interfaceC0517Cc3.A8I(this.A01);
                return this.A00;
            }
            throw new VJ(A00(24, 34, 125) + C0676Iy.A0S(this.A02) + A00(0, 24, 5), uri);
        }
        throw new RuntimeException();
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
