package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.61  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass61 {
    @Nullable
    public static AnonymousClass62 A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"dhICO", "mxKq80OLCiD", "i2W9TrIDW1srZxkJxV7foM0MgZvVXbWR", "HI2hESQONWq4EaTE0poPF0OJaSIxJaLc", "DAl184VBvvXhRHJ82dj3bqQv5TXH8TG3", "HKaWDYwPLWKyKiUqhpuc4RGInXEUU", "cSOfcLeIkAX6sPpwLxmVuA24IrFfyR3p", "KnRyMDjzSPNAoacBq98iQYDM8U9nlYJB"};

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (AnonymousClass61.class) {
            if (A00 == null) {
                return;
            }
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A00.ADz());
            anonymousClass90.A03(1);
            C1045Xn sdkContext = C8T.A00();
            if (sdkContext != null) {
                sdkContext.A06().A8y(A00(0, 9, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD), 3401, anonymousClass90);
            }
            AnonymousClass62 anonymousClass62 = A00;
            if (A03[1].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "kDYng9EYBsgXNgOEIL1h1gMPzmVJxAMa";
            strArr[6] = "TYxT1mxIdvKOfg1hbfM6O4XMHE5Nitia";
            anonymousClass62.reset();
        }
    }

    public static void A03(final long j2) {
        if (j2 > 0) {
            A00 = new C1180b8();
            new Thread(j2) { // from class: com.facebook.ads.redexgen.X.63
                public final long A00;

                {
                    this.A00 = j2;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    if (C0726Kz.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (Throwable th) {
                                C0726Kz.A00(th, this);
                                return;
                            }
                        } catch (InterruptedException unused) {
                        }
                        AnonymousClass61.A01();
                    }
                }
            };
        }
    }
}
