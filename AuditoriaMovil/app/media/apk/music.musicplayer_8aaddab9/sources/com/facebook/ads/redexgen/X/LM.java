package com.facebook.ads.redexgen.X;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class LM implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C1046Xo A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 122, 125, 98, 97, 99, 104, 99, 116, 111, 101};
    }

    public LM(C1046Xo c1046Xo) {
        this.A00 = c1046Xo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A00(0, 4, 88));
            anonymousClass90.A03(1);
            anonymousClass90.A04(1);
            anonymousClass90.A08(false);
            this.A00.A06().A8z(A00(4, 7, SyslogConstants.LOG_ALERT), C04398z.A1O, anonymousClass90);
        } catch (Throwable otsl) {
            C0726Kz.A00(otsl, this);
        }
    }
}
