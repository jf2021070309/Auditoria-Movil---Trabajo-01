package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Fp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0591Fp extends AbstractC1329dd {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, 28, 72, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, 73, 78, 80, 6, 28, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C0591Fp.class.getSimpleName();
    }

    public C0591Fp(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, String str, Uri uri, Map<String, String> map, @Nullable C02340m c02340m, boolean z) {
        super(c1046Xo, interfaceC0684Jg, str, c02340m, z);
        this.A00 = uri;
        this.A01 = map;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02280f
    @Nullable
    public final EnumC02270e A09() {
        try {
            LV.A09(new LV(), ((AbstractC02280f) this).A00, Uri.parse(this.A00.getQueryParameter(A00(25, 4, 8))), this.A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC02270e.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1329dd
    public final void A0C() {
        EnumC02270e enumC02270e = null;
        if (((AbstractC1329dd) this).A01) {
            enumC02270e = A09();
        }
        A0D(this.A01, enumC02270e);
    }
}
