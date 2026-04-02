package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class BP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ BS A03;

    public BP(BS bs, int i2, long j2, long j3) {
        this.A03 = bs;
        this.A00 = i2;
        this.A01 = j2;
        this.A02 = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BT bt;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            bt = this.A03.A01;
            bt.AA7(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
