package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Vw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1004Vw implements InterfaceC0536Di {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0525Co A03;
    public boolean A04;
    public final C0660Ii A05 = new C0660Ii(10);

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{25, 62, 72, 56, 54, 71, 57, 62, 67, 60, -11, 62, 67, 75, 54, 65, 62, 57, -11, 30, 25, 8, -11, 73, 54, 60, -16, 11, -38, -7, 12, 8, 11, 12, 25, 89, 104, 104, 100, 97, 91, 89, 108, 97, 103, 102, 39, 97, 92, 43};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void A47(C0660Ii c0660Ii) {
        if (!this.A04) {
            return;
        }
        int A04 = c0660Ii.A04();
        int i2 = this.A00;
        if (i2 < 10) {
            int min = Math.min(A04, 10 - i2);
            System.arraycopy(c0660Ii.A00, c0660Ii.A06(), this.A05.A00, this.A00, min);
            if (this.A00 + min == 10) {
                this.A05.A0Y(0);
                if (73 != this.A05.A0E() || 68 != this.A05.A0E() || 51 != this.A05.A0E()) {
                    Log.w(A00(26, 9, 44), A00(0, 26, 90));
                    this.A04 = false;
                    return;
                }
                this.A05.A0Z(3);
                this.A01 = this.A05.A0D() + 10;
            }
        }
        int min2 = Math.min(A04, this.A01 - this.A00);
        this.A03.AEL(c0660Ii, min2);
        this.A00 += min2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void A4U(Ce ce, C0550Dw c0550Dw) {
        c0550Dw.A05();
        this.A03 = ce.AFI(c0550Dw.A03(), 4);
        this.A03.A5U(Format.A0B(c0550Dw.A04(), A00(35, 15, 125), null, -1, null));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AD0() {
        int i2;
        if (!this.A04 || (i2 = this.A01) == 0 || this.A00 != i2) {
            return;
        }
        this.A03.AEM(this.A02, 1, i2, 0, null);
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AD1(long j2, boolean z) {
        if (!z) {
            return;
        }
        this.A04 = true;
        this.A02 = j2;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0536Di
    public final void AEP() {
        this.A04 = false;
    }
}
