package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Uy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0981Uy implements HZ, InterfaceC0651Hz<Object> {
    public static String[] A0A = {"8v43OWLt8X4Ft8FSsUnUJEljk6O9jZtl", "gqJU9rJqtCXP9nVsCJhzhjWr3OTUONn5", "evi8lnvhIGFpGwxvrEQ2HxpF9HfAYNb4", "XM9iQGBoaLQIRrKYvs1BFwTGSVuWakLP", "oYKHkHYzGvwdV8VAJO5FvOndhShHo3uL", "GsOQXWL80Wqi8CBj4PFxcrgidstVbv5Z", "TfEJwESWFeUjyASkqvscuoRhiyKsiSGj", "R3GeLkF45fmp7DtCtFYf0NMS1ko1sZ3Y"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    @Nullable
    public final Handler A06;
    @Nullable
    public final HY A07;
    public final IM A08;
    public final C0671It A09;

    public C0981Uy() {
        this(null, null, 1000000L, 2000, IM.A00);
    }

    public C0981Uy(@Nullable Handler handler, @Nullable HY hy, long j2, int i2, IM im) {
        this.A06 = handler;
        this.A07 = hy;
        this.A09 = new C0671It(i2);
        this.A08 = im;
        this.A01 = j2;
    }

    private void A01(int i2, long j2, long j3) {
        Handler handler = this.A06;
        if (handler != null) {
            HY hy = this.A07;
            String[] strArr = A0A;
            if (strArr[3].charAt(14) == strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[3] = "mcMhHiKL1Hs40ZODL70g4thjgDTU4mJQ";
            strArr2[2] = "gdrxxP25NVrEqdTm0xFGwMteDAr0ERpE";
            if (hy != null) {
                handler.post(new Hj(this, i2, j2, j3));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.HZ
    public final synchronized long A5m() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0651Hz
    public final synchronized void AAE(Object obj, int i2) {
        this.A02 += i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0651Hz
    public final synchronized void ACX(Object obj) {
        IJ.A04(this.A00 > 0);
        long A57 = this.A08.A57();
        long nowMs = A57 - this.A03;
        int i2 = (int) nowMs;
        long nowMs2 = i2;
        this.A05 += nowMs2;
        long j2 = this.A04;
        long nowMs3 = this.A02;
        this.A04 = j2 + nowMs3;
        if (i2 > 0) {
            long nowMs4 = i2;
            this.A09.A03((int) Math.sqrt(this.A02), (float) ((this.A02 * 8000) / nowMs4));
            int i3 = (this.A05 > 2000L ? 1 : (this.A05 == 2000L ? 0 : -1));
            String[] strArr = A0A;
            if (strArr[6].charAt(30) == strArr[5].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[3] = "ZGZYZVMOjrgZsL4omJYgF6CzP4kXRh7Y";
            strArr2[2] = "w8y5sfHjCRRFpoxn3MnbYbSKFexwF0nZ";
            if (i3 >= 0 || this.A04 >= 524288) {
                float bitsPerSecond = this.A09.A02(0.5f);
                this.A01 = bitsPerSecond;
            }
        }
        A01(i2, this.A02, this.A01);
        int i4 = this.A00 - 1;
        this.A00 = i4;
        if (i4 > 0) {
            this.A03 = A57;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0651Hz
    public final synchronized void ACY(Object obj, C0636Hi c0636Hi) {
        if (this.A00 == 0) {
            this.A03 = this.A08.A57();
        }
        this.A00++;
    }
}
