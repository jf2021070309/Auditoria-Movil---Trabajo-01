package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.Xt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1051Xt extends L7 {
    public static byte[] A02;
    public final /* synthetic */ C1050Xs A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, 22, 80, 87, 95, 90, 24, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public C1051Xt(C1050Xs c1050Xs, AtomicBoolean atomicBoolean) {
        this.A00 = c1050Xs;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        C8U c8u;
        long j2;
        C8U c8u2;
        long j3;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0G(EnumC0691Jn.A0H);
                c8u2 = this.A00.A02.A04;
                C7N c7n = this.A00.A01;
                int i2 = C7X.A00;
                j3 = this.A00.A02.A00;
                C7X.A02(c8u2, c7n, i2, A00(11, 14, 17), j3);
                this.A00.A02.A0R();
                this.A00.A00.AAM();
                return;
            }
            this.A00.A02.A0G(EnumC0691Jn.A0G);
            c8u = this.A00.A02.A04;
            C7N c7n2 = this.A00.A01;
            int i3 = C7X.A04;
            j2 = this.A00.A02.A00;
            C7X.A02(c8u, c7n2, i3, A00(0, 11, 41), j2);
            this.A00.A02.A0S();
            this.A00.A00.AAF();
        }
    }
}
