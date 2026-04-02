package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.7z  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C04187z extends AbstractC0706Kc {
    public final /* synthetic */ KV A00;

    public C04187z(KV kv) {
        this.A00 = kv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC04429c
    /* renamed from: A00 */
    public final void A03(C0707Kd c0707Kd) {
        Q8 q8;
        boolean z;
        Handler handler;
        boolean A0D;
        boolean z2;
        Handler handler2;
        int i2;
        q8 = this.A00.A01;
        if (q8 == null) {
            return;
        }
        z = this.A00.A03;
        if (z || c0707Kd.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A05;
        handler.removeCallbacksAndMessages(null);
        A0D = this.A00.A0D(QL.A05);
        if (A0D) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        z2 = this.A00.A02;
        if (!z2) {
            return;
        }
        handler2 = this.A00.A05;
        KW kw = new KW(this);
        i2 = this.A00.A00;
        handler2.postDelayed(kw, i2);
    }
}
