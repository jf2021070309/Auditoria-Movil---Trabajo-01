package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class IE {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-40, -21, -30, -46, -33, -40, -31, -10, 9, 0, -16, 3, -10, -11, -6, 3};
    }

    public static long A00(ID id) {
        return id.A5W(A02(0, 7, 27), -1L);
    }

    @Nullable
    public static Uri A01(ID id) {
        String A5Y = id.A5Y(A02(7, 9, 57), null);
        if (A5Y == null) {
            return null;
        }
        return Uri.parse(A5Y);
    }

    public static void A04(IF r3) {
        r3.A01(A02(7, 9, 57));
    }

    public static void A05(IF r3, long j2) {
        r3.A02(A02(0, 7, 27), j2);
    }

    public static void A06(IF r4, Uri uri) {
        r4.A03(A02(7, 9, 57), uri.toString());
    }
}
