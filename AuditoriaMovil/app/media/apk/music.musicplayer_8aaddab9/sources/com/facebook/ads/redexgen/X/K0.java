package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Arrays;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public class K0 implements DialogInterface.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ U3 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{7, 17, -3, 18, 21, 13, -3, 17, 18, 3, 14, -12, -14, -11, -27};
    }

    public K0(U3 u3) {
        this.A00 = u3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Map A012;
        A012 = this.A00.A01();
        A012.put(A00(0, 11, 119), A00(11, 4, 89));
        this.A00.A05(A012);
    }
}
