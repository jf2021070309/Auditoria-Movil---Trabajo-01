package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
/* loaded from: assets/audience_network.dex */
public final class XM implements C8W {
    public static XM A06;
    public static byte[] A07;
    public static String[] A08 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    @Nullable
    public C0U A00;
    @Nullable
    public C8V A01;
    @Nullable
    public InterfaceC04278l A02;
    @Nullable
    public C9P A03;
    @Nullable
    public InterfaceC0696Js A04;
    @Nullable
    public GR A05;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A06(int r4, int r5, int r6) {
        /*
            byte[] r1 = com.facebook.ads.redexgen.X.XM.A07
            int r0 = r4 + r5
            byte[] r3 = java.util.Arrays.copyOfRange(r1, r4, r0)
            r4 = 0
        L9:
            int r5 = r3.length
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XM.A08
            r0 = 6
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
        L1c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XM.A08
            java.lang.String r1 = "Hv2WK1fJh7GnXaP"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "jwUFRNkRPBL5IaL"
            r0 = 7
            r2[r0] = r1
            if (r4 >= r5) goto L5c
            r5 = r3[r4]
            int r5 = r5 - r6
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XM.A08
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L48
            goto L1c
        L48:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.XM.A08
            java.lang.String r1 = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw"
            r0 = 3
            r2[r0] = r1
            int r0 = r5 + (-98)
            byte r0 = (byte) r0
            r3[r4] = r0
            int r4 = r4 + 1
            goto L9
        L5c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XM.A06(int, int, int):java.lang.String");
    }

    public static void A07() {
        A07 = new byte[]{-63, -11, -56, -55, -14, -57, -12, -58, -16, 2, 16, 16, 6, 12, 11, -67, 1, -2, 17, -2, -67, 6, 11, 6, 17, 6, -2, 9, 6, 23, 2, 1, 33, 20, 31, 30, 33, 35, 2, 20, 34, 34, 24, 30, 29, -13, 16, 35, 16, -8, 29, 24, 35, 24, 16, 27, 24, 41, 20, 19};
        if (A08[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    static {
        A07();
    }

    @Nullable
    public static InterfaceC03595k A00(C1045Xn c1045Xn, @Nullable GR gr) {
        if (!JQ.A19(c1045Xn) || gr == null) {
            return null;
        }
        return AbstractC03605l.A00().A01(gr);
    }

    public static InterfaceC04278l A01(C1045Xn c1045Xn) {
        return C8m.A00().A01(c1045Xn, new XT());
    }

    public static synchronized XM A02() {
        XM xm;
        String[] strArr = A08;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[2] = "yNOYv8BJbeG1jc93xecDuC4SV0M6ZsAO";
        strArr2[3] = "rgM7W1LhEjhuRpvAxAxTebmxK2ArHzjw";
        synchronized (XM.class) {
            if (A06 == null) {
                A06 = new XM();
            }
            xm = A06;
        }
        return xm;
    }

    @Nullable
    public static InterfaceC0875Qv A03(C1045Xn c1045Xn) {
        if (!JQ.A15(c1045Xn)) {
            return null;
        }
        return RD.A01(c1045Xn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8W
    @Nullable
    /* renamed from: A04 */
    public final synchronized GR A7c() {
        return this.A05;
    }

    @Nullable
    public static GR A05(C1045Xn c1045Xn, InterfaceC04278l interfaceC04278l, @Nullable InterfaceC0875Qv interfaceC0875Qv) {
        if (!JQ.A1o(c1045Xn) || interfaceC0875Qv == null) {
            return null;
        }
        return AbstractC0880Ra.A00().A01(c1045Xn, interfaceC04278l, interfaceC0875Qv, C0715Kn.A04(c1045Xn), new XN(new C0709Kg(c1045Xn, A06(0, 0, 122), null, KL.A07, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, 0, AdSettings.isTestMode(c1045Xn), AdSettings.isMixedAudience(), new KQ(), M3.A01(JQ.A0H(c1045Xn)), null, null), c1045Xn), RY.A00().A00());
    }

    public static void A08() {
        String A062 = A06(32, 28, 77);
        if (A08[5].length() == 20) {
            throw new RuntimeException();
        }
        A08[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        KU.A05(A062, A06(8, 24, 59), A06(0, 8, 46));
    }

    public static void A09(C1045Xn c1045Xn, @Nullable InterfaceC03595k interfaceC03595k) {
        if (!JQ.A19(c1045Xn) || interfaceC03595k == null) {
            return;
        }
        AbstractC03575i.A00().A01(interfaceC03595k, c1045Xn);
    }

    public static void A0A(C1045Xn c1045Xn, @Nullable GR gr) {
        if (!JQ.A0h(c1045Xn) || gr == null) {
            return;
        }
        new AnonymousClass65(c1045Xn, gr, new AnonymousClass66(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1045Xn c1045Xn, @Nullable GR gr) {
        if (gr == null) {
            return;
        }
        JT.A00(c1045Xn, gr);
    }

    public final synchronized void A0C(C1045Xn c1045Xn) {
        if (this.A05 != null) {
            return;
        }
        this.A02 = A01(c1045Xn);
        this.A05 = A05(c1045Xn, this.A02, A03(c1045Xn));
        A09(c1045Xn, A00(c1045Xn, this.A05));
        A0A(c1045Xn, this.A05);
        A0B(c1045Xn, this.A05);
        if (this.A05 != null) {
            this.A05.A5T();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final InterfaceC0684Jg A5b(C1045Xn c1045Xn) {
        return UN.A01(c1045Xn);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C8V A5p(C8U c8u) {
        if (this.A01 == null) {
            this.A01 = new XO(this);
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized InterfaceC04278l A6K(C8U c8u) {
        if (this.A02 == null) {
            this.A02 = A01(c8u.A00());
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized InterfaceC04388y A6L(C8U c8u) {
        return new C1034Xc(c8u);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C8X A6U(C8U c8u) {
        E3 e3;
        e3 = new E3(this, c8u);
        String[] strArr = A08;
        if (strArr[4].charAt(26) != strArr[0].charAt(26)) {
            throw new RuntimeException();
        }
        A08[1] = "2Vt1OUprKjNjnyD3";
        return e3;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    @Nullable
    public final synchronized C0U A6h(C8U c8u) {
        if (!JQ.A0r(c8u)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0V.A00().A01(new XR(c8u));
        }
        C0U c0u = this.A00;
        if (A08[5].length() != 20) {
            String[] strArr = A08;
            strArr[4] = "VIV2EvMRfEPiWlvmDKty9fFKFHJul9Yn";
            strArr[0] = "0wfCQdIt8NwFYvPKQ0QtM4LE4vJ9WdpV";
            return c0u;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C8Z A7K(C8U c8u) {
        return new XP(c8u);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final C1045Xn A7L(Context context) {
        C1045Xn A00 = C8T.A00();
        if (A00 == null) {
            C1045Xn c1045Xn = new C1045Xn(context, this);
            C8T.A01(c1045Xn);
            return c1045Xn;
        }
        return A00;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized InterfaceC0696Js A7M(C1045Xn c1045Xn) {
        if (this.A04 == null) {
            this.A04 = new UU(c1045Xn);
        }
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C9P A7S() {
        if (this.A03 == null) {
            this.A03 = new C9P();
            A08();
        }
        return this.A03;
    }
}
