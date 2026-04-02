package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Bx */
/* loaded from: assets/audience_network.dex */
public final class C0513Bx implements VM, Ce, InterfaceC0641Hp<VQ>, InterfaceC0644Hs, InterfaceC0596Fu {
    public static byte[] A0c;
    public static String[] A0d = {"iI0ZOGUFhjVKOFZqbUjTJbzZriBk", "wCM5SpVnQk8vEGvx3xuFkFQnwN8gnHkn", "CC", "sZUrtXRAji2vfBWVwphN9cenOJ8FQWpp", "F506DqgxlNyYyNAR0eHuGAxqIBb0RwxX", "mj8nEZtHpBznvwUNQKJPsV2u1H4", "sYtV3FATfn8NsU7nH3", "hZDPske6mXbyt4vhVom9Ng"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public InterfaceC0522Cl A07;
    @Nullable
    public VN A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final FU A0S;
    public final FV A0T;
    public final C0587Fl A0U;
    public final HW A0V;
    public final InterfaceC0632He A0W;
    @Nullable
    public final String A0b;
    public final C0969Um A0X = new C0969Um(A07(0, 27, 82));
    public final IP A0Y = new IP();
    public final Runnable A0Z = new FS(this);
    public final Runnable A0a = new FT(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public VL[] A0K = new VL[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    public static String A07(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0c, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0d[7].length() != 22) {
                throw new RuntimeException();
            }
            A0d[2] = "Up";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ SyslogConstants.LOG_CLOCK);
            i5++;
        }
    }

    public static void A0B() {
        A0c = new byte[]{102, 69, 75, 78, 79, 88, 16, 111, 82, 94, 88, 75, 73, 94, 69, 88, 103, 79, 78, 67, 75, 122, 79, 88, 67, 69, 78};
    }

    static {
        A0B();
    }

    public C0513Bx(Uri uri, InterfaceC0632He interfaceC0632He, InterfaceC0517Cc[] interfaceC0517CcArr, int i2, C0587Fl c0587Fl, FV fv, HW hw, @Nullable String str, int i3) {
        this.A0Q = uri;
        this.A0W = interfaceC0632He;
        this.A0O = i2;
        this.A0U = c0587Fl;
        this.A0T = fv;
        this.A0V = hw;
        this.A0b = str;
        this.A0P = i3;
        this.A0S = new FU(interfaceC0517CcArr, this);
        this.A00 = i2 == -1 ? 3 : i2;
        c0587Fl.A03();
    }

    private int A00() {
        VL[] vlArr;
        int i2 = 0;
        for (VL vl : this.A0K) {
            String[] strArr = A0d;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[3] = "qSOUgbz3JlJaX9UdXA1gn9agrJ83m9Y6";
            strArr2[1] = "wkCF1xtIBevCyUX610AjJpYT598Om9ct";
            i2 += vl.A0C();
        }
        return i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0641Hp
    /* renamed from: A01 */
    public final int ABF(VQ vq, long j2, long j3, IOException iOException) {
        C0636Hi c0636Hi;
        long j4;
        long j5;
        boolean isErrorFatal = A0N(iOException);
        C0587Fl c0587Fl = this.A0U;
        c0636Hi = vq.A03;
        j4 = vq.A02;
        long j6 = this.A03;
        j5 = vq.A00;
        c0587Fl.A0H(c0636Hi, 1, -1, null, 0, null, j4, j6, j2, j3, j5, iOException, isErrorFatal);
        A0E(vq);
        if (isErrorFatal) {
            return 3;
        }
        int A00 = A00();
        boolean z = A00 > this.A02;
        if (A0L(vq, A00)) {
            return z ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        VL[] vlArr;
        long j2 = Long.MIN_VALUE;
        for (VL vl : this.A0K) {
            if (A0d[6].length() != 18) {
                throw new RuntimeException();
            }
            A0d[6] = "ZyGj31aUIwj7oXhThZ";
            j2 = Math.max(j2, vl.A0F());
        }
        return j2;
    }

    public void A09() {
        VL[] vlArr;
        if (this.A0G || this.A0F || this.A07 == null || !this.A0H) {
            return;
        }
        for (VL sampleQueue : this.A0K) {
            if (sampleQueue.A0G() == null) {
                return;
            }
        }
        this.A0Y.A01();
        int length = this.A0K.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.A0N = new boolean[length];
        this.A0L = new boolean[length];
        this.A0M = new boolean[length];
        this.A03 = this.A07.A6R();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < length) {
                Format A0G = this.A0K[i2].A0G();
                trackGroupArr[i2] = new TrackGroup(A0G);
                String str = A0G.A0O;
                if (!C0653Ib.A0B(str)) {
                    boolean A09 = C0653Ib.A09(str);
                    if (A0d[7].length() != 22) {
                        throw new RuntimeException();
                    }
                    A0d[4] = "sORkCePcQUNrHwPTmIu9z8sBJIN6eDJt";
                    if (!A09) {
                        z = false;
                    }
                }
                this.A0N[i2] = z;
                boolean isAudioVideo = this.A0A;
                this.A0A = isAudioVideo | z;
                i2++;
            } else {
                this.A09 = new TrackGroupArray(trackGroupArr);
                if (this.A0O == -1 && this.A05 == -1 && this.A07.A6R() == -9223372036854775807L) {
                    this.A00 = 6;
                }
                this.A0F = true;
                this.A0T.ACI(this.A03, this.A07.A8g());
                this.A08.ABt(this);
                return;
            }
        }
    }

