package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
/* renamed from: com.facebook.ads.redexgen.X.8J  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8J extends AbstractC0775My {
    public final /* synthetic */ C8I A00;

    public C8J(C8I c8i) {
        this.A00 = c8i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC04429c
    /* renamed from: A00 */
    public final void A03(C0776Mz c0776Mz) {
        new Handler(Looper.getMainLooper()).post(new PM(this));
    }
}
