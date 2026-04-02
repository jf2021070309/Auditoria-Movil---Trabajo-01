package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Ft  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0595Ft {
    @Nullable
    public C0595Ft A00;
    @Nullable
    public HV A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public C0595Ft(long j2, int i2) {
        this.A04 = j2;
        this.A03 = i2 + j2;
    }

    public final int A00(long j2) {
        return ((int) (j2 - this.A04)) + this.A01.A00;
    }

    public final C0595Ft A01() {
        this.A01 = null;
        C0595Ft c0595Ft = this.A00;
        this.A00 = null;
        return c0595Ft;
    }

    public final void A02(HV hv, C0595Ft c0595Ft) {
        this.A01 = hv;
        this.A00 = c0595Ft;
        this.A02 = true;
    }
}
