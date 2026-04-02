package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONException;
/* loaded from: assets/audience_network.dex */
public class UX implements RM {
    public static byte[] A02;
    public final /* synthetic */ C1045Xn A00;
    public final /* synthetic */ RK A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public UX(RK rk, C1045Xn c1045Xn) {
        this.A01 = rk;
        this.A00 = c1045Xn;
    }

    @Override // com.facebook.ads.redexgen.X.RM
    public final void A3t() {
        try {
            JQ.A0O(this.A00).A28(this.A01.A6I().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e2) {
            this.A00.A06().A3Q(e2);
        }
    }
}
