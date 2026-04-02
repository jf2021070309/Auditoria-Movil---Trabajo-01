package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public final class WQ extends D3 {
    public static byte[] A03;
    public final long A00;
    public final List<WQ> A01;
    public final List<WP> A02;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{0, 67, 79, 78, 84, 65, 73, 78, 69, 82, 83, 26, 0, -110, -34, -41, -45, -24, -41, -27, -84, -110};
    }

    public WQ(int i2, long j2) {
        super(i2);
        this.A00 = j2;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final WQ A06(int i2) {
        int size = this.A01.size();
        for (int i3 = 0; i3 < size; i3++) {
            WQ wq = this.A01.get(i3);
            if (((D3) wq).A00 == i2) {
                return wq;
            }
        }
        return null;
    }

    public final WP A07(int i2) {
        int size = this.A02.size();
        for (int i3 = 0; i3 < size; i3++) {
            WP wp = this.A02.get(i3);
            if (((D3) wp).A00 == i2) {
                return wp;
            }
        }
        return null;
    }

    public final void A08(WQ wq) {
        this.A01.add(wq);
    }

    public final void A09(WP wp) {
        this.A02.add(wp);
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final String toString() {
        return D3.A02(super.A00) + A04(13, 9, 15) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 125) + Arrays.toString(this.A01.toArray());
    }
}
