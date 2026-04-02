package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class W0 implements InterfaceC0536Di {
    public static byte[] A06;
    public static String[] A07 = {"Jiy", "2wEJIBTa4RvP8yrIwKSodHRjo9", "akcZBAKpF", "EuZb8kUx1OZ", "XeLxT4hCbfpB8vk3L3qpbFThh9kK", "oaj", "R8TqjunyKtvNfOkCV", "nGIequV"};
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<C0547Dt> A04;
    public final InterfaceC0525Co[] A05;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{117, 100, 100, 120, 125, 119, 117, 96, 125, 123, 122, 59, 112, 98, 118, 103, 97, 118, 103};
    }

    static {
        A01();
    }

    public W0(List<C0547Dt> list) {
        this.A04 = list;
        this.A05 = new InterfaceC0525Co[list.size()];
    }

    private boolean A02(C0660Ii c0660Ii, int i2) {
        if (c0660Ii.A04() == 0) {
            return false;
        }
        if (c0660Ii.A0E() != i2) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void A47(C0660Ii c0660Ii) {
        InterfaceC0525Co[] interfaceC0525CoArr;
        if (this.A03) {
            if (this.A00 == 2 && !A02(c0660Ii, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c0660Ii, 0)) {
                return;
            }
            int A062 = c0660Ii.A06();
            int A04 = c0660Ii.A04();
            for (InterfaceC0525Co output : this.A05) {
                c0660Ii.A0Y(A062);
                output.AEL(c0660Ii, A04);
            }
            this.A01 += A04;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void A4U(Ce ce, C0550Dw c0550Dw) {
        int i2 = 0;
        while (true) {
            InterfaceC0525Co[] interfaceC0525CoArr = this.A05;
            String[] strArr = A07;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "6Yign7KSgGvnaQ3UG";
            strArr2[0] = "Q7U";
            if (i2 < interfaceC0525CoArr.length) {
                C0547Dt c0547Dt = this.A04.get(i2);
                c0550Dw.A05();
                InterfaceC0525Co AFI = ce.AFI(c0550Dw.A03(), 3);
                AFI.A5U(Format.A0A(c0550Dw.A04(), A00(0, 19, 88), null, -1, 0, Collections.singletonList(c0547Dt.A02), c0547Dt.A01, null));
                this.A05[i2] = AFI;
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AD0() {
        if (this.A03) {
            for (InterfaceC0525Co interfaceC0525Co : this.A05) {
                interfaceC0525Co.AEM(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AD1(long j2, boolean z) {
        if (!z) {
            return;
        }
        this.A03 = true;
        this.A02 = j2;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AEP() {
        this.A03 = false;
    }
}
