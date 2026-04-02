package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Vg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0988Vg implements EA {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{72, 87, 90, 91, 81, 17, 95, 72, 93};
    }

    public C0988Vg() {
    }

    @Override // com.facebook.ads.redexgen.X.EA
    public final int A65() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.X.EA
    public final MediaCodecInfo A66(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // com.facebook.ads.redexgen.X.EA
    public final boolean A8f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 51).equals(str);
    }

    @Override // com.facebook.ads.redexgen.X.EA
    public final boolean AEO() {
        return false;
    }
}
