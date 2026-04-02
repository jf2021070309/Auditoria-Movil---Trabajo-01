package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class FT implements Runnable {
    public final /* synthetic */ C0513Bx A00;

    public FT(C0513Bx c0513Bx) {
        this.A00 = c0513Bx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        VN vn;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0G;
            if (!z) {
                vn = this.A00.A08;
                vn.AAN(this.A00);
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
