package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.dA  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1300dA extends AnonymousClass18 {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-123, -124, -111, -111, -120, -107};
    }

    public C1300dA(List<C1B> list) {
        super(list);
    }

    public static C1300dA A01(JSONObject jSONObject, C1046Xo c1046Xo) {
        C1300dA c1300dA = new C1300dA(AnonymousClass18.A02(jSONObject, c1046Xo, new C1301dB()));
        c1300dA.A0j(jSONObject);
        c1300dA.A0h(A03(0, 6, 27));
        return c1300dA;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass18
    public final int A0J() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass18
    public final int A0K() {
        return 0;
    }
}
