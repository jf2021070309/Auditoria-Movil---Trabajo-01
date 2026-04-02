package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Er  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0567Er implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ F0 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-73, -39, -22, -33, -27, -28, -106, -36, -33, -30, -37, -106, -30, -27, -41, -38, -33, -28, -35, -106, -36, -41, -33, -30, -37, -38, -92, -66, -23, -15, -24, -26, -23, -37, -34, -57, -37, -24, -37, -31, -33, -20};
    }

    public RunnableC0567Er(F0 f0) {
        this.A00 = f0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0558Eg c0558Eg;
        DownloadAction.Deserializer[] deserializerArr;
        Handler handler;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            c0558Eg = this.A00.A09;
            deserializerArr = this.A00.A0E;
            DownloadAction[] A03 = c0558Eg.A03(deserializerArr);
            handler = this.A00.A07;
            handler.post(new RunnableC0566Eq(this, A03));
        }
    }
}
