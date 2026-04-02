package com.facebook.ads.redexgen.X;

import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: assets/audience_network.dex */
public class UR extends L7 {
    public final /* synthetic */ UQ A00;

    public UR(UQ uq) {
        this.A00 = uq;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        Runnable runnable;
        this.A00.A0C = false;
        threadPoolExecutor = this.A00.A0B;
        if (threadPoolExecutor.getQueue().isEmpty()) {
            threadPoolExecutor2 = this.A00.A0B;
            runnable = this.A00.A0A;
            threadPoolExecutor2.execute(runnable);
        }
    }
}