    private void A0A() {
        C0636Hi c0636Hi;
        long j2;
        VQ vq = new VQ(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            IJ.A04(A0I());
            long j3 = this.A03;
            if (j3 != -9223372036854775807L && this.A06 >= j3) {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            }
            vq.A04(this.A07.A7N(this.A06).A00.A00, this.A06);
            this.A06 = -9223372036854775807L;
        }
        this.A02 = A00();
        long A04 = this.A0X.A04(vq, this, this.A00);
        C0587Fl c0587Fl = this.A0U;
        c0636Hi = vq.A03;
        j2 = vq.A02;
        c0587Fl.A0E(c0636Hi, 1, -1, null, 0, null, j2, this.A03, A04);
    }

    private void A0C(int i2) {
        if (!this.A0M[i2]) {
            Format A01 = this.A09.A01(i2).A01(0);
            this.A0U.A06(C0653Ib.A01(A01.A0O), A01, 0, null, this.A04);
            this.A0M[i2] = true;
        }
    }

    private void A0D(int i2) {
        VL[] vlArr;
        if (!this.A0E || !this.A0N[i2] || this.A0K[i2].A0M()) {
            return;
        }
        this.A06 = 0L;
        this.A0E = false;
        this.A0D = true;
        this.A04 = 0L;
        this.A02 = 0;
        for (VL sampleQueue : this.A0K) {
            sampleQueue.A0I();
        }
        this.A08.AAN(this);
    }

