package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
/* loaded from: assets/audience_network.dex */
public final class DF {
    public static String[] A0A = {"3clh", "In2mDQuCVOg3ihkf16hWdIIfuM6sFv5F", "x02l2Vae1akitXdZsfkSin5rPssADgyF", "voDg", "hUzVtg6QDcg3AayaGyy4Y5hfj2RvIx7z", "AYA0HHhZRav1tOhmR967ChnIf", "RG8", "bQ6q4wCv1qa3psjbWrVNO9D1ADq5zdw2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public D9 A04;
    public DO A05;
    public final InterfaceC0525Co A06;
    public final DQ A07 = new DQ();
    public final C0660Ii A09 = new C0660Ii(1);
    public final C0660Ii A08 = new C0660Ii();

    public DF(InterfaceC0525Co interfaceC0525Co) {
        this.A06 = interfaceC0525Co;
    }

    private DP A00() {
        int i2 = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            DQ dq = this.A07;
            String[] strArr = A0A;
            if (strArr[1].charAt(10) != strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "mhitCTNVD2gTcCiZ9jaRAXWaAA0g9dMw";
            strArr2[4] = "MwiogHOaq0gqmibDd9x4nD1rPGRVV4il";
            return dq.A08;
        }
        return this.A05.A00(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        C0660Ii c0660Ii = this.A07.A09;
        DP A00 = A00();
        if (A00.A00 != 0) {
            c0660Ii.A0Z(A00.A00);
        }
        if (this.A07.A0H[this.A01]) {
            c0660Ii.A0Z(c0660Ii.A0I() * 6);
        }
    }

    public final int A03() {
        C0660Ii c0660Ii;
        int length;
        if (this.A07.A0A) {
            DP A00 = A00();
            if (A00.A00 != 0) {
                c0660Ii = this.A07.A09;
                length = A00.A00;
            } else {
                byte[] bArr = A00.A04;
                String[] strArr = A0A;
                if (strArr[3].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[1] = "Pfb0S5CneQgYrjeMjOJgtR7T7eyOdr1R";
                strArr2[4] = "zLY8KEVp0MgNhcadjz3HGMWIKnjSbq4p";
                this.A08.A0b(bArr, bArr.length);
                c0660Ii = this.A08;
                length = bArr.length;
            }
            boolean[] zArr = this.A07.A0H;
            int vectorSize = this.A01;
            boolean z = zArr[vectorSize];
            byte[] bArr2 = this.A09.A00;
            int vectorSize2 = z ? 128 : 0;
            bArr2[0] = (byte) (vectorSize2 | length);
            this.A09.A0Y(0);
            this.A06.AEL(this.A09, 1);
            this.A06.AEL(c0660Ii, length);
            if (!z) {
                int vectorSize3 = length + 1;
                return vectorSize3;
            }
            C0660Ii c0660Ii2 = this.A07.A09;
            int A0I = c0660Ii2.A0I();
            c0660Ii2.A0Z(-2);
            int subsampleCount = A0I * 6;
            int i2 = subsampleCount + 2;
            this.A06.AEL(c0660Ii2, i2);
            int subsampleDataLength = length + 1;
            return subsampleDataLength + i2;
        }
        return 0;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j2) {
        long A01 = AG.A01(j2);
        for (int i2 = this.A01; i2 < this.A07.A00 && this.A07.A00(i2) < A01; i2++) {
            boolean[] zArr = this.A07.A0I;
            String[] strArr = A0A;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "yYyJ6pNJ0kgjmttu9OhrBT2GfQD0mn7b";
            strArr2[4] = "spdSEizAECgh3deYwyaUKu4kY7nul1tj";
            if (zArr[i2]) {
                this.A03 = i2;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        DP A00 = this.A05.A00(this.A07.A07.A02);
        this.A06.A5U(this.A05.A07.A0I(drmInitData.A02(A00 != null ? A00.A02 : null)));
    }

    public final void A07(DO r3, D9 d9) {
        this.A05 = (DO) IJ.A01(r3);
        this.A04 = (D9) IJ.A01(d9);
        this.A06.A5U(r3.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        this.A00++;
        int i2 = this.A00;
        int[] iArr = this.A07.A0E;
        int i3 = this.A02;
        if (i2 == iArr[i3]) {
            this.A02 = i3 + 1;
            String[] strArr = A0A;
            if (strArr[2].charAt(8) != strArr[7].charAt(8)) {
                throw new RuntimeException();
            }
            A0A[6] = "24SILmm";
            this.A00 = 0;
            return false;
        }
        return true;
    }
}
