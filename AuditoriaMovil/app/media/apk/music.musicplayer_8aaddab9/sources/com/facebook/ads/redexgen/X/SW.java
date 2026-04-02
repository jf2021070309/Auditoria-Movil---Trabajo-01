package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public class SW implements InterfaceC0824Ov {
    public static byte[] A01;
    public final /* synthetic */ C04579s A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-49, -53, -64, -40};
    }

    public SW(C04579s c04579s) {
        this.A00 = c04579s;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0824Ov
    public final void ACg(String str, JSONObject jSONObject) {
        P4 p4;
        C1046Xo c1046Xo;
        C1046Xo c1046Xo2;
        if (str.equals(A00(0, 4, 72))) {
            this.A00.AF7();
            c1046Xo = this.A00.A07;
            if (JQ.A1F(c1046Xo)) {
                c1046Xo2 = this.A00.A07;
                c1046Xo2.A09().AAR();
            }
        }
        p4 = this.A00.A0F;
        p4.A0h(str, jSONObject);
    }
}
