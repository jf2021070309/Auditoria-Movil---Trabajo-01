package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.Su  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0926Su extends L7 {
    public final /* synthetic */ O8 A00;

    public C0926Su(O8 o8) {
        this.A00 = o8;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        boolean z;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z = this.A00.A08;
        if (z) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
