package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.d4  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1294d4 extends AnonymousClass18 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 2751287062553772011L;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{123, 108, 126, 104, 123, 109, 108, 109, 86, Byte.MAX_VALUE, 96, 109, 108, 102};
    }

    public C1294d4(List<C1B> list) {
        super(list);
    }

    public static C1294d4 A01(JSONObject jSONObject, C1046Xo c1046Xo) {
        C1294d4 c1294d4 = new C1294d4(AnonymousClass18.A02(jSONObject, c1046Xo, new C1295d5()));
        c1294d4.A0j(jSONObject);
        c1294d4.A0h(A03(0, 14, 8));
        return c1294d4;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass18
    public final int A0J() {
        if (A0s()) {
            return 2;
        }
        if (A0N().A0D().A06() != null) {
            return 1;
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass18
    public final int A0K() {
        return A0N().A0D().A04();
    }
}
