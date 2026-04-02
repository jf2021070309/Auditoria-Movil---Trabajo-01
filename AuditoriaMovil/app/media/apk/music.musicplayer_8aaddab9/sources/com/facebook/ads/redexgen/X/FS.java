package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class FS implements Runnable {
    public final /* synthetic */ C0513Bx A00;

    public FS(C0513Bx c0513Bx) {
        this.A00 = c0513Bx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
