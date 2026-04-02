package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class JH implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ JL A02;

    public JH(JL jl, int i2, long j2) {
        this.A02 = jl;
        this.A00 = i2;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JM jm;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            jm = this.A02.A01;
            jm.AAc(this.A00, this.A01);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
