package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.Qa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0854Qa implements Runnable {
    public final /* synthetic */ C0857Qd A00;

    public RunnableC0854Qa(C0857Qd c0857Qd) {
        this.A00 = c0857Qd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.A08();
            handler = this.A00.A05;
            handler.removeCallbacks(this);
            handler2 = this.A00.A05;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
