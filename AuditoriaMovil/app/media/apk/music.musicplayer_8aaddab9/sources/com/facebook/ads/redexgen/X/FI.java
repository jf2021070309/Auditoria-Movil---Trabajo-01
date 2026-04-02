package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class FI extends AbstractC1281cr {
    public static byte[] A00;
    public static String[] A01 = {"QPajxPBXawZguZvIACdyFqOYUKJhGG1P", "5fhxQ1wmDDZwcYW6vVZtBFGAbpCppeaF", "0C8PIOmzvjBgpmOh8JUWA", "4kKOVZ4CcWBKVljagfvAN2XyBryastSO", "Oy7EzKzQwTS7e9udIDBq4FtqglrDvqBF", "BZaaKRqUw", "6zOS7wuF6dlGz7u6SsHniaRnv53e8kon", "jwUp8OtoUlvjJY1bP74aKb8UsU7a0Ko9"};

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(30) != strArr[6].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Dg0tZg7IxBj4D2AEunqK4FRxjbaI0pzK";
            strArr2[4] = "5sVR5Q40j80Tm4EH72ZLdFDAQDj0jOHn";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 112);
            i5++;
        }
    }

    public static void A02() {
        A00 = new byte[]{-11, -13, 0, -78, 1, 0, -2, 11, -78, 5, -9, 6, -78, 1, 0, -78, 4, -9, 9, -13, 4, -10, -9, -10, -78, 8, -5, -10, -9, 1, -78, -13, -10, 5, -15, -14, -93, -28, -25, -28, -13, -9, -24, -11, -93, -11, -24, -28, -25, -4, -93, -9, -14, -93, -10, -24, -9, -93, -11, -24, -6, -28, -11, -25, -93, -14, -15};
    }

    static {
        A02();
    }

    public FI(C1046Xo c1046Xo, C02641q c02641q) {
        super(c1046Xo, c02641q);
    }

    private AnonymousClass14 A00(Runnable runnable) {
        return new C1273cj(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1281cr
    public final void A0J() {
        AbstractC1305dF abstractC1305dF = (AbstractC1305dF) this.A01;
        abstractC1305dF.A00(this.A07.A00);
        abstractC1305dF.A0F();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1281cr
    public final void A0L(InterfaceC02350n interfaceC02350n, C9H c9h, C9F c9f, C02651r c02651r) {
        FQ fq = (FQ) interfaceC02350n;
        Runnable rewardedVideoTimeout = new C1274ck(this, c02651r, fq);
        if (JQ.A1h(this.A0B)) {
            A0C().postDelayed(rewardedVideoTimeout, c9h.A05().A05());
        }
        C1046Xo c1046Xo = this.A0B;
        AnonymousClass14 A002 = A00(rewardedVideoTimeout);
        boolean z = this.A07.A05;
        String str = this.A07.A03;
        C02641q c02641q = this.A07;
        String[] strArr = A01;
        if (strArr[3].charAt(31) == strArr[0].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "qv162d7nxdmOCgZ5HSNnY6lM4lD0tO4m";
        strArr2[0] = "JwvltbAvbK0MQjlZGmmyrgC4vpl52SAH";
        fq.A0G(c1046Xo, A002, c02651r, z, str, c02641q.A04);
    }

    public final AnonymousClass18 A0T() {
        return ((AbstractC1305dF) this.A01).A0E();
    }

    public final void A0U(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A7A() == AdPlacementType.REWARDED_VIDEO) {
                ((AbstractC1305dF) this.A01).A01(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 34));
        }
        throw new IllegalStateException(A01(34, 33, 19));
    }
}