    private void A0E(VQ vq) {
        long j2;
        if (this.A05 != -1) {
            return;
        }
        j2 = vq.A01;
        this.A05 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0641Hp
    /* renamed from: A0F */
    public final void ABE(VQ vq, long j2, long j3) {
        C0636Hi c0636Hi;
        long j4;
        long j5;
        long largestQueuedTimestampUs;
        if (this.A03 == -9223372036854775807L) {
            long A02 = A02();
            if (A02 == Long.MIN_VALUE) {
                largestQueuedTimestampUs = 0;
            } else {
                largestQueuedTimestampUs = AbstractComponentTracker.LINGERING_TIMEOUT + A02;
            }
            this.A03 = largestQueuedTimestampUs;
            this.A0T.ACI(this.A03, this.A07.A8g());
        }
        C0587Fl c0587Fl = this.A0U;
        c0636Hi = vq.A03;
        j4 = vq.A02;
        long j6 = this.A03;
        j5 = vq.A00;
        c0587Fl.A0G(c0636Hi, 1, -1, null, 0, null, j4, j6, j2, j3, j5);
        A0E(vq);
        this.A0B = true;
        this.A08.AAN(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0641Hp
    /* renamed from: A0G */
    public final void ABC(VQ vq, long j2, long j3, boolean z) {
        C0636Hi c0636Hi;
        long j4;
        long j5;
        C0587Fl c0587Fl = this.A0U;
        c0636Hi = vq.A03;
        j4 = vq.A02;
        long j6 = this.A03;
        j5 = vq.A00;
        c0587Fl.A0F(c0636Hi, 1, -1, null, 0, null, j4, j6, j2, j3, j5);
        if (!z) {
            A0E(vq);
            for (VL vl : this.A0K) {
                vl.A0I();
            }
            if (this.A01 > 0) {
                this.A08.AAN(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0J() {
        if (!this.A0D) {
            boolean A0I = A0I();
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            A0d[7] = "wEe5Kid34hKwvsAXbAWEFW";
            if (!A0I) {
                return false;
            }
        }
        return true;
    }

    private boolean A0K(long j2) {
        int length = this.A0K.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                return true;
            }
            VL sampleQueue = this.A0K[i2];
            sampleQueue.A0J();
            if ((sampleQueue.A0D(j2, true, false) != -1) || (!this.A0N[i2] && this.A0A)) {
                i2++;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0031, code lost:
        if (r7 != (-9223372036854775807L)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0L(com.facebook.ads.redexgen.X.VQ r10, int r11) {
        /*
            r9 = this;
            long r1 = r9.A05
            r6 = 1
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L33
            com.facebook.ads.redexgen.X.Cl r0 = r9.A07
            if (r0 == 0) goto L3c
            long r7 = r0.A6R()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0513Bx.A0d
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L36
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0513Bx.A0d
            java.lang.String r1 = "Q0rpoNhjqPePbxzXOOIqRvZr1JNrttpQ"
            r0 = 4
            r2[r0] = r1
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L3c
        L33:
            r9.A02 = r11
            return r6
        L36:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3c:
            boolean r0 = r9.A0F
            r5 = 0
            if (r0 == 0) goto L65
            boolean r0 = r9.A0J()
            if (r0 != 0) goto L65
            r9.A0E = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0513Bx.A0d
            r0 = 4
            r1 = r1[r0]
            r0 = 6
            char r1 = r1.charAt(r0)
            r0 = 89
            if (r1 == r0) goto L5f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0513Bx.A0d
            java.lang.String r1 = "yM"
            r0 = 2
            r2[r0] = r1
            return r5
        L5f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L65:
            boolean r0 = r9.A0F
            r9.A0D = r0
            r2 = 0
            r9.A04 = r2
            r9.A02 = r5
            com.facebook.ads.redexgen.X.VL[] r4 = r9.A0K
            int r1 = r4.length
        L72:
            if (r5 >= r1) goto L7c
            r0 = r4[r5]
            r0.A0I()
            int r5 = r5 + 1
            goto L72
        L7c:
            r10.A04(r2, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0513Bx.A0L(com.facebook.ads.redexgen.X.VQ, int):boolean");
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof VJ;
    }

    public final int A0O(int skipCount, long j2) {
        int A0D;
        if (A0J()) {
            return 0;
        }
        VL vl = this.A0K[skipCount];
        if (this.A0B && j2 > vl.A0F()) {
            A0D = vl.A0A();
        } else {
            A0D = vl.A0D(j2, true, true);
            if (A0D == -1) {
                A0D = 0;
            }
        }
        if (A0D > 0) {
            A0C(skipCount);
        } else {
            A0D(skipCount);
        }
        return A0D;
    }

    public final int A0P(int i2, AZ az, C1024Ws c1024Ws, boolean z) {
        if (A0J()) {
            return -3;
        }
        VL vl = this.A0K[i2];
        boolean z2 = this.A0B;
        long j2 = this.A04;
        if (A0d[6].length() != 18) {
            throw new RuntimeException();
        }
        A0d[4] = "BZZhA5HnQ267vlJC28K7sY9wv6QGzHwf";
        int A0E = vl.A0E(az, c1024Ws, z, z2, j2);
        if (A0E == -4) {
            A0C(i2);
        } else if (A0E == -3) {
            A0D(i2);
        }
        return A0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (VL vl : this.A0K) {
                vl.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i2) {
        return !A0J() && (this.A0B || this.A0K[i2].A0M());
    }

    @Override // com.facebook.ads.redexgen.X.VM
    public final boolean A49(long j2) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F) {
            int i2 = this.A01;
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            A0d[4] = "7rVHsGRdVZCry1KpVG9eopTEFKGRMHdR";
            if (i2 == 0) {
                return false;
            }
        }
        boolean A02 = this.A0Y.A02();
        if (!this.A0X.A08()) {
            A0A();
            String[] strArr = A0d;
            if (strArr[5].length() != strArr[0].length()) {
                A0d[4] = "GZZ8Yg3MT0LKLUTCQO9quz1OXrB3914Q";
                return true;
            }
            A0d[4] = "KAHjzw5ailzTQNPlHwAo2zZrrjfyTj4F";
            return false;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.X.VM
    public final void A4o(long j2, boolean z) {
        int length = this.A0K.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.A0K[i2].A0K(j2, z, this.A0L[i2]);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Ce
    public final void A5C() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.VM
    public final long A5d(long j2, C0488Ax c0488Ax) {
        if (!this.A07.A8g()) {
            return 0L;
        }
        Ck A7N = this.A07.A7N(j2);
        return C0676Iy.A0I(j2, c0488Ax, A7N.A00.A01, A7N.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.X.VM
    public final long A5s() {
        long A02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            long j2 = this.A06;
            if (A0d[6].length() == 18) {
                A0d[4] = "v1DtQTmxA3FTsqocwnKPSJWZapJDPMlv";
                return j2;
            }
        } else {
            if (this.A0A) {
                A02 = Long.MAX_VALUE;
                if (A0d[6].length() == 18) {
                    A0d[7] = "vaKypmx8P8ApWe5d9yUSyn";
                    int length = this.A0K.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (this.A0N[i2]) {
                            VL vl = this.A0K[i2];
                            String[] strArr = A0d;
                            if (strArr[5].length() == strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            A0d[7] = "ClOx81htkGLxdwhy5PY2qE";
                            A02 = Math.min(A02, vl.A0F());
                        }
                    }
                }
            } else {
                A02 = A02();
            }
            if (A02 == Long.MIN_VALUE) {
                return this.A04;
            }
            return A02;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.VM
    public final long A70() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A5s();
    }

    @Override // com.facebook.ads.redexgen.X.VM
    public final TrackGroupArray A7g() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.VM
    public final void A9W() throws IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0644Hs
    public final void ABJ() {
        for (VL vl : this.A0K) {
            vl.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0596Fu
    public final void ACb(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.VM
    public final void ADD(VN vn, long j2) {
        this.A08 = vn;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.VM
    public final long ADY() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        if (this.A0D) {
            if (this.A0B || A00() > this.A02) {
                this.A0D = false;
                return this.A04;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.VM
    public final void ADf(long j2) {
    }

    @Override // com.facebook.ads.redexgen.X.Ce
    public final void AER(InterfaceC0522Cl interfaceC0522Cl) {
        this.A07 = interfaceC0522Cl;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.VM
    public final long AEU(long j2) {
        VL[] vlArr;
        if (!this.A07.A8g()) {
            j2 = 0;
        }
        this.A04 = j2;
        this.A0D = false;
        if (!A0I() && A0K(j2)) {
            return j2;
        }
        this.A0E = false;
        this.A06 = j2;
        this.A0B = false;
        if (this.A0X.A08()) {
            this.A0X.A05();
        } else {
            for (VL sampleQueue : this.A0K) {
                sampleQueue.A0I();
            }
        }
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0108, code lost:
        if (r8.A08() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x010a, code lost:
        r4 = r12.A0K;
        r3 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x010d, code lost:
        if (r7 >= r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x010f, code lost:
        r4[r7].A0H();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0122, code lost:
        if (r8.A08() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0125, code lost:
        r4 = r12.A0K;
        r3 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0128, code lost:
        if (r7 >= r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x012a, code lost:
        r4[r7].A0I();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x015e, code lost:
        r12.A0X.A05();
     */
    @Override // com.facebook.ads.redexgen.X.VM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AEV(com.facebook.ads.redexgen.X.HQ[] r13, boolean[] r14, com.facebook.ads.redexgen.X.InterfaceC0597Fv[] r15, boolean[] r16, long r17) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0513Bx.AEV(com.facebook.ads.redexgen.X.HQ[], boolean[], com.facebook.ads.redexgen.X.Fv[], boolean[], long):long");
    }

    @Override // com.facebook.ads.redexgen.X.Ce
    public final InterfaceC0525Co AFI(int i2, int i3) {
        int length = this.A0K.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.A0J[i4] == i2) {
                return this.A0K[i4];
            }
        }
        VL vl = new VL(this.A0V);
        vl.A0L(this);
        this.A0J = Arrays.copyOf(this.A0J, length + 1);
        this.A0J[length] = i2;
        this.A0K = (VL[]) Arrays.copyOf(this.A0K, length + 1);
        this.A0K[length] = vl;
        return vl;
    }
}
