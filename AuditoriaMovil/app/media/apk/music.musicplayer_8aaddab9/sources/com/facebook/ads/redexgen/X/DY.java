package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* loaded from: assets/audience_network.dex */
public abstract class DY {
    public static String[] A0D = {"vdpx440NSg8M4CnGdydtu5qQkftaFl81", "8FBVTf92WyxNz1PbVx8WfEYVHOwD1jYA", "DKJKTeADHw9YeVFClTVADEpoqL7THNTT", "QMHe7Xu97ps4f3hWTDxnFcitcXlvMrzA", "cT681YGQWd9DutiYQJBSPFEBPfK5r2m4", "EyU4ukvYlXQau4YgIYVQwMEfY7bgqA6h", "DftqlnKuE3jyyUo0DxEITdlkAR2KkpEx", "3J2n16rNLfrexVGozCu5PKnUXiDeYKol"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public Ce A06;
    public InterfaceC0525Co A07;
    public DV A08;
    public DX A09;
    public boolean A0A;
    public boolean A0B;
    public final DT A0C = new DT();

    public abstract long A07(C0660Ii c0660Ii);

    public abstract boolean A0A(C0660Ii c0660Ii, long j2, DX dx) throws IOException, InterruptedException;

    private int A00(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        boolean z = true;
        while (z) {
            if (!this.A0C.A05(interfaceC0518Cd)) {
                this.A01 = 3;
                return -1;
            }
            this.A03 = interfaceC0518Cd.A7E() - this.A04;
            z = A0A(this.A0C.A02(), this.A04, this.A09);
            if (z) {
                this.A04 = interfaceC0518Cd.A7E();
            }
        }
        this.A00 = this.A09.A00.A0C;
        if (!this.A0A) {
            this.A07.A5U(this.A09.A00);
            this.A0A = true;
        }
        if (this.A09.A01 != null) {
            DX dx = this.A09;
            String[] strArr = A0D;
            if (strArr[3].charAt(31) == strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[2] = "bh7MBcJSzFDWGWL7bYV4RFdmzZ5DJPtg";
            strArr2[4] = "jbTTtcEVTbmVVWffnqyGAcPkGPEAibSD";
            this.A08 = dx.A01;
        } else if (interfaceC0518Cd.A6s() == -1) {
            this.A08 = new WA();
        } else {
            DU A01 = this.A0C.A01();
            this.A08 = new WG(this.A04, interfaceC0518Cd.A6s(), this, A01.A01 + A01.A00, A01.A05);
        }
        this.A09 = null;
        this.A01 = 2;
        this.A0C.A04();
        return 0;
    }

    private int A01(InterfaceC0518Cd interfaceC0518Cd, C0521Cj c0521Cj) throws IOException, InterruptedException {
        long ADV = this.A08.ADV(interfaceC0518Cd);
        if (ADV >= 0) {
            c0521Cj.A00 = ADV;
            return 1;
        }
        if (ADV < -1) {
            A08(-(2 + ADV));
        }
        boolean z = this.A0B;
        if (A0D[1].charAt(31) != 'Q') {
            A0D[6] = "YKdoYyhEaGRVIGwSTWAYioMwjJxRxWbM";
            if (!z) {
                this.A06.AER(this.A08.A4R());
                this.A0B = true;
            }
            if (this.A03 <= 0 && !this.A0C.A05(interfaceC0518Cd)) {
                this.A01 = 3;
                return -1;
            }
            this.A03 = 0L;
            C0660Ii A02 = this.A0C.A02();
            long A07 = A07(A02);
            if (A07 >= 0) {
                long j2 = this.A02;
                long granulesInPacket = j2 + A07;
                if (granulesInPacket >= this.A05) {
                    long A03 = A03(j2);
                    this.A07.AEL(A02, A02.A07());
                    this.A07.AEM(A03, 1, A02.A07(), 0, null);
                    this.A05 = -1L;
                }
            }
            long timeUs = this.A02;
            this.A02 = timeUs + A07;
            return 0;
        }
        throw new RuntimeException();
    }

    public final int A02(InterfaceC0518Cd interfaceC0518Cd, C0521Cj c0521Cj) throws IOException, InterruptedException {
        int i2 = this.A01;
        if (i2 != 0) {
            if (i2 == 1) {
                interfaceC0518Cd.AEy((int) this.A04);
                this.A01 = 2;
                return 0;
            } else if (i2 == 2) {
                int A01 = A01(interfaceC0518Cd, c0521Cj);
                if (A0D[6].charAt(6) != 'm') {
                    A0D[1] = "ecnT7ItXVuTi5H8Gayt4a9jA0qUq5vI3";
                    return A01;
                }
                throw new RuntimeException();
            } else {
                throw new IllegalStateException();
            }
        }
        return A00(interfaceC0518Cd);
    }

    public final long A03(long j2) {
        return (1000000 * j2) / this.A00;
    }

    public final long A04(long j2) {
        return (this.A00 * j2) / 1000000;
    }

    public final void A05(long j2, long j3) {
        this.A0C.A03();
        if (j2 == 0) {
            A09(!this.A0B);
        } else if (this.A01 == 0) {
        } else {
            this.A05 = this.A08.AF6(j3);
            this.A01 = 2;
        }
    }

    public final void A06(Ce ce, InterfaceC0525Co interfaceC0525Co) {
        this.A06 = ce;
        this.A07 = interfaceC0525Co;
        A09(true);
    }

    public void A08(long j2) {
        this.A02 = j2;
    }

    public void A09(boolean z) {
        if (z) {
            this.A09 = new DX();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
    }
}
