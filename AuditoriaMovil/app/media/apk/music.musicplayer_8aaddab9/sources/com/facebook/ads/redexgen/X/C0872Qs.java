package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.Qs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0872Qs extends L7 {
    public final /* synthetic */ Q8 A00;

    public C0872Qs(Q8 q8) {
        this.A00 = q8;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        boolean z;
        C04419b c04419b;
        Handler handler;
        int i2;
        z = this.A00.A03;
        if (!z) {
            c04419b = this.A00.A0A;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c04419b.A02(new N8(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.84
            });
            handler = this.A00.A06;
            i2 = this.A00.A00;
            handler.postDelayed(this, i2);
        }
    }
}
