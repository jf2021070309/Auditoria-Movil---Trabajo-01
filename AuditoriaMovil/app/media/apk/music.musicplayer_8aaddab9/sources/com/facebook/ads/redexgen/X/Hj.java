package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class Hj implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C0981Uy A03;

    public Hj(C0981Uy c0981Uy, int i2, long j2, long j3) {
        this.A03 = c0981Uy;
        this.A00 = i2;
        this.A02 = j2;
        this.A01 = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HY hy;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            hy = this.A03.A07;
            hy.AA9(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
