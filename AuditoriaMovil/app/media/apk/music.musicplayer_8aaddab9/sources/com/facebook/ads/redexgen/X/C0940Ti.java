package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.Ti  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0940Ti extends L7 {
    public final /* synthetic */ C0733Lg A00;

    public C0940Ti(C0733Lg c0733Lg) {
        this.A00 = c0733Lg;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        Handler handler;
        if (this.A00.A05()) {
            this.A00.A01();
            handler = this.A00.A03;
            handler.postDelayed(this, 250L);
        }
    }
}
