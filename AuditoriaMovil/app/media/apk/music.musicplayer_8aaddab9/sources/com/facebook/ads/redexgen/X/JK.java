package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class JK implements Runnable {
    public final /* synthetic */ C0512Bw A00;
    public final /* synthetic */ JL A01;

    public JK(JL jl, C0512Bw c0512Bw) {
        this.A01 = jl;
        this.A00 = c0512Bw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JM jm;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            jm = this.A01.A01;
            jm.ACe(this.A00);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
