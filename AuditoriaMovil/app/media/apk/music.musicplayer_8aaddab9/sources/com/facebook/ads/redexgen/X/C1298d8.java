package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.d8  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1298d8 extends AnonymousClass18 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772011L;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{72, 79, 85, 68, 83, 82, 85, 72, 85, 72, 64, 77};
    }

    public C1298d8(List<C1B> list) {
        super(list);
    }

    public static C1298d8 A01(JSONObject jSONObject, C1046Xo c1046Xo) {
        C1298d8 c1298d8 = new C1298d8(AnonymousClass18.A02(jSONObject, c1046Xo, new C1299d9()));
        c1298d8.A0j(jSONObject);
        c1298d8.A0h(A03(0, 12, 67));
        return c1298d8;
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
