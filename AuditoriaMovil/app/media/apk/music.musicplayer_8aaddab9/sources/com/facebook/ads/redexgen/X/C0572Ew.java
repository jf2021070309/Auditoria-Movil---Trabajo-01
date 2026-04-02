package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewVideoRenderer;
/* renamed from: com.facebook.ads.redexgen.X.Ew  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0572Ew extends LF {
    public final /* synthetic */ C5L A00;

    public C0572Ew(C5L c5l) {
        this.A00 = c5l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC04429c
    /* renamed from: A00 */
    public final void A03(C0731Le c0731Le) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            U1.A0L(this.A00.A08.getInternalNativeAd()).A1d(true, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPlayed();
    }
}
