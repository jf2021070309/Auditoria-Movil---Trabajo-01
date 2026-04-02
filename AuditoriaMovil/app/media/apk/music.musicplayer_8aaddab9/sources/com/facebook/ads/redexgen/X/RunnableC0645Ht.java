package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Ht  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0645Ht implements Runnable {
    public final InterfaceC0644Hs A00;

    public RunnableC0645Ht(InterfaceC0644Hs interfaceC0644Hs) {
        this.A00 = interfaceC0644Hs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.ABJ();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
