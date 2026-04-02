package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
/* loaded from: assets/audience_network.dex */
public final class V5 implements HP {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final HZ A06;
    public final IM A07;

    public V5(HZ hz) {
        this(hz, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, IM.A00);
    }

    public V5(HZ hz, int i2, int i3, int i4, float f2, float f3, long j2, IM im) {
        this.A06 = hz;
        this.A03 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A00 = f2;
        this.A01 = f3;
        this.A05 = j2;
        this.A07 = im;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.HP
    /* renamed from: A00 */
    public final C0490Ba A4T(TrackGroup trackGroup, int... iArr) {
        return new C0490Ba(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
