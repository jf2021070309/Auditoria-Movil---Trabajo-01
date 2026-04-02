package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
/* renamed from: com.facebook.ads.redexgen.X.Ag  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0471Ag {
    public final int A00;
    public final long A01;
    public final long A02;
    public final B1 A03;
    public final FY A04;
    public final TrackGroupArray A05;
    public final HU A06;
    @Nullable
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C0471Ag(B1 b1, long j2, TrackGroupArray trackGroupArray, HU hu) {
        this(b1, null, new FY(0), j2, -9223372036854775807L, 1, false, trackGroupArray, hu);
    }

    public C0471Ag(B1 b1, @Nullable Object obj, FY fy, long j2, long j3, int i2, boolean z, TrackGroupArray trackGroupArray, HU hu) {
        this.A03 = b1;
        this.A07 = obj;
        this.A04 = fy;
        this.A02 = j2;
        this.A01 = j3;
        this.A0A = j2;
        this.A09 = j2;
        this.A00 = i2;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = hu;
    }

    public static void A00(C0471Ag c0471Ag, C0471Ag c0471Ag2) {
        c0471Ag2.A0A = c0471Ag.A0A;
        c0471Ag2.A09 = c0471Ag.A09;
    }

    public final C0471Ag A01(int i2) {
        C0471Ag c0471Ag = new C0471Ag(this.A03, this.A07, this.A04.A00(i2), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c0471Ag);
        return c0471Ag;
    }

    public final C0471Ag A02(int i2) {
        C0471Ag c0471Ag = new C0471Ag(this.A03, this.A07, this.A04, this.A02, this.A01, i2, this.A08, this.A05, this.A06);
        A00(this, c0471Ag);
        return c0471Ag;
    }

    public final C0471Ag A03(B1 b1, Object obj) {
        C0471Ag c0471Ag = new C0471Ag(b1, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c0471Ag);
        return c0471Ag;
    }

    public final C0471Ag A04(FY fy, long j2, long j3) {
        long j4 = j3;
        B1 b1 = this.A03;
        Object obj = this.A07;
        if (!fy.A01()) {
            j4 = -9223372036854775807L;
        }
        return new C0471Ag(b1, obj, fy, j2, j4, this.A00, this.A08, this.A05, this.A06);
    }

    public final C0471Ag A05(TrackGroupArray trackGroupArray, HU hu) {
        C0471Ag c0471Ag = new C0471Ag(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, hu);
        A00(this, c0471Ag);
        return c0471Ag;
    }

    public final C0471Ag A06(boolean z) {
        C0471Ag c0471Ag = new C0471Ag(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, c0471Ag);
        return c0471Ag;
    }
}
