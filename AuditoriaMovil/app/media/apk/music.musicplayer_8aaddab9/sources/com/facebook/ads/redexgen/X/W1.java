package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
/* loaded from: assets/audience_network.dex */
public final class W1 implements InterfaceC0536Di {
    public static String[] A0B = {"Egp8wbctYg3AnrLoFsY0muWOBg0DV21X", "e5h8xZQ9y742", "HWojDw1vanmhl7F", "V39ipiog0D", "u2piqSS4vuQoaStDwbY0GoBR5fBlfuuM", "rfNh4mzWhxdgTcwc6CqJaoU4clFtHzcH", "1g0ZSxhEfC", "eBXSmpY9RuNSQ1O4XZ5t"};
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public long A05;
    public Format A06;
    public InterfaceC0525Co A07;
    public String A08;
    public final String A0A;
    public final C0660Ii A09 = new C0660Ii(new byte[18]);
    public int A02 = 0;

    public W1(String str) {
        this.A0A = str;
    }

    private void A00() {
        byte[] bArr = this.A09.A00;
        if (this.A06 == null) {
            this.A06 = C0501Bl.A03(bArr, this.A08, this.A0A, null);
            this.A07.A5U(this.A06);
        }
        this.A01 = C0501Bl.A01(bArr);
        this.A04 = (int) ((C0501Bl.A02(bArr) * 1000000) / this.A06.A0C);
    }

    private boolean A01(C0660Ii c0660Ii) {
        do {
            int A04 = c0660Ii.A04();
            String[] strArr = A0B;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0B[2] = "u2vG9yItOjfrtL1HZZufPW";
            if (A04 <= 0) {
                return false;
            }
            this.A03 <<= 8;
            this.A03 |= c0660Ii.A0E();
        } while (!C0501Bl.A07(this.A03));
        this.A09.A00[0] = (byte) ((this.A03 >> 24) & 255);
        this.A09.A00[1] = (byte) ((this.A03 >> 16) & 255);
        this.A09.A00[2] = (byte) ((this.A03 >> 8) & 255);
        this.A09.A00[3] = (byte) (this.A03 & 255);
        this.A00 = 4;
        this.A03 = 0;
        return true;
    }

    private boolean A02(C0660Ii c0660Ii, byte[] bArr, int i2) {
        int min = Math.min(c0660Ii.A04(), i2 - this.A00);
        c0660Ii.A0c(bArr, this.A00, min);
        this.A00 += min;
        return this.A00 == i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void A47(C0660Ii c0660Ii) {
        while (c0660Ii.A04() > 0) {
            int i2 = this.A02;
            if (i2 != 0) {
                if (i2 == 1) {
                    byte[] bArr = this.A09.A00;
                    String[] strArr = A0B;
                    if (strArr[5].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0B;
                    strArr2[7] = "fRWG3CzCM1nyuvAzq7jz";
                    strArr2[0] = "3KzD1A3zkNrKwQoZtzGyJPl8BSj940od";
                    if (A02(c0660Ii, bArr, 18)) {
                        A00();
                        this.A09.A0Y(0);
                        this.A07.AEL(this.A09, 18);
                        this.A02 = 2;
                    }
                } else if (i2 == 2) {
                    int min = Math.min(c0660Ii.A04(), this.A01 - this.A00);
                    this.A07.AEL(c0660Ii, min);
                    this.A00 += min;
                    int i3 = this.A00;
                    int i4 = this.A01;
                    if (i3 == i4) {
                        this.A07.AEM(this.A05, 1, i4, 0, null);
                        this.A05 += this.A04;
                        this.A02 = 0;
                    }
                }
            } else if (A01(c0660Ii)) {
                this.A02 = 1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void A4U(Ce ce, C0550Dw c0550Dw) {
        c0550Dw.A05();
        this.A08 = c0550Dw.A04();
        this.A07 = ce.AFI(c0550Dw.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AD0() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AD1(long j2, boolean z) {
        this.A05 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AEP() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }
}
