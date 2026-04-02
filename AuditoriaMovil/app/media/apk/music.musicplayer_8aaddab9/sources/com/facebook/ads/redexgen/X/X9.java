package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
/* loaded from: assets/audience_network.dex */
public final class X9 implements IZ {
    public static byte[] A04;
    @Nullable
    public X6 A00;
    @Nullable
    public IZ A01;
    public final AJ A02;
    public final C0957Ua A03;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{95, 103, 126, 102, 123, 98, 126, 119, 50, 96, 119, 124, 118, 119, 96, 119, 96, 50, Byte.MAX_VALUE, 119, 118, 123, 115, 50, 113, 126, 125, 113, 121, 97, 50, 119, 124, 115, 112, 126, 119, 118, 60};
    }

    public X9(AJ aj, IM im) {
        this.A02 = aj;
        this.A03 = new C0957Ua(im);
    }

    private void A01() {
        this.A03.A02(this.A01.A7G());
        C0472Ah playbackParameters = this.A01.A7D();
        if (!playbackParameters.equals(this.A03.A7D())) {
            this.A03.AEk(playbackParameters);
            this.A02.ABl(playbackParameters);
        }
    }

    private boolean A03() {
        X6 x6 = this.A00;
        return (x6 == null || x6.A8R() || (!this.A00.A8c() && this.A00.A84())) ? false : true;
    }

    public final long A04() {
        if (A03()) {
            A01();
            return this.A01.A7G();
        }
        return this.A03.A7G();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j2) {
        this.A03.A02(j2);
    }

    public final void A08(X6 x6) {
        if (x6 == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(X6 x6) throws AM {
        IZ iz;
        IZ A6v = x6.A6v();
        if (A6v != null && A6v != (iz = this.A01)) {
            if (iz == null) {
                this.A01 = A6v;
                this.A00 = x6;
                this.A01.AEk(this.A03.A7D());
                A01();
                return;
            }
            throw AM.A02(new IllegalStateException(A00(0, 39, 41)));
        }
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final C0472Ah A7D() {
        IZ iz = this.A01;
        if (iz != null) {
            return iz.A7D();
        }
        return this.A03.A7D();
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final long A7G() {
        if (A03()) {
            return this.A01.A7G();
        }
        return this.A03.A7G();
    }

    @Override // com.facebook.ads.redexgen.X.IZ
    public final C0472Ah AEk(C0472Ah c0472Ah) {
        IZ iz = this.A01;
        if (iz != null) {
            c0472Ah = iz.AEk(c0472Ah);
        }
        this.A03.AEk(c0472Ah);
        this.A02.ABl(c0472Ah);
        return c0472Ah;
    }
}
