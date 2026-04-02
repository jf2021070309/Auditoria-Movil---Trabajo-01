package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.7o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C04107o extends AbstractC0706Kc {
    public final /* synthetic */ KM A00;

    public C04107o(KM km) {
        this.A00 = km;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC04429c
    /* renamed from: A00 */
    public final void A03(C0707Kd c0707Kd) {
        Q8 q8;
        Handler handler;
        q8 = this.A00.A01;
        if (q8 == null || c0707Kd.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new QA(this));
    }
}
