package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class WR implements InterfaceC0517Cc {
    public static byte[] A0E;
    public static String[] A0F = {"ydp2W5xsf3wxxmCItZRtLRLpaCcQN61V", "ZzeQ67WJ6", "MfxT7BiZm", "QAZkmCdKFAHfN7ilsO4NsWCm7AIOdsAB", "uXA2W", "sq6CLgUZZ", "GhmTF3RrY3ydpwpSZCJZy8aIHeXkOr61", "710SvX7FP4z"};
    public static final InterfaceC0519Cf A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Ce A04;
    public InterfaceC0525Co A05;
    public WS A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final C0520Cg A0A;
    public final Ch A0B;
    public final Ci A0C;
    public final C0660Ii A0D;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{117, 82, 90, 83, 97, 87, 83, 64, 81, 90, 87, 86, 18, 70, 93, 93, 18, 95, 83, 92, 75, 18, 80, 75, 70, 87, 65, 28, 0, 20, 4, 31, 11, 58, 61, 52};
    }

    static {
        A05();
        A0G = new WT();
        A0J = C0676Iy.A08(A04(32, 4, 79));
        A0H = C0676Iy.A08(A04(0, 4, 32));
        A0I = C0676Iy.A08(A04(28, 4, 74));
    }

    public WR() {
        this(0);
    }

    public WR(int i2) {
        this(i2, -9223372036854775807L);
    }

    public WR(int i2, long j2) {
        this.A08 = i2;
        this.A09 = j2;
        this.A0D = new C0660Ii(10);
        this.A0C = new Ci();
        this.A0A = new C0520Cg();
        this.A02 = -9223372036854775807L;
        this.A0B = new Ch();
    }

    private int A00(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            interfaceC0518Cd.AE8();
            String[] strArr = A0F;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[0] = "k6Z5PTGWNQqxWVGEWp2g14fMjsllqw2H";
            strArr2[6] = "hJNgcdrxKvM79jF48EqDHnrsGOClnbxU";
            if (!interfaceC0518Cd.AD5(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int A08 = this.A0D.A08();
            if (!A06(A08, this.A01) || Ci.A00(A08) == -1) {
                interfaceC0518Cd.AEy(1);
                this.A01 = 0;
                return 0;
            }
            Ci.A04(A08, this.A0C);
            if (this.A02 == -9223372036854775807L) {
                this.A02 = this.A06.A7d(interfaceC0518Cd.A7E());
                if (this.A09 != -9223372036854775807L) {
                    this.A02 += this.A09 - this.A06.A7d(0L);
                }
            }
            this.A00 = this.A0C.A02;
        }
        int AEK = this.A05.AEK(interfaceC0518Cd, this.A00, true);
        if (AEK == -1) {
            return -1;
        }
        this.A00 -= AEK;
        if (this.A00 > 0) {
            return 0;
        }
        this.A05.AEM(this.A02 + ((this.A03 * 1000000) / this.A0C.A03), 1, this.A0C.A02, 0, null);
        this.A03 += this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    public static int A01(C0660Ii c0660Ii, int i2) {
        if (c0660Ii.A07() >= i2 + 4) {
            c0660Ii.A0Y(i2);
            int A08 = c0660Ii.A08();
            if (A08 == A0J || A08 == A0H) {
                return A08;
            }
        }
        if (c0660Ii.A07() >= 40) {
            c0660Ii.A0Y(36);
            int A082 = c0660Ii.A08();
            int i3 = A0I;
            if (A082 == i3) {
                return i3;
            }
            return 0;
        }
        return 0;
    }

    private WS A02(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        interfaceC0518Cd.AD4(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        Ci.A04(this.A0D.A08(), this.A0C);
        return new DJ(interfaceC0518Cd.A6s(), interfaceC0518Cd.A7E(), this.A0C);
    }

    private WS A03(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        C0660Ii c0660Ii = new C0660Ii(this.A0C.A02);
        interfaceC0518Cd.AD4(c0660Ii.A00, 0, this.A0C.A02);
        int i2 = 21;
        if ((this.A0C.A05 & 1) != 0) {
            if (this.A0C.A01 != 1) {
                i2 = 36;
            }
        } else {
            int seekHeader = this.A0C.A01;
            if (seekHeader == 1) {
                i2 = 13;
            }
        }
        int A01 = A01(c0660Ii, i2);
        int seekHeader2 = A0J;
        if (A01 != seekHeader2) {
            int seekHeader3 = A0H;
            if (A01 != seekHeader3) {
                int seekHeader4 = A0I;
                if (A01 == seekHeader4) {
                    DH A00 = DH.A00(interfaceC0518Cd.A6s(), interfaceC0518Cd.A7E(), this.A0C, c0660Ii);
                    interfaceC0518Cd.AEy(this.A0C.A02);
                    return A00;
                }
                interfaceC0518Cd.AE8();
                return null;
            }
        }
        DD A012 = DD.A01(interfaceC0518Cd.A6s(), interfaceC0518Cd.A7E(), this.A0C, c0660Ii);
        if (A012 != null && !this.A0A.A03()) {
            interfaceC0518Cd.AE8();
            int seekHeader5 = i2 + 141;
            interfaceC0518Cd.A3J(seekHeader5);
            interfaceC0518Cd.AD4(this.A0D.A00, 0, 3);
            this.A0D.A0Y(0);
            C0520Cg c0520Cg = this.A0A;
            int seekHeader6 = this.A0D.A0G();
            c0520Cg.A04(seekHeader6);
        }
        int seekHeader7 = this.A0C.A02;
        interfaceC0518Cd.AEy(seekHeader7);
        if (A012 == null || A012.A8g()) {
            return A012;
        }
        int seekHeader8 = A0H;
        if (A01 == seekHeader8) {
            return A02(interfaceC0518Cd);
        }
        return A012;
    }

    public static boolean A06(int i2, long j2) {
        return ((long) ((-128000) & i2)) == ((-128000) & j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r15 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r14.AEy(r5 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        r13.A01 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        r14.AE8();
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A07(com.facebook.ads.redexgen.X.InterfaceC0518Cd r14, boolean r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WR.A07(com.facebook.ads.redexgen.X.Cd, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void A8I(Ce ce) {
        this.A04 = ce;
        this.A05 = this.A04.AFI(0, 1);
        this.A04.A5C();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final int ADU(InterfaceC0518Cd interfaceC0518Cd, C0521Cj c0521Cj) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            try {
                A07(interfaceC0518Cd, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            this.A06 = A03(interfaceC0518Cd);
            WS ws = this.A06;
            if (ws == null || (!ws.A8g() && (this.A08 & 1) != 0)) {
                WS A02 = A02(interfaceC0518Cd);
                String[] strArr = A0F;
                if (strArr[2].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0F[3] = "vRoDRHRtSRtNnEEJ64K4r5ogXxosELXw";
                this.A06 = A02;
            }
            this.A04.AER(this.A06);
            this.A05.A5U(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(interfaceC0518Cd);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void AEQ(long j2, long j3) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final boolean AF0(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        return A07(interfaceC0518Cd, true);
    }
}
