package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.bM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1194bM implements InterfaceC02671t {
    public static byte[] A03;
    public C5Q A00;
    public C1046Xo A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Byte.MAX_VALUE, 122, Byte.MAX_VALUE, 126, 102, Byte.MAX_VALUE};
    }

    public C1194bM(C5Q c5q, C1046Xo c1046Xo, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c5q;
        this.A01 = c1046Xo;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02671t
    public final void AAh(KG kg) {
        C0725Ky.A00(new C1197bP(this, kg));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02671t
    public final void ABa(List<C1315dP> list) {
        C7U c7u = new C7U(this.A01);
        String A02 = A02(6, 7, 70);
        for (C1315dP c1315dP : list) {
            if (A02(6, 7, 70).equals(A02)) {
                A02 = c1315dP.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1315dP.A0E().A0G() != null) {
                    c7u.A0V(new C7R(c1315dP.A0E().A0G().getUrl(), c1315dP.A0E().A0G().getHeight(), c1315dP.A0E().A0G().getWidth(), c1315dP.A0G(), A02(0, 6, 2)));
                }
                if (c1315dP.A0E().A0F() != null) {
                    c7u.A0V(new C7R(c1315dP.A0E().A0F().getUrl(), c1315dP.A0E().A0F().getHeight(), c1315dP.A0E().A0F().getWidth(), c1315dP.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c1315dP.A0E().A0d())) {
                    c7u.A0a(new C7T(c1315dP.A0E().A0d(), c1315dP.A0G(), A02(0, 6, 2), c1315dP.A0E().A0A()));
                }
            }
        }
        c7u.A0U(new C1195bN(this, list), new C7N(A02, A02(0, 6, 2)));
    }
}
