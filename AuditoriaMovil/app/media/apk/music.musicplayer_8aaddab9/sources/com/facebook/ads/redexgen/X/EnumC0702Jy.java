package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Jy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0702Jy {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);
    
    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 75, 75, 34, 35, 34, 41};
    }

    static {
        A02();
    }

    EnumC0702Jy(long j2, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j2;
        this.A01 = mediaCacheFlag;
    }

    public static EnumC0702Jy A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        EnumC0702Jy[] values;
        for (EnumC0702Jy enumC0702Jy : values()) {
            if (enumC0702Jy.A01 == mediaCacheFlag) {
                return enumC0702Jy;
            }
        }
        return null;
    }
}
