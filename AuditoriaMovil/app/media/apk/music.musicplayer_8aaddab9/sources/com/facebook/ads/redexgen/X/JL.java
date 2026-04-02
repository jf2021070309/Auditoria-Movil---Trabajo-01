package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
/* loaded from: assets/audience_network.dex */
public final class JL {
    @Nullable
    public final Handler A00;
    @Nullable
    public final JM A01;

    public JL(@Nullable Handler handler, @Nullable JM jm) {
        this.A00 = jm != null ? (Handler) IJ.A01(handler) : null;
        this.A01 = jm;
    }

    public final void A01(int i2, int i3, int i4, float f2) {
        if (this.A01 != null) {
            this.A00.post(new JI(this, i2, i3, i4, f2));
        }
    }

    public final void A02(int i2, long j2) {
        if (this.A01 != null) {
            this.A00.post(new JH(this, i2, j2));
        }
    }

    public final void A03(Surface surface) {
        if (this.A01 != null) {
            this.A00.post(new JJ(this, surface));
        }
    }

    public final void A04(Format format) {
        if (this.A01 != null) {
            this.A00.post(new JG(this, format));
        }
    }

    public final void A05(C0512Bw c0512Bw) {
        if (this.A01 != null) {
            this.A00.post(new JK(this, c0512Bw));
        }
    }

    public final void A06(C0512Bw c0512Bw) {
        if (this.A01 != null) {
            this.A00.post(new JE(this, c0512Bw));
        }
    }

    public final void A07(String str, long j2, long j3) {
        if (this.A01 != null) {
            this.A00.post(new JF(this, str, j2, j3));
        }
    }
}
