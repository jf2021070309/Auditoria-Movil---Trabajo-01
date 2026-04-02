package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.By  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0514By extends Thread {
    public final /* synthetic */ AbstractC1022Wq A00;

    public C0514By(AbstractC1022Wq abstractC1022Wq) {
        this.A00 = abstractC1022Wq;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
