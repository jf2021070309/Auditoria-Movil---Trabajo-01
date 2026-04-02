package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Ae  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0469Ae {
    public static String[] A0C = {"L0u3smBC6U6OaYtXppAd31iOC3v5Qhxz", "mD", "DMmTpdJrujAgbmCwwmXMokmpSOB8XVVu", "Fa0SCWKpXCwAFqaC3HE", "LFAAfAeIJjtENyizMXbJJCIXxkMYQ2BS", "EOXOixXcPNGoqbhwUMphXmxbz6TL9K", "ydRMenJrqCbsHYuDZ17G4nGASKkEf2si", "4zZeHgY0eMzISLpxtPc37pmrQXWGSxn"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C0467Ac A04;
    public C0467Ac A05;
    public C0467Ac A06;
    public B1 A07;
    public Object A08;
    public boolean A09;
    public final C0489Az A0A = new C0489Az();
    public final B0 A0B = new B0();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C0468Ad A02(int i2, long j2, long j3) {
        FY fy = new FY(i2, j3);
        this.A07.A09(fy.A02, this.A0A);
        int A04 = this.A0A.A04(j2);
        long A09 = A04 == -1 ? Long.MIN_VALUE : this.A0A.A09(A04);
        boolean A0A = A0A(fy, A09);
        return new C0468Ad(fy, j2, A09, -9223372036854775807L, A09 == Long.MIN_VALUE ? this.A0A.A07() : A09, A0A, A0B(fy, A0A));
    }

    private long A00(int i2) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0A(i2, this.A0A, true).A03;
        int i3 = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A04(obj2)) != -1) {
            int oldFrontWindowIndex = this.A07.A09(oldFrontPeriodIndex, this.A0A).A00;
            if (oldFrontWindowIndex == i3) {
                return this.A03;
            }
        }
        for (C0467Ac A0E = A0E(); A0E != null; A0E = A0E.A01) {
            if (A0E.A09.equals(obj)) {
                return A0E.A02.A04.A03;
            }
        }
        for (C0467Ac A0E2 = A0E(); A0E2 != null; A0E2 = A0E2.A01) {
            int A04 = this.A07.A04(A0E2.A09);
            if (A04 != -1) {
                int holderWindowIndex = this.A07.A09(A04, this.A0A).A00;
                if (holderWindowIndex == i3) {
                    return A0E2.A02.A04.A03;
                }
            }
        }
        long j2 = this.A02;
        this.A02 = 1 + j2;
        return j2;
    }

    private C0468Ad A01(int i2, int i3, int i4, long durationUs, long j2) {
        long j3;
        FY fy = new FY(i2, i3, i4, j2);
        boolean A0A = A0A(fy, Long.MIN_VALUE);
        boolean A0B = A0B(fy, A0A);
        long A0A2 = this.A07.A09(fy.A02, this.A0A).A0A(fy.A00, fy.A01);
        if (i4 == this.A0A.A02(i3)) {
            j3 = this.A0A.A06();
        } else {
            j3 = 0;
        }
        return new C0468Ad(fy, j3, Long.MIN_VALUE, durationUs, A0A2, A0A, A0B);
    }

    @Nullable
    private C0468Ad A03(C0467Ac c0467Ac, long j2) {
        long j3;
        C0468Ad c0468Ad = c0467Ac.A02;
        if (c0468Ad.A06) {
            int A03 = this.A07.A03(c0468Ad.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (A03 == -1) {
                return null;
            }
            int i2 = this.A07.A0A(A03, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j4 = c0468Ad.A04.A03;
            if (this.A07.A0B(i2, this.A0B).A00 == A03) {
                long windowSequenceNumber = c0467Ac.A07();
                Pair<Integer, Long> A08 = this.A07.A08(this.A0B, this.A0A, i2, -9223372036854775807L, Math.max(0L, (windowSequenceNumber + c0468Ad.A01) - j2));
                if (A08 == null) {
                    return null;
                }
                Object nextPeriodUid = A08.first;
                A03 = ((Integer) nextPeriodUid).intValue();
                Object nextPeriodUid2 = A08.second;
                j3 = ((Long) nextPeriodUid2).longValue();
                Object nextPeriodUid3 = c0467Ac.A01;
                if (nextPeriodUid3 != null && c0467Ac.A01.A09.equals(obj)) {
                    j4 = c0467Ac.A01.A02.A04.A03;
                } else {
                    j4 = this.A02;
                    long startPositionUs = j4 + 1;
                    this.A02 = startPositionUs;
                }
            } else {
                j3 = 0;
            }
            return A06(A07(A03, j3, j4), j3, j3);
        }
        FY currentPeriodId = c0468Ad.A04;
        this.A07.A09(currentPeriodId.A02, this.A0A);
        if (currentPeriodId.A01()) {
            int adGroupIndex = currentPeriodId.A00;
            int A01 = this.A0A.A01(adGroupIndex);
            if (A01 == -1) {
                return null;
            }
            int adCountInCurrentAdGroup = this.A0A.A03(adGroupIndex, currentPeriodId.A01);
            if (adCountInCurrentAdGroup < A01) {
                if (!this.A0A.A0E(adGroupIndex, adCountInCurrentAdGroup)) {
                    return null;
                }
                return A01(currentPeriodId.A02, adGroupIndex, adCountInCurrentAdGroup, c0468Ad.A00, currentPeriodId.A03);
            }
            return A02(currentPeriodId.A02, c0468Ad.A00, currentPeriodId.A03);
        }
        long j5 = c0468Ad.A02;
        if (A0C[6].charAt(23) != 'A') {
            throw new RuntimeException();
        }
        A0C[1] = "6G";
        if (j5 != Long.MIN_VALUE) {
            int A05 = this.A0A.A05(c0468Ad.A02);
            if (A05 == -1) {
                return A02(currentPeriodId.A02, c0468Ad.A02, currentPeriodId.A03);
            }
            int A02 = this.A0A.A02(A05);
            if (!this.A0A.A0E(A05, A02)) {
                return null;
            }
            return A01(currentPeriodId.A02, A05, A02, c0468Ad.A02, currentPeriodId.A03);
        }
        int A00 = this.A0A.A00();
        if (A00 == 0) {
            return null;
        }
        int i3 = A00 - 1;
        if (this.A0A.A09(i3) != Long.MIN_VALUE || this.A0A.A0D(i3)) {
            return null;
        }
        int adGroupCount = this.A0A.A02(i3);
        if (!this.A0A.A0E(i3, adGroupCount)) {
            return null;
        }
        long A07 = this.A0A.A07();
        int i4 = currentPeriodId.A02;
        long contentDurationUs = currentPeriodId.A03;
        return A01(i4, i3, adGroupCount, A07, contentDurationUs);
    }

    private C0468Ad A04(C0468Ad c0468Ad, FY fy) {
        long A07;
        long j2 = c0468Ad.A03;
        long endPositionUs = c0468Ad.A02;
        boolean A0A = A0A(fy, endPositionUs);
        boolean A0B = A0B(fy, A0A);
        this.A07.A09(fy.A02, this.A0A);
        boolean isLastInPeriod = fy.A01();
        if (isLastInPeriod) {
            A07 = this.A0A.A0A(fy.A00, fy.A01);
        } else if (A0C[2].charAt(30) != 'V') {
            throw new RuntimeException();
        } else {
            A0C[2] = "zTzAUiYM1BrQqeObFTyCKDEgqKKR2HVC";
            A07 = endPositionUs == Long.MIN_VALUE ? this.A0A.A07() : endPositionUs;
        }
        return new C0468Ad(fy, j2, endPositionUs, c0468Ad.A00, A07, A0A, A0B);
    }

    private C0468Ad A05(C0471Ag c0471Ag) {
        return A06(c0471Ag.A04, c0471Ag.A01, c0471Ag.A02);
    }

    private C0468Ad A06(FY fy, long j2, long j3) {
        this.A07.A09(fy.A02, this.A0A);
        if (fy.A01()) {
            if (!this.A0A.A0E(fy.A00, fy.A01)) {
                return null;
            }
            return A01(fy.A02, fy.A00, fy.A01, j2, fy.A03);
        }
        return A02(fy.A02, j3, fy.A03);
    }

    private FY A07(int i2, long j2, long j3) {
        this.A07.A09(i2, this.A0A);
        int A05 = this.A0A.A05(j2);
        if (A05 == -1) {
            return new FY(i2, j3);
        }
        return new FY(i2, A05, this.A0A.A02(A05), j3);
    }

    private boolean A08() {
        C0467Ac A0E = A0E();
        if (A0E == null) {
            return true;
        }
        while (true) {
            int A03 = this.A07.A03(A0E.A02.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            while (A0E.A01 != null && !A0E.A02.A06) {
                A0E = A0E.A01;
            }
            if (A03 == -1 || A0E.A01 == null || A0E.A01.A02.A04.A02 != A03) {
                break;
            }
            A0E = A0E.A01;
        }
        boolean A0S = A0S(A0E);
        A0E.A02 = A04(A0E.A02, A0E.A02.A04);
        if (A0S) {
            boolean A0P = A0P();
            if (A0C[7].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "GuDKwHudSgXHMcEdzJg";
            strArr[5] = "TrxgVcYEVqGsLQMDNrMk5TDxlvQhmk";
            return !A0P;
        }
        return true;
    }

    private boolean A09(C0467Ac c0467Ac, C0468Ad c0468Ad) {
        C0468Ad c0468Ad2 = c0467Ac.A02;
        return c0468Ad2.A03 == c0468Ad.A03 && c0468Ad2.A02 == c0468Ad.A02 && c0468Ad2.A04.equals(c0468Ad.A04);
    }

    private boolean A0A(FY fy, long j2) {
        int A00 = this.A07.A09(fy.A02, this.A0A).A00();
        if (A00 == 0) {
            return true;
        }
        int i2 = A00 - 1;
        boolean A01 = fy.A01();
        if (this.A0A.A09(i2) != Long.MIN_VALUE) {
            return !A01 && j2 == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i2);
        if (postrollAdCount == -1) {
            return false;
        }
        if (A01 && fy.A00 == i2 && fy.A01 == postrollAdCount + (-1)) {
            return true;
        }
        return !A01 && this.A0A.A02(i2) == postrollAdCount;
    }

    private boolean A0B(FY fy, boolean z) {
        return !this.A07.A0B(this.A07.A09(fy.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(fy.A02, this.A0A, this.A0B, this.A01, this.A09) && z;
    }

    public final C0467Ac A0C() {
        C0467Ac c0467Ac = this.A05;
        if (c0467Ac != null) {
            if (c0467Ac == this.A06) {
                this.A06 = c0467Ac.A01;
            }
            this.A05.A0D();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            this.A05 = this.A05.A01;
        } else {
            C0467Ac c0467Ac2 = this.A04;
            this.A05 = c0467Ac2;
            this.A06 = c0467Ac2;
        }
        return this.A05;
    }

    public final C0467Ac A0D() {
        C0467Ac c0467Ac = this.A06;
        IJ.A04((c0467Ac == null || c0467Ac.A01 == null) ? false : true);
        if (A0C[7].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "7koWfuH1ta1EVLUWQFGgmnLKJoN2uwxl";
        strArr[0] = "1LlHzPavDhI1SmiN1gPMgWkfsuEkohyV";
        this.A06 = this.A06.A01;
        return this.A06;
    }

    public final C0467Ac A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final C0467Ac A0F() {
        return this.A04;
    }

    public final C0467Ac A0G() {
        return this.A05;
    }

    public final C0467Ac A0H() {
        return this.A06;
    }

    @Nullable
    public final C0468Ad A0I(long j2, C0471Ag c0471Ag) {
        C0467Ac c0467Ac = this.A04;
        if (c0467Ac == null) {
            return A05(c0471Ag);
        }
        return A03(c0467Ac, j2);
    }

    public final C0468Ad A0J(C0468Ad c0468Ad, int i2) {
        return A04(c0468Ad, c0468Ad.A04.A00(i2));
    }

    public final VM A0K(InterfaceC0485Au[] interfaceC0485AuArr, HT ht, HW hw, InterfaceC0576Fa interfaceC0576Fa, Object obj, C0468Ad c0468Ad) {
        long A07;
        C0467Ac c0467Ac = this.A04;
        if (c0467Ac != null) {
            A07 = c0467Ac.A07() + this.A04.A02.A01;
        } else {
            A07 = c0468Ad.A03;
        }
        C0467Ac c0467Ac2 = new C0467Ac(interfaceC0485AuArr, A07, ht, hw, interfaceC0576Fa, obj, c0468Ad);
        if (this.A04 != null) {
            IJ.A04(A0P());
            this.A04.A01 = c0467Ac2;
        }
        this.A08 = null;
        this.A04 = c0467Ac2;
        this.A00++;
        return c0467Ac2.A08;
    }

    public final FY A0L(int i2, long j2) {
        return A07(i2, j2, A00(i2));
    }

    public final void A0M(long j2) {
        C0467Ac c0467Ac = this.A04;
        if (c0467Ac != null) {
            c0467Ac.A0G(j2);
        }
    }

    public final void A0N(B1 b1) {
        this.A07 = b1;
    }

    public final void A0O(boolean z) {
        C0467Ac A0E = A0E();
        if (A0E != null) {
            this.A08 = z ? A0E.A09 : null;
            this.A03 = A0E.A02.A04.A03;
            A0E.A0D();
            A0S(A0E);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0P() {
        return this.A05 != null;
    }

    public final boolean A0Q() {
        C0467Ac c0467Ac = this.A04;
        return c0467Ac == null || (!c0467Ac.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != -9223372036854775807L && this.A00 < 100);
    }

    public final boolean A0R(int i2) {
        this.A01 = i2;
        return A08();
    }

    public final boolean A0S(C0467Ac c0467Ac) {
        IJ.A04(c0467Ac != null);
        boolean z = false;
        this.A04 = c0467Ac;
        while (c0467Ac.A01 != null) {
            c0467Ac = c0467Ac.A01;
            if (c0467Ac == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            c0467Ac.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z;
    }

    public final boolean A0T(VM vm) {
        C0467Ac c0467Ac = this.A04;
        return c0467Ac != null && c0467Ac.A08 == vm;
    }

    public final boolean A0U(FY fy, long j2) {
        int i2 = fy.A02;
        C0467Ac c0467Ac = null;
        for (C0467Ac A0E = A0E(); A0E != null; A0E = A0E.A01) {
            if (c0467Ac == null) {
                A0E.A02 = A0J(A0E.A02, i2);
            } else {
                if (i2 != -1) {
                    Object obj = A0E.A09;
                    if (A0C[2].charAt(30) != 'V') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0C;
                    strArr[4] = "cRCq0i1JCmFgPvSHr0NI30IAvGtOkPUO";
                    strArr[0] = "aqPjT6JpLbsnsfh6iIpVbm4IivKwupA2";
                    if (obj.equals(this.A07.A0A(i2, this.A0A, true).A03)) {
                        C0468Ad A03 = A03(c0467Ac, j2);
                        if (A03 == null) {
                            return true ^ A0S(c0467Ac);
                        }
                        A0E.A02 = A0J(A0E.A02, i2);
                        if (!A09(A0E, A03)) {
                            return true ^ A0S(c0467Ac);
                        }
                    }
                }
                return true ^ A0S(c0467Ac);
            }
            if (A0E.A02.A06) {
                i2 = this.A07.A03(i2, this.A0A, this.A0B, this.A01, this.A09);
            }
            c0467Ac = A0E;
        }
        return true;
    }

    public final boolean A0V(boolean z) {
        this.A09 = z;
        return A08();
    }
}
