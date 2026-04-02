package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public class U8 implements C7M {
    public static byte[] A03;
    public static String[] A04 = {"8KjqebZv60QJkTDxRMgw9", "thfRn5pDzJN70UFYfVIlaB6cN7Gudk2R", "C9BVpw9UV8RgNssPir2gScGxH", "7AiIJI7TwWfHsESFux14U5S4ACJbRhuU", "Q7zUSmRtSU1V7fItr4R7SI8x29M95mvp", "Azfz", "38Oiuq4LYjnMY2HJpsmmy", "sSYHnhmgAc6ueqp"};
    public final /* synthetic */ C1315dP A00;
    public final /* synthetic */ U1 A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-41, -14, -6, -3, -10, -11, -79, 5, 0, -79, -11, 0, 8, -1, -3, 0, -14, -11, -79, -14, -79, -2, -10, -11, -6, -14, -65};
    }

    static {
        A01();
    }

    public U8(U1 u1, C1315dP c1315dP, boolean z) {
        this.A01 = u1;
        this.A00 = c1315dP;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAF() {
        C1046Xo c1046Xo;
        long j2;
        U0 u0;
        U0 u02;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 49);
        c1046Xo = this.A01.A0c;
        C0R A0D = c1046Xo.A0D();
        j2 = this.A01.A00;
        A0D.A2a(MC.A01(j2), adErrorType.getErrorCode(), A00);
        u0 = this.A01.A0G;
        if (u0 != null) {
            u02 = this.A01.A0G;
            u02.AAh(KG.A01(adErrorType, A00));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
        if (r1.equals(com.facebook.ads.redexgen.X.EnumC0702Jy.A04) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
        r0 = r5.A01.A0s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
        if (r0 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
        r0 = r5.A01.A0G;
        r0.ABQ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
        if (r5.A02 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
        r0 = r5.A01.A0c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
        if (com.facebook.ads.redexgen.X.JQ.A1A(r0) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
        if (r5.A01.A11() == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
        if (r5.A01.A11().A0r() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
        r4 = r5.A01;
        r3 = r4.A0c;
        r4.A0M = com.facebook.ads.redexgen.X.P5.A01(r3, r5.A01.A11(), 4, new com.facebook.ads.redexgen.X.U9(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
        r0 = r5.A01.A0G;
        r0.A9u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
        if (r1.equals(com.facebook.ads.redexgen.X.EnumC0702Jy.A04) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    @Override // com.facebook.ads.redexgen.X.C7M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AAM() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.U1 r1 = r5.A01
            com.facebook.ads.redexgen.X.dP r0 = r5.A00
            r1.A0a = r0
            boolean r0 = r5.A02
            if (r0 == 0) goto L39
            com.facebook.ads.redexgen.X.FL r0 = com.facebook.ads.redexgen.X.U1.A0H(r1)
            if (r0 == 0) goto L39
            com.facebook.ads.redexgen.X.U1 r0 = r5.A01
            com.facebook.ads.redexgen.X.FL r3 = com.facebook.ads.redexgen.X.U1.A0H(r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.U8.A04
            r0 = 4
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Le1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.U8.A04
            java.lang.String r1 = "VPn7Tjnl2g2ZoGzxCsTNTuvzL6QbPFmz"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "YMqnQw7eyVGctn758ocTTHmAed4stf5y"
            r0 = 1
            r2[r0] = r1
            r3.A0F()
        L39:
            com.facebook.ads.redexgen.X.U1 r0 = r5.A01
            com.facebook.ads.redexgen.X.U0 r0 = com.facebook.ads.redexgen.X.U1.A0N(r0)
            if (r0 == 0) goto Lbd
            com.facebook.ads.redexgen.X.U1 r3 = r5.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.U8.A04
            r0 = 4
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lc8
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.U8.A04
            java.lang.String r1 = "6qlMxmRDBvH4L6kOfkSoYm3n5"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "yt5qGGbrsd8TRcD"
            r0 = 7
            r2[r0] = r1
            com.facebook.ads.redexgen.X.Jy r1 = com.facebook.ads.redexgen.X.U1.A0J(r3)
            com.facebook.ads.redexgen.X.Jy r0 = com.facebook.ads.redexgen.X.EnumC0702Jy.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L80
        L6f:
            com.facebook.ads.redexgen.X.U1 r0 = r5.A01
            boolean r0 = com.facebook.ads.redexgen.X.U1.A0y(r0)
            if (r0 != 0) goto L80
            com.facebook.ads.redexgen.X.U1 r0 = r5.A01
            com.facebook.ads.redexgen.X.U0 r0 = com.facebook.ads.redexgen.X.U1.A0N(r0)
            r0.ABQ()
        L80:
            boolean r0 = r5.A02
            if (r0 == 0) goto Lbd
            com.facebook.ads.redexgen.X.U1 r0 = r5.A01
            com.facebook.ads.redexgen.X.Xo r0 = com.facebook.ads.redexgen.X.U1.A0I(r0)
            boolean r0 = com.facebook.ads.redexgen.X.JQ.A1A(r0)
            if (r0 == 0) goto Lbe
            com.facebook.ads.redexgen.X.U1 r0 = r5.A01
            com.facebook.ads.redexgen.X.18 r0 = r0.A11()
            if (r0 == 0) goto Lbe
            com.facebook.ads.redexgen.X.U1 r0 = r5.A01
            com.facebook.ads.redexgen.X.18 r0 = r0.A11()
            boolean r0 = r0.A0r()
            if (r0 == 0) goto Lbe
            com.facebook.ads.redexgen.X.U1 r4 = r5.A01
            com.facebook.ads.redexgen.X.Xo r3 = com.facebook.ads.redexgen.X.U1.A0I(r4)
            com.facebook.ads.redexgen.X.U1 r0 = r5.A01
            com.facebook.ads.redexgen.X.18 r2 = r0.A11()
            r1 = 4
            com.facebook.ads.redexgen.X.U9 r0 = new com.facebook.ads.redexgen.X.U9
            r0.<init>(r5)
            com.facebook.ads.redexgen.X.P4 r0 = com.facebook.ads.redexgen.X.P5.A01(r3, r2, r1, r0)
            com.facebook.ads.redexgen.X.U1.A0U(r4, r0)
        Lbd:
            return
        Lbe:
            com.facebook.ads.redexgen.X.U1 r0 = r5.A01
            com.facebook.ads.redexgen.X.U0 r0 = com.facebook.ads.redexgen.X.U1.A0N(r0)
            r0.A9u()
            goto Lbd
        Lc8:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.U8.A04
            java.lang.String r1 = "NqrZxTPTxSSE484geuNhnuVXrlMqLfJJ"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "nXt660y1rE1HMRNPODglVba6eKGAZLBD"
            r0 = 1
            r2[r0] = r1
            com.facebook.ads.redexgen.X.Jy r1 = com.facebook.ads.redexgen.X.U1.A0J(r3)
            com.facebook.ads.redexgen.X.Jy r0 = com.facebook.ads.redexgen.X.EnumC0702Jy.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L80
            goto L6f
        Le1:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.U8.AAM():void");
    }
}
