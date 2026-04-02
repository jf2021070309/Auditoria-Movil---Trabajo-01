package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* loaded from: assets/audience_network.dex */
public class WF implements DV, InterfaceC0522Cl {
    public static String[] A05 = {"yHlOCb8hYCUAGFBSR1KAQUls", "juuz7zvmjSSgkVuftf6ZJcl9wJUxZwvI", "9ebISPaipFvwM", "wI75rrP9DnRc8cDmDq6gSrlsVWTLnppT", "4k7x4VjdHI9zouAPkna3Rg4ZAMvyURep", "hKkxNrfwukp47", "HBJCJbTVml8ZYTmPInpazFF5", "aaJAILk2rqVBl9Nm5Oiw"};
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ WE A04;

    public WF(WE we) {
        this.A04 = we;
    }

    public final void A00(long j2) {
        this.A00 = j2;
    }

    public final void A01(C0660Ii c0660Ii) {
        c0660Ii.A0Z(1);
        int A0G = c0660Ii.A0G() / 18;
        this.A02 = new long[A0G];
        this.A03 = new long[A0G];
        for (int i2 = 0; i2 < A0G; i2++) {
            this.A02[i2] = c0660Ii.A0L();
            if (A05[4].charAt(31) != 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "w9Elnsp9xD6AY";
            strArr[2] = "jAQAlpm0y2ybi";
            this.A03[i2] = c0660Ii.A0L();
            c0660Ii.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final InterfaceC0522Cl A4R() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final long A6R() {
        IV iv;
        iv = this.A04.A01;
        return iv.A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final Ck A7N(long j2) {
        int A0B = C0676Iy.A0B(this.A02, this.A04.A04(j2), true, true);
        long seekTimeUs = this.A04.A03(this.A02[A0B]);
        C0523Cm c0523Cm = new C0523Cm(seekTimeUs, this.A00 + this.A03[A0B]);
        if (seekTimeUs < j2) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                long A03 = this.A04.A03(jArr[A0B + 1]);
                long secondSeekTimeUs = this.A00;
                return new Ck(c0523Cm, new C0523Cm(A03, secondSeekTimeUs + this.A03[A0B + 1]));
            }
        }
        return new Ck(c0523Cm);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0522Cl
    public final boolean A8g() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final long ADV(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        long j2 = this.A01;
        if (j2 >= 0) {
            long j3 = -(j2 + 2);
            this.A01 = -1L;
            return j3;
        }
        return -1L;
    }

    @Override // com.facebook.ads.redexgen.X.DV
    public final long AF6(long j2) {
        long A04 = this.A04.A04(j2);
        this.A01 = this.A02[C0676Iy.A0B(this.A02, A04, true, true)];
        return A04;
    }
}
