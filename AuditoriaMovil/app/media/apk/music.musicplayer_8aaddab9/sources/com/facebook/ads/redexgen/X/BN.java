package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class BN implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ BS A02;
    public final /* synthetic */ String A03;

    public BN(BS bs, String str, long j2, long j3) {
        this.A02 = bs;
        this.A03 = str;
        this.A01 = j2;
        this.A00 = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BT bt;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            bt = this.A02.A01;
            bt.AA2(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
