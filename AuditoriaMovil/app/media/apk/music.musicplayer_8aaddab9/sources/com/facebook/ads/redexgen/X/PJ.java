package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class PJ {
    @Nullable
    public String A02;
    @Nullable
    public String A03;
    public final C1I A04;
    public final C1U A05;
    public final C1046Xo A06;
    public C1K A01 = C1K.A01(null);
    public int A00 = 1000;

    public PJ(C1046Xo c1046Xo, C1I c1i, C1U c1u) {
        this.A06 = c1046Xo;
        this.A04 = c1i;
        this.A05 = c1u;
    }

    public static /* synthetic */ int A00(PJ pj) {
        return pj.A00;
    }

    public static /* synthetic */ C1I A01(PJ pj) {
        return pj.A04;
    }

    public static /* synthetic */ C1K A02(PJ pj) {
        return pj.A01;
    }

    public static /* synthetic */ C1U A03(PJ pj) {
        return pj.A05;
    }

    public static /* synthetic */ C1046Xo A04(PJ pj) {
        return pj.A06;
    }

    public static /* synthetic */ String A05(PJ pj) {
        return pj.A03;
    }

    public static /* synthetic */ String A06(PJ pj) {
        return pj.A02;
    }

    public final PJ A07(int i2) {
        this.A00 = i2;
        return this;
    }

    public final PJ A08(C1K c1k) {
        this.A01 = c1k;
        return this;
    }

    public final PJ A09(String str) {
        this.A02 = str;
        return this;
    }

    public final PJ A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final PL A0B() {
        return new PL(this, null);
    }
}
