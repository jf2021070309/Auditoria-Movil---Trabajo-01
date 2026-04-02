package com.facebook.ads.redexgen.X;

import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class WI implements InterfaceC0517Cc, InterfaceC0522Cl {
    public static byte[] A0J;
    public static String[] A0K = {"0jSfxoXEMfCjtmnyDugkNcQJRjSOySMa", "bnCyjA5DcUmWUqivzOXdDI", "awYt8cnKxKdhDKIItvFTiUYUED9yM0q1", "Luabopmg5NHaS5SoCXeHIbwAQFsLRvJ0", "odfzLqPoxtdmNhQ8QVXSS2", "Wo8IxRBaFRXe4oQbEdt7BomqryNllMGC", "1wQy", "sEQm6Nsu4XqoPKwwi3EdYrJfunZcOKFC"};
    public static final InterfaceC0519Cf A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public Ce A09;
    public C0660Ii A0A;
    public boolean A0B;
    public DI[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C0660Ii A0F;
    public final C0660Ii A0G;
    public final C0660Ii A0H;
    public final ArrayDeque<WQ> A0I;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{57, 12, 23, 21, 88, 11, 17, 2, 29, 88, 20, 29, 11, 11, 88, 12, 16, 25, 22, 88, 16, 29, 25, 28, 29, 10, 88, 20, 29, 22, 31, 12, 16, 88, 80, 13, 22, 11, 13, 8, 8, 23, 10, 12, 29, 28, 81, 86, 4, 1, 85, 85};
    }

    static {
        A07();
        A0L = new WJ();
        A0M = C0676Iy.A08(A04(48, 4, 105));
    }

    public WI() {
        this(0);
    }

    public WI(int i2) {
        this.A0E = i2;
        this.A0F = new C0660Ii(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C0660Ii(C0656Ie.A03);
        this.A0G = new C0660Ii(4);
        this.A06 = -1;
    }

    private int A00(long preferredSkipAmount) {
        long j2 = Long.MAX_VALUE;
        int i2 = 1;
        int i3 = -1;
        long j3 = Long.MAX_VALUE;
        long j4 = Long.MAX_VALUE;
        int trackIndex = 1;
        int sampleIndex = -1;
        int i4 = 0;
        while (true) {
            DI[] diArr = this.A0C;
            if (i4 >= diArr.length) {
                break;
            }
            DI di = diArr[i4];
            int i5 = di.A00;
            if (i5 != di.A03.A01) {
                long j5 = di.A03.A06[i5];
                long j6 = this.A0D[i4][i5];
                long j7 = j5 - preferredSkipAmount;
                int i6 = (j7 < 0 || j7 >= 262144) ? 1 : 0;
                if ((i6 == 0 && i2 != 0) || (i6 == i2 && j7 < j2)) {
                    i2 = i6;
                    j2 = j7;
                    i3 = i4;
                    j3 = j6;
                }
                if (j6 < j4) {
                    j4 = j6;
                    trackIndex = i6;
                    sampleIndex = i4;
                }
            }
            i4++;
        }
        int i7 = (j4 > Long.MAX_VALUE ? 1 : (j4 == Long.MAX_VALUE ? 0 : -1));
        if (A0K[5].charAt(28) != 'l') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[7] = "2rf3IkD44HipF2iEZWYVpECLVHr0uALb";
        strArr[0] = "2zlrhAiZVnIklu1FhIrlCsqVaSaq97eM";
        if (i7 == 0 || trackIndex == 0) {
            return i3;
        }
        long sampleOffset = SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE + j4;
        if (j3 < sampleOffset) {
            return i3;
        }
        return sampleIndex;
    }

    private int A01(InterfaceC0518Cd interfaceC0518Cd, C0521Cj c0521Cj) throws IOException, InterruptedException {
        int i2;
        long A7E = interfaceC0518Cd.A7E();
        if (this.A06 == -1) {
            this.A06 = A00(A7E);
            if (this.A06 == -1) {
                return -1;
            }
        }
        DI di = this.A0C[this.A06];
        InterfaceC0525Co interfaceC0525Co = di.A01;
        int i3 = di.A00;
        long j2 = di.A03.A06[i3];
        int i4 = di.A03.A05[i3];
        long inputPosition = j2 - A7E;
        long position = inputPosition + this.A04;
        int sampleSize = (position > 0L ? 1 : (position == 0L ? 0 : -1));
        if (sampleSize >= 0) {
            int sampleSize2 = (position > 262144L ? 1 : (position == 262144L ? 0 : -1));
            if (sampleSize2 < 0) {
                if (di.A02.A02 == 1) {
                    position += 8;
                    i4 -= 8;
                }
                interfaceC0518Cd.AEy((int) position);
                if (di.A02.A01 != 0) {
                    byte[] bArr = this.A0G.A00;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i5 = di.A02.A01;
                    int i6 = 4 - di.A02.A01;
                    while (this.A04 < i4) {
                        int i7 = this.A05;
                        if (i7 == 0) {
                            byte[] nalLengthData = this.A0G.A00;
                            interfaceC0518Cd.readFully(nalLengthData, i6, i5);
                            this.A0G.A0Y(0);
                            this.A05 = this.A0G.A0H();
                            this.A0H.A0Y(0);
                            interfaceC0525Co.AEL(this.A0H, 4);
                            this.A04 += 4;
                            i4 += i6;
                        } else {
                            int writtenBytes = interfaceC0525Co.AEK(interfaceC0518Cd, i7, false);
                            this.A04 += writtenBytes;
                            this.A05 -= writtenBytes;
                        }
                    }
                    i2 = 0;
                } else {
                    while (true) {
                        int i8 = this.A04;
                        if (i8 >= i4) {
                            break;
                        }
                        int AEK = interfaceC0525Co.AEK(interfaceC0518Cd, i4 - i8, false);
                        int writtenBytes2 = this.A04;
                        this.A04 = writtenBytes2 + AEK;
                        int writtenBytes3 = this.A05;
                        this.A05 = writtenBytes3 - AEK;
                    }
                    i2 = 0;
                }
                interfaceC0525Co.AEM(di.A03.A07[i3], di.A03.A04[i3], i4, 0, null);
                di.A00++;
                this.A06 = -1;
                this.A04 = i2;
                this.A05 = i2;
                return i2;
            }
        }
        c0521Cj.A00 = j2;
        return 1;
    }

    public static int A02(DR dr, long j2) {
        int A00 = dr.A00(j2);
        if (A00 == -1) {
            return dr.A01(j2);
        }
        return A00;
    }

    public static long A03(DR dr, long j2, long j3) {
        int A02 = A02(dr, j2);
        if (A02 == -1) {
            return j3;
        }
        return Math.min(dr.A06[A02], j3);
    }

    private ArrayList<DR> A05(WQ wq, C0520Cg c0520Cg, boolean z) throws C0470Af {
        DO A0C;
        ArrayList<DR> arrayList = new ArrayList<>();
        int i2 = 0;
        while (true) {
            int size = wq.A01.size();
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "cCqXKTxpaVHnB5xhxhubewm2proDizNi";
            strArr2[0] = "XNMFZPcuybbaYtAFLaJvO7GLnY5oO3YZ";
            if (i2 < size) {
                WQ wq2 = wq.A01.get(i2);
                if (((D3) wq2).A00 == D3.A1L && (A0C = D8.A0C(wq2, wq.A07(D3.A0n), -9223372036854775807L, null, z, this.A0B)) != null) {
                    DR A0E = D8.A0E(A0C, wq2.A06(D3.A0d).A06(D3.A0h).A06(D3.A16), c0520Cg);
                    if (A0E.A01 != 0) {
                        arrayList.add(A0E);
                    }
                }
                i2++;
            } else {
                return arrayList;
            }
        }
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j2) throws C0470Af {
        while (!this.A0I.isEmpty() && this.A0I.peek().A00 == j2) {
            WQ pop = this.A0I.pop();
            if (((D3) pop).A00 == D3.A0j) {
                A0A(pop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A08(pop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A09(long j2) {
        DI[] diArr;
        for (DI di : this.A0C) {
            DR dr = di.A03;
            int A00 = dr.A00(j2);
            if (A00 == -1) {
                A00 = dr.A01(j2);
            }
            di.A00 = A00;
        }
    }

    private void A0A(WQ wq) throws C0470Af {
        ArrayList<DR> A05;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        C0520Cg c0520Cg = new C0520Cg();
        WP A07 = wq.A07(D3.A1P);
        if (A07 != null && (metadata = D8.A0F(A07, this.A0B)) != null) {
            c0520Cg.A05(metadata);
        }
        boolean ignoreEditLists = (this.A0E & 1) != 0;
        try {
            A05 = A05(wq, c0520Cg, ignoreEditLists);
        } catch (WM unused) {
            c0520Cg = new C0520Cg();
            A05 = A05(wq, c0520Cg, true);
        }
        int size = A05.size();
        for (int i3 = 0; i3 < size; i3++) {
            DR dr = A05.get(i3);
            DO r13 = dr.A03;
            DI di = new DI(r13, dr, this.A09.AFI(i3, r13.A03));
            int trackCount = dr.A00 + 30;
            Format A0F = r13.A07.A0F(trackCount);
            if (r13.A03 == 1) {
                if (c0520Cg.A03()) {
                    A0F = A0F.A0G(c0520Cg.A00, c0520Cg.A01);
                }
                if (metadata != null) {
                    A0F = A0F.A0J(metadata);
                }
            }
            di.A01.A5U(A0F);
            j2 = Math.max(j2, r13.A04 != -9223372036854775807L ? r13.A04 : dr.A02);
            int maxInputSize = r13.A03;
            if (maxInputSize == 2 && i2 == -1) {
                i2 = arrayList.size();
            }
            arrayList.add(di);
        }
        this.A02 = i2;
        this.A08 = j2;
        this.A0C = (DI[]) arrayList.toArray(new DI[arrayList.size()]);
        this.A0D = A0G(this.A0C);
        this.A09.A5C();
        this.A09.AER(this);
    }

    public static boolean A0B(int i2) {
        if (i2 != D3.A0j) {
            int i3 = D3.A1L;
            String[] strArr = A0K;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "xHWkCkmm9lwx55Xb6ilKRbCBaMi3tx91";
            strArr2[3] = "ufwmFaOIh4ETn2yFiF4b2v05oMaexVS8";
            if (i2 != i3 && i2 != D3.A0d && i2 != D3.A0h && i2 != D3.A16 && i2 != D3.A0N) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0C(int i2) {
        if (i2 != D3.A0c && i2 != D3.A0n && i2 != D3.A0V && i2 != D3.A1A && i2 != D3.A1D && i2 != D3.A1B) {
            int i3 = D3.A0C;
            if (A0K[1].length() != 22) {
                throw new RuntimeException();
            }
            A0K[1] = "WjfYMB7jPbcUwDvfNOpuH1";
            if (i2 != i3 && i2 != D3.A0O && i2 != D3.A19 && i2 != D3.A1C && i2 != D3.A1E && i2 != D3.A17 && i2 != D3.A0B && i2 != D3.A1J && i2 != D3.A0U && i2 != D3.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0D(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!interfaceC0518Cd.ADZ(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        long j2 = this.A07;
        if (j2 == 1) {
            interfaceC0518Cd.readFully(this.A0F.A00, 8, 8);
            this.A00 += 8;
            this.A07 = this.A0F.A0N();
        } else if (j2 == 0) {
            long A6s = interfaceC0518Cd.A6s();
            if (A6s == -1 && !this.A0I.isEmpty()) {
                A6s = this.A0I.peek().A00;
            }
            if (A6s != -1) {
                this.A07 = (A6s - interfaceC0518Cd.A7E()) + this.A00;
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long A7E = (interfaceC0518Cd.A7E() + this.A07) - this.A00;
                this.A0I.push(new WQ(this.A01, A7E));
                if (this.A07 == this.A00) {
                    A08(A7E);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                IJ.A04(this.A00 == 8);
                IJ.A04(this.A07 <= 2147483647L);
                this.A0A = new C0660Ii((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new C0470Af(A04(0, 48, 100));
    }

    private boolean A0E(InterfaceC0518Cd interfaceC0518Cd, C0521Cj c0521Cj) throws IOException, InterruptedException {
        long j2 = this.A07 - this.A00;
        long A7E = interfaceC0518Cd.A7E() + j2;
        boolean z = false;
        C0660Ii c0660Ii = this.A0A;
        if (c0660Ii != null) {
            interfaceC0518Cd.readFully(c0660Ii.A00, this.A00, (int) j2);
            if (this.A01 == D3.A0U) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new WP(this.A01, this.A0A));
            }
        } else if (j2 < 262144) {
            interfaceC0518Cd.AEy((int) j2);
        } else {
            c0521Cj.A00 = interfaceC0518Cd.A7E() + j2;
            z = true;
        }
        A08(A7E);
        return z && this.A03 != 2;
    }

    public static boolean A0F(C0660Ii c0660Ii) {
        c0660Ii.A0Y(8);
        if (c0660Ii.A08() == A0M) {
            return true;
        }
        c0660Ii.A0Z(4);
        while (c0660Ii.A04() > 0) {
            if (c0660Ii.A08() == A0M) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0036 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long[][] A0G(com.facebook.ads.redexgen.X.DI[] r14) {
        /*
            int r0 = r14.length
            long[][] r6 = new long[r0]
            int r0 = r14.length
            int[] r5 = new int[r0]
            int r0 = r14.length
            long[] r4 = new long[r0]
            int r0 = r14.length
            boolean[] r3 = new boolean[r0]
            r2 = 0
        Ld:
            int r0 = r14.length
            if (r2 >= r0) goto L28
            r0 = r14[r2]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r6[r2] = r0
            r0 = r14[r2]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            long[] r1 = r0.A07
            r0 = 0
            r0 = r1[r0]
            r4[r2] = r0
            int r2 = r2 + 1
            goto Ld
        L28:
            r12 = 0
            r2 = 0
        L2b:
            int r0 = r14.length
            if (r2 >= r0) goto L71
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = -1
            r1 = 0
        L35:
            int r0 = r14.length
            if (r1 >= r0) goto L48
            boolean r0 = r3[r1]
            if (r0 != 0) goto L45
            r7 = r4[r1]
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 > 0) goto L45
            r9 = r1
            r10 = r4[r1]
        L45:
            int r1 = r1 + 1
            goto L35
        L48:
            r7 = r5[r9]
            r0 = r6[r9]
            r0[r7] = r12
            r0 = r14[r9]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            int[] r0 = r0.A05
            r0 = r0[r7]
            long r0 = (long) r0
            long r12 = r12 + r0
            r1 = 1
            int r7 = r7 + r1
            r5[r9] = r7
            r0 = r6[r9]
            int r0 = r0.length
            if (r7 >= r0) goto L6c
            r0 = r14[r9]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            long[] r0 = r0.A07
            r0 = r0[r7]
            r4[r9] = r0
            goto L2b
        L6c:
            r3[r9] = r1
            int r2 = r2 + 1
            goto L2b
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WI.A0G(com.facebook.ads.redexgen.X.DI[]):long[][]");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final long A6R() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final Ck A7N(long secondTimeUs) {
        long j2;
        long j3;
        int A01;
        DI[] diArr = this.A0C;
        if (diArr.length == 0) {
            return new Ck(C0523Cm.A04);
        }
        long j4 = -9223372036854775807L;
        long j5 = -1;
        int i2 = this.A02;
        if (i2 != -1) {
            DR dr = diArr[i2].A03;
            int A02 = A02(dr, secondTimeUs);
            if (A02 == -1) {
                return new Ck(C0523Cm.A04);
            }
            j2 = dr.A07[A02];
            j3 = dr.A06[A02];
            if (j2 < secondTimeUs) {
                int i3 = dr.A01 - 1;
                if (A0K[5].charAt(28) == 'l') {
                    String[] strArr = A0K;
                    strArr[4] = "wZC6PUUkwbL39FGS7qgHi4";
                    strArr[6] = "ISWp";
                    if (A02 < i3 && (A01 = dr.A01(secondTimeUs)) != -1 && A01 != A02) {
                        j4 = dr.A07[A01];
                        j5 = dr.A06[A01];
                    }
                }
                throw new RuntimeException();
            }
        } else {
            j2 = secondTimeUs;
            j3 = Long.MAX_VALUE;
        }
        int i4 = 0;
        while (true) {
            DI[] diArr2 = this.A0C;
            if (A0K[5].charAt(28) != 'l') {
                break;
            }
            String[] strArr2 = A0K;
            strArr2[2] = "HuKpkwhwNffVsg1qOYm34WvQGcpzf7CA";
            strArr2[3] = "OpSxQ7AB5KpfVVm82hohcPrOWAs1xSas";
            if (i4 < diArr2.length) {
                if (i4 != this.A02) {
                    DR dr2 = diArr2[i4].A03;
                    j3 = A03(dr2, j2, j3);
                    if (j4 != -9223372036854775807L) {
                        j5 = A03(dr2, j4, j5);
                    }
                }
                i4++;
            } else {
                C0523Cm c0523Cm = new C0523Cm(j2, j3);
                if (j4 == -9223372036854775807L) {
                    return new Ck(c0523Cm);
                }
                return new Ck(c0523Cm, new C0523Cm(j4, j5));
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void A8I(Ce ce) {
        this.A09 = ce;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final boolean A8g() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final int ADU(InterfaceC0518Cd interfaceC0518Cd, C0521Cj c0521Cj) throws IOException, InterruptedException {
        while (true) {
            int i2 = this.A03;
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "qJxbwGisfZf9YKIw0pjhTsx78598m8MK";
            strArr2[0] = "kX2rligkfJBBB9teOSCW5LaSmFhGBJWo";
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return A01(interfaceC0518Cd, c0521Cj);
                    }
                    throw new IllegalStateException();
                } else if (A0E(interfaceC0518Cd, c0521Cj)) {
                    return 1;
                }
            } else if (!A0D(interfaceC0518Cd)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void AEQ(long j2, long j3) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j2 == 0) {
            A06();
        } else if (this.A0C == null) {
        } else {
            A09(j3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final boolean AF0(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        return DM.A04(interfaceC0518Cd);
    }
}
