package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Eu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0570Eu implements Runnable {
    public final /* synthetic */ RunnableC0573Ex A00;

    public RunnableC0570Eu(RunnableC0573Ex runnableC0573Ex) {
        this.A00 = runnableC0573Ex;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.A0F(5, 3);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
