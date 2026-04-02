package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class XW implements InterfaceC0873Qt {
    public static byte[] A01;
    public final C1045Xn A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, 21, 21, 18, -45, -8, 21, 27, 26, 15, 20, 13, -45, -6, 21, 17, 11, 20, 102, 100, 86, 99, 30, 82, 88, 86, 95, 101};
    }

    public XW(C1045Xn c1045Xn) {
        this.A00 = c1045Xn;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0873Qt
    public final Map<String, String> A5V(boolean z) {
        HashMap hashMap = new HashMap();
        if (!C03675s.A00().A04()) {
            hashMap.put(A00(0, 23, 39), C9U.A00().A01(this.A00, true).A7X());
        }
        hashMap.put(A00(23, 10, 114), C9Y.A06(new AnonymousClass99(this.A00), this.A00, z));
        return hashMap;
    }
}
