package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Tj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0941Tj extends L7 {
    public static byte[] A01;
    public static String[] A02 = {"562InPUOhACtlwCEtN", "R5lwX4z8RDFVh5E8umVQyGbxSoVGO", "CYUCoKvLVtAS439EMb", "ChKnavF9Nqo0oetaNymcfBGaHAWTYXo2", "g5ZzVDftJQYE4wszTnHA7JY3RdMW3", "1hyLjyvULyVtl4OO", "Eld6CqAd7cnvJnvbiWS", "Re88eRXq7VTIVsZrXxwUq3yVYBRsOkYZ"};
    public final /* synthetic */ Context A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, -123, -123, 98, 126, -125, 104, 121, Byte.MIN_VALUE, 107, 122, -121, -120, 126, -124, -125};
    }

    static {
        A02();
    }

    public C0941Tj(Context context) {
        this.A00 = context;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        int A022;
        if (C0730Ld.A02 == EnumC0729Lc.A02) {
            return;
        }
        SharedPreferences A00 = C0719Ks.A00(this.A00);
        String A002 = A00(0, 16, 10);
        int returnMinSdkVersion = A00.getInt(A002, -1);
        if (returnMinSdkVersion != -1) {
            int unused = C0730Ld.A00 = returnMinSdkVersion;
            C0730Ld.A02 = EnumC0729Lc.A02;
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            A022 = C0730Ld.A03(this.A00);
        } else {
            A022 = C0730Ld.A02(this.A00);
        }
        int unused2 = C0730Ld.A00 = A022;
        if (A02[7].charAt(31) == 71) {
            throw new RuntimeException();
        }
        A02[3] = "Y4NBnL2AiN9ppE2ANDhRNdYoO8WQhPKC";
        A00.edit().putInt(A002, A022).commit();
        C0730Ld.A02 = EnumC0729Lc.A02;
    }
}
