package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.db  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1327db extends AbstractC02280f {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 115, 123, 126, 119, 118, 50, -122, -127, 50, -127, -126, 119, Byte.MIN_VALUE, 50, 126, 123, Byte.MIN_VALUE, 125, 50, -121, -124, 126, 76, 50};
    }

    static {
        A01();
        A02 = C1327db.class.getSimpleName();
    }

    public C1327db(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, String str, Uri uri) {
        super(c1046Xo, interfaceC0684Jg, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02280f
    public final void A0B() {
        try {
            LV.A0A(new LV(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
    }
}
