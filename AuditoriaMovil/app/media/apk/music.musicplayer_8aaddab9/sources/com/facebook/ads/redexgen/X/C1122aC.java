package com.facebook.ads.redexgen.X;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.aC  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1122aC implements InterfaceC03956v {
    public static byte[] A01;
    public final /* synthetic */ C1113a3 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ SyslogConstants.LOG_ALERT);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 30, 11, 30, 31, 25};
    }

    public C1122aC(C1113a3 c1113a3) {
        this.A00 = c1113a3;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        return this.A00.A0A(A00(0, 6, 26), 1);
    }
}
