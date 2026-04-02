package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
/* loaded from: assets/audience_network.dex */
public class JG implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ JL A01;

    public JG(JL jl, Format format) {
        this.A01 = jl;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JM jm;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            jm = this.A01.A01;
            jm.ACi(this.A00);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
