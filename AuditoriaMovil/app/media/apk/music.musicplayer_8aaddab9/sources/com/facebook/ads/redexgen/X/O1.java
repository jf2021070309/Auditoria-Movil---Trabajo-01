package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class O1 implements Runnable {
    public final /* synthetic */ O2 A00;
    public final /* synthetic */ O3 A01;

    public O1(O2 o2, O3 o3) {
        this.A00 = o2;
        this.A01 = o3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A01.AA1();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
