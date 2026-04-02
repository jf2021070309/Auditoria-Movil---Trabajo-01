package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class BR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BS A01;

    public BR(BS bs, int i2) {
        this.A01 = bs;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BT bt;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            bt = this.A01.A01;
            bt.AA6(this.A00);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
