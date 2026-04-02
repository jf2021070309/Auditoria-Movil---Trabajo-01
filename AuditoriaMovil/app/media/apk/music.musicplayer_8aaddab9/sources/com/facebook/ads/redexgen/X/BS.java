package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
/* loaded from: assets/audience_network.dex */
public final class BS {
    @Nullable
    public final Handler A00;
    @Nullable
    public final BT A01;

    public BS(@Nullable Handler handler, @Nullable BT bt) {
        this.A00 = bt != null ? (Handler) IJ.A01(handler) : null;
        this.A01 = bt;
    }

    public final void A01(int i2) {
        if (this.A01 != null) {
            this.A00.post(new BR(this, i2));
        }
    }

    public final void A02(int i2, long j2, long j3) {
        if (this.A01 != null) {
            this.A00.post(new BP(this, i2, j2, j3));
        }
    }

    public final void A03(Format format) {
        if (this.A01 != null) {
            this.A00.post(new BO(this, format));
        }
    }

    public final void A04(C0512Bw c0512Bw) {
        if (this.A01 != null) {
            this.A00.post(new BQ(this, c0512Bw));
        }
    }

    public final void A05(C0512Bw c0512Bw) {
        if (this.A01 != null) {
            this.A00.post(new BM(this, c0512Bw));
        }
    }

    public final void A06(String str, long j2, long j3) {
        if (this.A01 != null) {
            this.A00.post(new BN(this, str, j2, j3));
        }
    }
}
