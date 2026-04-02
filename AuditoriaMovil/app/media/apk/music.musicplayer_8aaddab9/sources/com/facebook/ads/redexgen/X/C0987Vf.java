package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Arrays;
@TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
/* renamed from: com.facebook.ads.redexgen.X.Vf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0987Vf implements EA {
    public static byte[] A02;
    public MediaCodecInfo[] A00;
    public final int A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 39);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 28, 26, 12, 11, 28, 84, 9, 21, 24, 0, 27, 24, 26, 18};
    }

    public C0987Vf(boolean z) {
        this.A01 = z ? 1 : 0;
    }

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.X.EA
    public final int A65() {
        A01();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.EA
    public final MediaCodecInfo A66(int i2) {
        A01();
        return this.A00[i2];
    }

    @Override // com.facebook.ads.redexgen.X.EA
    public final boolean A8f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A00(0, 15, 94));
    }

    @Override // com.facebook.ads.redexgen.X.EA
    public final boolean AEO() {
        return true;
    }
}
