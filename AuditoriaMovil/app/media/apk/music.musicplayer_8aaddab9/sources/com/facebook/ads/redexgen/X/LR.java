package com.facebook.ads.redexgen.X;

import androidx.annotation.VisibleForTesting;
/* loaded from: assets/audience_network.dex */
public final class LR {
    public static final LR A04 = new LR(new C0943Tl(), new C0942Tk());
    public final LQ A02;
    public final MB A03;
    public boolean A01 = true;
    public long A00 = -1;

    @VisibleForTesting
    public LR(MB mb, LQ lq) {
        this.A03 = mb;
        this.A02 = lq;
    }

    public static LR A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A4f();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        boolean z = true;
        if (this.A02.A6q() != null) {
            return true;
        }
        synchronized (LR.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A4f() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
