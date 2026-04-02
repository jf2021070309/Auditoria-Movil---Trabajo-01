package com.facebook.ads.redexgen.X;

import ch.qos.logback.classic.Level;
/* renamed from: com.facebook.ads.redexgen.X.Br  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0507Br {
    public int A00;

    public final void A00(int i2) {
        this.A00 |= i2;
    }

    public final void A01(int i2) {
        this.A00 &= i2 ^ (-1);
    }

    public final void A02(int i2) {
        this.A00 = i2;
    }

    public final boolean A03() {
        return A06(Level.ALL_INT);
    }

    public final boolean A04() {
        return A06(4);
    }

    public final boolean A05() {
        return A06(1);
    }

    public final boolean A06(int i2) {
        return (this.A00 & i2) == i2;
    }

    public void A07() {
        this.A00 = 0;
    }
}
