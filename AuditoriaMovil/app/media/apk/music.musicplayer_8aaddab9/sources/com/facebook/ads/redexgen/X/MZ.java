package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
/* loaded from: assets/audience_network.dex */
public final class MZ {
    @Nullable
    public static MZ A02;
    public final TX A00;
    public final C0752Mb A01;

    public MZ(C1046Xo c1046Xo, Executor executor, C9H c9h) {
        this.A01 = new C0752Mb(c1046Xo);
        this.A00 = new TX(executor, c9h, c1046Xo);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1046Xo c1046Xo, Executor executor, C9H c9h) {
        if (!JQ.A0y(c1046Xo)) {
            return;
        }
        MZ mz = A02;
        if (mz == null) {
            A02 = new MZ(c1046Xo, executor, c9h);
            A02.A00();
            return;
        }
        mz.A02(c9h);
    }

    private void A02(C9H c9h) {
        this.A00.A07(c9h);
    }
}
