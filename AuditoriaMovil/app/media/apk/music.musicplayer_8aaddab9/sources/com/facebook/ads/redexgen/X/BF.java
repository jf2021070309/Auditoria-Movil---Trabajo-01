package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import java.util.TreeSet;
/* loaded from: assets/audience_network.dex */
public final class BF implements InterfaceC0961Ue, Comparator<I7> {
    public static String[] A03 = {"qrCZDebBZXOMsu5PI8FdamZv", "usPTrKdLrE7MLvxS6mJMRwkls4hZpcPz", "BDrpv9J1bckqz2zbQbGMwvdv", "cHdTuf55w1r5Lcr9n47avjSAGBdp9rLc", "v1mI", "NFtkBlX9Mz", "lz", "jBDMosIM65rjrOuIbY8WA7ZUxyDm84U3"};
    public long A00;
    public final long A01;
    public final TreeSet<I7> A02 = new TreeSet<>(this);

    public BF(long j2) {
        this.A01 = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(I7 i7, I7 i72) {
        if (i7.A00 - i72.A00 == 0) {
            return i7.compareTo(i72);
        }
        return i7.A00 < i72.A00 ? -1 : 1;
    }

    private void A01(I3 i3, long j2) {
        while (this.A00 + j2 > this.A01) {
            boolean isEmpty = this.A02.isEmpty();
            if (A03[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "3qXh8T5e4LOlD1IWJEc6SNWF";
            strArr[2] = "YJzC3pPkQPrTmiUzc4g95RWz";
            if (!isEmpty) {
                try {
                    i3.ADu(this.A02.first());
                } catch (I1 unused) {
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.I2
    public final void ACK(I3 i3, I7 i7) {
        this.A02.add(i7);
        this.A00 += i7.A01;
        A01(i3, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.I2
    public final void ACL(I3 i3, I7 i7) {
        this.A02.remove(i7);
        this.A00 -= i7.A01;
    }

    @Override // com.facebook.ads.redexgen.X.I2
    public final void ACM(I3 i3, I7 i7, I7 i72) {
        ACL(i3, i7);
        ACK(i3, i72);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0961Ue
    public final void ACN(I3 i3, String str, long j2, long j3) {
        A01(i3, j3);
    }
}
