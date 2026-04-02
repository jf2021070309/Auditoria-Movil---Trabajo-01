package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
/* renamed from: com.facebook.ads.redexgen.X.Vu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1002Vu implements InterfaceC0536Di {
    public static String[] A0C = {"KDszHDzXfqF59CRVRWftd3HVsRnCigSQ", "mt1wJ32vNuSPyEC341LvOqJuOPF0PUkp", "WrM", "XaAyFYRGYfBBBZw7eK", "eDOzUgm8HT4q1AQmalgqs20fTFsFJUGd", "BoW68Cbgp4ULkXl8fLSwM62hHrGuEs23", "bWE7L7mx05VAedoWHIxzCG4hfzqVFa", "OpD2t2SPaq7VaFKSNzknI6aN9MYETC"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public InterfaceC0525Co A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final Ci A09;
    public final C0660Ii A0A;
    public final String A0B;

    public C1002Vu() {
        this(null);
    }

    public C1002Vu(String str) {
        this.A02 = 0;
        this.A0A = new C0660Ii(4);
        this.A0A.A00[0] = -1;
        this.A09 = new Ci();
        this.A0B = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(com.facebook.ads.redexgen.X.C0660Ii r11) {
        /*
            r10 = this;
            byte[] r5 = r11.A00
            int r4 = r11.A06()
            int r7 = r11.A07()
        La:
            if (r4 >= r7) goto L89
            r1 = r5[r4]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            r6 = 0
            r3 = 1
            if (r1 != r0) goto L87
            r9 = 1
        L16:
            boolean r0 = r10.A08
            if (r0 == 0) goto L47
            r8 = r5[r4]
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1002Vu.A0C
            r0 = 6
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L34
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L34:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1002Vu.A0C
            java.lang.String r1 = "UcL2wMN6HBGwWkWL4B"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "jB5"
            r0 = 2
            r2[r0] = r1
            r0 = 224(0xe0, float:3.14E-43)
            r8 = r8 & r0
            if (r8 != r0) goto L47
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            r10.A08 = r9
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1002Vu.A0C
            r0 = 1
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L75
            if (r8 == 0) goto L84
        L60:
            int r0 = r4 + 1
            r11.A0Y(r0)
            r10.A08 = r6
            com.facebook.ads.redexgen.X.Ii r0 = r10.A0A
            byte[] r1 = r0.A00
            r0 = r5[r4]
            r1[r3] = r0
            r0 = 2
            r10.A00 = r0
            r10.A02 = r3
            return
        L75:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1002Vu.A0C
            java.lang.String r1 = "AyJ6e7KDyRqb1r0P1KBKVEJakZlKMKHZ"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "2ThmXJimQn9uK6mMidfBhWUlfDYnBKkO"
            r0 = 0
            r2[r0] = r1
            if (r8 == 0) goto L84
            goto L60
        L84:
            int r4 = r4 + 1
            goto La
        L87:
            r9 = 0
            goto L16
        L89:
            r11.A0Y(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1002Vu.A00(com.facebook.ads.redexgen.X.Ii):void");
    }

    private void A01(C0660Ii c0660Ii) {
        int min = Math.min(c0660Ii.A04(), this.A01 - this.A00);
        this.A05.AEL(c0660Ii, min);
        this.A00 += min;
        int i2 = this.A00;
        int i3 = this.A01;
        if (i2 < i3) {
            return;
        }
        this.A05.AEM(this.A04, 1, i3, 0, null);
        this.A04 += this.A03;
        this.A00 = 0;
        String[] strArr = A0C;
        if (strArr[5].charAt(10) == strArr[0].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "ScjCWzDsMvlE6C4iVMEuFqkFuKCicUAb";
        strArr2[4] = "udpHDrUjrNQxaJr25pS4UodeWrrvfUFS";
        this.A02 = 0;
    }

    private void A02(C0660Ii c0660Ii) {
        int min = Math.min(c0660Ii.A04(), 4 - this.A00);
        c0660Ii.A0c(this.A0A.A00, this.A00, min);
        this.A00 += min;
        if (this.A00 < 4) {
            return;
        }
        this.A0A.A0Y(0);
        if (Ci.A04(this.A0A.A08(), this.A09)) {
            this.A01 = this.A09.A02;
            if (!this.A07) {
                this.A03 = (this.A09.A04 * 1000000) / this.A09.A03;
                this.A05.A5U(Format.A07(this.A06, this.A09.A06, null, -1, 4096, this.A09.A01, this.A09.A03, null, null, 0, this.A0B));
                this.A07 = true;
            }
            this.A0A.A0Y(0);
            this.A05.AEL(this.A0A, 4);
            this.A02 = 2;
            return;
        }
        this.A00 = 0;
        this.A02 = 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void A47(C0660Ii c0660Ii) {
        while (c0660Ii.A04() > 0) {
            int i2 = this.A02;
            if (i2 == 0) {
                A00(c0660Ii);
            } else if (i2 != 1) {
                String[] strArr = A0C;
                if (strArr[1].charAt(29) != strArr[4].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0C;
                strArr2[1] = "DlgSkZ7kUmj97mVCMXW7YS18xBC70U7G";
                strArr2[4] = "tybkSaN9ICkxBJ48s31m7V5Ixzqz2U6M";
                if (i2 == 2) {
                    A01(c0660Ii);
                }
            } else {
                A02(c0660Ii);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void A4U(Ce ce, C0550Dw c0550Dw) {
        c0550Dw.A05();
        this.A06 = c0550Dw.A04();
        this.A05 = ce.AFI(c0550Dw.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AD0() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AD1(long j2, boolean z) {
        this.A04 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AEP() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}
