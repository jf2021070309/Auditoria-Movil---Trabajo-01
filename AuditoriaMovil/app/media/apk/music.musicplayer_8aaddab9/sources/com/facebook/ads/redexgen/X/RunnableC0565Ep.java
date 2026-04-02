package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;
/* renamed from: com.facebook.ads.redexgen.X.Ep  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0565Ep implements Runnable {
    public final /* synthetic */ ConditionVariable A00;

    @Override // java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.open();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
