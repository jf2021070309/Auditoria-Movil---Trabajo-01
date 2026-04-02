package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class BQ implements Runnable {
    public final /* synthetic */ BS A00;
    public final /* synthetic */ C0512Bw A01;

    public BQ(BS bs, C0512Bw c0512Bw) {
        this.A00 = bs;
        this.A01 = c0512Bw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BT bt;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A01.A00();
            bt = this.A00.A01;
            bt.AA3(this.A01);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
